package sindarin;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/** Imprime a árvore sintática concreta com recuo (uma regra ou token por linha). */
public final class ImpressorArvore {

    private ImpressorArvore() {}

    public static String indentada(ParseTree raiz, Parser parser) {
        StringBuilder sb = new StringBuilder();
        imprimir(raiz, parser, 0, sb);
        return sb.toString();
    }

    private static void imprimir(ParseTree no, Parser parser, int nivel, StringBuilder sb) {
        sb.append("  ".repeat(nivel));
        if (no instanceof ErrorNode e) {
            sb.append("<erro> '").append(e.getText()).append("'\n");
            return;
        }
        if (no instanceof TerminalNode t) {
            Vocabulary v = parser.getVocabulary();
            String nome = t.getSymbol().getType() == -1 ? "EOF" : v.getSymbolicName(t.getSymbol().getType());
            sb.append(nome).append(" '").append(t.getText()).append("'\n");
            return;
        }
        ParserRuleContext ctx = (ParserRuleContext) no;
        String regra = parser.getRuleNames()[ctx.getRuleIndex()];
        sb.append(regra);
        String rotulo = ctx.getClass().getSimpleName().replaceAll("Context$", "");
        if (!rotulo.equalsIgnoreCase(regra)) {
            sb.append("  #").append(rotulo);        // alternativa rotulada na gramática
        }
        sb.append('\n');
        for (int i = 0; i < ctx.getChildCount(); i++) {
            imprimir(ctx.getChild(i), parser, nivel + 1, sb);
        }
    }
}
