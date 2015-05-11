// Generated from RegularExpressionERE.g4 by ANTLR 4.5

	package gerado;

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
		PRINT=29, PUNCT=30, UPPER=31, XDIGIT=32, CLASSCLOSE=33;
	public static final int
		RULE_expression = 0, RULE_multiple = 1, RULE_subExpression = 2, RULE_group = 3, 
		RULE_anchor = 4, RULE_startAnchor = 5, RULE_endAnchor = 6, RULE_repetition = 7, 
		RULE_quantified = 8, RULE_quantifier = 9, RULE_oneOrMore = 10, RULE_zeroOrMore = 11, 
		RULE_conditional = 12, RULE_exact = 13, RULE_atLeast = 14, RULE_between = 15, 
		RULE_value = 16, RULE_firstValue = 17, RULE_lastValue = 18, RULE_list = 19, 
		RULE_negativeList = 20, RULE_positiveList = 21, RULE_listElement = 22, 
		RULE_range = 23, RULE_listFirstElement = 24, RULE_listNoSpecial = 25, 
		RULE_listFirstRange = 26, RULE_listLastElement = 27, RULE_listCharacter = 28, 
		RULE_charclass = 29, RULE_classname = 30, RULE_alnum = 31, RULE_alpha = 32, 
		RULE_blank = 33, RULE_cntrl = 34, RULE_digitclass = 35, RULE_graph = 36, 
		RULE_lower = 37, RULE_print = 38, RULE_punct = 39, RULE_spaceclass = 40, 
		RULE_upper = 41, RULE_xdigit = 42, RULE_anychar = 43, RULE_escaped = 44, 
		RULE_special = 45, RULE_characters = 46, RULE_character = 47;
	public static final String[] ruleNames = {
		"expression", "multiple", "subExpression", "group", "anchor", "startAnchor", 
		"endAnchor", "repetition", "quantified", "quantifier", "oneOrMore", "zeroOrMore", 
		"conditional", "exact", "atLeast", "between", "value", "firstValue", "lastValue", 
		"list", "negativeList", "positiveList", "listElement", "range", "listFirstElement", 
		"listNoSpecial", "listFirstRange", "listLastElement", "listCharacter", 
		"charclass", "classname", "alnum", "alpha", "blank", "cntrl", "digitclass", 
		"graph", "lower", "print", "punct", "spaceclass", "upper", "xdigit", "anychar", 
		"escaped", "special", "characters", "character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "','", "'?'", "'+'", "'*'", "'{'", "'}'", "'['", "']'", "'-'", 
		"'^'", "'$'", "'|'", "'('", "')'", "'\\'", null, "'[:'", null, null, "'digit'", 
		"'space'", "'alnum'", "'alpha'", "'blank'", "'cntrl'", "'graph'", "'lower'", 
		"'print'", "'punct'", "'upper'", "'xdigit'", "':]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", 
		"LISTOPEN", "LISTCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", "PIPE", "GROUPOPEN", 
		"GROUPCLOSE", "ESCAPE", "DIGIT", "CLASSOPEN", "OTHER", "WS", "DIGITCLASS", 
		"SPACECLASS", "ALNUM", "ALPHA", "BLANK", "CNTRL", "GRAPH", "LOWER", "PRINT", 
		"PUNCT", "UPPER", "XDIGIT", "CLASSCLOSE"
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
		public CharclassContext charclass() {
			return getRuleContext(CharclassContext.class,0);
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(97);
				group();
				}
				break;
			case 2:
				{
				setState(98);
				multiple();
				}
				break;
			case 3:
				{
				setState(99);
				anchor();
				}
				break;
			case 4:
				{
				setState(100);
				repetition();
				}
				break;
			case 5:
				{
				setState(101);
				list();
				}
				break;
			case 6:
				{
				setState(102);
				charclass();
				}
				break;
			case 7:
				{
				setState(103);
				anychar();
				}
				break;
			case 8:
				{
				setState(104);
				characters();
				}
				break;
			case 9:
				{
				setState(105);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
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
					setState(108);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(109);
					expression(7);
					}
					} 
				}
				setState(114);
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
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multiple);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			subExpression(0);
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(116);
					match(PIPE);
					setState(117);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
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
		public CharclassContext charclass() {
			return getRuleContext(CharclassContext.class,0);
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
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(123);
				group();
				}
				break;
			case 2:
				{
				setState(124);
				anchor();
				}
				break;
			case 3:
				{
				setState(125);
				repetition();
				}
				break;
			case 4:
				{
				setState(126);
				list();
				}
				break;
			case 5:
				{
				setState(127);
				charclass();
				}
				break;
			case 6:
				{
				setState(128);
				anychar();
				}
				break;
			case 7:
				{
				setState(129);
				characters();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
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
					setState(132);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(133);
					subExpression(6);
					}
					} 
				}
				setState(138);
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
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(GROUPOPEN);
			setState(140);
			expression(0);
			setState(141);
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
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anchor);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case CIRCUMFLEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				startAnchor();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
	}

	public final StartAnchorContext startAnchor() throws RecognitionException {
		StartAnchorContext _localctx = new StartAnchorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_startAnchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
	}

	public final EndAnchorContext endAnchor() throws RecognitionException {
		EndAnchorContext _localctx = new EndAnchorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endAnchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
	}

	public final RepetitionContext repetition() throws RecognitionException {
		RepetitionContext _localctx = new RepetitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repetition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			quantified();
			setState(152);
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
		public CharclassContext charclass() {
			return getRuleContext(CharclassContext.class,0);
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
	}

	public final QuantifiedContext quantified() throws RecognitionException {
		QuantifiedContext _localctx = new QuantifiedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantified);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case GROUPOPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				group();
				}
				break;
			case LISTOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				list();
				}
				break;
			case CLASSOPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				charclass();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				anychar();
				}
				break;
			case ESCAPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				escaped();
				}
				break;
			case COMMA:
			case DASH:
			case DIGIT:
			case OTHER:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
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
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quantifier);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				oneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				zeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				exact();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				atLeast();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
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
	}

	public final OneOrMoreContext oneOrMore() throws RecognitionException {
		OneOrMoreContext _localctx = new OneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
	}

	public final ZeroOrMoreContext zeroOrMore() throws RecognitionException {
		ZeroOrMoreContext _localctx = new ZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_zeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
	}

	public final ExactContext exact() throws RecognitionException {
		ExactContext _localctx = new ExactContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(CURLYOPEN);
			setState(177);
			value();
			setState(178);
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
	}

	public final AtLeastContext atLeast() throws RecognitionException {
		AtLeastContext _localctx = new AtLeastContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atLeast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CURLYOPEN);
			setState(181);
			value();
			setState(182);
			match(COMMA);
			setState(183);
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
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(CURLYOPEN);
			setState(186);
			((BetweenContext)_localctx).a = firstValue();
			setState(187);
			match(COMMA);
			setState(188);
			((BetweenContext)_localctx).b = lastValue();
			setState(189);
			match(CURLYCLOSE);
			setState(190);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				match(DIGIT);
				}
				}
				setState(195); 
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
	}

	public final FirstValueContext firstValue() throws RecognitionException {
		FirstValueContext _localctx = new FirstValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_firstValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				match(DIGIT);
				}
				}
				setState(200); 
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
	}

	public final LastValueContext lastValue() throws RecognitionException {
		LastValueContext _localctx = new LastValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lastValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(DIGIT);
				}
				}
				setState(205); 
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(LISTOPEN);
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(208);
				negativeList();
				}
				break;
			case 2:
				{
				setState(209);
				positiveList();
				}
				break;
			}
			setState(212);
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
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
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
	}

	public final NegativeListContext negativeList() throws RecognitionException {
		NegativeListContext _localctx = new NegativeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_negativeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(CIRCUMFLEX);
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(215);
				listFirstElement();
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << CLASSOPEN) | (1L << OTHER))) != 0)) {
				{
				{
				setState(218);
				listElement();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(224);
				listLastElement();
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

	public static class PositiveListContext extends ParserRuleContext {
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
	}

	public final PositiveListContext positiveList() throws RecognitionException {
		PositiveListContext _localctx = new PositiveListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_positiveList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(227);
				listFirstElement();
				}
				break;
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << LISTOPEN) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << GROUPOPEN) | (1L << GROUPCLOSE) | (1L << ESCAPE) | (1L << DIGIT) | (1L << CLASSOPEN) | (1L << OTHER))) != 0)) {
				{
				{
				setState(230);
				listElement();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(236);
				listLastElement();
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
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listElement);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				charclass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
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
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_range);
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				((RangeContext)_localctx).a = listCharacter();
				setState(245);
				match(DASH);
				setState(246);
				((RangeContext)_localctx).b = listCharacter();
				setState(247);
				if (!(vemAntesDe((((RangeContext)_localctx).a!=null?_input.getText(((RangeContext)_localctx).a.start,((RangeContext)_localctx).a.stop):null),(((RangeContext)_localctx).b!=null?_input.getText(((RangeContext)_localctx).b.start,((RangeContext)_localctx).b.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($a.text,$b.text)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				((RangeContext)_localctx).c = listCharacter();
				setState(250);
				match(DASH);
				setState(251);
				((RangeContext)_localctx).d = match(DASH);
				setState(252);
				if (!(vemAntesDe((((RangeContext)_localctx).c!=null?_input.getText(((RangeContext)_localctx).c.start,((RangeContext)_localctx).c.stop):null),(((RangeContext)_localctx).d!=null?((RangeContext)_localctx).d.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($c.text,$d.text)");
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
	}

	public final ListFirstElementContext listFirstElement() throws RecognitionException {
		ListFirstElementContext _localctx = new ListFirstElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listFirstElement);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				listFirstRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
	}

	public final ListNoSpecialContext listNoSpecial() throws RecognitionException {
		ListNoSpecialContext _localctx = new ListNoSpecialContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listNoSpecial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		public ListCharacterContext d;
		public Token e;
		public ListCharacterContext f;
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
	}

	public final ListFirstRangeContext listFirstRange() throws RecognitionException {
		ListFirstRangeContext _localctx = new ListFirstRangeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listFirstRange);
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((ListFirstRangeContext)_localctx).a = match(LISTCLOSE);
				setState(263);
				match(DASH);
				setState(264);
				((ListFirstRangeContext)_localctx).b = match(DASH);
				setState(265);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).a!=null?((ListFirstRangeContext)_localctx).a.getText():null),(((ListFirstRangeContext)_localctx).b!=null?((ListFirstRangeContext)_localctx).b.getText():null)))) throw new FailedPredicateException(this, "vemAntesDe($a.text,$b.text)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(DASH);
				setState(267);
				match(DASH);
				setState(268);
				match(DASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				((ListFirstRangeContext)_localctx).c = match(LISTCLOSE);
				setState(270);
				match(DASH);
				setState(271);
				((ListFirstRangeContext)_localctx).d = listCharacter();
				setState(272);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).c!=null?((ListFirstRangeContext)_localctx).c.getText():null),(((ListFirstRangeContext)_localctx).d!=null?_input.getText(((ListFirstRangeContext)_localctx).d.start,((ListFirstRangeContext)_localctx).d.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($c.text,$d.text)");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				((ListFirstRangeContext)_localctx).e = match(DASH);
				setState(275);
				match(DASH);
				setState(276);
				((ListFirstRangeContext)_localctx).f = listCharacter();
				setState(277);
				if (!(vemAntesDe((((ListFirstRangeContext)_localctx).e!=null?((ListFirstRangeContext)_localctx).e.getText():null),(((ListFirstRangeContext)_localctx).f!=null?_input.getText(((ListFirstRangeContext)_localctx).f.start,((ListFirstRangeContext)_localctx).f.stop):null)))) throw new FailedPredicateException(this, "vemAntesDe($e.text,$f.text)");
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
	}

	public final ListLastElementContext listLastElement() throws RecognitionException {
		ListLastElementContext _localctx = new ListLastElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listLastElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
	}

	public final ListCharacterContext listCharacter() throws RecognitionException {
		ListCharacterContext _localctx = new ListCharacterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterCharclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitCharclass(this);
		}
	}

	public final CharclassContext charclass() throws RecognitionException {
		CharclassContext _localctx = new CharclassContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_charclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(CLASSOPEN);
			setState(286);
			classname();
			setState(287);
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
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classname);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case ALNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				alnum();
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				alpha();
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				blank();
				}
				break;
			case CNTRL:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				cntrl();
				}
				break;
			case DIGITCLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				digitclass();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				graph();
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				lower();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(296);
				print();
				}
				break;
			case PUNCT:
				enterOuterAlt(_localctx, 9);
				{
				setState(297);
				punct();
				}
				break;
			case SPACECLASS:
				enterOuterAlt(_localctx, 10);
				{
				setState(298);
				spaceclass();
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 11);
				{
				setState(299);
				upper();
				}
				break;
			case XDIGIT:
				enterOuterAlt(_localctx, 12);
				{
				setState(300);
				xdigit();
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
	}

	public final AlnumContext alnum() throws RecognitionException {
		AlnumContext _localctx = new AlnumContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_alnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alpha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blank);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
	}

	public final CntrlContext cntrl() throws RecognitionException {
		CntrlContext _localctx = new CntrlContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
	}

	public final DigitclassContext digitclass() throws RecognitionException {
		DigitclassContext _localctx = new DigitclassContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_digitclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
	}

	public final PunctContext punct() throws RecognitionException {
		PunctContext _localctx = new PunctContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_punct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
	}

	public final SpaceclassContext spaceclass() throws RecognitionException {
		SpaceclassContext _localctx = new SpaceclassContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_spaceclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_upper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
	}

	public final XdigitContext xdigit() throws RecognitionException {
		XdigitContext _localctx = new XdigitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_xdigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_anychar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
	}

	public final EscapedContext escaped() throws RecognitionException {
		EscapedContext _localctx = new EscapedContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_escaped);
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new EscapedSpecialContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(ESCAPE);
				setState(330);
				special();
				}
				break;
			case 2:
				_localctx = new EscapedCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(ESCAPE);
				setState(332);
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
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitCharacters(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_characters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(339);
					switch (_input.LA(1)) {
					case COMMA:
					case DASH:
					case DIGIT:
					case OTHER:
						{
						setState(337);
						character();
						}
						break;
					case ESCAPE:
						{
						setState(338);
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
				setState(341); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		case 23:
			return range_sempred((RangeContext)_localctx, predIndex);
		case 26:
			return listFirstRange_sempred((ListFirstRangeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean subExpression_sempred(SubExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
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
		}
		return true;
	}
	private boolean listFirstRange_sempred(ListFirstRangeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return vemAntesDe((((ListFirstRangeContext)_localctx).a!=null?((ListFirstRangeContext)_localctx).a.getText():null),(((ListFirstRangeContext)_localctx).b!=null?((ListFirstRangeContext)_localctx).b.getText():null));
		case 6:
			return vemAntesDe((((ListFirstRangeContext)_localctx).c!=null?((ListFirstRangeContext)_localctx).c.getText():null),(((ListFirstRangeContext)_localctx).d!=null?_input.getText(((ListFirstRangeContext)_localctx).d.start,((ListFirstRangeContext)_localctx).d.stop):null));
		case 7:
			return vemAntesDe((((ListFirstRangeContext)_localctx).e!=null?((ListFirstRangeContext)_localctx).e.getText():null),(((ListFirstRangeContext)_localctx).f!=null?_input.getText(((ListFirstRangeContext)_localctx).f.start,((ListFirstRangeContext)_localctx).f.stop):null));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2m\n\2\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\3\3\3\3\3\6\3"+
		"y\n\3\r\3\16\3z\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0085\n\4\3\4\3\4"+
		"\7\4\u0089\n\4\f\4\16\4\u008c\13\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0094\n"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ab\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\6\22\u00c4\n\22\r\22\16\22\u00c5\3\23\6\23\u00c9\n\23"+
		"\r\23\16\23\u00ca\3\24\6\24\u00ce\n\24\r\24\16\24\u00cf\3\25\3\25\3\25"+
		"\5\25\u00d5\n\25\3\25\3\25\3\26\3\26\5\26\u00db\n\26\3\26\7\26\u00de\n"+
		"\26\f\26\16\26\u00e1\13\26\3\26\5\26\u00e4\n\26\3\27\5\27\u00e7\n\27\3"+
		"\27\7\27\u00ea\n\27\f\27\16\27\u00ed\13\27\3\27\5\27\u00f0\n\27\3\30\3"+
		"\30\3\30\5\30\u00f5\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0101\n\31\3\32\3\32\5\32\u0105\n\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u011a\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0130\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u0150"+
		"\n.\3/\3/\3\60\3\60\6\60\u0156\n\60\r\60\16\60\u0157\3\61\3\61\3\61\2"+
		"\4\2\6\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`\2\6\3\2\13\f\5\2\3\n\r\23\25\25\5\2\3\3\5\13\r"+
		"\22\6\2\4\4\f\f\23\23\25\25\u0166\2l\3\2\2\2\4u\3\2\2\2\6\u0084\3\2\2"+
		"\2\b\u008d\3\2\2\2\n\u0093\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2\20"+
		"\u0099\3\2\2\2\22\u00a2\3\2\2\2\24\u00aa\3\2\2\2\26\u00ac\3\2\2\2\30\u00ae"+
		"\3\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2\2\2\36\u00b6\3\2\2\2 \u00bb\3\2"+
		"\2\2\"\u00c3\3\2\2\2$\u00c8\3\2\2\2&\u00cd\3\2\2\2(\u00d1\3\2\2\2*\u00d8"+
		"\3\2\2\2,\u00e6\3\2\2\2.\u00f4\3\2\2\2\60\u0100\3\2\2\2\62\u0104\3\2\2"+
		"\2\64\u0106\3\2\2\2\66\u0119\3\2\2\28\u011b\3\2\2\2:\u011d\3\2\2\2<\u011f"+
		"\3\2\2\2>\u012f\3\2\2\2@\u0131\3\2\2\2B\u0133\3\2\2\2D\u0135\3\2\2\2F"+
		"\u0137\3\2\2\2H\u0139\3\2\2\2J\u013b\3\2\2\2L\u013d\3\2\2\2N\u013f\3\2"+
		"\2\2P\u0141\3\2\2\2R\u0143\3\2\2\2T\u0145\3\2\2\2V\u0147\3\2\2\2X\u0149"+
		"\3\2\2\2Z\u014f\3\2\2\2\\\u0151\3\2\2\2^\u0155\3\2\2\2`\u0159\3\2\2\2"+
		"bc\b\2\1\2cm\5\b\5\2dm\5\4\3\2em\5\n\6\2fm\5\20\t\2gm\5(\25\2hm\5<\37"+
		"\2im\5X-\2jm\5^\60\2km\7\26\2\2lb\3\2\2\2ld\3\2\2\2le\3\2\2\2lf\3\2\2"+
		"\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2mr\3\2\2\2no\f\b\2"+
		"\2oq\5\2\2\tpn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\3\3\2\2\2tr\3\2"+
		"\2\2ux\5\6\4\2vw\7\17\2\2wy\5\6\4\2xv\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\5\3\2\2\2|}\b\4\1\2}\u0085\5\b\5\2~\u0085\5\n\6\2\177\u0085\5"+
		"\20\t\2\u0080\u0085\5(\25\2\u0081\u0085\5<\37\2\u0082\u0085\5X-\2\u0083"+
		"\u0085\5^\60\2\u0084|\3\2\2\2\u0084~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u008a\3\2\2\2\u0086\u0087\f\7\2\2\u0087\u0089\5\6\4\b\u0088\u0086\3\2"+
		"\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\7\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\20\2\2\u008e\u008f\5\2\2"+
		"\2\u008f\u0090\7\21\2\2\u0090\t\3\2\2\2\u0091\u0094\5\f\7\2\u0092\u0094"+
		"\5\16\b\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\13\3\2\2\2\u0095"+
		"\u0096\7\r\2\2\u0096\r\3\2\2\2\u0097\u0098\7\16\2\2\u0098\17\3\2\2\2\u0099"+
		"\u009a\5\22\n\2\u009a\u009b\5\24\13\2\u009b\21\3\2\2\2\u009c\u00a3\5\b"+
		"\5\2\u009d\u00a3\5(\25\2\u009e\u00a3\5<\37\2\u009f\u00a3\5X-\2\u00a0\u00a3"+
		"\5Z.\2\u00a1\u00a3\5`\61\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\23\3\2\2\2\u00a4\u00ab\5\26\f\2\u00a5\u00ab\5\30\r\2\u00a6"+
		"\u00ab\5\32\16\2\u00a7\u00ab\5\34\17\2\u00a8\u00ab\5\36\20\2\u00a9\u00ab"+
		"\5 \21\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ad\7\6\2\2\u00ad\27\3\2\2\2\u00ae\u00af\7\7\2\2\u00af\31\3"+
		"\2\2\2\u00b0\u00b1\7\5\2\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3"+
		"\u00b4\5\"\22\2\u00b4\u00b5\7\t\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\7\b\2"+
		"\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\7\t\2\2\u00ba"+
		"\37\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5$\23\2\u00bd\u00be\7\4\2"+
		"\2\u00be\u00bf\5&\24\2\u00bf\u00c0\7\t\2\2\u00c0\u00c1\6\21\4\3\u00c1"+
		"!\3\2\2\2\u00c2\u00c4\7\23\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00c9\7"+
		"\23\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb%\3\2\2\2\u00cc\u00ce\7\23\2\2\u00cd\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\'\3"+
		"\2\2\2\u00d1\u00d4\7\n\2\2\u00d2\u00d5\5*\26\2\u00d3\u00d5\5,\27\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\13"+
		"\2\2\u00d7)\3\2\2\2\u00d8\u00da\7\r\2\2\u00d9\u00db\5\62\32\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\5.\30\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\58\35\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4+\3\2\2\2\u00e5\u00e7\5\62\32"+
		"\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea"+
		"\5.\30\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\58"+
		"\35\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0-\3\2\2\2\u00f1\u00f5"+
		"\5\60\31\2\u00f2\u00f5\5<\37\2\u00f3\u00f5\5:\36\2\u00f4\u00f1\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5/\3\2\2\2\u00f6\u00f7\5"+
		":\36\2\u00f7\u00f8\7\f\2\2\u00f8\u00f9\5:\36\2\u00f9\u00fa\6\31\5\3\u00fa"+
		"\u0101\3\2\2\2\u00fb\u00fc\5:\36\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe\7\f"+
		"\2\2\u00fe\u00ff\6\31\6\3\u00ff\u0101\3\2\2\2\u0100\u00f6\3\2\2\2\u0100"+
		"\u00fb\3\2\2\2\u0101\61\3\2\2\2\u0102\u0105\5\66\34\2\u0103\u0105\5\64"+
		"\33\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\63\3\2\2\2\u0106\u0107"+
		"\t\2\2\2\u0107\65\3\2\2\2\u0108\u0109\7\13\2\2\u0109\u010a\7\f\2\2\u010a"+
		"\u010b\7\f\2\2\u010b\u011a\6\34\7\3\u010c\u010d\7\f\2\2\u010d\u010e\7"+
		"\f\2\2\u010e\u011a\7\f\2\2\u010f\u0110\7\13\2\2\u0110\u0111\7\f\2\2\u0111"+
		"\u0112\5:\36\2\u0112\u0113\6\34\b\3\u0113\u011a\3\2\2\2\u0114\u0115\7"+
		"\f\2\2\u0115\u0116\7\f\2\2\u0116\u0117\5:\36\2\u0117\u0118\6\34\t\3\u0118"+
		"\u011a\3\2\2\2\u0119\u0108\3\2\2\2\u0119\u010c\3\2\2\2\u0119\u010f\3\2"+
		"\2\2\u0119\u0114\3\2\2\2\u011a\67\3\2\2\2\u011b\u011c\7\f\2\2\u011c9\3"+
		"\2\2\2\u011d\u011e\t\3\2\2\u011e;\3\2\2\2\u011f\u0120\7\24\2\2\u0120\u0121"+
		"\5> \2\u0121\u0122\7#\2\2\u0122=\3\2\2\2\u0123\u0130\5@!\2\u0124\u0130"+
		"\5B\"\2\u0125\u0130\5D#\2\u0126\u0130\5F$\2\u0127\u0130\5H%\2\u0128\u0130"+
		"\5J&\2\u0129\u0130\5L\'\2\u012a\u0130\5N(\2\u012b\u0130\5P)\2\u012c\u0130"+
		"\5R*\2\u012d\u0130\5T+\2\u012e\u0130\5V,\2\u012f\u0123\3\2\2\2\u012f\u0124"+
		"\3\2\2\2\u012f\u0125\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u0127\3\2\2\2\u012f"+
		"\u0128\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2"+
		"\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"?\3\2\2\2\u0131\u0132\7\31\2\2\u0132A\3\2\2\2\u0133\u0134\7\32\2\2\u0134"+
		"C\3\2\2\2\u0135\u0136\7\33\2\2\u0136E\3\2\2\2\u0137\u0138\7\34\2\2\u0138"+
		"G\3\2\2\2\u0139\u013a\7\27\2\2\u013aI\3\2\2\2\u013b\u013c\7\35\2\2\u013c"+
		"K\3\2\2\2\u013d\u013e\7\36\2\2\u013eM\3\2\2\2\u013f\u0140\7\37\2\2\u0140"+
		"O\3\2\2\2\u0141\u0142\7 \2\2\u0142Q\3\2\2\2\u0143\u0144\7\30\2\2\u0144"+
		"S\3\2\2\2\u0145\u0146\7!\2\2\u0146U\3\2\2\2\u0147\u0148\7\"\2\2\u0148"+
		"W\3\2\2\2\u0149\u014a\7\3\2\2\u014aY\3\2\2\2\u014b\u014c\7\22\2\2\u014c"+
		"\u0150\5\\/\2\u014d\u014e\7\22\2\2\u014e\u0150\5`\61\2\u014f\u014b\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150[\3\2\2\2\u0151\u0152\t\4\2\2\u0152]\3\2"+
		"\2\2\u0153\u0156\5`\61\2\u0154\u0156\5Z.\2\u0155\u0153\3\2\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"_\3\2\2\2\u0159\u015a\t\5\2\2\u015aa\3\2\2\2\34lrz\u0084\u008a\u0093\u00a2"+
		"\u00aa\u00c5\u00ca\u00cf\u00d4\u00da\u00df\u00e3\u00e6\u00eb\u00ef\u00f4"+
		"\u0100\u0104\u0119\u012f\u014f\u0155\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}