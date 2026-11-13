package sindarin;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.antlr.v4.runtime.Token;

/**
 * Executa todos os arquivos .sind de um diretório e compara o resultado OBSERVADO com o
 * ESPERADO declarado no cabeçalho de cada arquivo (linhas "// @chave: valor"):
 *
 *   // @objetivo: o que o teste quer provar
 *   // @etapa:    lexer | parser                (lexer = só análise léxica)
 *   // @esperado: OK | ERRO-LEXICO L:C | ERRO-SINTATICO L:C
 *   // @tokens:   TIPO1 TIPO2 ...               (opcional; só etapa lexer com esperado OK)
 *
 * L:C é a posição (linha:coluna, a partir de 1) do PRIMEIRO erro. As linhas de cabeçalho
 * fazem parte do arquivo, então contam nas posições.
 */
public final class TesteRunner {

    private record Resultado(Path arquivo, String etapa, String objetivo, String esperado,
                             String observado, boolean passou) {}

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Uso: sindarin.TesteRunner <diretorio-de-testes>");
            System.exit(2);
        }
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        List<Path> arquivos;
        try (Stream<Path> s = Files.walk(Path.of(args[0]))) {
            arquivos = s.filter(p -> p.toString().endsWith(".sind")).sorted().collect(Collectors.toList());
        }

        List<Resultado> resultados = new ArrayList<>();
        for (Path p : arquivos) {
            resultados.add(executar(p));
        }

        int ok = 0;
        for (Resultado r : resultados) {
            out.println((r.passou() ? "[PASSOU] " : "[FALHOU] ") + r.arquivo());
            out.println("    etapa    : " + r.etapa());
            out.println("    objetivo : " + r.objetivo());
            out.println("    esperado : " + r.esperado());
            out.println("    observado: " + r.observado());
            if (r.passou()) ok++;
        }
        out.println();
        out.println("RESUMO: " + ok + " de " + resultados.size() + " testes passaram.");
        System.exit(ok == resultados.size() ? 0 : 1);
    }

    private static Resultado executar(Path arquivo) {
        String texto;
        try {
            texto = LeitorFonte.ler(arquivo);
        } catch (ErroLeitura e) {
            return new Resultado(arquivo, "?", "?", "?", "erro de leitura: " + e.getMessage(), false);
        }
        Map<String, String> cab = cabecalho(texto);
        String etapa = cab.getOrDefault("etapa", "parser");
        String objetivo = cab.getOrDefault("objetivo", "(sem objetivo declarado)");
        String esperado = cab.getOrDefault("esperado", "OK");

        String observado;
        List<Diagnostico> erros;
        Analisador.ResultadoLexico lex;
        if (etapa.equals("lexer")) {
            lex = Analisador.analisarLexico(texto);
            erros = lex.erros();
        } else {
            Analisador.ResultadoCompleto c = Analisador.analisar(texto);
            lex = c.lexico();
            erros = c.erros();
        }

        boolean passou;
        if (erros.isEmpty()) {
            List<String> tipos = new ArrayList<>();
            for (Token t : lex.tokens()) {
                if (t.getType() != Token.EOF) tipos.add(Main.nomeDoToken(t.getType()));
            }
            observado = "OK" + (cab.containsKey("tokens") ? " tokens=" + String.join(" ", tipos)
                                                          : " (" + tipos.size() + " tokens)");
            passou = esperado.equals("OK")
                    && (!cab.containsKey("tokens") || String.join(" ", tipos).equals(cab.get("tokens")));
            if (esperado.equals("OK") && cab.containsKey("tokens")) {
                esperado = "OK tokens=" + cab.get("tokens");
            }
        } else {
            Diagnostico d = erros.get(0);
            String tipo = d.fase().equals(Diagnostico.LEXICO) ? "ERRO-LEXICO" : "ERRO-SINTATICO";
            observado = tipo + " " + d.linha() + ":" + d.coluna() + "  (" + d.mensagem() + ")";
            passou = esperado.equals(tipo + " " + d.linha() + ":" + d.coluna());
        }
        return new Resultado(arquivo, etapa, objetivo, esperado, observado, passou);
    }

    private static Map<String, String> cabecalho(String texto) {
        Map<String, String> m = new HashMap<>();
        for (String linha : texto.split("\r\n|\r|\n")) {
            if (!linha.startsWith("// @")) break;
            int dois = linha.indexOf(':');
            if (dois < 0) break;
            m.put(linha.substring(4, dois).trim(), linha.substring(dois + 1).trim());
        }
        return m;
    }
}
