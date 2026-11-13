// Generated from grammar/SindarinParser.g4 by ANTLR 4.13.2
package sindarin.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SindarinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SindarinParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SindarinParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SindarinParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#blocoRecursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoRecursos(SindarinParser.BlocoRecursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#blocoSetup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoSetup(SindarinParser.BlocoSetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#blocoLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoLoop(SindarinParser.BlocoLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#declaracaoRecurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoRecurso(SindarinParser.DeclaracaoRecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#tipoRecurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoRecurso(SindarinParser.TipoRecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#construtorPino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrutorPino(SindarinParser.ConstrutorPinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoGlobal(SindarinParser.DeclaracaoGlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#declaracaoConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoConstante(SindarinParser.DeclaracaoConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#declaracaoVariavelGlobal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavelGlobal(SindarinParser.DeclaracaoVariavelGlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#declaracaoVariavelLocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavelLocal(SindarinParser.DeclaracaoVariavelLocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SindarinParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#tipoEscalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEscalar(SindarinParser.TipoEscalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#larguraInteira}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLarguraInteira(SindarinParser.LarguraInteiraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#qualificadorInstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualificadorInstante(SindarinParser.QualificadorInstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#tipoVetor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVetor(SindarinParser.TipoVetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoFuncao(SindarinParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(SindarinParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(SindarinParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(SindarinParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#itemBloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemBloco(SindarinParser.ItemBlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoAtribuicao}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(SindarinParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoAcao}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAcao(SindarinParser.ComandoAcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoSerialBegin}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSerialBegin(SindarinParser.ComandoSerialBeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoCondicional}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCondicional(SindarinParser.ComandoCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoSelecao}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSelecao(SindarinParser.ComandoSelecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoEnquanto}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEnquanto(SindarinParser.ComandoEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoPara}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPara(SindarinParser.ComandoParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoRepeticao}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(SindarinParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoFacaEnquanto}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoFacaEnquanto(SindarinParser.ComandoFacaEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoInterromper}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoInterromper(SindarinParser.ComandoInterromperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoContinuar}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoContinuar(SindarinParser.ComandoContinuarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComandoRetorno}
	 * labeled alternative in {@link SindarinParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRetorno(SindarinParser.ComandoRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(SindarinParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#indiceVetor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndiceVetor(SindarinParser.IndiceVetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#inicializacaoSerial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacaoSerial(SindarinParser.InicializacaoSerialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao(SindarinParser.AcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcaoImprimir}
	 * labeled alternative in {@link SindarinParser#corpoAcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcaoImprimir(SindarinParser.AcaoImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcaoImprimirLinha}
	 * labeled alternative in {@link SindarinParser#corpoAcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcaoImprimirLinha(SindarinParser.AcaoImprimirLinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcaoEnviarByte}
	 * labeled alternative in {@link SindarinParser#corpoAcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcaoEnviarByte(SindarinParser.AcaoEnviarByteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcaoEsperar}
	 * labeled alternative in {@link SindarinParser#corpoAcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcaoEsperar(SindarinParser.AcaoEsperarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcaoEscreverPlaca}
	 * labeled alternative in {@link SindarinParser#corpoAcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcaoEscreverPlaca(SindarinParser.AcaoEscreverPlacaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcaoChamar}
	 * labeled alternative in {@link SindarinParser#corpoAcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcaoChamar(SindarinParser.AcaoChamarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#chamadaAcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaAcao(SindarinParser.ChamadaAcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(SindarinParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#vinculoPresenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVinculoPresenca(SindarinParser.VinculoPresencaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(SindarinParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(SindarinParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#casoSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoSelecao(SindarinParser.CasoSelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#casoPadrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoPadrao(SindarinParser.CasoPadraoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#lacoEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLacoEnquanto(SindarinParser.LacoEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#repeticaoContada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticaoContada(SindarinParser.RepeticaoContadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#lacoFacaEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLacoFacaEnquanto(SindarinParser.LacoFacaEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#lacoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLacoPara(SindarinParser.LacoParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InicializacaoDeclaracao}
	 * labeled alternative in {@link SindarinParser#inicializacaoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacaoDeclaracao(SindarinParser.InicializacaoDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InicializacaoAtribuicao}
	 * labeled alternative in {@link SindarinParser#inicializacaoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacaoAtribuicao(SindarinParser.InicializacaoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InicializacaoChamada}
	 * labeled alternative in {@link SindarinParser#inicializacaoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacaoChamada(SindarinParser.InicializacaoChamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtualizacaoAtribuicao}
	 * labeled alternative in {@link SindarinParser#atualizacaoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtualizacaoAtribuicao(SindarinParser.AtualizacaoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtualizacaoChamada}
	 * labeled alternative in {@link SindarinParser#atualizacaoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtualizacaoChamada(SindarinParser.AtualizacaoChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(SindarinParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#expressaoOu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoOu(SindarinParser.ExpressaoOuContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#expressaoE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoE(SindarinParser.ExpressaoEContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(SindarinParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#operadorRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorRelacional(SindarinParser.OperadorRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAditiva(SindarinParser.ExpressaoAditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoMultiplicativa(SindarinParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoUnaria(SindarinParser.ExpressaoUnariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioLiteral}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioLiteral(SindarinParser.PrimarioLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioLista}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioLista(SindarinParser.PrimarioListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioParenteses}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioParenteses(SindarinParser.PrimarioParentesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioChamada}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioChamada(SindarinParser.PrimarioChamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioAcessoVetor}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioAcessoVetor(SindarinParser.PrimarioAcessoVetorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioIdentificador}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioIdentificador(SindarinParser.PrimarioIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioLeituraSerial}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioLeituraSerial(SindarinParser.PrimarioLeituraSerialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioRelogio}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioRelogio(SindarinParser.PrimarioRelogioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioLeituraDigital}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioLeituraDigital(SindarinParser.PrimarioLeituraDigitalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioLeituraAnalogica}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioLeituraAnalogica(SindarinParser.PrimarioLeituraAnalogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioConversao}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioConversao(SindarinParser.PrimarioConversaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioDuracao}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioDuracao(SindarinParser.PrimarioDuracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimarioBits}
	 * labeled alternative in {@link SindarinParser#primario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarioBits(SindarinParser.PrimarioBitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SindarinParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#chamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada(SindarinParser.ChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(SindarinParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#listaVetorial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVetorial(SindarinParser.ListaVetorialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#conversao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversao(SindarinParser.ConversaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#construtorDuracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrutorDuracao(SindarinParser.ConstrutorDuracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SindarinParser#operacaoBits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoBits(SindarinParser.OperacaoBitsContext ctx);
}