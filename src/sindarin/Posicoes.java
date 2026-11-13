package sindarin;

import java.util.ArrayList;
import java.util.List;

/**
 * Converte um índice em PONTOS DE CÓDIGO do texto em (linha, coluna), como pede a seção 21:
 * linha e coluna começam em 1; CRLF conta como UMA quebra, assim como CR ou LF isolados;
 * a coluna conta pontos de código do texto original (uma tabulação conta como 1).
 *
 * O ANTLR só reconhece LF como quebra de linha, por isso as posições dos diagnósticos
 * são calculadas aqui, a partir de Token.getStartIndex(), e não de Token.getLine().
 */
public final class Posicoes {

    private final int[] inicioDeLinha;

    public Posicoes(String texto) {
        int[] cps = texto.codePoints().toArray();
        List<Integer> inicios = new ArrayList<>();
        inicios.add(0);
        for (int i = 0; i < cps.length; i++) {
            if (cps[i] == '\n') {
                inicios.add(i + 1);
            } else if (cps[i] == '\r') {
                if (i + 1 < cps.length && cps[i + 1] == '\n') {
                    i++;
                }
                inicios.add(i + 1);
            }
        }
        inicioDeLinha = inicios.stream().mapToInt(Integer::intValue).toArray();
    }

    /** Linha (a partir de 1) do ponto de código de índice {@code indice}. */
    public int linha(int indice) {
        int lo = 0, hi = inicioDeLinha.length - 1;
        while (lo < hi) {
            int meio = (lo + hi + 1) >>> 1;
            if (inicioDeLinha[meio] <= indice) {
                lo = meio;
            } else {
                hi = meio - 1;
            }
        }
        return lo + 1;
    }

    /** Coluna (a partir de 1) do ponto de código de índice {@code indice}. */
    public int coluna(int indice) {
        return indice - inicioDeLinha[linha(indice) - 1] + 1;
    }
}
