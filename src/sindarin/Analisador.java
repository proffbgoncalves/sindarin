package sindarin;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import sindarin.gen.SindarinLexer;
import sindarin.gen.SindarinParser;

/**
 * Orquestra as etapas 1 e 2:  texto -> tokens -> árvore sintática.
 *
 * Regra de projeto: se houver QUALQUER erro léxico, o parser nem é executado. Assim um erro
 * léxico não gera uma cascata de erros sintáticos e nenhuma "saída utilizável" é produzida
 * para entrada inválida (seção 23.6).
 */
public final class Analisador {

    private Analisador() {}

    // ------------------------------------------------------------------ resultados

    public record ResultadoLexico(String texto, Posicoes posicoes, List<Token> tokens,
                                  List<Diagnostico> erros) {
        public boolean ok() { return erros.isEmpty(); }
    }

    public record ResultadoCompleto(ResultadoLexico lexico, SindarinParser parser,
                                    ParseTree arvore, List<Diagnostico> erros) {
        public boolean ok() { return erros.isEmpty(); }
    }

    // ------------------------------------------------------------------ etapa 1: lexer

    public static ResultadoLexico analisarLexico(String texto) {
        Posicoes pos = new Posicoes(texto);
        CharStream entrada = CharStreams.fromString(texto);   // fluxo de PONTOS DE CÓDIGO
        SindarinLexerNfc lexer = new SindarinLexerNfc(entrada);
        lexer.removeErrorListeners();   // ERROR_CHAR captura tudo; não há "token recognition error"

        List<Token> tokens = new ArrayList<>();
        List<Diagnostico> erros = new ArrayList<>();
        for (Token t = lexer.nextToken(); ; t = lexer.nextToken()) {
            tokens.add(t);
            Diagnostico d = diagnosticoDoToken(t, pos);
            if (d != null) erros.add(d);
            if (t.getType() == Token.EOF) break;
        }
        return new ResultadoLexico(texto, pos, tokens, erros);
    }

    // ------------------------------------------------------------------ etapa 2: parser

    public static ResultadoCompleto analisar(String texto) {
        ResultadoLexico lex = analisarLexico(texto);
        if (!lex.ok()) {
            return new ResultadoCompleto(lex, null, null, lex.erros());
        }
        SindarinParser parser = new SindarinParser(new CommonTokenStream(new ListTokenSource(lex.tokens())));
        ErroSintaticoListener listener = new ErroSintaticoListener(lex.posicoes());
        parser.removeErrorListeners();
        parser.addErrorListener(listener);
        ParseTree arvore = parser.programa();
        return new ResultadoCompleto(lex, parser, arvore, listener.erros());
    }

    // ------------------------------------------------------------------ diagnósticos léxicos

    private static Diagnostico diagnosticoDoToken(Token t, Posicoes pos) {
        int inicio = t.getStartIndex();
        String texto = t.getText();
        switch (t.getType()) {
            case SindarinLexer.ERROR_CHAR:
                return novo(pos, inicio, "caractere inválido " + descreverCaractere(texto.codePointAt(0))
                        + ": não pertence a nenhum token da linguagem");
            case SindarinLexer.INVALID_NUMBER:
                return novo(pos, inicio, "numeral inválido '" + texto + "': " + explicarNumero(texto));
            case SindarinLexer.INVALID_STRING:
                return diagnosticoDeString(t, pos);
            case SindarinLexer.UNTERMINATED_COMMENT:
                return novo(pos, inicio, "comentário de bloco não fechado: falta '*/' antes do fim do arquivo");
            case SindarinLexer.RESERVED_IDENTIFIER:
                return novo(pos, inicio, "identificador '" + texto + "' inválido: nomes iniciados por dois "
                        + "sublinhados são reservados para a implementação");
            default:
                return null;
        }
    }

    private static Diagnostico novo(Posicoes pos, int indice, String msg) {
        return new Diagnostico(Diagnostico.LEXICO, pos.linha(indice), pos.coluna(indice), msg);
    }

    /** Mostra o caractere, o ponto de código e (quando existir) o nome Unicode. */
    static String descreverCaractere(int cp) {
        String hex = String.format("U+%04X", cp);
        String nome = Character.getName(cp);
        boolean visivel = !Character.isISOControl(cp) && !Character.isWhitespace(cp)
                && !Character.isSpaceChar(cp) && Character.getType(cp) != Character.FORMAT;
        String base = visivel ? "'" + new String(Character.toChars(cp)) + "' (" + hex + ")" : hex;
        return nome != null && !visivel ? base + " " + nome : base;
    }

    // ---- numerais: explica POR QUE o candidato completo é inválido

    private static final Pattern PONTO_SEM_DIGITO = Pattern.compile("\\.(?![0-9])");

    static String explicarNumero(String s) {
        if (s.startsWith("0x")) {
            String resto = s.substring(2);
            if (resto.isEmpty()) return "prefixo hexadecimal '0x' sem dígitos";
            int ruim = primeiroForaDe(resto, "0123456789abcdefABCDEF");
            return "'" + new String(Character.toChars(ruim)) + "' não é dígito hexadecimal (use 0-9 e A-F)";
        }
        if (s.startsWith("0b")) {
            String resto = s.substring(2);
            if (resto.isEmpty()) return "prefixo binário '0b' sem dígitos";
            int ruim = primeiroForaDe(resto, "01");
            return "'" + new String(Character.toChars(ruim)) + "' não é dígito binário (use apenas 0 e 1)";
        }
        if (s.startsWith("0X") || s.startsWith("0B")) {
            return "os prefixos de base devem ser minúsculos (0x ou 0b)";
        }
        if (s.matches("0[0-9]+(\\..*)?")) {
            return "inteiros e parte inteira de reais não aceitam zeros à esquerda (escreva 7, não 007)";
        }
        if (s.chars().filter(c -> c == '.').count() > 1) {
            return "contém mais de um ponto decimal";
        }
        if (s.matches("[0-9.]+[eE][+-]?")) {
            return "o expoente precisa de pelo menos um dígito (ex.: 1e3 ou 2.5e-2)";
        }
        if (PONTO_SEM_DIGITO.matcher(s).find()) {
            return "o ponto decimal exige dígitos dos dois lados (1.0 é válido; 5. e .5 não)";
        }
        if (s.matches("[0-9]+[\\p{L}\\p{M}_].*")) {
            return "sequência iniciada por dígito não é numeral nem identificador (identificadores não começam por dígito)";
        }
        return "não corresponde a nenhuma forma de numeral permitida";
    }

    private static int primeiroForaDe(String s, String permitidos) {
        return s.codePoints().filter(c -> permitidos.indexOf(c) < 0).findFirst().orElse('?');
    }

    // ---- strings: aponta o PRIMEIRO problema (U+0000, escape inexistente ou falta de aspas)

    private static Diagnostico diagnosticoDeString(Token t, Posicoes pos) {
        int inicio = t.getStartIndex();
        int[] cps = t.getText().codePoints().toArray();
        boolean fechada = false;
        for (int i = 1; i < cps.length; i++) {
            int c = cps[i];
            if (c == 0) {
                return novo(pos, inicio + i, "string contém o caractere U+0000, que é proibido em literais");
            }
            if (c == '\\') {
                if (i + 1 >= cps.length) break;                 // barra no fim da linha
                int prox = cps[i + 1];
                if ("nrt\"\\".indexOf(prox) < 0) {
                    return novo(pos, inicio + i, "escape inexistente '\\" + new String(Character.toChars(prox))
                            + "' (os escapes permitidos são \\n, \\r, \\t, \\\" e \\\\)");
                }
                i++;
                continue;
            }
            if (c == '"') {
                fechada = true;
                break;
            }
        }
        if (!fechada) {
            return novo(pos, inicio, "string sem aspas de fechamento (strings não podem ter quebra de linha)");
        }
        return novo(pos, inicio, "string inválida");
    }
}
