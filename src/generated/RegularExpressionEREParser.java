package generated;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
// Generated from RegularExpressionERE.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularExpressionEREParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
	RULE_emptyList = 20, RULE_emptyPositiveList = 21, RULE_emptyNegativeList = 22,
	RULE_negativeList = 23, RULE_positiveList = 24, RULE_listElements = 25,
	RULE_listElement = 26, RULE_range = 27, RULE_listFirstElement = 28, RULE_listNoSpecial = 29,
	RULE_listFirstRange = 30, RULE_listLastElement = 31, RULE_listCharacter = 32,
	RULE_charclass = 33, RULE_classname = 34, RULE_alnum = 35, RULE_alpha = 36,
	RULE_blank = 37, RULE_cntrl = 38, RULE_digitclass = 39, RULE_graph = 40,
	RULE_lower = 41, RULE_print = 42, RULE_punct = 43, RULE_spaceclass = 44,
	RULE_upper = 45, RULE_xdigit = 46, RULE_errorClass = 47, RULE_anychar = 48,
	RULE_escaped = 49, RULE_special = 50, RULE_characters = 51, RULE_character = 52;
	public static final String[] ruleNames = {
			"expression", "multiple", "subExpression", "group", "anchor", "startAnchor",
			"endAnchor", "repetition", "quantified", "quantifier", "oneOrMore", "zeroOrMore",
			"conditional", "exact", "atLeast", "between", "value", "firstValue", "lastValue",
			"list", "emptyList", "emptyPositiveList", "emptyNegativeList", "negativeList",
			"positiveList", "listElements", "listElement", "range", "listFirstElement",
			"listNoSpecial", "listFirstRange", "listLastElement", "listCharacter",
			"charclass", "classname", "alnum", "alpha", "blank", "cntrl", "digitclass",
			"graph", "lower", "print", "punct", "spaceclass", "upper", "xdigit", "errorClass",
			"anychar", "escaped", "special", "characters", "character"
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
			if (tokenNames[i] == null)
				tokenNames[i] = VOCABULARY.getSymbolicName(i);

			if (tokenNames[i] == null)
				tokenNames[i] = "<INVALID>";
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
		int unicodeA = a;
		int unicodeB = b;
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitExpression(this);
		}
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(115);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
				{
					setState(107);
					group();
				}
				break;
				case 2:
				{
					setState(108);
					multiple();
				}
				break;
				case 3:
				{
					setState(109);
					anchor();
				}
				break;
				case 4:
				{
					setState(110);
					repetition();
				}
				break;
				case 5:
				{
					setState(111);
					list();
				}
				break;
				case 6:
				{
					setState(112);
					anychar();
				}
				break;
				case 7:
				{
					setState(113);
					characters();
				}
				break;
				case 8:
				{
					setState(114);
					match(WS);
				}
				break;
				}
				_ctx.stop = _input.LT(-1);
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( (_alt!=2) && (_alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						{
							{
								_localctx = new ExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(117);
								if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
								setState(118);
								expression(6);
							}
						}
					}
					setState(123);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitMultiple(this);
		}
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
				setState(124);
				subExpression(0);
				setState(127);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
					{
						{
							setState(125);
							match(PIPE);
							setState(126);
							subExpression(0);
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( (_alt!=2) && (_alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitSubExpression(this);
		}
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_subExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(138);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
				{
					setState(132);
					group();
				}
				break;
				case 2:
				{
					setState(133);
					anchor();
				}
				break;
				case 3:
				{
					setState(134);
					repetition();
				}
				break;
				case 4:
				{
					setState(135);
					list();
				}
				break;
				case 5:
				{
					setState(136);
					anychar();
				}
				break;
				case 6:
				{
					setState(137);
					characters();
				}
				break;
				}
				_ctx.stop = _input.LT(-1);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( (_alt!=2) && (_alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						{
							{
								_localctx = new SubExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_subExpression);
								setState(140);
								if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
								setState(141);
								subExpression(5);
							}
						}
					}
					setState(146);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitGroup(this);
		}
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
				setState(147);
				match(GROUPOPEN);
				setState(148);
				expression(0);
				setState(149);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitAnchor(this);
		}
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
			setState(153);
			switch (_input.LA(1)) {
			case CIRCUMFLEX:
				enterOuterAlt(_localctx, 1);
				{
					setState(151);
					startAnchor();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
					setState(152);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterStartAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitStartAnchor(this);
		}
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
				setState(155);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterEndAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitEndAnchor(this);
		}
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
				setState(157);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterRepetition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitRepetition(this);
		}
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
				setState(159);
				quantified();
				setState(160);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterQuantified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitQuantified(this);
		}
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
			setState(167);
			switch (_input.LA(1)) {
			case GROUPOPEN:
				enterOuterAlt(_localctx, 1);
				{
					setState(162);
					group();
				}
				break;
			case LISTOPEN:
				enterOuterAlt(_localctx, 2);
				{
					setState(163);
					list();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
					setState(164);
					anychar();
				}
				break;
			case ESCAPE:
				enterOuterAlt(_localctx, 4);
				{
					setState(165);
					escaped();
				}
				break;
			case COMMA:
			case DASH:
			case DIGIT:
			case OTHER:
				enterOuterAlt(_localctx, 5);
				{
					setState(166);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitQuantifier(this);
		}
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
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(169);
					oneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(170);
					zeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(171);
					conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(172);
					exact();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(173);
					atLeast();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(174);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitOneOrMore(this);
		}
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
				setState(177);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitZeroOrMore(this);
		}
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
				setState(179);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitConditional(this);
		}
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
				setState(181);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterExact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitExact(this);
		}
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
				setState(183);
				match(CURLYOPEN);
				setState(184);
				value();
				setState(185);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterAtLeast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitAtLeast(this);
		}
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
				setState(187);
				match(CURLYOPEN);
				setState(188);
				value();
				setState(189);
				match(COMMA);
				setState(190);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitBetween(this);
		}
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
				setState(192);
				match(CURLYOPEN);
				setState(193);
				_localctx.a = firstValue();
				setState(194);
				match(COMMA);
				setState(195);
				_localctx.b = lastValue();
				setState(196);
				match(CURLYCLOSE);
				setState(197);
				if (!(menorOuIgual((_localctx.a!=null?_input.getText(_localctx.a.start,_localctx.a.stop):null),(_localctx.b!=null?_input.getText(_localctx.b.start,_localctx.b.stop):null)))) throw new FailedPredicateException(this, "menorOuIgual($a.text,$b.text)");
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitValue(this);
		}
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
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(199);
							match(DIGIT);
						}
					}
					setState(202);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterFirstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitFirstValue(this);
		}
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
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(204);
							match(DIGIT);
						}
					}
					setState(207);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterLastValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitLastValue(this);
		}
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
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(209);
							match(DIGIT);
						}
					}
					setState(212);
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
		public NegativeListContext negativeList() {
			return getRuleContext(NegativeListContext.class,0);
		}
		public PositiveListContext positiveList() {
			return getRuleContext(PositiveListContext.class,0);
		}
		public EmptyListContext emptyList() {
			return getRuleContext(EmptyListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitList(this);
		}
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
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(214);
					negativeList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(215);
					positiveList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(216);
					emptyList();
					notifyErrorListeners("Lista vazia.");
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

	public static class EmptyListContext extends ParserRuleContext {
		public EmptyPositiveListContext emptyPositiveList() {
			return getRuleContext(EmptyPositiveListContext.class,0);
		}
		public EmptyNegativeListContext emptyNegativeList() {
			return getRuleContext(EmptyNegativeListContext.class,0);
		}
		public EmptyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterEmptyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitEmptyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitEmptyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyListContext emptyList() throws RecognitionException {
		EmptyListContext _localctx = new EmptyListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_emptyList);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(221);
					emptyPositiveList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(222);
					emptyNegativeList();
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

	public static class EmptyPositiveListContext extends ParserRuleContext {
		public TerminalNode LISTOPEN() { return getToken(RegularExpressionEREParser.LISTOPEN, 0); }
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public EmptyPositiveListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyPositiveList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterEmptyPositiveList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitEmptyPositiveList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitEmptyPositiveList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyPositiveListContext emptyPositiveList() throws RecognitionException {
		EmptyPositiveListContext _localctx = new EmptyPositiveListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_emptyPositiveList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(225);
				match(LISTOPEN);
				setState(226);
				match(LISTCLOSE);
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

	public static class EmptyNegativeListContext extends ParserRuleContext {
		public TerminalNode LISTOPEN() { return getToken(RegularExpressionEREParser.LISTOPEN, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public EmptyNegativeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyNegativeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterEmptyNegativeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitEmptyNegativeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitEmptyNegativeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyNegativeListContext emptyNegativeList() throws RecognitionException {
		EmptyNegativeListContext _localctx = new EmptyNegativeListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_emptyNegativeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(228);
				match(LISTOPEN);
				setState(229);
				match(CIRCUMFLEX);
				setState(230);
				match(LISTCLOSE);
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
		public TerminalNode LISTOPEN() { return getToken(RegularExpressionEREParser.LISTOPEN, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public ListElementsContext listElements() {
			return getRuleContext(ListElementsContext.class,0);
		}
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public NegativeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterNegativeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitNegativeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitNegativeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeListContext negativeList() throws RecognitionException {
		NegativeListContext _localctx = new NegativeListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_negativeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(232);
				match(LISTOPEN);
				setState(233);
				match(CIRCUMFLEX);
				setState(234);
				listElements();
				setState(235);
				match(LISTCLOSE);
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
		public TerminalNode LISTOPEN() { return getToken(RegularExpressionEREParser.LISTOPEN, 0); }
		public ListElementsContext listElements() {
			return getRuleContext(ListElementsContext.class,0);
		}
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public PositiveListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterPositiveList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitPositiveList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitPositiveList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositiveListContext positiveList() throws RecognitionException {
		PositiveListContext _localctx = new PositiveListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_positiveList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(237);
				match(LISTOPEN);
				setState(238);
				listElements();
				setState(239);
				match(LISTCLOSE);
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
		public ListLastElementContext listLastElement() {
			return getRuleContext(ListLastElementContext.class,0);
		}
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public ListElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterListElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitListElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementsContext listElements() throws RecognitionException {
		ListElementsContext _localctx = new ListElementsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listElements);
		int _la;
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(241);
					listFirstElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(242);
					listLastElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(243);
					listFirstElement();
					setState(244);
					listLastElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(246);
					listFirstElement();
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(247);
								listElement();
							}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << CLASSOPEN) | (1L << OTHER))) != 0)) );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(252);
								listElement();
							}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << CLASSOPEN) | (1L << OTHER))) != 0)) );
					setState(257);
					listLastElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(259);
					listFirstElement();
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(260);
								listElement();
							}
						}
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << CLASSOPEN) | (1L << OTHER))) != 0)) );
					setState(265);
					listLastElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(267);
								listElement();
							}
						}
						setState(270);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << CLASSOPEN) | (1L << OTHER))) != 0)) );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listElement);
		try {
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(274);
					range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(275);
					charclass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(276);
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
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_range);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(279);
					_localctx.a = listCharacter();
					setState(280);
					match(DASH);
					setState(281);
					_localctx.b = listCharacter();
					setState(282);
					if (!(vemAntesDe((_localctx.a!=null?_input.getText(_localctx.a.start,_localctx.a.stop):null),(_localctx.b!=null?_input.getText(_localctx.b.start,_localctx.b.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($a.text,$b.text)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(284);
					_localctx.c = listCharacter();
					setState(285);
					match(DASH);
					setState(286);
					_localctx.d = match(DASH);
					setState(287);
					if (!(vemAntesDe((_localctx.c!=null?_input.getText(_localctx.c.start,_localctx.c.stop):null),(_localctx.d!=null?_localctx.d.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($c.text,$d.text)");
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterListFirstElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitListFirstElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListFirstElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListFirstElementContext listFirstElement() throws RecognitionException {
		ListFirstElementContext _localctx = new ListFirstElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listFirstElement);
		try {
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(291);
					listFirstRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(292);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterListNoSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitListNoSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListNoSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListNoSpecialContext listNoSpecial() throws RecognitionException {
		ListNoSpecialContext _localctx = new ListNoSpecialContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listNoSpecial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(295);
				_la = _input.LA(1);
				if ( !((_la==LISTCLOSE) || (_la==DASH)) )
					_errHandler.recoverInline(this);
				else
					consume();
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
		public Token i;
		public ListCharacterContext j;
		public Token k;
		public ListCharacterContext l;
		public List<TerminalNode> DASH() { return getTokens(RegularExpressionEREParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(RegularExpressionEREParser.DASH, i);
		}
		public TerminalNode LISTCLOSE() { return getToken(RegularExpressionEREParser.LISTCLOSE, 0); }
		public ListCharacterContext listCharacter() {
			return getRuleContext(ListCharacterContext.class,0);
		}
		public ListFirstRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFirstRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterListFirstRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitListFirstRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListFirstRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListFirstRangeContext listFirstRange() throws RecognitionException {
		ListFirstRangeContext _localctx = new ListFirstRangeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listFirstRange);
		try {
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(297);
					_localctx.a = match(LISTCLOSE);
					setState(298);
					match(DASH);
					setState(299);
					_localctx.b = match(DASH);
					setState(300);
					if (!(vemAntesDe((_localctx.a!=null?_localctx.a.getText():null),(_localctx.b!=null?_localctx.b.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($a.text,$b.text)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(301);
					_localctx.c = match(DASH);
					setState(302);
					match(DASH);
					setState(303);
					_localctx.d = match(DASH);
					setState(304);
					if (!(vemAntesDe((_localctx.c!=null?_localctx.c.getText():null),(_localctx.d!=null?_localctx.d.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($c.text,$d.text)");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(305);
					_localctx.i = match(LISTCLOSE);
					setState(306);
					match(DASH);
					setState(307);
					_localctx.j = listCharacter();
					setState(308);
					if (!(vemAntesDe((_localctx.i!=null?_localctx.i.getText():null),(_localctx.j!=null?_input.getText(_localctx.j.start,_localctx.j.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($i.text,$j.text)");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(310);
					_localctx.k = match(DASH);
					setState(311);
					match(DASH);
					setState(312);
					_localctx.l = listCharacter();
					setState(313);
					if (!(vemAntesDe((_localctx.k!=null?_localctx.k.getText():null),(_localctx.l!=null?_input.getText(_localctx.l.start,_localctx.l.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($k.text,$l.text)");
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterListLastElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitListLastElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListLastElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLastElementContext listLastElement() throws RecognitionException {
		ListLastElementContext _localctx = new ListLastElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_listLastElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(317);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterListCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitListCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitListCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListCharacterContext listCharacter() throws RecognitionException {
		ListCharacterContext _localctx = new ListCharacterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(319);
				_la = _input.LA(1);
				if ( !(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << OTHER))) != 0))) )
					_errHandler.recoverInline(this);
				else
					consume();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterCharclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitCharclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCharclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharclassContext charclass() throws RecognitionException {
		CharclassContext _localctx = new CharclassContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_charclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(321);
				match(CLASSOPEN);
				setState(322);
				classname();
				setState(323);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_classname);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case ALNUM:
				enterOuterAlt(_localctx, 1);
				{
					setState(325);
					alnum();
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
					setState(326);
					alpha();
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 3);
				{
					setState(327);
					blank();
				}
				break;
			case CNTRL:
				enterOuterAlt(_localctx, 4);
				{
					setState(328);
					cntrl();
				}
				break;
			case DIGITCLASS:
				enterOuterAlt(_localctx, 5);
				{
					setState(329);
					digitclass();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 6);
				{
					setState(330);
					graph();
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 7);
				{
					setState(331);
					lower();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
					setState(332);
					print();
				}
				break;
			case PUNCT:
				enterOuterAlt(_localctx, 9);
				{
					setState(333);
					punct();
				}
				break;
			case SPACECLASS:
				enterOuterAlt(_localctx, 10);
				{
					setState(334);
					spaceclass();
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 11);
				{
					setState(335);
					upper();
				}
				break;
			case XDIGIT:
				enterOuterAlt(_localctx, 12);
				{
					setState(336);
					xdigit();
				}
				break;
			case ERRORCLASS:
				enterOuterAlt(_localctx, 13);
				{
					setState(337);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterAlnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitAlnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAlnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlnumContext alnum() throws RecognitionException {
		AlnumContext _localctx = new AlnumContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(340);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alpha);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(342);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_blank);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(344);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterCntrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitCntrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCntrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CntrlContext cntrl() throws RecognitionException {
		CntrlContext _localctx = new CntrlContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(346);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterDigitclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitDigitclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitDigitclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitclassContext digitclass() throws RecognitionException {
		DigitclassContext _localctx = new DigitclassContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_digitclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(348);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitGraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(350);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterLower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitLower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitLower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(352);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(354);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterPunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitPunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitPunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunctContext punct() throws RecognitionException {
		PunctContext _localctx = new PunctContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_punct);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(356);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterSpaceclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitSpaceclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitSpaceclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceclassContext spaceclass() throws RecognitionException {
		SpaceclassContext _localctx = new SpaceclassContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_spaceclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(358);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterUpper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitUpper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitUpper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_upper);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(360);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterXdigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitXdigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitXdigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdigitContext xdigit() throws RecognitionException {
		XdigitContext _localctx = new XdigitContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_xdigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(362);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterErrorClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitErrorClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitErrorClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorClassContext errorClass() throws RecognitionException {
		ErrorClassContext _localctx = new ErrorClassContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_errorClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(364);
							match(ERRORCLASS);
						}
					}
					setState(367);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterAnychar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitAnychar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitAnychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_anychar);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(371);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterEscapedSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitEscapedSpecial(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterEscapedChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitEscapedChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitEscapedChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapedContext escaped() throws RecognitionException {
		EscapedContext _localctx = new EscapedContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_escaped);
		try {
			setState(377);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new EscapedSpecialContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
					setState(373);
					match(ESCAPE);
					setState(374);
					special();
				}
				break;
			case 2:
				_localctx = new EscapedCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
					setState(375);
					match(ESCAPE);
					setState(376);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(379);
				_la = _input.LA(1);
				if ( !(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << DOT) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << LISTCLOSE) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE))) != 0))) )
					_errHandler.recoverInline(this);
				else
					consume();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitCharacters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCharacters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_characters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(383);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
					{
						setState(383);
						switch (_input.LA(1)) {
						case COMMA:
						case DASH:
						case DIGIT:
						case OTHER:
						{
							setState(381);
							character();
						}
						break;
						case ESCAPE:
						{
							setState(382);
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
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( (_alt!=2) && (_alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(387);
				_la = _input.LA(1);
				if ( !(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << COMMA) | (1L << DASH) | (1L << DIGIT) | (1L << OTHER))) != 0))) )
					_errHandler.recoverInline(this);
				else
					consume();
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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 2:
			return subExpression_sempred((SubExpressionContext)_localctx, predIndex);
		case 15:
			return between_sempred((BetweenContext)_localctx, predIndex);
		case 27:
			return range_sempred((RangeContext)_localctx, predIndex);
		case 30:
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
			return menorOuIgual((_localctx.a!=null?_input.getText(_localctx.a.start,_localctx.a.stop):null),(_localctx.b!=null?_input.getText(_localctx.b.start,_localctx.b.stop):null));
		}
		return true;
	}
	private boolean range_sempred(RangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return vemAntesDe((_localctx.a!=null?_input.getText(_localctx.a.start,_localctx.a.stop):null),(_localctx.b!=null?_input.getText(_localctx.b.start,_localctx.b.stop):null));
		case 4:
			return vemAntesDe((_localctx.c!=null?_input.getText(_localctx.c.start,_localctx.c.stop):null),(_localctx.d!=null?_localctx.d.getText():null));
		}
		return true;
	}
	private boolean listFirstRange_sempred(ListFirstRangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return vemAntesDe((_localctx.a!=null?_localctx.a.getText():null),(_localctx.b!=null?_localctx.b.getText():null));
		case 6:
			return vemAntesDe((_localctx.c!=null?_localctx.c.getText():null),(_localctx.d!=null?_localctx.d.getText():null));
		case 7:
			return vemAntesDe((_localctx.i!=null?_localctx.i.getText():null),(_localctx.j!=null?_input.getText(_localctx.j.start,_localctx.j.stop):null));
		case 8:
			return vemAntesDe((_localctx.k!=null?_localctx.k.getText():null),(_localctx.l!=null?_input.getText(_localctx.l.start,_localctx.l.stop):null));
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0188\4\2\t\2\4"+
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
					"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2v\n\2\3"+
					"\2\3\2\7\2z\n\2\f\2\16\2}\13\2\3\3\3\3\3\3\6\3\u0082\n\3\r\3\16\3\u0083"+
					"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\4\3\4\7\4\u0091\n\4\f\4\16"+
					"\4\u0094\13\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u009c\n\6\3\7\3\7\3\b\3\b\3"+
					"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\3\13\3\13"+
					"\3\13\5\13\u00b2\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
					"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u00cb"+
					"\n\22\r\22\16\22\u00cc\3\23\6\23\u00d0\n\23\r\23\16\23\u00d1\3\24\6\24"+
					"\u00d5\n\24\r\24\16\24\u00d6\3\25\3\25\3\25\3\25\3\25\5\25\u00de\n\25"+
					"\3\26\3\26\5\26\u00e2\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
					"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
					"\6\33\u00fb\n\33\r\33\16\33\u00fc\3\33\6\33\u0100\n\33\r\33\16\33\u0101"+
					"\3\33\3\33\3\33\3\33\6\33\u0108\n\33\r\33\16\33\u0109\3\33\3\33\3\33\6"+
					"\33\u010f\n\33\r\33\16\33\u0110\5\33\u0113\n\33\3\34\3\34\3\34\5\34\u0118"+
					"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0124\n\35"+
					"\3\36\3\36\5\36\u0128\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
					"\3 \3 \3 \3 \3 \3 \3 \5 \u013e\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3"+
					"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0155\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
					"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\6\61\u0170\n\61"+
					"\r\61\16\61\u0171\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u017c\n"+
					"\63\3\64\3\64\3\65\3\65\6\65\u0182\n\65\r\65\16\65\u0183\3\66\3\66\3\66"+
					"\2\4\2\6\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
					"8:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\6\3\2\13\f\5\2\3\n\r\23\25\25\5\2\3\3\5"+
					"\13\r\22\6\2\4\4\f\f\23\23\25\25\u0192\2u\3\2\2\2\4~\3\2\2\2\6\u008c\3"+
					"\2\2\2\b\u0095\3\2\2\2\n\u009b\3\2\2\2\f\u009d\3\2\2\2\16\u009f\3\2\2"+
					"\2\20\u00a1\3\2\2\2\22\u00a9\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3\3\2\2\2"+
					"\30\u00b5\3\2\2\2\32\u00b7\3\2\2\2\34\u00b9\3\2\2\2\36\u00bd\3\2\2\2 "+
					"\u00c2\3\2\2\2\"\u00ca\3\2\2\2$\u00cf\3\2\2\2&\u00d4\3\2\2\2(\u00dd\3"+
					"\2\2\2*\u00e1\3\2\2\2,\u00e3\3\2\2\2.\u00e6\3\2\2\2\60\u00ea\3\2\2\2\62"+
					"\u00ef\3\2\2\2\64\u0112\3\2\2\2\66\u0117\3\2\2\28\u0123\3\2\2\2:\u0127"+
					"\3\2\2\2<\u0129\3\2\2\2>\u013d\3\2\2\2@\u013f\3\2\2\2B\u0141\3\2\2\2D"+
					"\u0143\3\2\2\2F\u0154\3\2\2\2H\u0156\3\2\2\2J\u0158\3\2\2\2L\u015a\3\2"+
					"\2\2N\u015c\3\2\2\2P\u015e\3\2\2\2R\u0160\3\2\2\2T\u0162\3\2\2\2V\u0164"+
					"\3\2\2\2X\u0166\3\2\2\2Z\u0168\3\2\2\2\\\u016a\3\2\2\2^\u016c\3\2\2\2"+
					"`\u016f\3\2\2\2b\u0175\3\2\2\2d\u017b\3\2\2\2f\u017d\3\2\2\2h\u0181\3"+
					"\2\2\2j\u0185\3\2\2\2lm\b\2\1\2mv\5\b\5\2nv\5\4\3\2ov\5\n\6\2pv\5\20\t"+
					"\2qv\5(\25\2rv\5b\62\2sv\5h\65\2tv\7\26\2\2ul\3\2\2\2un\3\2\2\2uo\3\2"+
					"\2\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v{\3\2\2\2wx\f\7"+
					"\2\2xz\5\2\2\byw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\3\3\2\2\2}{\3"+
					"\2\2\2~\u0081\5\6\4\2\177\u0080\7\17\2\2\u0080\u0082\5\6\4\2\u0081\177"+
					"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
					"\5\3\2\2\2\u0085\u0086\b\4\1\2\u0086\u008d\5\b\5\2\u0087\u008d\5\n\6\2"+
					"\u0088\u008d\5\20\t\2\u0089\u008d\5(\25\2\u008a\u008d\5b\62\2\u008b\u008d"+
					"\5h\65\2\u008c\u0085\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c"+
					"\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0092\3\2"+
					"\2\2\u008e\u008f\f\6\2\2\u008f\u0091\5\6\4\7\u0090\u008e\3\2\2\2\u0091"+
					"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\7\3\2\2\2"+
					"\u0094\u0092\3\2\2\2\u0095\u0096\7\20\2\2\u0096\u0097\5\2\2\2\u0097\u0098"+
					"\7\21\2\2\u0098\t\3\2\2\2\u0099\u009c\5\f\7\2\u009a\u009c\5\16\b\2\u009b"+
					"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\13\3\2\2\2\u009d\u009e\7\r\2"+
					"\2\u009e\r\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0\17\3\2\2\2\u00a1\u00a2\5"+
					"\22\n\2\u00a2\u00a3\5\24\13\2\u00a3\21\3\2\2\2\u00a4\u00aa\5\b\5\2\u00a5"+
					"\u00aa\5(\25\2\u00a6\u00aa\5b\62\2\u00a7\u00aa\5d\63\2\u00a8\u00aa\5j"+
					"\66\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
					"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00b2\5\26\f"+
					"\2\u00ac\u00b2\5\30\r\2\u00ad\u00b2\5\32\16\2\u00ae\u00b2\5\34\17\2\u00af"+
					"\u00b2\5\36\20\2\u00b0\u00b2\5 \21\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3"+
					"\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
					"\u00b0\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7\6\2\2\u00b4\27\3\2\2\2\u00b5"+
					"\u00b6\7\7\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\7\5\2\2\u00b8\33\3\2\2\2\u00b9"+
					"\u00ba\7\b\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\7\t\2\2\u00bc\35\3\2\2"+
					"\2\u00bd\u00be\7\b\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7\4\2\2\u00c0"+
					"\u00c1\7\t\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\5$\23"+
					"\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\5&\24\2\u00c6\u00c7\7\t\2\2\u00c7\u00c8"+
					"\6\21\4\3\u00c8!\3\2\2\2\u00c9\u00cb\7\23\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
					"\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd#\3\2\2\2"+
					"\u00ce\u00d0\7\23\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf"+
					"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00d5\7\23\2\2\u00d4"+
					"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
					"\2\2\u00d7\'\3\2\2\2\u00d8\u00de\5\60\31\2\u00d9\u00de\5\62\32\2\u00da"+
					"\u00db\5*\26\2\u00db\u00dc\b\25\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3"+
					"\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00de)\3\2\2\2\u00df\u00e2"+
					"\5,\27\2\u00e0\u00e2\5.\30\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
					"+\3\2\2\2\u00e3\u00e4\7\n\2\2\u00e4\u00e5\7\13\2\2\u00e5-\3\2\2\2\u00e6"+
					"\u00e7\7\n\2\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9\7\13\2\2\u00e9/\3\2\2\2"+
					"\u00ea\u00eb\7\n\2\2\u00eb\u00ec\7\r\2\2\u00ec\u00ed\5\64\33\2\u00ed\u00ee"+
					"\7\13\2\2\u00ee\61\3\2\2\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\5\64\33\2\u00f1"+
					"\u00f2\7\13\2\2\u00f2\63\3\2\2\2\u00f3\u0113\5:\36\2\u00f4\u0113\5@!\2"+
					"\u00f5\u00f6\5:\36\2\u00f6\u00f7\5@!\2\u00f7\u0113\3\2\2\2\u00f8\u00fa"+
					"\5:\36\2\u00f9\u00fb\5\66\34\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2"+
					"\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0113\3\2\2\2\u00fe\u0100"+
					"\5\66\34\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2"+
					"\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5@!\2\u0104\u0113"+
					"\3\2\2\2\u0105\u0107\5:\36\2\u0106\u0108\5\66\34\2\u0107\u0106\3\2\2\2"+
					"\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
					"\3\2\2\2\u010b\u010c\5@!\2\u010c\u0113\3\2\2\2\u010d\u010f\5\66\34\2\u010e"+
					"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
					"\2\2\u0111\u0113\3\2\2\2\u0112\u00f3\3\2\2\2\u0112\u00f4\3\2\2\2\u0112"+
					"\u00f5\3\2\2\2\u0112\u00f8\3\2\2\2\u0112\u00ff\3\2\2\2\u0112\u0105\3\2"+
					"\2\2\u0112\u010e\3\2\2\2\u0113\65\3\2\2\2\u0114\u0118\58\35\2\u0115\u0118"+
					"\5D#\2\u0116\u0118\5B\"\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
					"\u0116\3\2\2\2\u0118\67\3\2\2\2\u0119\u011a\5B\"\2\u011a\u011b\7\f\2\2"+
					"\u011b\u011c\5B\"\2\u011c\u011d\6\35\5\3\u011d\u0124\3\2\2\2\u011e\u011f"+
					"\5B\"\2\u011f\u0120\7\f\2\2\u0120\u0121\7\f\2\2\u0121\u0122\6\35\6\3\u0122"+
					"\u0124\3\2\2\2\u0123\u0119\3\2\2\2\u0123\u011e\3\2\2\2\u01249\3\2\2\2"+
					"\u0125\u0128\5> \2\u0126\u0128\5<\37\2\u0127\u0125\3\2\2\2\u0127\u0126"+
					"\3\2\2\2\u0128;\3\2\2\2\u0129\u012a\t\2\2\2\u012a=\3\2\2\2\u012b\u012c"+
					"\7\13\2\2\u012c\u012d\7\f\2\2\u012d\u012e\7\f\2\2\u012e\u013e\6 \7\3\u012f"+
					"\u0130\7\f\2\2\u0130\u0131\7\f\2\2\u0131\u0132\7\f\2\2\u0132\u013e\6 "+
					"\b\3\u0133\u0134\7\13\2\2\u0134\u0135\7\f\2\2\u0135\u0136\5B\"\2\u0136"+
					"\u0137\6 \t\3\u0137\u013e\3\2\2\2\u0138\u0139\7\f\2\2\u0139\u013a\7\f"+
					"\2\2\u013a\u013b\5B\"\2\u013b\u013c\6 \n\3\u013c\u013e\3\2\2\2\u013d\u012b"+
					"\3\2\2\2\u013d\u012f\3\2\2\2\u013d\u0133\3\2\2\2\u013d\u0138\3\2\2\2\u013e"+
					"?\3\2\2\2\u013f\u0140\7\f\2\2\u0140A\3\2\2\2\u0141\u0142\t\3\2\2\u0142"+
					"C\3\2\2\2\u0143\u0144\7\24\2\2\u0144\u0145\5F$\2\u0145\u0146\7$\2\2\u0146"+
					"E\3\2\2\2\u0147\u0155\5H%\2\u0148\u0155\5J&\2\u0149\u0155\5L\'\2\u014a"+
					"\u0155\5N(\2\u014b\u0155\5P)\2\u014c\u0155\5R*\2\u014d\u0155\5T+\2\u014e"+
					"\u0155\5V,\2\u014f\u0155\5X-\2\u0150\u0155\5Z.\2\u0151\u0155\5\\/\2\u0152"+
					"\u0155\5^\60\2\u0153\u0155\5`\61\2\u0154\u0147\3\2\2\2\u0154\u0148\3\2"+
					"\2\2\u0154\u0149\3\2\2\2\u0154\u014a\3\2\2\2\u0154\u014b\3\2\2\2\u0154"+
					"\u014c\3\2\2\2\u0154\u014d\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u014f\3\2"+
					"\2\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
					"\u0153\3\2\2\2\u0155G\3\2\2\2\u0156\u0157\7\31\2\2\u0157I\3\2\2\2\u0158"+
					"\u0159\7\32\2\2\u0159K\3\2\2\2\u015a\u015b\7\33\2\2\u015bM\3\2\2\2\u015c"+
					"\u015d\7\34\2\2\u015dO\3\2\2\2\u015e\u015f\7\27\2\2\u015fQ\3\2\2\2\u0160"+
					"\u0161\7\35\2\2\u0161S\3\2\2\2\u0162\u0163\7\36\2\2\u0163U\3\2\2\2\u0164"+
					"\u0165\7\37\2\2\u0165W\3\2\2\2\u0166\u0167\7 \2\2\u0167Y\3\2\2\2\u0168"+
					"\u0169\7\30\2\2\u0169[\3\2\2\2\u016a\u016b\7!\2\2\u016b]\3\2\2\2\u016c"+
					"\u016d\7\"\2\2\u016d_\3\2\2\2\u016e\u0170\7#\2\2\u016f\u016e\3\2\2\2\u0170"+
					"\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
					"\2\2\u0173\u0174\b\61\1\2\u0174a\3\2\2\2\u0175\u0176\7\3\2\2\u0176c\3"+
					"\2\2\2\u0177\u0178\7\22\2\2\u0178\u017c\5f\64\2\u0179\u017a\7\22\2\2\u017a"+
					"\u017c\5j\66\2\u017b\u0177\3\2\2\2\u017b\u0179\3\2\2\2\u017ce\3\2\2\2"+
					"\u017d\u017e\t\4\2\2\u017eg\3\2\2\2\u017f\u0182\5j\66\2\u0180\u0182\5"+
					"d\63\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
					"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184i\3\2\2\2\u0185\u0186\t\5\2\2"+
					"\u0186k\3\2\2\2\35u{\u0083\u008c\u0092\u009b\u00a9\u00b1\u00cc\u00d1\u00d6"+
					"\u00dd\u00e1\u00fc\u0101\u0109\u0110\u0112\u0117\u0123\u0127\u013d\u0154"+
					"\u0171\u017b\u0181\u0183";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
	}
}