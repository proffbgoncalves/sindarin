package sindarin;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.IntervalSet;

import sindarin.gen.SindarinLexer;

/**
 * Converte os erros do parser em {@link Diagnostico}s em português, com a posição calculada
 * no texto original (ver {@link Posicoes}). A posição apontada é a do PRIMEIRO TOKEN que a
 * gramática não aceitou; para um ';' esquecido, por exemplo, é o token seguinte ao lugar
 * onde o ';' deveria estar.
 */
public class ErroSintaticoListener extends BaseErrorListener {

    private final Posicoes posicoes;
    private final List<Diagnostico> erros = new ArrayList<>();

    public ErroSintaticoListener(Posicoes posicoes) {
        this.posicoes = posicoes;
    }

    public List<Diagnostico> erros() {
        return erros;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> reconhecedor, Object simboloOfensor,
                            int linhaAntlr, int colunaAntlr, String msgAntlr, RecognitionException e) {
        Token t = (Token) simboloOfensor;
        int indice = t.getStartIndex();
        String encontrado = t.getType() == Token.EOF ? "fim do arquivo" : "'" + t.getText() + "'";

        IntervalSet esperados = null;
        Vocabulary vocab = reconhecedor.getVocabulary();
        if (reconhecedor instanceof Parser p) {
            try {
                esperados = p.getExpectedTokens();
            } catch (RuntimeException ignorada) {
                // sem lista de esperados: a mensagem fica só com o token encontrado
            }
        }

        StringBuilder msg = new StringBuilder("token inesperado ").append(encontrado);
        if (esperados != null && !esperados.isNil()) {
            msg.append("; esperado: ").append(descrever(esperados, vocab));
        }
        String dica = dica(t, esperados);
        if (dica != null) msg.append(" — dica: ").append(dica);

        erros.add(new Diagnostico(Diagnostico.SINTATICO,
                posicoes.linha(indice), posicoes.coluna(indice), msg.toString()));
    }

    // ---------------------------------------------------------------- mensagens

    private static final int LIMITE = 8;

    private static final java.util.Set<Integer> OPERADORES = java.util.Set.of(
            SindarinLexer.EQ, SindarinLexer.NEQ, SindarinLexer.LE, SindarinLexer.GE, SindarinLexer.LT,
            SindarinLexer.GT, SindarinLexer.PLUS, SindarinLexer.MINUS, SindarinLexer.STAR,
            SindarinLexer.SLASH, SindarinLexer.PERCENT, SindarinLexer.AND, SindarinLexer.OR);

    /** Lista o que era esperado; operadores são resumidos em "um operador" para não encobrir o resto. */
    private static String descrever(IntervalSet esperados, Vocabulary vocab) {
        List<String> nomes = new ArrayList<>();
        boolean temOperador = false;
        for (int tipo : esperados.toList()) {
            if (OPERADORES.contains(tipo)) {
                temOperador = true;
            } else {
                nomes.add(nomeAmigavel(tipo, vocab));
            }
        }
        if (nomes.size() > LIMITE) {
            int total = nomes.size();
            nomes = new ArrayList<>(nomes.subList(0, LIMITE));
            nomes.add("... (" + total + " possibilidades)");
        }
        if (temOperador) nomes.add("um operador");
        return String.join(", ", nomes);
    }

    private static String nomeAmigavel(int tipo, Vocabulary vocab) {
        switch (tipo) {
            case Token.EOF:                      return "fim do arquivo";
            case SindarinLexer.ID:               return "identificador";
            case SindarinLexer.INT_LITERAL:      return "numeral inteiro";
            case SindarinLexer.FLOAT_LITERAL:    return "numeral real";
            case SindarinLexer.STRING_LITERAL:   return "texto entre aspas";
            default:
                String literal = vocab.getLiteralName(tipo);
                return literal != null ? "'" + SindarinLexerNfc.desescapar(literal.substring(1, literal.length() - 1)) + "'"
                               : vocab.getSymbolicName(tipo);
        }
    }

    /** Dicas para os enganos mais comuns de quem está aprendendo a sintaxe de Sindarin. */
    private static String dica(Token ofensor, IntervalSet esperados) {
        boolean esperaMi = esperados != null && esperados.contains(SindarinLexer.IN);
        if (ofensor.getType() == SindarinLexer.LBRACE && esperaMi) {
            return "todo bloco é introduzido por 'mi' imediatamente antes de '{'";
        }
        if (ofensor.getType() == SindarinLexer.IN) {
            return "'mi' só pode aparecer imediatamente antes de '{', depois do cabeçalho completo";
        }
        boolean podeComecarComando = ofensor.getType() == SindarinLexer.RBRACE || ofensor.getType() == Token.EOF
                || ofensor.getType() == SindarinLexer.ID
                || (ofensor.getText() != null && ofensor.getText().codePointAt(0) != '('
                    && Character.isLetter(ofensor.getText().codePointAt(0)));
        if (podeComecarComando && esperados != null && esperados.contains(SindarinLexer.SEMI)) {
            return "falta ';' ao fim do comando ou da declaração anterior";
        }
        return null;
    }
}
