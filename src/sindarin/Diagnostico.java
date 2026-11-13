package sindarin;

/**
 * Um erro encontrado pelo compilador, com a fase em que foi detectado e a posição
 * no texto ORIGINAL (linha e coluna começam em 1; a coluna conta pontos de código).
 */
public record Diagnostico(String fase, int linha, int coluna, String mensagem) {

    public static final String LEXICO = "léxico";
    public static final String SINTATICO = "sintático";

    public String formatar(String arquivo) {
        return arquivo + ":" + linha + ":" + coluna + ": erro " + fase + ": " + mensagem;
    }
}
