package gerado;

// Generated from RegularExpressionERE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularExpressionEREParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COMMA=2, QUESTION=3, PLUS=4, ASTERISC=5, CURLYOPEN=6, CURLYCLOSE=7, 
		LISTOPEN=8, LISTCLOSE=9, DASH=10, CIRCUMFLEX=11, DOLAR=12, PIPE=13, GROUPOPEN=14, 
		GROUPCLOSE=15, ESCAPE=16, DIGIT=17, CLASSOPEN=18, OTHER=19, WS=20, DIGITCLASS=21, 
		SPACECLASS=22, ALNUM=23, ALPHA=24, BLANK=25, CNTRL=26, GRAPH=27, LOWER=28, 
		PRINT=29, PUNCT=30, UPPER=31, XDIGIT=32, ERRORCLASS=33, CLASSCLOSE=34;
	public static final int
		RULE_expression = 0, RULE_multiple = 1, RULE_subExpression = 2, RULE_group = 3, 
		RULE_anchor = 4, RULE_startAnchor = 5, RULE_endAnchor = 6, RULE_repetition = 7, 
		RULE_quantified = 8, RULE_quantifier = 9, RULE_oneOrMore = 10, RULE_zeroOrMore = 11, 
		RULE_conditional = 12, RULE_exact = 13, RULE_atLeast = 14, RULE_between = 15, 
		RULE_value = 16, RULE_firstValue = 17, RULE_lastValue = 18, RULE_list = 19, 
		RULE_negativeList = 20, RULE_positiveList = 21, RULE_listElements = 22, 
		RULE_listElement = 23, RULE_range = 24, RULE_listFirstElement = 25, RULE_listNoSpecial = 26, 
		RULE_listFirstRange = 27, RULE_listLastElement = 28, RULE_listCharacter = 29, 
		RULE_charclass = 30, RULE_classname = 31, RULE_alnum = 32, RULE_alpha = 33, 
		RULE_blank = 34, RULE_cntrl = 35, RULE_digitclass = 36, RULE_graph = 37, 
		RULE_lower = 38, RULE_print = 39, RULE_punct = 40, RULE_spaceclass = 41, 
		RULE_upper = 42, RULE_xdigit = 43, RULE_errorClass = 44, RULE_anychar = 45, 
		RULE_escaped = 46, RULE_special = 47, RULE_characters = 48, RULE_character = 49;
	public static final String[] ruleNames = {
		"expression", "multiple", "subExpression", "group", "anchor", "startAnchor", 
		"endAnchor", "repetition", "quantified", "quantifier", "oneOrMore", "zeroOrMore", 
		"conditional", "exact", "atLeast", "between", "value", "firstValue", "lastValue", 
		"list", "negativeList", "positiveList", "listElements", "listElement", 
		"range", "listFirstElement", "listNoSpecial", "listFirstRange", "listLastElement", 
		"listCharacter", "charclass", "classname", "alnum", "alpha", "blank", 
		"cntrl", "digitclass", "graph", "lower", "print", "punct", "spaceclass", 
		"upper", "xdigit", "errorClass", "anychar", "escaped", "special", "characters", 
		"character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "','", "'?'", "'+'", "'*'", "'{'", "'}'", "'['", "']'", "'-'", 
		"'^'", "'$'", "'|'", "'('", "')'", "'\\'", null, "'[:'", null, null, "'digit'", 
		"'space'", "'alnum'", "'alpha'", "'blank'", "'cntrl'", "'graph'", "'lower'", 
		"'print'", "'punct'", "'upper'", "'xdigit'", null, "':]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", 
		"LISTOPEN", "LISTCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", "PIPE", "GROUPOPEN", 
		"GROUPCLOSE", "ESCAPE", "DIGIT", "CLASSOPEN", "OTHER", "WS", "DIGITCLASS", 
		"SPACECLASS", "ALNUM", "ALPHA", "BLANK", "CNTRL", "GRAPH", "LOWER", "PRINT", 
		"PUNCT", "UPPER", "XDIGIT", "ERRORCLASS", "CLASSCLOSE"
	};
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
	public String getGrammarFileName() { return "RegularExpressionERE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		
		/**
		 * Recebe duas Strings e as converte para inteiros.
		 * Compara se a primeira e menor ou igual a segunda
		 * e retorna um boolean.
		 */
		protected boolean menorOuIgual(String primeiro, String segundo) {
			int a = Integer.parseInt(primeiro);
			int b = Integer.parseInt(segundo);
			return (a<=b);
		}
		
		/**
		 * Recebe duas Strings e extrai o primeiro caractere de cada.
		 * Descobre o numero Unicode dos caracteres, e compara se
		 * o primeiro e menor ou igual ao segundo. Retorna um boolean.
		 */
		protected boolean vemAntesDe(String primeiro, String segundo) {
			char a = primeiro.charAt(0);
			char b = segundo.charAt(0);
			int unicodeA = (int) a;
			int unicodeB = (int) b;
			return (unicodeA<=unicodeB);
		}

	public RegularExpressionEREParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
		}
		public RepetitionContext repetition() {
			return getRuleContext(RepetitionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AnycharContext anychar() {
			return getRuleContext(AnycharContext.class,0);
		}
		public CharactersContext characters() {
			return getRuleContext(CharactersContext.class,0);
		}
		public TerminalNode WS() { return getToken(RegularExpressionEREParser.WS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(101);
				group();
				}
				break;
			case 2:
				{
				setState(102);
				multiple();
				}
				break;
			case 3:
				{
				setState(103);
				anchor();
				}
				break;
			case 4:
				{
				setState(104);
				repetition();
				}
				break;
			case 5:
				{
				setState(105);
				list();
				}
				break;
			case 6:
				{
				setState(106);
				anychar();
				}
				break;
			case 7:
				{
				setState(107);
				characters();
				}
				break;
			case 8:
				{
				setState(108);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(111);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(112);
					expression(6);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultipleContext extends ParserRuleContext {
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(RegularExpressionEREParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(RegularExpressionEREParser.PIPE, i);
		}
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multiple);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			subExpression(0);
			setState(121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					match(PIPE);
					setState(120);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SubExpressionContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
		}
		public RepetitionContext repetition() {
			return getRuleContext(RepetitionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AnycharContext anychar() {
			return getRuleContext(AnycharContext.class,0);
		}
		public CharactersContext characters() {
			return getRuleContext(CharactersContext.class,0);
		}
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		return subExpression(0);
	}

	private SubExpressionContext subExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, _parentState);
		SubExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_subExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(126);
				group();
				}
				break;
			case 2:
				{
				setState(127);
				anchor();
				}
				break;
			case 3:
				{
				setState(128);
				repetition();
				}
				break;
			case 4:
				{
				setState(129);
				list();
				}
				break;
			case 5:
				{
				setState(130);
				anychar();
				}
				break;
			case 6:
				{
				setState(131);
				characters();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_subExpression);
					setState(134);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(135);
					subExpression(5);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode GROUPOPEN() { return getToken(RegularExpressionEREParser.GROUPOPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GROUPCLOSE() { return getToken(RegularExpressionEREParser.GROUPCLOSE, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(GROUPOPEN);
			setState(142);
			expression(0);
			setState(143);
			match(GROUPCLOSE);
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

	public static class AnchorContext extends ParserRuleContext {
		public StartAnchorContext startAnchor() {
			return getRuleContext(StartAnchorContext.class,0);
		}
		public EndAnchorContext endAnchor() {
			return getRuleContext(EndAnchorContext.class,0);
		}
		public AnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anchor);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case CIRCUMFLEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				startAnchor();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				endAnchor();
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

	public static class StartAnchorContext extends ParserRuleContext {
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public StartAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startAnchor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitStartAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartAnchorContext startAnchor() throws RecognitionException {
		StartAnchorContext _localctx = new StartAnchorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_startAnchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CIRCUMFLEX);
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

	public static class EndAnchorContext extends ParserRuleContext {
		public TerminalNode DOLAR() { return getToken(RegularExpressionEREParser.DOLAR, 0); }
		public EndAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endAnchor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitEndAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndAnchorContext endAnchor() throws RecognitionException {
		EndAnchorContext _localctx = new EndAnchorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endAnchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DOLAR);
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

	public static class RepetitionContext extends ParserRuleContext {
		public QuantifiedContext quantified() {
			return getRuleContext(QuantifiedContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public RepetitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitRepetition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionContext repetition() throws RecognitionException {
		RepetitionContext _localctx = new RepetitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repetition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			quantified();
			setState(154);
			quantifier();
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

	public static class QuantifiedContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AnycharContext anychar() {
			return getRuleContext(AnycharContext.class,0);
		}
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public QuantifiedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantified; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitQuantified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedContext quantified() throws RecognitionException {
		QuantifiedContext _localctx = new QuantifiedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantified);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case GROUPOPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				group();
				}
				break;
			case LISTOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				list();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				anychar();
				}
				break;
			case ESCAPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				escaped();
				}
				break;
			case COMMA:
			case DASH:
			case DIGIT:
			case OTHER:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				character();
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

	public static class QuantifierContext extends ParserRuleContext {
		public OneOrMoreContext oneOrMore() {
			return getRuleContext(OneOrMoreContext.class,0);
		}
		public ZeroOrMoreContext zeroOrMore() {
			return getRuleContext(ZeroOrMoreContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ExactContext exact() {
			return getRuleContext(ExactContext.class,0);
		}
		public AtLeastContext atLeast() {
			return getRuleContext(AtLeastContext.class,0);
		}
		public BetweenContext between() {
			return getRuleContext(BetweenContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quantifier);
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				oneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				zeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				exact();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				atLeast();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				between();
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

	public static class OneOrMoreContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(RegularExpressionEREParser.PLUS, 0); }
		public OneOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOrMore; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneOrMoreContext oneOrMore() throws RecognitionException {
		OneOrMoreContext _localctx = new OneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PLUS);
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

	public static class ZeroOrMoreContext extends ParserRuleContext {
		public TerminalNode ASTERISC() { return getToken(RegularExpressionEREParser.ASTERISC, 0); }
		public ZeroOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroOrMore; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeroOrMoreContext zeroOrMore() throws RecognitionException {
		ZeroOrMoreContext _localctx = new ZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_zeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ASTERISC);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(RegularExpressionEREParser.QUESTION, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(QUESTION);
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

	public static class ExactContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionEREParser.CURLYOPEN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionEREParser.CURLYCLOSE, 0); }
		public ExactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exact; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitExact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExactContext exact() throws RecognitionException {
		ExactContext _localctx = new ExactContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(CURLYOPEN);
			setState(178);
			value();
			setState(179);
			match(CURLYCLOSE);
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

	public static class AtLeastContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionEREParser.CURLYOPEN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionEREParser.COMMA, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionEREParser.CURLYCLOSE, 0); }
		public AtLeastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atLeast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtLeastContext atLeast() throws RecognitionException {
		AtLeastContext _localctx = new AtLeastContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atLeast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(CURLYOPEN);
			setState(182);
			value();
			setState(183);
			match(COMMA);
			setState(184);
			match(CURLYCLOSE);
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

	public static class BetweenContext extends ParserRuleContext {
		public FirstValueContext a;
		public LastValueContext b;
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionEREParser.CURLYOPEN, 0); }
		public TerminalNode COMMA() { return getToken(RegularExpressionEREParser.COMMA, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionEREParser.CURLYCLOSE, 0); }
		public FirstValueContext firstValue() {
			return getRuleContext(FirstValueContext.class,0);
		}
		public LastValueContext lastValue() {
			return getRuleContext(LastValueContext.class,0);
		}
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CURLYOPEN);
			setState(187);
			((BetweenContext)_localctx).a = firstValue();
			setState(188);
			match(COMMA);
			setState(189);
			((BetweenContext)_localctx).b = lastValue();
			setState(190);
			match(CURLYCLOSE);
			setState(191);
			if (!(menorOuIgual((((BetweenContext)_localctx).a!=null?_input.getText(((BetweenContext)_localctx).a.start,((BetweenContext)_localctx).a.stop):null),(((BetweenContext)_localctx).b!=null?_input.getText(((BetweenContext)_localctx).b.start,((BetweenContext)_localctx).b.stop):null)))) throw new FailedPredicateException(this, "menorOuIgual($a.text,$b.text)");
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionEREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionEREParser.DIGIT, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(DIGIT);
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class FirstValueContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionEREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionEREParser.DIGIT, i);
		}
		public FirstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitFirstValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstValueContext firstValue() throws RecognitionException {
		FirstValueContext _localctx = new FirstValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_firstValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				match(DIGIT);
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class LastValueContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionEREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionEREParser.DIGIT, i);
		}
		public LastValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitLastValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastValueContext lastValue() throws RecognitionException {
		LastValueContext _localctx = new LastValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lastValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				match(DIGIT);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LISTOPEN() { return getToken(RegularExpressionEREParser.LISTOPEN, 0); }
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public NegativeListContext negativeList() {
			return getRuleContext(NegativeListContext.class,0);
		}
		public PositiveListContext positiveList() {
			return getRuleContext(PositiveListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(208);
					match(LISTOPEN);
					setState(209);
					match(LISTCLOSE);
					}
					break;
				case 2:
					{
					setState(210);
					match(LISTOPEN);
					setState(211);
					match(CIRCUMFLEX);
					setState(212);
					match(LISTCLOSE);
					}
					break;
				}
				notifyErrorListeners("Lista vazia.");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(LISTOPEN);
				setState(219);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(217);
					negativeList();
					}
					break;
				case 2:
					{
					setState(218);
					positiveList();
					}
					break;
				}
				setState(221);
				match(LISTCLOSE);
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

	public static class NegativeListContext extends ParserRuleContext {
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public ListElementsContext listElements() {
			return getRuleContext(ListElementsContext.class,0);
		}
		public NegativeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitNegativeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeListContext negativeList() throws RecognitionException {
		NegativeListContext _localctx = new NegativeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_negativeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(CIRCUMFLEX);
			setState(226);
			listElements();
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

	public static class PositiveListContext extends ParserRuleContext {
		public ListElementsContext listElements() {
			return getRuleContext(ListElementsContext.class,0);
		}
		public PositiveListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitPositiveList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositiveListContext positiveList() throws RecognitionException {
		PositiveListContext _localctx = new PositiveListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_positiveList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			listElements();
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

	public static class ListElementsContext extends ParserRuleContext {
		public ListFirstElementContext listFirstElement() {
			return getRuleContext(ListFirstElementContext.class,0);
		}
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public ListLastElementContext listLastElement() {
			return getRuleContext(ListLastElementContext.class,0);
		}
		public ListElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementsContext listElements() throws RecognitionException {
		ListElementsContext _localctx = new ListElementsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listElements);
		int _la;
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				_la = _input.LA(1);
				if (_la==LISTCLOSE || _la==DASH) {
					{
					setState(230);
					listFirstElement();
					}
				}

				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					listElement();
					}
					}
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << CLASSOPEN) | (1L << OTHER))) != 0) );
				setState(239);
				_la = _input.LA(1);
				if (_la==DASH) {
					{
					setState(238);
					listLastElement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				listFirstElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				listLastElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				listFirstElement();
				setState(244);
				listLastElement();
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

	public static class ListElementContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CharclassContext charclass() {
			return getRuleContext(CharclassContext.class,0);
		}
		public ListCharacterContext listCharacter() {
			return getRuleContext(ListCharacterContext.class,0);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listElement);
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				charclass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				listCharacter();
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

	public static class RangeContext extends ParserRuleContext {
		public ListCharacterContext a;
		public ListCharacterContext b;
		public ListCharacterContext c;
		public Token d;
		public ListCharacterContext e;
		public Token f;
		public List<TerminalNode> DASH() { return getTokens(RegularExpressionEREParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(RegularExpressionEREParser.DASH, i);
		}
		public List<ListCharacterContext> listCharacter() {
			return getRuleContexts(ListCharacterContext.class);
		}
		public ListCharacterContext listCharacter(int i) {
			return getRuleContext(ListCharacterContext.class,i);
		}
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_range);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((RangeContext)_localctx).a = listCharacter();
				setState(254);
				match(DASH);
				setState(255);
				((RangeContext)_localctx).b = listCharacter();
				setState(256);
				if (!(vemAntesDe((((RangeContext)_localctx).a!=null?_input.getText(((RangeContext)_localctx).a.start,((RangeContext)_localctx).a.stop):null),(((RangeContext)_localctx).b!=null?_input.getText(((RangeContext)_localctx).b.start,((RangeContext)_localctx).b.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($a.text,$b.text)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((RangeContext)_localctx).c = listCharacter();
				setState(259);
				match(DASH);
				setState(260);
				((RangeContext)_localctx).d = match(DASH);
				setState(261);
				if (!(vemAntesDe((((RangeContext)_localctx).c!=null?_input.getText(((RangeContext)_localctx).c.start,((RangeContext)_localctx).c.stop):null),(((RangeContext)_localctx).d!=null?((RangeContext)_localctx).d.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($c.text,$d.text)");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				((RangeContext)_localctx).e = listCharacter();
				setState(264);
				match(DASH);
				setState(265);
				((RangeContext)_localctx).f = match(LISTCLOSE);
				setState(266);
				if (!(vemAntesDe((((RangeContext)_localctx).e!=null?_input.getText(((RangeContext)_localctx).e.start,((RangeContext)_localctx).e.stop):null),(((RangeContext)_localctx).f!=null?((RangeContext)_localctx).f.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($e.text,$f.text)");
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

	public static class ListFirstElementContext extends ParserRuleContext {
		public ListFirstRangeContext listFirstRange() {
			return getRuleContext(ListFirstRangeContext.class,0);
		}
		public ListNoSpecialContext listNoSpecial() {
			return getRuleContext(ListNoSpecialContext.class,0);
		}
		public ListFirstElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFirstElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListFirstElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListFirstElementContext listFirstElement() throws RecognitionException {
		ListFirstElementContext _localctx = new ListFirstElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listFirstElement);
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				listFirstRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				listNoSpecial();
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

	public static class ListNoSpecialContext extends ParserRuleContext {
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public TerminalNode DASH() { return getToken(RegularExpressionEREParser.DASH, 0); }
		public ListNoSpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listNoSpecial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListNoSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListNoSpecialContext listNoSpecial() throws RecognitionException {
		ListNoSpecialContext _localctx = new ListNoSpecialContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listNoSpecial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==LISTCLOSE || _la==DASH) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ListFirstRangeContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public Token e;
		public Token f;
		public Token g;
		public Token h;
		public Token i;
		public ListCharacterContext j;
		public Token k;
		public ListCharacterContext l;
		public List<TerminalNode> DASH() { return getTokens(RegularExpressionEREParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(RegularExpressionEREParser.DASH, i);
		}
		public List<TerminalNode> LISTCLOSE() { return getTokens(RegularExpressionEREParser.LISTCLOSE); }
		public TerminalNode LISTCLOSE(int i) {
			return getToken(RegularExpressionEREParser.LISTCLOSE, i);
		}
		public ListCharacterContext listCharacter() {
			return getRuleContext(ListCharacterContext.class,0);
		}
		public ListFirstRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFirstRange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListFirstRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListFirstRangeContext listFirstRange() throws RecognitionException {
		ListFirstRangeContext _localctx = new ListFirstRangeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listFirstRange);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((ListFirstRangeContext)_localctx).a = match(LISTCLOSE);
				setState(277);
				match(DASH);
				setState(278);
				((ListFirstRangeContext)_localctx).b = match(DASH);
				setState(279);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).a!=null?((ListFirstRangeContext)_localctx).a.getText():null),(((ListFirstRangeContext)_localctx).b!=null?((ListFirstRangeContext)_localctx).b.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($a.text,$b.text)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((ListFirstRangeContext)_localctx).c = match(DASH);
				setState(281);
				match(DASH);
				setState(282);
				((ListFirstRangeContext)_localctx).d = match(DASH);
				setState(283);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).c!=null?((ListFirstRangeContext)_localctx).c.getText():null),(((ListFirstRangeContext)_localctx).d!=null?((ListFirstRangeContext)_localctx).d.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($c.text,$d.text)");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((ListFirstRangeContext)_localctx).e = match(LISTCLOSE);
				setState(285);
				match(DASH);
				setState(286);
				((ListFirstRangeContext)_localctx).f = match(LISTCLOSE);
				setState(287);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).e!=null?((ListFirstRangeContext)_localctx).e.getText():null),(((ListFirstRangeContext)_localctx).f!=null?((ListFirstRangeContext)_localctx).f.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($e.text,$f.text)");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				((ListFirstRangeContext)_localctx).g = match(DASH);
				setState(289);
				match(DASH);
				setState(290);
				((ListFirstRangeContext)_localctx).h = match(LISTCLOSE);
				setState(291);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).g!=null?((ListFirstRangeContext)_localctx).g.getText():null),(((ListFirstRangeContext)_localctx).h!=null?((ListFirstRangeContext)_localctx).h.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($g.text,$h.text)");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				((ListFirstRangeContext)_localctx).i = match(LISTCLOSE);
				setState(293);
				match(DASH);
				setState(294);
				((ListFirstRangeContext)_localctx).j = listCharacter();
				setState(295);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).i!=null?((ListFirstRangeContext)_localctx).i.getText():null),(((ListFirstRangeContext)_localctx).j!=null?_input.getText(((ListFirstRangeContext)_localctx).j.start,((ListFirstRangeContext)_localctx).j.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($i.text,$j.text)");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				((ListFirstRangeContext)_localctx).k = match(DASH);
				setState(298);
				match(DASH);
				setState(299);
				((ListFirstRangeContext)_localctx).l = listCharacter();
				setState(300);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).k!=null?((ListFirstRangeContext)_localctx).k.getText():null),(((ListFirstRangeContext)_localctx).l!=null?_input.getText(((ListFirstRangeContext)_localctx).l.start,((ListFirstRangeContext)_localctx).l.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($k.text,$l.text)");
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

	public static class ListLastElementContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(RegularExpressionEREParser.DASH, 0); }
		public ListLastElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLastElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListLastElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLastElementContext listLastElement() throws RecognitionException {
		ListLastElementContext _localctx = new ListLastElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listLastElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(DASH);
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

	public static class ListCharacterContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RegularExpressionEREParser.DIGIT, 0); }
		public TerminalNode COMMA() { return getToken(RegularExpressionEREParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(RegularExpressionEREParser.DOT, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionEREParser.QUESTION, 0); }
		public TerminalNode PLUS() { return getToken(RegularExpressionEREParser.PLUS, 0); }
		public TerminalNode ASTERISC() { return getToken(RegularExpressionEREParser.ASTERISC, 0); }
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionEREParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionEREParser.CURLYCLOSE, 0); }
		public TerminalNode LISTOPEN() { return getToken(RegularExpressionEREParser.LISTOPEN, 0); }
		public TerminalNode ESCAPE() { return getToken(RegularExpressionEREParser.ESCAPE, 0); }
		public TerminalNode DOLAR() { return getToken(RegularExpressionEREParser.DOLAR, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public TerminalNode PIPE() { return getToken(RegularExpressionEREParser.PIPE, 0); }
		public TerminalNode GROUPOPEN() { return getToken(RegularExpressionEREParser.GROUPOPEN, 0); }
		public TerminalNode GROUPCLOSE() { return getToken(RegularExpressionEREParser.GROUPCLOSE, 0); }
		public TerminalNode OTHER() { return getToken(RegularExpressionEREParser.OTHER, 0); }
		public ListCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCharacter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListCharacterContext listCharacter() throws RecognitionException {
		ListCharacterContext _localctx = new ListCharacterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << OTHER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CharclassContext extends ParserRuleContext {
		public TerminalNode CLASSOPEN() { return getToken(RegularExpressionEREParser.CLASSOPEN, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode CLASSCLOSE() { return getToken(RegularExpressionEREParser.CLASSCLOSE, 0); }
		public CharclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCharclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharclassContext charclass() throws RecognitionException {
		CharclassContext _localctx = new CharclassContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_charclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(CLASSOPEN);
			setState(309);
			classname();
			setState(310);
			match(CLASSCLOSE);
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

	public static class ClassnameContext extends ParserRuleContext {
		public AlnumContext alnum() {
			return getRuleContext(AlnumContext.class,0);
		}
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
		}
		public CntrlContext cntrl() {
			return getRuleContext(CntrlContext.class,0);
		}
		public DigitclassContext digitclass() {
			return getRuleContext(DigitclassContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public LowerContext lower() {
			return getRuleContext(LowerContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PunctContext punct() {
			return getRuleContext(PunctContext.class,0);
		}
		public SpaceclassContext spaceclass() {
			return getRuleContext(SpaceclassContext.class,0);
		}
		public UpperContext upper() {
			return getRuleContext(UpperContext.class,0);
		}
		public XdigitContext xdigit() {
			return getRuleContext(XdigitContext.class,0);
		}
		public ErrorClassContext errorClass() {
			return getRuleContext(ErrorClassContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classname);
		try {
			setState(325);
			switch (_input.LA(1)) {
			case ALNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				alnum();
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				alpha();
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				blank();
				}
				break;
			case CNTRL:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				cntrl();
				}
				break;
			case DIGITCLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				digitclass();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				graph();
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				lower();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
				print();
				}
				break;
			case PUNCT:
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				punct();
				}
				break;
			case SPACECLASS:
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				spaceclass();
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 11);
				{
				setState(322);
				upper();
				}
				break;
			case XDIGIT:
				enterOuterAlt(_localctx, 12);
				{
				setState(323);
				xdigit();
				}
				break;
			case ERRORCLASS:
				enterOuterAlt(_localctx, 13);
				{
				setState(324);
				errorClass();
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

	public static class AlnumContext extends ParserRuleContext {
		public TerminalNode ALNUM() { return getToken(RegularExpressionEREParser.ALNUM, 0); }
		public AlnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alnum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAlnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlnumContext alnum() throws RecognitionException {
		AlnumContext _localctx = new AlnumContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ALNUM);
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

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(RegularExpressionEREParser.ALPHA, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_alpha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ALPHA);
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

	public static class BlankContext extends ParserRuleContext {
		public TerminalNode BLANK() { return getToken(RegularExpressionEREParser.BLANK, 0); }
		public BlankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blank; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_blank);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(BLANK);
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

	public static class CntrlContext extends ParserRuleContext {
		public TerminalNode CNTRL() { return getToken(RegularExpressionEREParser.CNTRL, 0); }
		public CntrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cntrl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCntrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CntrlContext cntrl() throws RecognitionException {
		CntrlContext _localctx = new CntrlContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(CNTRL);
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

	public static class DigitclassContext extends ParserRuleContext {
		public TerminalNode DIGITCLASS() { return getToken(RegularExpressionEREParser.DIGITCLASS, 0); }
		public DigitclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitDigitclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitclassContext digitclass() throws RecognitionException {
		DigitclassContext _localctx = new DigitclassContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_digitclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(DIGITCLASS);
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

	public static class GraphContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(RegularExpressionEREParser.GRAPH, 0); }
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(GRAPH);
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

	public static class LowerContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(RegularExpressionEREParser.LOWER, 0); }
		public LowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitLower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(LOWER);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RegularExpressionEREParser.PRINT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(PRINT);
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

	public static class PunctContext extends ParserRuleContext {
		public TerminalNode PUNCT() { return getToken(RegularExpressionEREParser.PUNCT, 0); }
		public PunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitPunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunctContext punct() throws RecognitionException {
		PunctContext _localctx = new PunctContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_punct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(PUNCT);
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

	public static class SpaceclassContext extends ParserRuleContext {
		public TerminalNode SPACECLASS() { return getToken(RegularExpressionEREParser.SPACECLASS, 0); }
		public SpaceclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitSpaceclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceclassContext spaceclass() throws RecognitionException {
		SpaceclassContext _localctx = new SpaceclassContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_spaceclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(SPACECLASS);
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

	public static class UpperContext extends ParserRuleContext {
		public TerminalNode UPPER() { return getToken(RegularExpressionEREParser.UPPER, 0); }
		public UpperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitUpper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_upper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(UPPER);
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

	public static class XdigitContext extends ParserRuleContext {
		public TerminalNode XDIGIT() { return getToken(RegularExpressionEREParser.XDIGIT, 0); }
		public XdigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdigit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitXdigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdigitContext xdigit() throws RecognitionException {
		XdigitContext _localctx = new XdigitContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_xdigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(XDIGIT);
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

	public static class ErrorClassContext extends ParserRuleContext {
		public List<TerminalNode> ERRORCLASS() { return getTokens(RegularExpressionEREParser.ERRORCLASS); }
		public TerminalNode ERRORCLASS(int i) {
			return getToken(RegularExpressionEREParser.ERRORCLASS, i);
		}
		public ErrorClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorClass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitErrorClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorClassContext errorClass() throws RecognitionException {
		ErrorClassContext _localctx = new ErrorClassContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_errorClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(351);
				match(ERRORCLASS);
				}
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ERRORCLASS );
			notifyErrorListeners("Classe nao existe.");
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

	public static class AnycharContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(RegularExpressionEREParser.DOT, 0); }
		public AnycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anychar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAnychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_anychar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(DOT);
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

	public static class EscapedContext extends ParserRuleContext {
		public EscapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped; }
	 
		public EscapedContext() { }
		public void copyFrom(EscapedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EscapedSpecialContext extends EscapedContext {
		public TerminalNode ESCAPE() { return getToken(RegularExpressionEREParser.ESCAPE, 0); }
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public EscapedSpecialContext(EscapedContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitEscapedSpecial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EscapedCharContext extends EscapedContext {
		public TerminalNode ESCAPE() { return getToken(RegularExpressionEREParser.ESCAPE, 0); }
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public EscapedCharContext(EscapedContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitEscapedChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapedContext escaped() throws RecognitionException {
		EscapedContext _localctx = new EscapedContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_escaped);
		try {
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new EscapedSpecialContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(ESCAPE);
				setState(361);
				special();
				}
				break;
			case 2:
				_localctx = new EscapedCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(ESCAPE);
				setState(363);
				character();
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

	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(RegularExpressionEREParser.DOT, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionEREParser.QUESTION, 0); }
		public TerminalNode PLUS() { return getToken(RegularExpressionEREParser.PLUS, 0); }
		public TerminalNode ASTERISC() { return getToken(RegularExpressionEREParser.ASTERISC, 0); }
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionEREParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionEREParser.CURLYCLOSE, 0); }
		public TerminalNode LISTOPEN() { return getToken(RegularExpressionEREParser.LISTOPEN, 0); }
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public TerminalNode DOLAR() { return getToken(RegularExpressionEREParser.DOLAR, 0); }
		public TerminalNode PIPE() { return getToken(RegularExpressionEREParser.PIPE, 0); }
		public TerminalNode GROUPOPEN() { return getToken(RegularExpressionEREParser.GROUPOPEN, 0); }
		public TerminalNode GROUPCLOSE() { return getToken(RegularExpressionEREParser.GROUPCLOSE, 0); }
		public TerminalNode ESCAPE() { return getToken(RegularExpressionEREParser.ESCAPE, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << LISTCLOSE) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CharactersContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public List<EscapedContext> escaped() {
			return getRuleContexts(EscapedContext.class);
		}
		public EscapedContext escaped(int i) {
			return getRuleContext(EscapedContext.class,i);
		}
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCharacters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_characters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(370);
					switch (_input.LA(1)) {
					case COMMA:
					case DASH:
					case DIGIT:
					case OTHER:
						{
						setState(368);
						character();
						}
						break;
					case ESCAPE:
						{
						setState(369);
						escaped();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(RegularExpressionEREParser.DIGIT, 0); }
		public TerminalNode COMMA() { return getToken(RegularExpressionEREParser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(RegularExpressionEREParser.DASH, 0); }
		public TerminalNode OTHER() { return getToken(RegularExpressionEREParser.OTHER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << DASH) | (1L << DIGIT) | (1L << OTHER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 2:
			return subExpression_sempred((SubExpressionContext)_localctx, predIndex);
		case 15:
			return between_sempred((BetweenContext)_localctx, predIndex);
		case 24:
			return range_sempred((RangeContext)_localctx, predIndex);
		case 27:
			return listFirstRange_sempred((ListFirstRangeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean subExpression_sempred(SubExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean between_sempred(BetweenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return menorOuIgual((((BetweenContext)_localctx).a!=null?_input.getText(((BetweenContext)_localctx).a.start,((BetweenContext)_localctx).a.stop):null),(((BetweenContext)_localctx).b!=null?_input.getText(((BetweenContext)_localctx).b.start,((BetweenContext)_localctx).b.stop):null));
		}
		return true;
	}
	private boolean range_sempred(RangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return vemAntesDe((((RangeContext)_localctx).a!=null?_input.getText(((RangeContext)_localctx).a.start,((RangeContext)_localctx).a.stop):null),(((RangeContext)_localctx).b!=null?_input.getText(((RangeContext)_localctx).b.start,((RangeContext)_localctx).b.stop):null));
		case 4:
			return vemAntesDe((((RangeContext)_localctx).c!=null?_input.getText(((RangeContext)_localctx).c.start,((RangeContext)_localctx).c.stop):null),(((RangeContext)_localctx).d!=null?((RangeContext)_localctx).d.getText():null));
		case 5:
			return vemAntesDe((((RangeContext)_localctx).e!=null?_input.getText(((RangeContext)_localctx).e.start,((RangeContext)_localctx).e.stop):null),(((RangeContext)_localctx).f!=null?((RangeContext)_localctx).f.getText():null));
		}
		return true;
	}
	private boolean listFirstRange_sempred(ListFirstRangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return vemAntesDe((((ListFirstRangeContext)_localctx).a!=null?((ListFirstRangeContext)_localctx).a.getText():null),(((ListFirstRangeContext)_localctx).b!=null?((ListFirstRangeContext)_localctx).b.getText():null));
		case 7:
			return vemAntesDe((((ListFirstRangeContext)_localctx).c!=null?((ListFirstRangeContext)_localctx).c.getText():null),(((ListFirstRangeContext)_localctx).d!=null?((ListFirstRangeContext)_localctx).d.getText():null));
		case 8:
			return vemAntesDe((((ListFirstRangeContext)_localctx).e!=null?((ListFirstRangeContext)_localctx).e.getText():null),(((ListFirstRangeContext)_localctx).f!=null?((ListFirstRangeContext)_localctx).f.getText():null));
		case 9:
			return vemAntesDe((((ListFirstRangeContext)_localctx).g!=null?((ListFirstRangeContext)_localctx).g.getText():null),(((ListFirstRangeContext)_localctx).h!=null?((ListFirstRangeContext)_localctx).h.getText():null));
		case 10:
			return vemAntesDe((((ListFirstRangeContext)_localctx).i!=null?((ListFirstRangeContext)_localctx).i.getText():null),(((ListFirstRangeContext)_localctx).j!=null?_input.getText(((ListFirstRangeContext)_localctx).j.start,((ListFirstRangeContext)_localctx).j.stop):null));
		case 11:
			return vemAntesDe((((ListFirstRangeContext)_localctx).k!=null?((ListFirstRangeContext)_localctx).k.getText():null),(((ListFirstRangeContext)_localctx).l!=null?_input.getText(((ListFirstRangeContext)_localctx).l.start,((ListFirstRangeContext)_localctx).l.stop):null));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u017b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2p\n\2\3\2\3\2\7\2t\n\2\f\2\16\2w\13\2"+
		"\3\3\3\3\3\3\6\3|\n\3\r\3\16\3}\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0087"+
		"\n\4\3\4\3\4\7\4\u008b\n\4\f\4\16\4\u008e\13\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\5\6\u0096\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a4"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\6\22\u00c5\n\22\r\22\16\22\u00c6\3\23\6\23\u00ca"+
		"\n\23\r\23\16\23\u00cb\3\24\6\24\u00cf\n\24\r\24\16\24\u00d0\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00d8\n\25\3\25\3\25\3\25\3\25\5\25\u00de\n\25\3"+
		"\25\3\25\5\25\u00e2\n\25\3\26\3\26\3\26\3\27\3\27\3\30\5\30\u00ea\n\30"+
		"\3\30\6\30\u00ed\n\30\r\30\16\30\u00ee\3\30\5\30\u00f2\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00f9\n\30\3\31\3\31\3\31\5\31\u00fe\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u010f\n\32\3\33\3\33\5\33\u0113\n\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0131\n\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0148\n!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\6.\u0163\n.\r.\16.\u0164\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60"+
		"\u016f\n\60\3\61\3\61\3\62\3\62\6\62\u0175\n\62\r\62\16\62\u0176\3\63"+
		"\3\63\3\63\2\4\2\6\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\6\3\2\13\f\5\2\3\n\r\23\25\25\5"+
		"\2\3\3\5\13\r\22\6\2\4\4\f\f\23\23\25\25\u0187\2o\3\2\2\2\4x\3\2\2\2\6"+
		"\u0086\3\2\2\2\b\u008f\3\2\2\2\n\u0095\3\2\2\2\f\u0097\3\2\2\2\16\u0099"+
		"\3\2\2\2\20\u009b\3\2\2\2\22\u00a3\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3"+
		"\2\2\2\30\u00af\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3\3\2\2\2\36\u00b7\3\2"+
		"\2\2 \u00bc\3\2\2\2\"\u00c4\3\2\2\2$\u00c9\3\2\2\2&\u00ce\3\2\2\2(\u00e1"+
		"\3\2\2\2*\u00e3\3\2\2\2,\u00e6\3\2\2\2.\u00f8\3\2\2\2\60\u00fd\3\2\2\2"+
		"\62\u010e\3\2\2\2\64\u0112\3\2\2\2\66\u0114\3\2\2\28\u0130\3\2\2\2:\u0132"+
		"\3\2\2\2<\u0134\3\2\2\2>\u0136\3\2\2\2@\u0147\3\2\2\2B\u0149\3\2\2\2D"+
		"\u014b\3\2\2\2F\u014d\3\2\2\2H\u014f\3\2\2\2J\u0151\3\2\2\2L\u0153\3\2"+
		"\2\2N\u0155\3\2\2\2P\u0157\3\2\2\2R\u0159\3\2\2\2T\u015b\3\2\2\2V\u015d"+
		"\3\2\2\2X\u015f\3\2\2\2Z\u0162\3\2\2\2\\\u0168\3\2\2\2^\u016e\3\2\2\2"+
		"`\u0170\3\2\2\2b\u0174\3\2\2\2d\u0178\3\2\2\2fg\b\2\1\2gp\5\b\5\2hp\5"+
		"\4\3\2ip\5\n\6\2jp\5\20\t\2kp\5(\25\2lp\5\\/\2mp\5b\62\2np\7\26\2\2of"+
		"\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2o"+
		"n\3\2\2\2pu\3\2\2\2qr\f\7\2\2rt\5\2\2\bsq\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2v\3\3\2\2\2wu\3\2\2\2x{\5\6\4\2yz\7\17\2\2z|\5\6\4\2{y\3\2\2"+
		"\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\5\3\2\2\2\177\u0080\b\4\1\2\u0080\u0087"+
		"\5\b\5\2\u0081\u0087\5\n\6\2\u0082\u0087\5\20\t\2\u0083\u0087\5(\25\2"+
		"\u0084\u0087\5\\/\2\u0085\u0087\5b\62\2\u0086\177\3\2\2\2\u0086\u0081"+
		"\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008c\3\2\2\2\u0088\u0089\f\6\2\2\u0089\u008b\5\6"+
		"\4\7\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\7\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\20\2"+
		"\2\u0090\u0091\5\2\2\2\u0091\u0092\7\21\2\2\u0092\t\3\2\2\2\u0093\u0096"+
		"\5\f\7\2\u0094\u0096\5\16\b\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\13\3\2\2\2\u0097\u0098\7\r\2\2\u0098\r\3\2\2\2\u0099\u009a\7\16"+
		"\2\2\u009a\17\3\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\5\24\13\2\u009d"+
		"\21\3\2\2\2\u009e\u00a4\5\b\5\2\u009f\u00a4\5(\25\2\u00a0\u00a4\5\\/\2"+
		"\u00a1\u00a4\5^\60\2\u00a2\u00a4\5d\63\2\u00a3\u009e\3\2\2\2\u00a3\u009f"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\23\3\2\2\2\u00a5\u00ac\5\26\f\2\u00a6\u00ac\5\30\r\2\u00a7\u00ac\5\32"+
		"\16\2\u00a8\u00ac\5\34\17\2\u00a9\u00ac\5\36\20\2\u00aa\u00ac\5 \21\2"+
		"\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad"+
		"\u00ae\7\6\2\2\u00ae\27\3\2\2\2\u00af\u00b0\7\7\2\2\u00b0\31\3\2\2\2\u00b1"+
		"\u00b2\7\5\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\b\2\2\u00b4\u00b5\5\"\22"+
		"\2\u00b5\u00b6\7\t\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9"+
		"\5\"\22\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\7\t\2\2\u00bb\37\3\2\2\2\u00bc"+
		"\u00bd\7\b\2\2\u00bd\u00be\5$\23\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\5&"+
		"\24\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\6\21\4\3\u00c2!\3\2\2\2\u00c3\u00c5"+
		"\7\23\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00ca\7\23\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"%\3\2\2\2\u00cd\u00cf\7\23\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7"+
		"\n\2\2\u00d3\u00d8\7\13\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\7\r\2\2\u00d6"+
		"\u00d8\7\13\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00e2\b\25\1\2\u00da\u00dd\7\n\2\2\u00db\u00de\5*\26\2\u00dc"+
		"\u00de\5,\27\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1"+
		"\u00da\3\2\2\2\u00e2)\3\2\2\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\5.\30\2"+
		"\u00e5+\3\2\2\2\u00e6\u00e7\5.\30\2\u00e7-\3\2\2\2\u00e8\u00ea\5\64\33"+
		"\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00ed"+
		"\5\60\31\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5:\36\2\u00f1\u00f0"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f9\3\2\2\2\u00f3\u00f9\5\64\33\2"+
		"\u00f4\u00f9\5:\36\2\u00f5\u00f6\5\64\33\2\u00f6\u00f7\5:\36\2\u00f7\u00f9"+
		"\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9/\3\2\2\2\u00fa\u00fe\5\62\32\2\u00fb\u00fe\5> \2"+
		"\u00fc\u00fe\5<\37\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\61\3\2\2\2\u00ff\u0100\5<\37\2\u0100\u0101\7\f\2\2\u0101"+
		"\u0102\5<\37\2\u0102\u0103\6\32\5\3\u0103\u010f\3\2\2\2\u0104\u0105\5"+
		"<\37\2\u0105\u0106\7\f\2\2\u0106\u0107\7\f\2\2\u0107\u0108\6\32\6\3\u0108"+
		"\u010f\3\2\2\2\u0109\u010a\5<\37\2\u010a\u010b\7\f\2\2\u010b\u010c\7\13"+
		"\2\2\u010c\u010d\6\32\7\3\u010d\u010f\3\2\2\2\u010e\u00ff\3\2\2\2\u010e"+
		"\u0104\3\2\2\2\u010e\u0109\3\2\2\2\u010f\63\3\2\2\2\u0110\u0113\58\35"+
		"\2\u0111\u0113\5\66\34\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\65\3\2\2\2\u0114\u0115\t\2\2\2\u0115\67\3\2\2\2\u0116\u0117\7\13\2\2"+
		"\u0117\u0118\7\f\2\2\u0118\u0119\7\f\2\2\u0119\u0131\6\35\b\3\u011a\u011b"+
		"\7\f\2\2\u011b\u011c\7\f\2\2\u011c\u011d\7\f\2\2\u011d\u0131\6\35\t\3"+
		"\u011e\u011f\7\13\2\2\u011f\u0120\7\f\2\2\u0120\u0121\7\13\2\2\u0121\u0131"+
		"\6\35\n\3\u0122\u0123\7\f\2\2\u0123\u0124\7\f\2\2\u0124\u0125\7\13\2\2"+
		"\u0125\u0131\6\35\13\3\u0126\u0127\7\13\2\2\u0127\u0128\7\f\2\2\u0128"+
		"\u0129\5<\37\2\u0129\u012a\6\35\f\3\u012a\u0131\3\2\2\2\u012b\u012c\7"+
		"\f\2\2\u012c\u012d\7\f\2\2\u012d\u012e\5<\37\2\u012e\u012f\6\35\r\3\u012f"+
		"\u0131\3\2\2\2\u0130\u0116\3\2\2\2\u0130\u011a\3\2\2\2\u0130\u011e\3\2"+
		"\2\2\u0130\u0122\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u012b\3\2\2\2\u0131"+
		"9\3\2\2\2\u0132\u0133\7\f\2\2\u0133;\3\2\2\2\u0134\u0135\t\3\2\2\u0135"+
		"=\3\2\2\2\u0136\u0137\7\24\2\2\u0137\u0138\5@!\2\u0138\u0139\7$\2\2\u0139"+
		"?\3\2\2\2\u013a\u0148\5B\"\2\u013b\u0148\5D#\2\u013c\u0148\5F$\2\u013d"+
		"\u0148\5H%\2\u013e\u0148\5J&\2\u013f\u0148\5L\'\2\u0140\u0148\5N(\2\u0141"+
		"\u0148\5P)\2\u0142\u0148\5R*\2\u0143\u0148\5T+\2\u0144\u0148\5V,\2\u0145"+
		"\u0148\5X-\2\u0146\u0148\5Z.\2\u0147\u013a\3\2\2\2\u0147\u013b\3\2\2\2"+
		"\u0147\u013c\3\2\2\2\u0147\u013d\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u013f"+
		"\3\2\2\2\u0147\u0140\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147"+
		"\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2"+
		"\2\2\u0148A\3\2\2\2\u0149\u014a\7\31\2\2\u014aC\3\2\2\2\u014b\u014c\7"+
		"\32\2\2\u014cE\3\2\2\2\u014d\u014e\7\33\2\2\u014eG\3\2\2\2\u014f\u0150"+
		"\7\34\2\2\u0150I\3\2\2\2\u0151\u0152\7\27\2\2\u0152K\3\2\2\2\u0153\u0154"+
		"\7\35\2\2\u0154M\3\2\2\2\u0155\u0156\7\36\2\2\u0156O\3\2\2\2\u0157\u0158"+
		"\7\37\2\2\u0158Q\3\2\2\2\u0159\u015a\7 \2\2\u015aS\3\2\2\2\u015b\u015c"+
		"\7\30\2\2\u015cU\3\2\2\2\u015d\u015e\7!\2\2\u015eW\3\2\2\2\u015f\u0160"+
		"\7\"\2\2\u0160Y\3\2\2\2\u0161\u0163\7#\2\2\u0162\u0161\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\b.\1\2\u0167[\3\2\2\2\u0168\u0169\7\3\2\2\u0169]\3\2\2\2\u016a"+
		"\u016b\7\22\2\2\u016b\u016f\5`\61\2\u016c\u016d\7\22\2\2\u016d\u016f\5"+
		"d\63\2\u016e\u016a\3\2\2\2\u016e\u016c\3\2\2\2\u016f_\3\2\2\2\u0170\u0171"+
		"\t\4\2\2\u0171a\3\2\2\2\u0172\u0175\5d\63\2\u0173\u0175\5^\60\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177c\3\2\2\2\u0178\u0179\t\5\2\2\u0179e\3\2"+
		"\2\2\35ou}\u0086\u008c\u0095\u00a3\u00ab\u00c6\u00cb\u00d0\u00d7\u00dd"+
		"\u00e1\u00e9\u00ee\u00f1\u00f8\u00fd\u010e\u0112\u0130\u0147\u0164\u016e"+
		"\u0174\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}