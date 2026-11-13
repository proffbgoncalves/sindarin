package sindarin;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * Lê um programa Sindarin seguindo a seção 21 do enunciado:
 * - o arquivo é UTF-8; UTF-8 malformado é erro de leitura (sem substituição silenciosa);
 * - um BOM UTF-8 no INÍCIO do arquivo é aceito e removido (em qualquer outro lugar,
 *   U+FEFF vira ERROR_CHAR no lexer);
 * - o texto NÃO é normalizado: comentários e strings chegam exatamente como estão.
 */
public final class LeitorFonte {

    private LeitorFonte() {}

    public static String ler(Path caminho) throws ErroLeitura {
        byte[] bytes;
        try {
            bytes = Files.readAllBytes(caminho);
        } catch (NoSuchFileException e) {
            throw new ErroLeitura("arquivo não encontrado: " + caminho);
        } catch (IOException e) {
            throw new ErroLeitura("não foi possível ler " + caminho + ": " + e.getMessage());
        }
        return decodificar(bytes);
    }

    public static String decodificar(byte[] bytes) throws ErroLeitura {
        CharsetDecoder dec = StandardCharsets.UTF_8.newDecoder()
                .onMalformedInput(CodingErrorAction.REPORT)
                .onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer in = ByteBuffer.wrap(bytes);
        CharBuffer out = CharBuffer.allocate(bytes.length + 1);
        CoderResult r = dec.decode(in, out, true);
        if (r.isError()) {
            throw new ErroLeitura("UTF-8 malformado no byte " + in.position()
                    + " (o arquivo-fonte deve ser UTF-8 válido)");
        }
        dec.flush(out);
        out.flip();
        String texto = out.toString();
        if (!texto.isEmpty() && texto.charAt(0) == '\uFEFF') {
            texto = texto.substring(1);
        }
        return texto;
    }
}
