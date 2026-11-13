package sindarin;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.WritableToken;

import sindarin.gen.SindarinLexer;

/**
 * Lexer gerado pelo ANTLR + reclassificação por NFC (seção 5.1 do enunciado).
 *
 * Problema: "û_maer" escrito com 'u' + acento combinante (NFD) não casa com o literal
 * 'û_maer' da gramática (que está em NFC). O reconhecimento inicial, porém, ACEITA marcas
 * combinantes e devolve o texto como ID. Aqui o texto do ID é normalizado para NFC e
 * comparado com a tabela de palavras reservadas; se for reservada, o tipo do token é trocado.
 *
 * Só o TIPO muda: o texto e as posições do token continuam sendo os do arquivo original.
 * A tabela é montada a partir dos literais da própria gramática, então nunca fica
 * dessincronizada das 59 palavras reservadas.
 */
public class SindarinLexerNfc extends SindarinLexer {

    private static final Map<String, Integer> RESERVADAS = montarTabela();

    public SindarinLexerNfc(CharStream entrada) {
        super(entrada);
    }

    @Override
    public Token nextToken() {
        Token t = super.nextToken();
        if (t.getType() == ID && t instanceof WritableToken w) {
            Integer tipo = RESERVADAS.get(nfc(t.getText()));
            if (tipo != null) {
                w.setType(tipo);
            }
        }
        return t;
    }

    /** Forma canônica NFC: usada para comparar palavras e identificadores. */
    public static String nfc(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFC);
    }

    private static Map<String, Integer> montarTabela() {
        Vocabulary v = VOCABULARY;
        Map<String, Integer> mapa = new HashMap<>();
        for (int tipo = 1; tipo <= v.getMaxTokenType(); tipo++) {
            String literal = v.getLiteralName(tipo);
            if (literal == null) continue;
            // tira as aspas simples e desfaz os escapes \\uXXXX que o ANTLR usa em VOCABULARY
            String palavra = desescapar(literal.substring(1, literal.length() - 1));
            if (Character.isLetter(palavra.codePointAt(0))) {
                mapa.put(nfc(palavra), tipo);
            }
        }
        return mapa;
    }

    public static String desescapar(String s) {
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\\\u([0-9A-Fa-f]{4})").matcher(s);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            m.appendReplacement(sb, java.util.regex.Matcher.quoteReplacement(
                    String.valueOf((char) Integer.parseInt(m.group(1), 16))));
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
