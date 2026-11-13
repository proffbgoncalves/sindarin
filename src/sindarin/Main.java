package sindarin;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.Trees;

import sindarin.gen.SindarinLexer;

/**
 * Linha de comando do compilador Sindarin (etapas 1 e 2: lexer e parser).
 *
 * Códigos de saída: 0 = sem erros; 1 = erro léxico ou sintático no programa;
 * 2 = uso incorreto ou falha de leitura (arquivo ausente, UTF-8 malformado).
 */
public final class Main {

    private Main() {}

    public static void main(String[] args) {
        PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8);
        PrintStream err = new PrintStream(new FileOutputStream(FileDescriptor.err), true, StandardCharsets.UTF_8);
        int codigo = executar(args, out, err);
        out.flush();
        err.flush();
        System.exit(codigo);
    }

    static int executar(String[] args, PrintStream out, PrintStream err) {
        if (args.length < 2) {
            uso(err);
            return 2;
        }
        String comando = args[0];
        String arquivo = args[1];
        boolean lisp = List.of(args).contains("--lisp");
        if (!List.of("tokens", "parse", "check").contains(comando)) {
            uso(err);
            return 2;
        }

        String texto;
        try {
            texto = LeitorFonte.ler(Path.of(arquivo));
        } catch (ErroLeitura e) {
            err.println(arquivo + ": erro de leitura: " + e.getMessage());
            return 2;
        }

        switch (comando) {
            case "tokens": return comandoTokens(arquivo, texto, out, err);
            case "parse":  return comandoParse(arquivo, texto, lisp, out, err);
            default:       return comandoCheck(arquivo, texto, out, err);
        }
    }

    // ------------------------------------------------------------------ comandos

    private static int comandoTokens(String arquivo, String texto, PrintStream out, PrintStream err) {
        Analisador.ResultadoLexico r = Analisador.analisarLexico(texto);
        out.printf("%-9s %-22s %s%n", "LIN:COL", "TOKEN", "TEXTO");
        for (Token t : r.tokens()) {
            int i = t.getStartIndex();
            String pos = r.posicoes().linha(i) + ":" + r.posicoes().coluna(i);
            String nome = nomeDoToken(t.getType());
            String txt = t.getType() == Token.EOF ? "" : t.getText();
            String nfc = SindarinLexerNfc.nfc(txt);
            String extra = (t.getType() != Token.EOF && !nfc.equals(txt)) ? "   [NFC: " + nfc + "]" : "";
            out.printf("%-9s %-22s %s%s%n", pos, nome, mostrar(txt), extra);
        }
        for (Diagnostico d : r.erros()) {
            err.println(d.formatar(arquivo));
        }
        return r.ok() ? 0 : 1;
    }

    private static int comandoParse(String arquivo, String texto, boolean lisp, PrintStream out, PrintStream err) {
        Analisador.ResultadoCompleto r = Analisador.analisar(texto);
        if (!r.ok()) {
            r.erros().forEach(d -> err.println(d.formatar(arquivo)));
            return 1;
        }
        out.print(lisp ? Trees.toStringTree(r.arvore(), r.parser()) + "\n"
                       : ImpressorArvore.indentada(r.arvore(), r.parser()));
        return 0;
    }

    private static int comandoCheck(String arquivo, String texto, PrintStream out, PrintStream err) {
        Analisador.ResultadoCompleto r = Analisador.analisar(texto);
        if (!r.ok()) {
            r.erros().forEach(d -> err.println(d.formatar(arquivo)));
            return 1;
        }
        out.println(arquivo + ": OK (léxico e sintático válidos; " + (r.lexico().tokens().size() - 1) + " tokens)");
        return 0;
    }

    // ------------------------------------------------------------------ utilidades

    static String nomeDoToken(int tipo) {
        return tipo == Token.EOF ? "EOF" : SindarinLexer.VOCABULARY.getSymbolicName(tipo);
    }

    /** Torna visíveis quebras e caracteres de controle ao listar tokens. */
    static String mostrar(String s) {
        StringBuilder sb = new StringBuilder();
        s.codePoints().forEach(c -> {
            if (c == '\n') sb.append("\\n");
            else if (c == '\r') sb.append("\\r");
            else if (c == '\t') sb.append("\\t");
            else if (Character.isISOControl(c)) sb.append(String.format("\\u%04X", c));
            else sb.appendCodePoint(c);
        });
        return sb.toString();
    }

    private static void uso(PrintStream err) {
        err.println("Uso: java -cp <classes>:<antlr.jar> sindarin.Main <comando> <arquivo.sind> [--lisp]");
        err.println("  tokens   lista os tokens com linha:coluna (etapa 1)");
        err.println("  parse    análise léxica + sintática; imprime a árvore do parser (--lisp: forma LISP)");
        err.println("  check    só informa OK ou os erros encontrados");
        err.println("Saída: 0 = sem erros | 1 = erro léxico/sintático | 2 = uso incorreto ou erro de leitura");
    }
}
