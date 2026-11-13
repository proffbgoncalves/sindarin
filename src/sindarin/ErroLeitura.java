package sindarin;

/** Falha ao ler o arquivo-fonte (arquivo ausente ou UTF-8 malformado). */
public class ErroLeitura extends Exception {
	private static final long serialVersionUID = 1L;
    public ErroLeitura(String mensagem) {
        super(mensagem);
    }
}
