// Generated from grammar/SindarinParser.g4 by ANTLR 4.13.2
package sindarin.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SindarinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HARDWARE=1, SETUP=2, LOOP=3, IN=4, TO=5, ACTION=6, CONST=7, FUNCTION=8, 
		RETURN=9, INT_TYPE=10, BYTE_TYPE=11, BOOL_TYPE=12, LEVEL_TYPE=13, TIME_TYPE=14, 
		TEXT_TYPE=15, OPTIONAL_BYTE_TYPE=16, FLOAT=17, VOID=18, TRUE=19, FALSE=20, 
		HIGH=21, LOW=22, IF=23, ELSE=24, SWITCH=25, CASE=26, WHILE=27, REPEAT=28, 
		DO=29, FOR=30, BREAK=31, CONTINUE=32, AND=33, OR=34, NOT=35, BIT_AND=36, 
		BIT_OR=37, BIT_XOR=38, BIT_NOT=39, SHIFT_LEFT=40, SHIFT_RIGHT=41, DIGITAL_WRITE=42, 
		ANALOG_WRITE=43, DELAY=44, DIGITAL_READ=45, ANALOG_READ=46, MILLIS=47, 
		SERIAL_PRINT=48, SERIAL_PRINTLN=49, SERIAL_WRITE=50, SERIAL_BEGIN=51, 
		SERIAL_READ=52, DIGITAL_PIN=53, ANALOG_PIN=54, INPUT=55, INPUT_PULLUP=56, 
		OUTPUT=57, ANALOG_INPUT=58, PWM_OUTPUT=59, EQ=60, NEQ=61, LE=62, GE=63, 
		LT=64, GT=65, ASSIGN=66, PLUS=67, MINUS=68, STAR=69, SLASH=70, PERCENT=71, 
		LBRACE=72, RBRACE=73, LPAREN=74, RPAREN=75, LBRACK=76, RBRACK=77, SEMI=78, 
		COMMA=79, COLON=80, INT_LITERAL=81, FLOAT_LITERAL=82, STRING_LITERAL=83, 
		INVALID_NUMBER=84, INVALID_STRING=85, RESERVED_IDENTIFIER=86, ID=87, WS=88, 
		LINE_COMMENT=89, BLOCK_COMMENT=90, UNTERMINATED_COMMENT=91, ERROR_CHAR=92;
	public static final int
		RULE_programa = 0, RULE_blocoRecursos = 1, RULE_blocoSetup = 2, RULE_blocoLoop = 3, 
		RULE_declaracaoRecurso = 4, RULE_tipoRecurso = 5, RULE_construtorPino = 6, 
		RULE_declaracaoGlobal = 7, RULE_declaracaoConstante = 8, RULE_declaracaoVariavelGlobal = 9, 
		RULE_declaracaoVariavelLocal = 10, RULE_tipo = 11, RULE_tipoEscalar = 12, 
		RULE_larguraInteira = 13, RULE_qualificadorInstante = 14, RULE_tipoVetor = 15, 
		RULE_declaracaoFuncao = 16, RULE_parametros = 17, RULE_parametro = 18, 
		RULE_bloco = 19, RULE_itemBloco = 20, RULE_comando = 21, RULE_atribuicao = 22, 
		RULE_indiceVetor = 23, RULE_inicializacaoSerial = 24, RULE_acao = 25, 
		RULE_corpoAcao = 26, RULE_chamadaAcao = 27, RULE_condicional = 28, RULE_vinculoPresenca = 29, 
		RULE_senao = 30, RULE_selecao = 31, RULE_casoSelecao = 32, RULE_casoPadrao = 33, 
		RULE_lacoEnquanto = 34, RULE_repeticaoContada = 35, RULE_lacoFacaEnquanto = 36, 
		RULE_lacoPara = 37, RULE_inicializacaoPara = 38, RULE_atualizacaoPara = 39, 
		RULE_expressao = 40, RULE_expressaoOu = 41, RULE_expressaoE = 42, RULE_expressaoRelacional = 43, 
		RULE_operadorRelacional = 44, RULE_expressaoAditiva = 45, RULE_expressaoMultiplicativa = 46, 
		RULE_expressaoUnaria = 47, RULE_primario = 48, RULE_literal = 49, RULE_chamada = 50, 
		RULE_argumentos = 51, RULE_listaVetorial = 52, RULE_conversao = 53, RULE_construtorDuracao = 54, 
		RULE_operacaoBits = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "blocoRecursos", "blocoSetup", "blocoLoop", "declaracaoRecurso", 
			"tipoRecurso", "construtorPino", "declaracaoGlobal", "declaracaoConstante", 
			"declaracaoVariavelGlobal", "declaracaoVariavelLocal", "tipo", "tipoEscalar", 
			"larguraInteira", "qualificadorInstante", "tipoVetor", "declaracaoFuncao", 
			"parametros", "parametro", "bloco", "itemBloco", "comando", "atribuicao", 
			"indiceVetor", "inicializacaoSerial", "acao", "corpoAcao", "chamadaAcao", 
			"condicional", "vinculoPresenca", "senao", "selecao", "casoSelecao", 
			"casoPadrao", "lacoEnquanto", "repeticaoContada", "lacoFacaEnquanto", 
			"lacoPara", "inicializacaoPara", "atualizacaoPara", "expressao", "expressaoOu", 
			"expressaoE", "expressaoRelacional", "operadorRelacional", "expressaoAditiva", 
			"expressaoMultiplicativa", "expressaoUnaria", "primario", "literal", 
			"chamada", "argumentos", "listaVetorial", "conversao", "construtorDuracao", 
			"operacaoBits"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'gwaith'", "'minui'", "'cor'", "'mi'", "'an'", "'caro'", "'sador'", 
			"'curu'", "'dandol'", "'nedia'", "'nedia_min'", "'maer_peth'", "'calad_gwath'", 
			"'aur'", "'peth'", "'cen_min'", "'nen'", "'pen'", "'maer'", "'\\u00FB_maer'", 
			"'calad'", "'gwath'", "'maer_an'", "'egor_mi'", "'curu_egor'", "'curu_min'", 
			"'cor_maer'", "'cor_nedia'", "'cor_caro'", "'cor_pad'", "'methed'", "'cor_minui'", 
			"'a'", "'egor'", "'\\u00FB'", "'a_min'", "'egor_min'", "'egor_pen'", 
			"'\\u00FB_min'", "'d\\u00FBn_min'", "'rh\\u00FBn_min'", "'caro_calad'", 
			"'caro_nen'", "'aur_d\\u00EEn'", "'cen_calad'", "'cen_nen'", "'h\\u00ED'", 
			"'pedo'", "'pedo_meth'", "'pedo_min'", "'minui_peth'", "'cen'", "'ceber'", 
			"'ceber_nen'", "'ceber_cen'", "'ceber_calad'", "'ceber_caro'", "'nen_cen'", 
			"'nen_caro'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"';'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HARDWARE", "SETUP", "LOOP", "IN", "TO", "ACTION", "CONST", "FUNCTION", 
			"RETURN", "INT_TYPE", "BYTE_TYPE", "BOOL_TYPE", "LEVEL_TYPE", "TIME_TYPE", 
			"TEXT_TYPE", "OPTIONAL_BYTE_TYPE", "FLOAT", "VOID", "TRUE", "FALSE", 
			"HIGH", "LOW", "IF", "ELSE", "SWITCH", "CASE", "WHILE", "REPEAT", "DO", 
			"FOR", "BREAK", "CONTINUE", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", 
			"BIT_XOR", "BIT_NOT", "SHIFT_LEFT", "SHIFT_RIGHT", "DIGITAL_WRITE", "ANALOG_WRITE", 
			"DELAY", "DIGITAL_READ", "ANALOG_READ", "MILLIS", "SERIAL_PRINT", "SERIAL_PRINTLN", 
			"SERIAL_WRITE", "SERIAL_BEGIN", "SERIAL_READ", "DIGITAL_PIN", "ANALOG_PIN", 
			"INPUT", "INPUT_PULLUP", "OUTPUT", "ANALOG_INPUT", "PWM_OUTPUT", "EQ", 
			"NEQ", "LE", "GE", "LT", "GT", "ASSIGN", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "COLON", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"INVALID_NUMBER", "INVALID_STRING", "RESERVED_IDENTIFIER", "ID", "WS", 
			"LINE_COMMENT", "BLOCK_COMMENT", "UNTERMINATED_COMMENT", "ERROR_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SindarinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SindarinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BlocoRecursosContext blocoRecursos() {
			return getRuleContext(BlocoRecursosContext.class,0);
		}
		public BlocoSetupContext blocoSetup() {
			return getRuleContext(BlocoSetupContext.class,0);
		}
		public BlocoLoopContext blocoLoop() {
			return getRuleContext(BlocoLoopContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SindarinParser.EOF, 0); }
		public List<DeclaracaoGlobalContext> declaracaoGlobal() {
			return getRuleContexts(DeclaracaoGlobalContext.class);
		}
		public DeclaracaoGlobalContext declaracaoGlobal(int i) {
			return getRuleContext(DeclaracaoGlobalContext.class,i);
		}
		public List<DeclaracaoFuncaoContext> declaracaoFuncao() {
			return getRuleContexts(DeclaracaoFuncaoContext.class);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao(int i) {
			return getRuleContext(DeclaracaoFuncaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			blocoRecursos();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 523392L) != 0) || _la==LBRACK) {
				{
				{
				setState(113);
				declaracaoGlobal();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(119);
				declaracaoFuncao();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			blocoSetup();
			setState(126);
			blocoLoop();
			setState(127);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoRecursosContext extends ParserRuleContext {
		public TerminalNode HARDWARE() { return getToken(SindarinParser.HARDWARE, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public TerminalNode LBRACE() { return getToken(SindarinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SindarinParser.RBRACE, 0); }
		public List<DeclaracaoRecursoContext> declaracaoRecurso() {
			return getRuleContexts(DeclaracaoRecursoContext.class);
		}
		public DeclaracaoRecursoContext declaracaoRecurso(int i) {
			return getRuleContext(DeclaracaoRecursoContext.class,i);
		}
		public BlocoRecursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoRecursos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitBlocoRecursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoRecursosContext blocoRecursos() throws RecognitionException {
		BlocoRecursosContext _localctx = new BlocoRecursosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocoRecursos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(HARDWARE);
			setState(130);
			match(IN);
			setState(131);
			match(LBRACE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707587883008L) != 0)) {
				{
				{
				setState(132);
				declaracaoRecurso();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoSetupContext extends ParserRuleContext {
		public TerminalNode SETUP() { return getToken(SindarinParser.SETUP, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public BlocoSetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoSetup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitBlocoSetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoSetupContext blocoSetup() throws RecognitionException {
		BlocoSetupContext _localctx = new BlocoSetupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blocoSetup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(SETUP);
			setState(141);
			match(IN);
			setState(142);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoLoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(SindarinParser.LOOP, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public BlocoLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitBlocoLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoLoopContext blocoLoop() throws RecognitionException {
		BlocoLoopContext _localctx = new BlocoLoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blocoLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LOOP);
			setState(145);
			match(IN);
			setState(146);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoRecursoContext extends ParserRuleContext {
		public TipoRecursoContext tipoRecurso() {
			return getRuleContext(TipoRecursoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SindarinParser.ASSIGN, 0); }
		public ConstrutorPinoContext construtorPino() {
			return getRuleContext(ConstrutorPinoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(SindarinParser.COLON, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoRecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoRecurso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitDeclaracaoRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoRecursoContext declaracaoRecurso() throws RecognitionException {
		DeclaracaoRecursoContext _localctx = new DeclaracaoRecursoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoRecurso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			tipoRecurso();
			setState(149);
			match(ID);
			setState(150);
			match(ASSIGN);
			setState(151);
			construtorPino();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(152);
				match(COLON);
				setState(153);
				expressao();
				}
			}

			setState(156);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoRecursoContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(SindarinParser.OUTPUT, 0); }
		public TerminalNode INPUT() { return getToken(SindarinParser.INPUT, 0); }
		public TerminalNode INPUT_PULLUP() { return getToken(SindarinParser.INPUT_PULLUP, 0); }
		public TerminalNode ANALOG_INPUT() { return getToken(SindarinParser.ANALOG_INPUT, 0); }
		public TerminalNode PWM_OUTPUT() { return getToken(SindarinParser.PWM_OUTPUT, 0); }
		public TipoRecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRecurso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitTipoRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoRecursoContext tipoRecurso() throws RecognitionException {
		TipoRecursoContext _localctx = new TipoRecursoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoRecurso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707587883008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstrutorPinoContext extends ParserRuleContext {
		public TerminalNode DIGITAL_PIN() { return getToken(SindarinParser.DIGITAL_PIN, 0); }
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SindarinParser.INT_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public TerminalNode ANALOG_PIN() { return getToken(SindarinParser.ANALOG_PIN, 0); }
		public ConstrutorPinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtorPino; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitConstrutorPino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrutorPinoContext construtorPino() throws RecognitionException {
		ConstrutorPinoContext _localctx = new ConstrutorPinoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_construtorPino);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITAL_PIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(DIGITAL_PIN);
				setState(161);
				match(LPAREN);
				setState(162);
				match(INT_LITERAL);
				setState(163);
				match(RPAREN);
				}
				break;
			case ANALOG_PIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(ANALOG_PIN);
				setState(165);
				match(LPAREN);
				setState(166);
				match(INT_LITERAL);
				setState(167);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoGlobalContext extends ParserRuleContext {
		public DeclaracaoConstanteContext declaracaoConstante() {
			return getRuleContext(DeclaracaoConstanteContext.class,0);
		}
		public DeclaracaoVariavelGlobalContext declaracaoVariavelGlobal() {
			return getRuleContext(DeclaracaoVariavelGlobalContext.class,0);
		}
		public DeclaracaoGlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoGlobal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitDeclaracaoGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoGlobalContext declaracaoGlobal() throws RecognitionException {
		DeclaracaoGlobalContext _localctx = new DeclaracaoGlobalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracaoGlobal);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				declaracaoConstante();
				}
				break;
			case INT_TYPE:
			case BYTE_TYPE:
			case BOOL_TYPE:
			case LEVEL_TYPE:
			case TIME_TYPE:
			case TEXT_TYPE:
			case OPTIONAL_BYTE_TYPE:
			case FLOAT:
			case VOID:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				declaracaoVariavelGlobal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoConstanteContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SindarinParser.CONST, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SindarinParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public DeclaracaoConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoConstante; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitDeclaracaoConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoConstanteContext declaracaoConstante() throws RecognitionException {
		DeclaracaoConstanteContext _localctx = new DeclaracaoConstanteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoConstante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CONST);
			setState(175);
			tipo();
			setState(176);
			match(ID);
			setState(177);
			match(ASSIGN);
			setState(178);
			expressao();
			setState(179);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariavelGlobalContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(SindarinParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelGlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavelGlobal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitDeclaracaoVariavelGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelGlobalContext declaracaoVariavelGlobal() throws RecognitionException {
		DeclaracaoVariavelGlobalContext _localctx = new DeclaracaoVariavelGlobalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracaoVariavelGlobal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			tipo();
			setState(182);
			match(ID);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(183);
				match(ASSIGN);
				setState(184);
				expressao();
				}
			}

			setState(187);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariavelLocalContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SindarinParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public DeclaracaoVariavelLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavelLocal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitDeclaracaoVariavelLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelLocalContext declaracaoVariavelLocal() throws RecognitionException {
		DeclaracaoVariavelLocalContext _localctx = new DeclaracaoVariavelLocalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracaoVariavelLocal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			tipo();
			setState(190);
			match(ID);
			setState(191);
			match(ASSIGN);
			setState(192);
			expressao();
			setState(193);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoEscalarContext tipoEscalar() {
			return getRuleContext(TipoEscalarContext.class,0);
		}
		public TipoVetorContext tipoVetor() {
			return getRuleContext(TipoVetorContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BYTE_TYPE:
			case BOOL_TYPE:
			case LEVEL_TYPE:
			case TIME_TYPE:
			case TEXT_TYPE:
			case OPTIONAL_BYTE_TYPE:
			case FLOAT:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				tipoEscalar();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				tipoVetor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoEscalarContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(SindarinParser.INT_TYPE, 0); }
		public TerminalNode BYTE_TYPE() { return getToken(SindarinParser.BYTE_TYPE, 0); }
		public LarguraInteiraContext larguraInteira() {
			return getRuleContext(LarguraInteiraContext.class,0);
		}
		public TerminalNode TIME_TYPE() { return getToken(SindarinParser.TIME_TYPE, 0); }
		public QualificadorInstanteContext qualificadorInstante() {
			return getRuleContext(QualificadorInstanteContext.class,0);
		}
		public TerminalNode BOOL_TYPE() { return getToken(SindarinParser.BOOL_TYPE, 0); }
		public TerminalNode LEVEL_TYPE() { return getToken(SindarinParser.LEVEL_TYPE, 0); }
		public TerminalNode TEXT_TYPE() { return getToken(SindarinParser.TEXT_TYPE, 0); }
		public TerminalNode OPTIONAL_BYTE_TYPE() { return getToken(SindarinParser.OPTIONAL_BYTE_TYPE, 0); }
		public TerminalNode FLOAT() { return getToken(SindarinParser.FLOAT, 0); }
		public TerminalNode VOID() { return getToken(SindarinParser.VOID, 0); }
		public TipoEscalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEscalar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitTipoEscalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEscalarContext tipoEscalar() throws RecognitionException {
		TipoEscalarContext _localctx = new TipoEscalarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipoEscalar);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BYTE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==BYTE_TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(200);
					larguraInteira();
					}
				}

				}
				break;
			case TIME_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(TIME_TYPE);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(204);
					qualificadorInstante();
					}
				}

				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(BOOL_TYPE);
				}
				break;
			case LEVEL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(LEVEL_TYPE);
				}
				break;
			case TEXT_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(TEXT_TYPE);
				}
				break;
			case OPTIONAL_BYTE_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(OPTIONAL_BYTE_TYPE);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(FLOAT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LarguraInteiraContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SindarinParser.LT, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SindarinParser.INT_LITERAL, 0); }
		public TerminalNode GT() { return getToken(SindarinParser.GT, 0); }
		public LarguraInteiraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_larguraInteira; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitLarguraInteira(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LarguraInteiraContext larguraInteira() throws RecognitionException {
		LarguraInteiraContext _localctx = new LarguraInteiraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_larguraInteira);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LT);
			setState(216);
			match(INT_LITERAL);
			setState(217);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualificadorInstanteContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SindarinParser.LT, 0); }
		public TerminalNode MILLIS() { return getToken(SindarinParser.MILLIS, 0); }
		public TerminalNode GT() { return getToken(SindarinParser.GT, 0); }
		public QualificadorInstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualificadorInstante; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitQualificadorInstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualificadorInstanteContext qualificadorInstante() throws RecognitionException {
		QualificadorInstanteContext _localctx = new QualificadorInstanteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_qualificadorInstante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(LT);
			setState(220);
			match(MILLIS);
			setState(221);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoVetorContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SindarinParser.LBRACK, 0); }
		public TipoEscalarContext tipoEscalar() {
			return getRuleContext(TipoEscalarContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SindarinParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(SindarinParser.RBRACK, 0); }
		public TipoVetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVetor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitTipoVetor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVetorContext tipoVetor() throws RecognitionException {
		TipoVetorContext _localctx = new TipoVetorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipoVetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LBRACK);
			setState(224);
			tipoEscalar();
			setState(225);
			match(SEMI);
			setState(226);
			match(INT_LITERAL);
			setState(227);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SindarinParser.FUNCTION, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitDeclaracaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(FUNCTION);
			setState(230);
			tipo();
			setState(231);
			match(ID);
			setState(232);
			match(LPAREN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707588406272L) != 0) || _la==LBRACK) {
				{
				setState(233);
				parametros();
				}
			}

			setState(236);
			match(RPAREN);
			setState(237);
			match(IN);
			setState(238);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SindarinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SindarinParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			parametro();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				parametro();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoRecursoContext tipoRecurso() {
			return getRuleContext(TipoRecursoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BYTE_TYPE:
			case BOOL_TYPE:
			case LEVEL_TYPE:
			case TIME_TYPE:
			case TEXT_TYPE:
			case OPTIONAL_BYTE_TYPE:
			case FLOAT:
			case VOID:
			case LBRACK:
				{
				setState(248);
				tipo();
				}
				break;
			case INPUT:
			case INPUT_PULLUP:
			case OUTPUT:
			case ANALOG_INPUT:
			case PWM_OUTPUT:
				{
				setState(249);
				tipoRecurso();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(252);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SindarinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SindarinParser.RBRACE, 0); }
		public List<ItemBlocoContext> itemBloco() {
			return getRuleContexts(ItemBlocoContext.class);
		}
		public ItemBlocoContext itemBloco(int i) {
			return getRuleContext(ItemBlocoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(LBRACE);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251808311869120L) != 0) || _la==LBRACK || _la==ID) {
				{
				{
				setState(255);
				itemBloco();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemBlocoContext extends ParserRuleContext {
		public DeclaracaoConstanteContext declaracaoConstante() {
			return getRuleContext(DeclaracaoConstanteContext.class,0);
		}
		public DeclaracaoVariavelLocalContext declaracaoVariavelLocal() {
			return getRuleContext(DeclaracaoVariavelLocalContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ItemBlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemBloco; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitItemBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemBlocoContext itemBloco() throws RecognitionException {
		ItemBlocoContext _localctx = new ItemBlocoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_itemBloco);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				declaracaoConstante();
				}
				break;
			case INT_TYPE:
			case BYTE_TYPE:
			case BOOL_TYPE:
			case LEVEL_TYPE:
			case TIME_TYPE:
			case TEXT_TYPE:
			case OPTIONAL_BYTE_TYPE:
			case FLOAT:
			case VOID:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				declaracaoVariavelLocal();
				}
				break;
			case ACTION:
			case RETURN:
			case IF:
			case SWITCH:
			case WHILE:
			case REPEAT:
			case DO:
			case FOR:
			case BREAK:
			case CONTINUE:
			case SERIAL_BEGIN:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				comando();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoAtribuicaoContext extends ComandoContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public ComandoAtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoCondicionalContext extends ComandoContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ComandoCondicionalContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoCondicional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoInterromperContext extends ComandoContext {
		public TerminalNode BREAK() { return getToken(SindarinParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public ComandoInterromperContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoInterromper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoParaContext extends ComandoContext {
		public LacoParaContext lacoPara() {
			return getRuleContext(LacoParaContext.class,0);
		}
		public ComandoParaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoPara(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoRepeticaoContext extends ComandoContext {
		public RepeticaoContadaContext repeticaoContada() {
			return getRuleContext(RepeticaoContadaContext.class,0);
		}
		public ComandoRepeticaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContinuarContext extends ComandoContext {
		public TerminalNode CONTINUE() { return getToken(SindarinParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public ComandoContinuarContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoContinuar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoAcaoContext extends ComandoContext {
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public ComandoAcaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoAcao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoEnquantoContext extends ComandoContext {
		public LacoEnquantoContext lacoEnquanto() {
			return getRuleContext(LacoEnquantoContext.class,0);
		}
		public ComandoEnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoFacaEnquantoContext extends ComandoContext {
		public LacoFacaEnquantoContext lacoFacaEnquanto() {
			return getRuleContext(LacoFacaEnquantoContext.class,0);
		}
		public ComandoFacaEnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoFacaEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoSelecaoContext extends ComandoContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public ComandoSelecaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoSelecao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoRetornoContext extends ComandoContext {
		public TerminalNode RETURN() { return getToken(SindarinParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoRetornoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComandoSerialBeginContext extends ComandoContext {
		public InicializacaoSerialContext inicializacaoSerial() {
			return getRuleContext(InicializacaoSerialContext.class,0);
		}
		public ComandoSerialBeginContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitComandoSerialBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comando);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ComandoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				atribuicao();
				setState(269);
				match(SEMI);
				}
				break;
			case ACTION:
				_localctx = new ComandoAcaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				acao();
				}
				break;
			case SERIAL_BEGIN:
				_localctx = new ComandoSerialBeginContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				inicializacaoSerial();
				}
				break;
			case IF:
				_localctx = new ComandoCondicionalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				condicional();
				}
				break;
			case SWITCH:
				_localctx = new ComandoSelecaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				selecao();
				}
				break;
			case WHILE:
				_localctx = new ComandoEnquantoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				lacoEnquanto();
				}
				break;
			case FOR:
				_localctx = new ComandoParaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				lacoPara();
				}
				break;
			case REPEAT:
				_localctx = new ComandoRepeticaoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				repeticaoContada();
				}
				break;
			case DO:
				_localctx = new ComandoFacaEnquantoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(278);
				lacoFacaEnquanto();
				}
				break;
			case BREAK:
				_localctx = new ComandoInterromperContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(279);
				match(BREAK);
				setState(280);
				match(SEMI);
				}
				break;
			case CONTINUE:
				_localctx = new ComandoContinuarContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(281);
				match(CONTINUE);
				setState(282);
				match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ComandoRetornoContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(283);
				match(RETURN);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4754253926779904L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 581953L) != 0)) {
					{
					setState(284);
					expressao();
					}
				}

				setState(287);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SindarinParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IndiceVetorContext indiceVetor() {
			return getRuleContext(IndiceVetorContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(291);
				indiceVetor();
				}
			}

			setState(294);
			match(ASSIGN);
			setState(295);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndiceVetorContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SindarinParser.LBRACK, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SindarinParser.RBRACK, 0); }
		public IndiceVetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indiceVetor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitIndiceVetor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndiceVetorContext indiceVetor() throws RecognitionException {
		IndiceVetorContext _localctx = new IndiceVetorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indiceVetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LBRACK);
			setState(298);
			expressao();
			setState(299);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoSerialContext extends ParserRuleContext {
		public TerminalNode SERIAL_BEGIN() { return getToken(SindarinParser.SERIAL_BEGIN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(SindarinParser.INT_LITERAL, 0); }
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public InicializacaoSerialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoSerial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitInicializacaoSerial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoSerialContext inicializacaoSerial() throws RecognitionException {
		InicializacaoSerialContext _localctx = new InicializacaoSerialContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inicializacaoSerial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(SERIAL_BEGIN);
			setState(302);
			match(INT_LITERAL);
			setState(303);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AcaoContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(SindarinParser.ACTION, 0); }
		public CorpoAcaoContext corpoAcao() {
			return getRuleContext(CorpoAcaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_acao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ACTION);
			setState(306);
			corpoAcao();
			setState(307);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoAcaoContext extends ParserRuleContext {
		public CorpoAcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpoAcao; }
	 
		public CorpoAcaoContext() { }
		public void copyFrom(CorpoAcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcaoImprimirLinhaContext extends CorpoAcaoContext {
		public TerminalNode SERIAL_PRINTLN() { return getToken(SindarinParser.SERIAL_PRINTLN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AcaoImprimirLinhaContext(CorpoAcaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAcaoImprimirLinha(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcaoEscreverPlacaContext extends CorpoAcaoContext {
		public TerminalNode TO() { return getToken(SindarinParser.TO, 0); }
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DIGITAL_WRITE() { return getToken(SindarinParser.DIGITAL_WRITE, 0); }
		public TerminalNode ANALOG_WRITE() { return getToken(SindarinParser.ANALOG_WRITE, 0); }
		public AcaoEscreverPlacaContext(CorpoAcaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAcaoEscreverPlaca(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcaoEnviarByteContext extends CorpoAcaoContext {
		public TerminalNode SERIAL_WRITE() { return getToken(SindarinParser.SERIAL_WRITE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AcaoEnviarByteContext(CorpoAcaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAcaoEnviarByte(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcaoImprimirContext extends CorpoAcaoContext {
		public TerminalNode SERIAL_PRINT() { return getToken(SindarinParser.SERIAL_PRINT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AcaoImprimirContext(CorpoAcaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAcaoImprimir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcaoChamarContext extends CorpoAcaoContext {
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public AcaoChamarContext(CorpoAcaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAcaoChamar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcaoEsperarContext extends CorpoAcaoContext {
		public TerminalNode DELAY() { return getToken(SindarinParser.DELAY, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AcaoEsperarContext(CorpoAcaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAcaoEsperar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoAcaoContext corpoAcao() throws RecognitionException {
		CorpoAcaoContext _localctx = new CorpoAcaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_corpoAcao);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SERIAL_PRINT:
				_localctx = new AcaoImprimirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(SERIAL_PRINT);
				setState(310);
				expressao();
				}
				break;
			case SERIAL_PRINTLN:
				_localctx = new AcaoImprimirLinhaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(SERIAL_PRINTLN);
				setState(312);
				expressao();
				}
				break;
			case SERIAL_WRITE:
				_localctx = new AcaoEnviarByteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(SERIAL_WRITE);
				setState(314);
				expressao();
				}
				break;
			case DELAY:
				_localctx = new AcaoEsperarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(DELAY);
				setState(316);
				expressao();
				}
				break;
			case TO:
				_localctx = new AcaoEscreverPlacaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				match(TO);
				setState(318);
				match(ID);
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==DIGITAL_WRITE || _la==ANALOG_WRITE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				expressao();
				}
				break;
			case ID:
				_localctx = new AcaoChamarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				chamada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaAcaoContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(SindarinParser.ACTION, 0); }
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public ChamadaAcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaAcao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitChamadaAcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaAcaoContext chamadaAcao() throws RecognitionException {
		ChamadaAcaoContext _localctx = new ChamadaAcaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_chamadaAcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ACTION);
			setState(325);
			chamada();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SindarinParser.IF, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public VinculoPresencaContext vinculoPresenca() {
			return getRuleContext(VinculoPresencaContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(IF);
			setState(328);
			expressao();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(329);
				vinculoPresenca();
				}
			}

			setState(332);
			match(IN);
			setState(333);
			bloco();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(334);
				senao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VinculoPresencaContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(SindarinParser.TO, 0); }
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public VinculoPresencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vinculoPresenca; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitVinculoPresenca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VinculoPresencaContext vinculoPresenca() throws RecognitionException {
		VinculoPresencaContext _localctx = new VinculoPresencaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_vinculoPresenca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(TO);
			setState(338);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SindarinParser.ELSE, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ELSE);
			setState(341);
			match(IN);
			setState(342);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SindarinParser.SWITCH, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public TerminalNode LBRACE() { return getToken(SindarinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SindarinParser.RBRACE, 0); }
		public List<CasoSelecaoContext> casoSelecao() {
			return getRuleContexts(CasoSelecaoContext.class);
		}
		public CasoSelecaoContext casoSelecao(int i) {
			return getRuleContext(CasoSelecaoContext.class,i);
		}
		public CasoPadraoContext casoPadrao() {
			return getRuleContext(CasoPadraoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(SWITCH);
			setState(345);
			expressao();
			setState(346);
			match(IN);
			setState(347);
			match(LBRACE);
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				casoSelecao();
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(353);
				casoPadrao();
				}
			}

			setState(356);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoSelecaoContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SindarinParser.CASE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CasoSelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoSelecao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitCasoSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoSelecaoContext casoSelecao() throws RecognitionException {
		CasoSelecaoContext _localctx = new CasoSelecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_casoSelecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(CASE);
			setState(359);
			expressao();
			setState(360);
			match(IN);
			setState(361);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoPadraoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SindarinParser.ELSE, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CasoPadraoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoPadrao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitCasoPadrao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoPadraoContext casoPadrao() throws RecognitionException {
		CasoPadraoContext _localctx = new CasoPadraoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_casoPadrao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ELSE);
			setState(364);
			match(IN);
			setState(365);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LacoEnquantoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SindarinParser.WHILE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public LacoEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacoEnquanto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitLacoEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LacoEnquantoContext lacoEnquanto() throws RecognitionException {
		LacoEnquantoContext _localctx = new LacoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lacoEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(WHILE);
			setState(368);
			expressao();
			setState(369);
			match(IN);
			setState(370);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContadaContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(SindarinParser.REPEAT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public RepeticaoContadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticaoContada; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitRepeticaoContada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContadaContext repeticaoContada() throws RecognitionException {
		RepeticaoContadaContext _localctx = new RepeticaoContadaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_repeticaoContada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(REPEAT);
			setState(373);
			expressao();
			setState(374);
			match(IN);
			setState(375);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LacoFacaEnquantoContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(SindarinParser.DO, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SindarinParser.WHILE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SindarinParser.SEMI, 0); }
		public LacoFacaEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacoFacaEnquanto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitLacoFacaEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LacoFacaEnquantoContext lacoFacaEnquanto() throws RecognitionException {
		LacoFacaEnquantoContext _localctx = new LacoFacaEnquantoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lacoFacaEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(DO);
			setState(378);
			match(IN);
			setState(379);
			bloco();
			setState(380);
			match(WHILE);
			setState(381);
			expressao();
			setState(382);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LacoParaContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SindarinParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(SindarinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SindarinParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public TerminalNode IN() { return getToken(SindarinParser.IN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InicializacaoParaContext inicializacaoPara() {
			return getRuleContext(InicializacaoParaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtualizacaoParaContext atualizacaoPara() {
			return getRuleContext(AtualizacaoParaContext.class,0);
		}
		public LacoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacoPara; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitLacoPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LacoParaContext lacoPara() throws RecognitionException {
		LacoParaContext _localctx = new LacoParaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lacoPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(FOR);
			setState(385);
			match(LPAREN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 523328L) != 0) || _la==LBRACK || _la==ID) {
				{
				setState(386);
				inicializacaoPara();
				}
			}

			setState(389);
			match(SEMI);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4754253926779904L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 581953L) != 0)) {
				{
				setState(390);
				expressao();
				}
			}

			setState(393);
			match(SEMI);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTION || _la==ID) {
				{
				setState(394);
				atualizacaoPara();
				}
			}

			setState(397);
			match(RPAREN);
			setState(398);
			match(IN);
			setState(399);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoParaContext extends ParserRuleContext {
		public InicializacaoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoPara; }
	 
		public InicializacaoParaContext() { }
		public void copyFrom(InicializacaoParaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoAtribuicaoContext extends InicializacaoParaContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public InicializacaoAtribuicaoContext(InicializacaoParaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitInicializacaoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoDeclaracaoContext extends InicializacaoParaContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SindarinParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InicializacaoDeclaracaoContext(InicializacaoParaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitInicializacaoDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoChamadaContext extends InicializacaoParaContext {
		public ChamadaAcaoContext chamadaAcao() {
			return getRuleContext(ChamadaAcaoContext.class,0);
		}
		public InicializacaoChamadaContext(InicializacaoParaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitInicializacaoChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoParaContext inicializacaoPara() throws RecognitionException {
		InicializacaoParaContext _localctx = new InicializacaoParaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_inicializacaoPara);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BYTE_TYPE:
			case BOOL_TYPE:
			case LEVEL_TYPE:
			case TIME_TYPE:
			case TEXT_TYPE:
			case OPTIONAL_BYTE_TYPE:
			case FLOAT:
			case VOID:
			case LBRACK:
				_localctx = new InicializacaoDeclaracaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				tipo();
				setState(402);
				match(ID);
				setState(403);
				match(ASSIGN);
				setState(404);
				expressao();
				}
				break;
			case ID:
				_localctx = new InicializacaoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				atribuicao();
				}
				break;
			case ACTION:
				_localctx = new InicializacaoChamadaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				chamadaAcao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtualizacaoParaContext extends ParserRuleContext {
		public AtualizacaoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atualizacaoPara; }
	 
		public AtualizacaoParaContext() { }
		public void copyFrom(AtualizacaoParaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtualizacaoAtribuicaoContext extends AtualizacaoParaContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public AtualizacaoAtribuicaoContext(AtualizacaoParaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAtualizacaoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtualizacaoChamadaContext extends AtualizacaoParaContext {
		public ChamadaAcaoContext chamadaAcao() {
			return getRuleContext(ChamadaAcaoContext.class,0);
		}
		public AtualizacaoChamadaContext(AtualizacaoParaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitAtualizacaoChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtualizacaoParaContext atualizacaoPara() throws RecognitionException {
		AtualizacaoParaContext _localctx = new AtualizacaoParaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_atualizacaoPara);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtualizacaoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				atribuicao();
				}
				break;
			case ACTION:
				_localctx = new AtualizacaoChamadaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				chamadaAcao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoOuContext expressaoOu() {
			return getRuleContext(ExpressaoOuContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			expressaoOu();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoOuContext extends ParserRuleContext {
		public List<ExpressaoEContext> expressaoE() {
			return getRuleContexts(ExpressaoEContext.class);
		}
		public ExpressaoEContext expressaoE(int i) {
			return getRuleContext(ExpressaoEContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SindarinParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SindarinParser.OR, i);
		}
		public ExpressaoOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoOu; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitExpressaoOu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoOuContext expressaoOu() throws RecognitionException {
		ExpressaoOuContext _localctx = new ExpressaoOuContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressaoOu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			expressaoE();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(417);
				match(OR);
				setState(418);
				expressaoE();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoEContext extends ParserRuleContext {
		public List<ExpressaoRelacionalContext> expressaoRelacional() {
			return getRuleContexts(ExpressaoRelacionalContext.class);
		}
		public ExpressaoRelacionalContext expressaoRelacional(int i) {
			return getRuleContext(ExpressaoRelacionalContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SindarinParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SindarinParser.AND, i);
		}
		public ExpressaoEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoE; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitExpressaoE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoEContext expressaoE() throws RecognitionException {
		ExpressaoEContext _localctx = new ExpressaoEContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressaoE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			expressaoRelacional();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(425);
				match(AND);
				setState(426);
				expressaoRelacional();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public OperadorRelacionalContext operadorRelacional() {
			return getRuleContext(OperadorRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressaoRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			expressaoAditiva();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 63L) != 0)) {
				{
				setState(433);
				operadorRelacional();
				setState(434);
				expressaoAditiva();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorRelacionalContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SindarinParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SindarinParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SindarinParser.LT, 0); }
		public TerminalNode LE() { return getToken(SindarinParser.LE, 0); }
		public TerminalNode GT() { return getToken(SindarinParser.GT, 0); }
		public TerminalNode GE() { return getToken(SindarinParser.GE, 0); }
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitOperadorRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAditivaContext extends ParserRuleContext {
		public List<ExpressaoMultiplicativaContext> expressaoMultiplicativa() {
			return getRuleContexts(ExpressaoMultiplicativaContext.class);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa(int i) {
			return getRuleContext(ExpressaoMultiplicativaContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SindarinParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SindarinParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SindarinParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SindarinParser.MINUS, i);
		}
		public ExpressaoAditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAditiva; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitExpressaoAditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAditivaContext expressaoAditiva() throws RecognitionException {
		ExpressaoAditivaContext _localctx = new ExpressaoAditivaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressaoAditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			expressaoMultiplicativa();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(441);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(442);
				expressaoMultiplicativa();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public List<ExpressaoUnariaContext> expressaoUnaria() {
			return getRuleContexts(ExpressaoUnariaContext.class);
		}
		public ExpressaoUnariaContext expressaoUnaria(int i) {
			return getRuleContext(ExpressaoUnariaContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(SindarinParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(SindarinParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(SindarinParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(SindarinParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(SindarinParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(SindarinParser.PERCENT, i);
		}
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitExpressaoMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressaoMultiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			expressaoUnaria();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7L) != 0)) {
				{
				{
				setState(449);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(450);
				expressaoUnaria();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoUnariaContext extends ParserRuleContext {
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SindarinParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SindarinParser.MINUS, 0); }
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public ExpressaoUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoUnaria; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitExpressaoUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoUnariaContext expressaoUnaria() throws RecognitionException {
		ExpressaoUnariaContext _localctx = new ExpressaoUnariaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressaoUnaria);
		int _la;
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				expressaoUnaria();
				}
				break;
			case INT_TYPE:
			case BYTE_TYPE:
			case TIME_TYPE:
			case FLOAT:
			case TRUE:
			case FALSE:
			case HIGH:
			case LOW:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case BIT_NOT:
			case SHIFT_LEFT:
			case SHIFT_RIGHT:
			case DIGITAL_READ:
			case ANALOG_READ:
			case MILLIS:
			case SERIAL_READ:
			case LPAREN:
			case LBRACK:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				primario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioContext extends ParserRuleContext {
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
	 
		public PrimarioContext() { }
		public void copyFrom(PrimarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioListaContext extends PrimarioContext {
		public ListaVetorialContext listaVetorial() {
			return getRuleContext(ListaVetorialContext.class,0);
		}
		public PrimarioListaContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioLista(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioParentesesContext extends PrimarioContext {
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public PrimarioParentesesContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioLiteralContext extends PrimarioContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimarioLiteralContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioLeituraSerialContext extends PrimarioContext {
		public TerminalNode SERIAL_READ() { return getToken(SindarinParser.SERIAL_READ, 0); }
		public PrimarioLeituraSerialContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioLeituraSerial(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioConversaoContext extends PrimarioContext {
		public ConversaoContext conversao() {
			return getRuleContext(ConversaoContext.class,0);
		}
		public PrimarioConversaoContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioConversao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioAcessoVetorContext extends PrimarioContext {
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(SindarinParser.LBRACK, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SindarinParser.RBRACK, 0); }
		public PrimarioAcessoVetorContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioAcessoVetor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioLeituraAnalogicaContext extends PrimarioContext {
		public TerminalNode ANALOG_READ() { return getToken(SindarinParser.ANALOG_READ, 0); }
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public PrimarioLeituraAnalogicaContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioLeituraAnalogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioChamadaContext extends PrimarioContext {
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public PrimarioChamadaContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioChamada(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioIdentificadorContext extends PrimarioContext {
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public PrimarioIdentificadorContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioDuracaoContext extends PrimarioContext {
		public ConstrutorDuracaoContext construtorDuracao() {
			return getRuleContext(ConstrutorDuracaoContext.class,0);
		}
		public PrimarioDuracaoContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioDuracao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioBitsContext extends PrimarioContext {
		public OperacaoBitsContext operacaoBits() {
			return getRuleContext(OperacaoBitsContext.class,0);
		}
		public PrimarioBitsContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioBits(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioRelogioContext extends PrimarioContext {
		public TerminalNode MILLIS() { return getToken(SindarinParser.MILLIS, 0); }
		public PrimarioRelogioContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioRelogio(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioLeituraDigitalContext extends PrimarioContext {
		public TerminalNode DIGITAL_READ() { return getToken(SindarinParser.DIGITAL_READ, 0); }
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public PrimarioLeituraDigitalContext(PrimarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitPrimarioLeituraDigital(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primario);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new PrimarioLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				literal();
				}
				break;
			case 2:
				_localctx = new PrimarioListaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				listaVetorial();
				}
				break;
			case 3:
				_localctx = new PrimarioParentesesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(LPAREN);
				setState(464);
				expressao();
				setState(465);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new PrimarioChamadaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				chamada();
				}
				break;
			case 5:
				_localctx = new PrimarioAcessoVetorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				match(ID);
				setState(469);
				match(LBRACK);
				setState(470);
				expressao();
				setState(471);
				match(RBRACK);
				}
				break;
			case 6:
				_localctx = new PrimarioIdentificadorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
				match(ID);
				}
				break;
			case 7:
				_localctx = new PrimarioLeituraSerialContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(474);
				match(SERIAL_READ);
				}
				break;
			case 8:
				_localctx = new PrimarioRelogioContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(475);
				match(MILLIS);
				}
				break;
			case 9:
				_localctx = new PrimarioLeituraDigitalContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(476);
				match(DIGITAL_READ);
				setState(477);
				match(ID);
				}
				break;
			case 10:
				_localctx = new PrimarioLeituraAnalogicaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(478);
				match(ANALOG_READ);
				setState(479);
				match(ID);
				}
				break;
			case 11:
				_localctx = new PrimarioConversaoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(480);
				conversao();
				}
				break;
			case 12:
				_localctx = new PrimarioDuracaoContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(481);
				construtorDuracao();
				}
				break;
			case 13:
				_localctx = new PrimarioBitsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(482);
				operacaoBits();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SindarinParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(SindarinParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SindarinParser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(SindarinParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SindarinParser.FALSE, 0); }
		public TerminalNode HIGH() { return getToken(SindarinParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(SindarinParser.LOW, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SindarinParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_chamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(ID);
			setState(488);
			match(LPAREN);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4754253926779904L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 581953L) != 0)) {
				{
				setState(489);
				argumentos();
				}
			}

			setState(492);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SindarinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SindarinParser.COMMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			expressao();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				expressao();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaVetorialContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SindarinParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SindarinParser.RBRACK, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ListaVetorialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVetorial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitListaVetorial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaVetorialContext listaVetorial() throws RecognitionException {
		ListaVetorialContext _localctx = new ListaVetorialContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_listaVetorial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(LBRACK);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4754253926779904L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 581953L) != 0)) {
				{
				setState(503);
				argumentos();
				}
			}

			setState(506);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConversaoContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public TerminalNode INT_TYPE() { return getToken(SindarinParser.INT_TYPE, 0); }
		public TerminalNode BYTE_TYPE() { return getToken(SindarinParser.BYTE_TYPE, 0); }
		public LarguraInteiraContext larguraInteira() {
			return getRuleContext(LarguraInteiraContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(SindarinParser.FLOAT, 0); }
		public ConversaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitConversao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversaoContext conversao() throws RecognitionException {
		ConversaoContext _localctx = new ConversaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_conversao);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BYTE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==BYTE_TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(509);
					larguraInteira();
					}
				}

				setState(512);
				match(LPAREN);
				setState(513);
				expressao();
				setState(514);
				match(RPAREN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(FLOAT);
				setState(517);
				match(LPAREN);
				setState(518);
				expressao();
				setState(519);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstrutorDuracaoContext extends ParserRuleContext {
		public TerminalNode TIME_TYPE() { return getToken(SindarinParser.TIME_TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(SindarinParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(SindarinParser.INT_LITERAL, i);
		}
		public TerminalNode COMMA() { return getToken(SindarinParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public ConstrutorDuracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtorDuracao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitConstrutorDuracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrutorDuracaoContext construtorDuracao() throws RecognitionException {
		ConstrutorDuracaoContext _localctx = new ConstrutorDuracaoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_construtorDuracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(TIME_TYPE);
			setState(524);
			match(LPAREN);
			setState(525);
			match(INT_LITERAL);
			setState(526);
			match(COMMA);
			setState(527);
			match(INT_LITERAL);
			setState(528);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoBitsContext extends ParserRuleContext {
		public LarguraInteiraContext larguraInteira() {
			return getRuleContext(LarguraInteiraContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SindarinParser.LPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SindarinParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SindarinParser.RPAREN, 0); }
		public TerminalNode BIT_AND() { return getToken(SindarinParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(SindarinParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(SindarinParser.BIT_XOR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(SindarinParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(SindarinParser.SHIFT_RIGHT, 0); }
		public TerminalNode BIT_NOT() { return getToken(SindarinParser.BIT_NOT, 0); }
		public OperacaoBitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoBits; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SindarinParserVisitor ) return ((SindarinParserVisitor<? extends T>)visitor).visitOperacaoBits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoBitsContext operacaoBits() throws RecognitionException {
		OperacaoBitsContext _localctx = new OperacaoBitsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operacaoBits);
		int _la;
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case SHIFT_LEFT:
			case SHIFT_RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3779571220480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				larguraInteira();
				setState(532);
				match(LPAREN);
				setState(533);
				expressao();
				setState(534);
				match(COMMA);
				setState(535);
				expressao();
				setState(536);
				match(RPAREN);
				}
				break;
			case BIT_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(BIT_NOT);
				setState(539);
				larguraInteira();
				setState(540);
				match(LPAREN);
				setState(541);
				expressao();
				setState(542);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\\\u0223\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0005\u0000s\b\u0000\n\u0000\f\u0000"+
		"v\t\u0000\u0001\u0000\u0005\u0000y\b\u0000\n\u0000\f\u0000|\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0086\b\u0001\n\u0001\f\u0001\u0089\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009b\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a9\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00ad\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u00ba\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00c6\b\u000b\u0001\f\u0001\f\u0003\f\u00ca\b\f\u0001\f\u0001\f\u0003"+
		"\f\u00ce\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d6"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00eb\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f4\b\u0011\n\u0011"+
		"\f\u0011\u00f7\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00fb\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0101\b\u0013"+
		"\n\u0013\f\u0013\u0104\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u010b\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011e\b\u0015\u0001\u0015\u0003"+
		"\u0015\u0121\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0125\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0143\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u014b\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0150\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0004\u001f\u015e\b\u001f\u000b\u001f\f\u001f\u015f\u0001"+
		"\u001f\u0003\u001f\u0163\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u0184\b%\u0001"+
		"%\u0001%\u0003%\u0188\b%\u0001%\u0001%\u0003%\u018c\b%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0199"+
		"\b&\u0001\'\u0001\'\u0003\'\u019d\b\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0005)\u01a4\b)\n)\f)\u01a7\t)\u0001*\u0001*\u0001*\u0005*\u01ac\b*"+
		"\n*\f*\u01af\t*\u0001+\u0001+\u0001+\u0001+\u0003+\u01b5\b+\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0005-\u01bc\b-\n-\f-\u01bf\t-\u0001.\u0001.\u0001"+
		".\u0005.\u01c4\b.\n.\f.\u01c7\t.\u0001/\u0001/\u0001/\u0003/\u01cc\b/"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u01e4\b0\u00011\u00011\u00012\u00012\u00012\u0003"+
		"2\u01eb\b2\u00012\u00012\u00013\u00013\u00013\u00053\u01f2\b3\n3\f3\u01f5"+
		"\t3\u00014\u00014\u00034\u01f9\b4\u00014\u00014\u00015\u00015\u00035\u01ff"+
		"\b5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u020a\b5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u0221\b7\u00017\u0000\u00008\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\t\u0001\u00007;\u0001\u0000"+
		"\n\u000b\u0001\u0000*+\u0001\u0000<A\u0001\u0000CD\u0001\u0000EG\u0002"+
		"\u0000##DD\u0002\u0000\u0013\u0016QS\u0002\u0000$&()\u0235\u0000p\u0001"+
		"\u0000\u0000\u0000\u0002\u0081\u0001\u0000\u0000\u0000\u0004\u008c\u0001"+
		"\u0000\u0000\u0000\u0006\u0090\u0001\u0000\u0000\u0000\b\u0094\u0001\u0000"+
		"\u0000\u0000\n\u009e\u0001\u0000\u0000\u0000\f\u00a8\u0001\u0000\u0000"+
		"\u0000\u000e\u00ac\u0001\u0000\u0000\u0000\u0010\u00ae\u0001\u0000\u0000"+
		"\u0000\u0012\u00b5\u0001\u0000\u0000\u0000\u0014\u00bd\u0001\u0000\u0000"+
		"\u0000\u0016\u00c5\u0001\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000"+
		"\u0000\u001a\u00d7\u0001\u0000\u0000\u0000\u001c\u00db\u0001\u0000\u0000"+
		"\u0000\u001e\u00df\u0001\u0000\u0000\u0000 \u00e5\u0001\u0000\u0000\u0000"+
		"\"\u00f0\u0001\u0000\u0000\u0000$\u00fa\u0001\u0000\u0000\u0000&\u00fe"+
		"\u0001\u0000\u0000\u0000(\u010a\u0001\u0000\u0000\u0000*\u0120\u0001\u0000"+
		"\u0000\u0000,\u0122\u0001\u0000\u0000\u0000.\u0129\u0001\u0000\u0000\u0000"+
		"0\u012d\u0001\u0000\u0000\u00002\u0131\u0001\u0000\u0000\u00004\u0142"+
		"\u0001\u0000\u0000\u00006\u0144\u0001\u0000\u0000\u00008\u0147\u0001\u0000"+
		"\u0000\u0000:\u0151\u0001\u0000\u0000\u0000<\u0154\u0001\u0000\u0000\u0000"+
		">\u0158\u0001\u0000\u0000\u0000@\u0166\u0001\u0000\u0000\u0000B\u016b"+
		"\u0001\u0000\u0000\u0000D\u016f\u0001\u0000\u0000\u0000F\u0174\u0001\u0000"+
		"\u0000\u0000H\u0179\u0001\u0000\u0000\u0000J\u0180\u0001\u0000\u0000\u0000"+
		"L\u0198\u0001\u0000\u0000\u0000N\u019c\u0001\u0000\u0000\u0000P\u019e"+
		"\u0001\u0000\u0000\u0000R\u01a0\u0001\u0000\u0000\u0000T\u01a8\u0001\u0000"+
		"\u0000\u0000V\u01b0\u0001\u0000\u0000\u0000X\u01b6\u0001\u0000\u0000\u0000"+
		"Z\u01b8\u0001\u0000\u0000\u0000\\\u01c0\u0001\u0000\u0000\u0000^\u01cb"+
		"\u0001\u0000\u0000\u0000`\u01e3\u0001\u0000\u0000\u0000b\u01e5\u0001\u0000"+
		"\u0000\u0000d\u01e7\u0001\u0000\u0000\u0000f\u01ee\u0001\u0000\u0000\u0000"+
		"h\u01f6\u0001\u0000\u0000\u0000j\u0209\u0001\u0000\u0000\u0000l\u020b"+
		"\u0001\u0000\u0000\u0000n\u0220\u0001\u0000\u0000\u0000pt\u0003\u0002"+
		"\u0001\u0000qs\u0003\u000e\u0007\u0000rq\u0001\u0000\u0000\u0000sv\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uz\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0003 \u0010\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}~\u0003\u0004\u0002\u0000~\u007f\u0003\u0006\u0003\u0000"+
		"\u007f\u0080\u0005\u0000\u0000\u0001\u0080\u0001\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0001\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000"+
		"\u0083\u0087\u0005H\u0000\u0000\u0084\u0086\u0003\b\u0004\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005I\u0000\u0000\u008b\u0003\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0002\u0000\u0000\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u008f"+
		"\u0003&\u0013\u0000\u008f\u0005\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\u0003\u0000\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0093\u0003"+
		"&\u0013\u0000\u0093\u0007\u0001\u0000\u0000\u0000\u0094\u0095\u0003\n"+
		"\u0005\u0000\u0095\u0096\u0005W\u0000\u0000\u0096\u0097\u0005B\u0000\u0000"+
		"\u0097\u009a\u0003\f\u0006\u0000\u0098\u0099\u0005P\u0000\u0000\u0099"+
		"\u009b\u0003P(\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"N\u0000\u0000\u009d\t\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0000"+
		"\u0000\u0000\u009f\u000b\u0001\u0000\u0000\u0000\u00a0\u00a1\u00055\u0000"+
		"\u0000\u00a1\u00a2\u0005J\u0000\u0000\u00a2\u00a3\u0005Q\u0000\u0000\u00a3"+
		"\u00a9\u0005K\u0000\u0000\u00a4\u00a5\u00056\u0000\u0000\u00a5\u00a6\u0005"+
		"J\u0000\u0000\u00a6\u00a7\u0005Q\u0000\u0000\u00a7\u00a9\u0005K\u0000"+
		"\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a9\r\u0001\u0000\u0000\u0000\u00aa\u00ad\u0003\u0010\b\u0000"+
		"\u00ab\u00ad\u0003\u0012\t\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u000f\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\u0007\u0000\u0000\u00af\u00b0\u0003\u0016\u000b\u0000\u00b0"+
		"\u00b1\u0005W\u0000\u0000\u00b1\u00b2\u0005B\u0000\u0000\u00b2\u00b3\u0003"+
		"P(\u0000\u00b3\u00b4\u0005N\u0000\u0000\u00b4\u0011\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0003\u0016\u000b\u0000\u00b6\u00b9\u0005W\u0000\u0000"+
		"\u00b7\u00b8\u0005B\u0000\u0000\u00b8\u00ba\u0003P(\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005N\u0000\u0000\u00bc\u0013\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0003\u0016\u000b\u0000\u00be\u00bf\u0005"+
		"W\u0000\u0000\u00bf\u00c0\u0005B\u0000\u0000\u00c0\u00c1\u0003P(\u0000"+
		"\u00c1\u00c2\u0005N\u0000\u0000\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c6\u0003\u0018\f\u0000\u00c4\u00c6\u0003\u001e\u000f\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u0017"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0007\u0001\u0000\u0000\u00c8\u00ca"+
		"\u0003\u001a\r\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00d6\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005"+
		"\u000e\u0000\u0000\u00cc\u00ce\u0003\u001c\u000e\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d6\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d6\u0005\f\u0000\u0000\u00d0\u00d6\u0005\r"+
		"\u0000\u0000\u00d1\u00d6\u0005\u000f\u0000\u0000\u00d2\u00d6\u0005\u0010"+
		"\u0000\u0000\u00d3\u00d6\u0005\u0011\u0000\u0000\u00d4\u00d6\u0005\u0012"+
		"\u0000\u0000\u00d5\u00c7\u0001\u0000\u0000\u0000\u00d5\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005@\u0000"+
		"\u0000\u00d8\u00d9\u0005Q\u0000\u0000\u00d9\u00da\u0005A\u0000\u0000\u00da"+
		"\u001b\u0001\u0000\u0000\u0000\u00db\u00dc\u0005@\u0000\u0000\u00dc\u00dd"+
		"\u0005/\u0000\u0000\u00dd\u00de\u0005A\u0000\u0000\u00de\u001d\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0005L\u0000\u0000\u00e0\u00e1\u0003\u0018\f"+
		"\u0000\u00e1\u00e2\u0005N\u0000\u0000\u00e2\u00e3\u0005Q\u0000\u0000\u00e3"+
		"\u00e4\u0005M\u0000\u0000\u00e4\u001f\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\b\u0000\u0000\u00e6\u00e7\u0003\u0016\u000b\u0000\u00e7\u00e8\u0005"+
		"W\u0000\u0000\u00e8\u00ea\u0005J\u0000\u0000\u00e9\u00eb\u0003\"\u0011"+
		"\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005K\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0004\u0000\u0000\u00ee\u00ef\u0003&\u0013\u0000\u00ef"+
		"!\u0001\u0000\u0000\u0000\u00f0\u00f5\u0003$\u0012\u0000\u00f1\u00f2\u0005"+
		"O\u0000\u0000\u00f2\u00f4\u0003$\u0012\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6#\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003\u0016\u000b\u0000"+
		"\u00f9\u00fb\u0003\n\u0005\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005W\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u0102\u0005"+
		"H\u0000\u0000\u00ff\u0101\u0003(\u0014\u0000\u0100\u00ff\u0001\u0000\u0000"+
		"\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0005I\u0000\u0000"+
		"\u0106\'\u0001\u0000\u0000\u0000\u0107\u010b\u0003\u0010\b\u0000\u0108"+
		"\u010b\u0003\u0014\n\u0000\u0109\u010b\u0003*\u0015\u0000\u010a\u0107"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b)\u0001\u0000\u0000\u0000\u010c\u010d\u0003"+
		",\u0016\u0000\u010d\u010e\u0005N\u0000\u0000\u010e\u0121\u0001\u0000\u0000"+
		"\u0000\u010f\u0121\u00032\u0019\u0000\u0110\u0121\u00030\u0018\u0000\u0111"+
		"\u0121\u00038\u001c\u0000\u0112\u0121\u0003>\u001f\u0000\u0113\u0121\u0003"+
		"D\"\u0000\u0114\u0121\u0003J%\u0000\u0115\u0121\u0003F#\u0000\u0116\u0121"+
		"\u0003H$\u0000\u0117\u0118\u0005\u001f\u0000\u0000\u0118\u0121\u0005N"+
		"\u0000\u0000\u0119\u011a\u0005 \u0000\u0000\u011a\u0121\u0005N\u0000\u0000"+
		"\u011b\u011d\u0005\t\u0000\u0000\u011c\u011e\u0003P(\u0000\u011d\u011c"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f\u0121\u0005N\u0000\u0000\u0120\u010c\u0001"+
		"\u0000\u0000\u0000\u0120\u010f\u0001\u0000\u0000\u0000\u0120\u0110\u0001"+
		"\u0000\u0000\u0000\u0120\u0111\u0001\u0000\u0000\u0000\u0120\u0112\u0001"+
		"\u0000\u0000\u0000\u0120\u0113\u0001\u0000\u0000\u0000\u0120\u0114\u0001"+
		"\u0000\u0000\u0000\u0120\u0115\u0001\u0000\u0000\u0000\u0120\u0116\u0001"+
		"\u0000\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120\u0119\u0001"+
		"\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0121+\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0005W\u0000\u0000\u0123\u0125\u0003.\u0017\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0005B\u0000\u0000\u0127"+
		"\u0128\u0003P(\u0000\u0128-\u0001\u0000\u0000\u0000\u0129\u012a\u0005"+
		"L\u0000\u0000\u012a\u012b\u0003P(\u0000\u012b\u012c\u0005M\u0000\u0000"+
		"\u012c/\u0001\u0000\u0000\u0000\u012d\u012e\u00053\u0000\u0000\u012e\u012f"+
		"\u0005Q\u0000\u0000\u012f\u0130\u0005N\u0000\u0000\u01301\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005\u0006\u0000\u0000\u0132\u0133\u00034\u001a"+
		"\u0000\u0133\u0134\u0005N\u0000\u0000\u01343\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u00050\u0000\u0000\u0136\u0143\u0003P(\u0000\u0137\u0138\u0005"+
		"1\u0000\u0000\u0138\u0143\u0003P(\u0000\u0139\u013a\u00052\u0000\u0000"+
		"\u013a\u0143\u0003P(\u0000\u013b\u013c\u0005,\u0000\u0000\u013c\u0143"+
		"\u0003P(\u0000\u013d\u013e\u0005\u0005\u0000\u0000\u013e\u013f\u0005W"+
		"\u0000\u0000\u013f\u0140\u0007\u0002\u0000\u0000\u0140\u0143\u0003P(\u0000"+
		"\u0141\u0143\u0003d2\u0000\u0142\u0135\u0001\u0000\u0000\u0000\u0142\u0137"+
		"\u0001\u0000\u0000\u0000\u0142\u0139\u0001\u0000\u0000\u0000\u0142\u013b"+
		"\u0001\u0000\u0000\u0000\u0142\u013d\u0001\u0000\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u01435\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"\u0006\u0000\u0000\u0145\u0146\u0003d2\u0000\u01467\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u0017\u0000\u0000\u0148\u014a\u0003P(\u0000\u0149"+
		"\u014b\u0003:\u001d\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005\u0004\u0000\u0000\u014d\u014f\u0003&\u0013\u0000\u014e\u0150\u0003"+
		"<\u001e\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u01509\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0005\u0000"+
		"\u0000\u0152\u0153\u0005W\u0000\u0000\u0153;\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005\u0018\u0000\u0000\u0155\u0156\u0005\u0004\u0000\u0000\u0156"+
		"\u0157\u0003&\u0013\u0000\u0157=\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\u0019\u0000\u0000\u0159\u015a\u0003P(\u0000\u015a\u015b\u0005\u0004\u0000"+
		"\u0000\u015b\u015d\u0005H\u0000\u0000\u015c\u015e\u0003@ \u0000\u015d"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u0162\u0001\u0000\u0000\u0000\u0161\u0163\u0003B!\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0005I\u0000\u0000\u0165?\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005\u001a\u0000\u0000\u0167\u0168\u0003P(\u0000\u0168"+
		"\u0169\u0005\u0004\u0000\u0000\u0169\u016a\u0003&\u0013\u0000\u016aA\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005\u0018\u0000\u0000\u016c\u016d\u0005"+
		"\u0004\u0000\u0000\u016d\u016e\u0003&\u0013\u0000\u016eC\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0005\u001b\u0000\u0000\u0170\u0171\u0003P(\u0000\u0171"+
		"\u0172\u0005\u0004\u0000\u0000\u0172\u0173\u0003&\u0013\u0000\u0173E\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005\u001c\u0000\u0000\u0175\u0176\u0003"+
		"P(\u0000\u0176\u0177\u0005\u0004\u0000\u0000\u0177\u0178\u0003&\u0013"+
		"\u0000\u0178G\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u001d\u0000\u0000"+
		"\u017a\u017b\u0005\u0004\u0000\u0000\u017b\u017c\u0003&\u0013\u0000\u017c"+
		"\u017d\u0005\u001b\u0000\u0000\u017d\u017e\u0003P(\u0000\u017e\u017f\u0005"+
		"N\u0000\u0000\u017fI\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u001e\u0000"+
		"\u0000\u0181\u0183\u0005J\u0000\u0000\u0182\u0184\u0003L&\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0005N\u0000\u0000\u0186\u0188"+
		"\u0003P(\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0005N\u0000"+
		"\u0000\u018a\u018c\u0003N\'\u0000\u018b\u018a\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005K\u0000\u0000\u018e\u018f\u0005\u0004\u0000\u0000\u018f"+
		"\u0190\u0003&\u0013\u0000\u0190K\u0001\u0000\u0000\u0000\u0191\u0192\u0003"+
		"\u0016\u000b\u0000\u0192\u0193\u0005W\u0000\u0000\u0193\u0194\u0005B\u0000"+
		"\u0000\u0194\u0195\u0003P(\u0000\u0195\u0199\u0001\u0000\u0000\u0000\u0196"+
		"\u0199\u0003,\u0016\u0000\u0197\u0199\u00036\u001b\u0000\u0198\u0191\u0001"+
		"\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0197\u0001"+
		"\u0000\u0000\u0000\u0199M\u0001\u0000\u0000\u0000\u019a\u019d\u0003,\u0016"+
		"\u0000\u019b\u019d\u00036\u001b\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019b\u0001\u0000\u0000\u0000\u019dO\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0003R)\u0000\u019fQ\u0001\u0000\u0000\u0000\u01a0\u01a5\u0003"+
		"T*\u0000\u01a1\u01a2\u0005\"\u0000\u0000\u01a2\u01a4\u0003T*\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"S\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ad"+
		"\u0003V+\u0000\u01a9\u01aa\u0005!\u0000\u0000\u01aa\u01ac\u0003V+\u0000"+
		"\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000"+
		"\u01aeU\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b4\u0003Z-\u0000\u01b1\u01b2\u0003X,\u0000\u01b2\u01b3\u0003Z-\u0000"+
		"\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5W\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0007\u0003\u0000\u0000\u01b7Y\u0001\u0000\u0000\u0000\u01b8\u01bd"+
		"\u0003\\.\u0000\u01b9\u01ba\u0007\u0004\u0000\u0000\u01ba\u01bc\u0003"+
		"\\.\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be[\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c5\u0003^/\u0000\u01c1\u01c2\u0007\u0005\u0000\u0000\u01c2"+
		"\u01c4\u0003^/\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6]\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0007\u0006\u0000\u0000\u01c9\u01cc\u0003^/\u0000"+
		"\u01ca\u01cc\u0003`0\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc_\u0001\u0000\u0000\u0000\u01cd\u01e4\u0003"+
		"b1\u0000\u01ce\u01e4\u0003h4\u0000\u01cf\u01d0\u0005J\u0000\u0000\u01d0"+
		"\u01d1\u0003P(\u0000\u01d1\u01d2\u0005K\u0000\u0000\u01d2\u01e4\u0001"+
		"\u0000\u0000\u0000\u01d3\u01e4\u0003d2\u0000\u01d4\u01d5\u0005W\u0000"+
		"\u0000\u01d5\u01d6\u0005L\u0000\u0000\u01d6\u01d7\u0003P(\u0000\u01d7"+
		"\u01d8\u0005M\u0000\u0000\u01d8\u01e4\u0001\u0000\u0000\u0000\u01d9\u01e4"+
		"\u0005W\u0000\u0000\u01da\u01e4\u00054\u0000\u0000\u01db\u01e4\u0005/"+
		"\u0000\u0000\u01dc\u01dd\u0005-\u0000\u0000\u01dd\u01e4\u0005W\u0000\u0000"+
		"\u01de\u01df\u0005.\u0000\u0000\u01df\u01e4\u0005W\u0000\u0000\u01e0\u01e4"+
		"\u0003j5\u0000\u01e1\u01e4\u0003l6\u0000\u01e2\u01e4\u0003n7\u0000\u01e3"+
		"\u01cd\u0001\u0000\u0000\u0000\u01e3\u01ce\u0001\u0000\u0000\u0000\u01e3"+
		"\u01cf\u0001\u0000\u0000\u0000\u01e3\u01d3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01e3\u01d9\u0001\u0000\u0000\u0000\u01e3"+
		"\u01da\u0001\u0000\u0000\u0000\u01e3\u01db\u0001\u0000\u0000\u0000\u01e3"+
		"\u01dc\u0001\u0000\u0000\u0000\u01e3\u01de\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4a\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0007\u0007\u0000\u0000\u01e6c\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005"+
		"W\u0000\u0000\u01e8\u01ea\u0005J\u0000\u0000\u01e9\u01eb\u0003f3\u0000"+
		"\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005K\u0000\u0000\u01ed"+
		"e\u0001\u0000\u0000\u0000\u01ee\u01f3\u0003P(\u0000\u01ef\u01f0\u0005"+
		"O\u0000\u0000\u01f0\u01f2\u0003P(\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4g\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005L\u0000\u0000\u01f7"+
		"\u01f9\u0003f3\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005"+
		"M\u0000\u0000\u01fbi\u0001\u0000\u0000\u0000\u01fc\u01fe\u0007\u0001\u0000"+
		"\u0000\u01fd\u01ff\u0003\u001a\r\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0005J\u0000\u0000\u0201\u0202\u0003P(\u0000\u0202\u0203"+
		"\u0005K\u0000\u0000\u0203\u020a\u0001\u0000\u0000\u0000\u0204\u0205\u0005"+
		"\u0011\u0000\u0000\u0205\u0206\u0005J\u0000\u0000\u0206\u0207\u0003P("+
		"\u0000\u0207\u0208\u0005K\u0000\u0000\u0208\u020a\u0001\u0000\u0000\u0000"+
		"\u0209\u01fc\u0001\u0000\u0000\u0000\u0209\u0204\u0001\u0000\u0000\u0000"+
		"\u020ak\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u000e\u0000\u0000\u020c"+
		"\u020d\u0005J\u0000\u0000\u020d\u020e\u0005Q\u0000\u0000\u020e\u020f\u0005"+
		"O\u0000\u0000\u020f\u0210\u0005Q\u0000\u0000\u0210\u0211\u0005K\u0000"+
		"\u0000\u0211m\u0001\u0000\u0000\u0000\u0212\u0213\u0007\b\u0000\u0000"+
		"\u0213\u0214\u0003\u001a\r\u0000\u0214\u0215\u0005J\u0000\u0000\u0215"+
		"\u0216\u0003P(\u0000\u0216\u0217\u0005O\u0000\u0000\u0217\u0218\u0003"+
		"P(\u0000\u0218\u0219\u0005K\u0000\u0000\u0219\u0221\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0005\'\u0000\u0000\u021b\u021c\u0003\u001a\r\u0000"+
		"\u021c\u021d\u0005J\u0000\u0000\u021d\u021e\u0003P(\u0000\u021e\u021f"+
		"\u0005K\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u0212\u0001"+
		"\u0000\u0000\u0000\u0220\u021a\u0001\u0000\u0000\u0000\u0221o\u0001\u0000"+
		"\u0000\u0000*tz\u0087\u009a\u00a8\u00ac\u00b9\u00c5\u00c9\u00cd\u00d5"+
		"\u00ea\u00f5\u00fa\u0102\u010a\u011d\u0120\u0124\u0142\u014a\u014f\u015f"+
		"\u0162\u0183\u0187\u018b\u0198\u019c\u01a5\u01ad\u01b4\u01bd\u01c5\u01cb"+
		"\u01e3\u01ea\u01f3\u01f8\u01fe\u0209\u0220";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}