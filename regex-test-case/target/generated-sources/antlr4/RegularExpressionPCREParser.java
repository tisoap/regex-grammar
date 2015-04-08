// Generated from RegularExpressionPCRE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularExpressionPCREParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMESTART=1, NAMEEND=2, NOCAPTUREGROUP=3, COMMENT=4, DOT=5, COMMA=6, QUESTION=7, 
		PLUS=8, ASTERISC=9, CURLYOPEN=10, CURLYCLOSE=11, BRACKETOPEN=12, BRACKETCLOSE=13, 
		DASH=14, CIRCUMFLEX=15, DOLAR=16, PIPE=17, OPEN=18, CLOSE=19, CLASSOPEN=20, 
		CLASSCLOSE=21, ALNUM=22, ALPHA=23, BLANK=24, CNTRL=25, DIGITCLASS=26, 
		GRAPH=27, LOWER=28, PRINT=29, PUNCT=30, SPACECLASS=31, UPPER=32, XDIGIT=33, 
		SPACE=34, DIGIT=35, LATIN=36, WS=37;
	public static final int
		RULE_expression = 0, RULE_subExpression = 1, RULE_group = 2, RULE_namedGroup = 3, 
		RULE_groupName = 4, RULE_noCaptureGroup = 5, RULE_quantifier = 6, RULE_lazy = 7, 
		RULE_greedy = 8, RULE_greedyOneOrMore = 9, RULE_greedyZeroOrMore = 10, 
		RULE_greedyConditional = 11, RULE_greedyAtLeast = 12, RULE_greedyBetween = 13, 
		RULE_lazyOneOrMore = 14, RULE_lazyZeroOrMore = 15, RULE_lazyConditional = 16, 
		RULE_lazyAtLeast = 17, RULE_lazyBetween = 18, RULE_comment = 19, RULE_commentText = 20, 
		RULE_multiple = 21, RULE_numericalGroup = 22, RULE_anchor = 23, RULE_startAnchor = 24, 
		RULE_endAnchor = 25, RULE_repetition = 26, RULE_quantified = 27, RULE_oneOrMore = 28, 
		RULE_zeroOrMore = 29, RULE_conditional = 30, RULE_exact = 31, RULE_atLeast = 32, 
		RULE_between = 33, RULE_value = 34, RULE_firstValue = 35, RULE_lastValue = 36, 
		RULE_list = 37, RULE_negativeList = 38, RULE_positiveList = 39, RULE_range = 40, 
		RULE_charclass = 41, RULE_classname = 42, RULE_alnum = 43, RULE_alpha = 44, 
		RULE_blank = 45, RULE_cntrl = 46, RULE_digitclass = 47, RULE_graph = 48, 
		RULE_lower = 49, RULE_print = 50, RULE_punct = 51, RULE_spaceclass = 52, 
		RULE_upper = 53, RULE_xdigit = 54, RULE_anychar = 55, RULE_characters = 56, 
		RULE_character = 57;
	public static final String[] ruleNames = {
		"expression", "subExpression", "group", "namedGroup", "groupName", "noCaptureGroup", 
		"quantifier", "lazy", "greedy", "greedyOneOrMore", "greedyZeroOrMore", 
		"greedyConditional", "greedyAtLeast", "greedyBetween", "lazyOneOrMore", 
		"lazyZeroOrMore", "lazyConditional", "lazyAtLeast", "lazyBetween", "comment", 
		"commentText", "multiple", "numericalGroup", "anchor", "startAnchor", 
		"endAnchor", "repetition", "quantified", "oneOrMore", "zeroOrMore", "conditional", 
		"exact", "atLeast", "between", "value", "firstValue", "lastValue", "list", 
		"negativeList", "positiveList", "range", "charclass", "classname", "alnum", 
		"alpha", "blank", "cntrl", "digitclass", "graph", "lower", "print", "punct", 
		"spaceclass", "upper", "xdigit", "anychar", "characters", "character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'(?<'", "'>'", "'(?:'", "'(?#'", "'.'", "','", "'?'", "'+'", "'*'", 
		"'{'", "'}'", "'['", "']'", "'-'", "'^'", "'$'", "'|'", "'('", "')'", 
		"'[:'", "':]'", "'alnum'", "'alpha'", "'blank'", "'cntrl'", "'digit'", 
		"'graph'", "'lower'", "'print'", "'punct'", "'space'", "'upper'", "'xdigit'", 
		"' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMESTART", "NAMEEND", "NOCAPTUREGROUP", "COMMENT", "DOT", "COMMA", 
		"QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", "BRACKETOPEN", 
		"BRACKETCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", "PIPE", "OPEN", "CLOSE", 
		"CLASSOPEN", "CLASSCLOSE", "ALNUM", "ALPHA", "BLANK", "CNTRL", "DIGITCLASS", 
		"GRAPH", "LOWER", "PRINT", "PUNCT", "SPACECLASS", "UPPER", "XDIGIT", "SPACE", 
		"DIGIT", "LATIN", "WS"
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
	public String getGrammarFileName() { return "RegularExpressionPCRE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegularExpressionPCREParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
		public CharactersContext characters() {
			return getRuleContext(CharactersContext.class,0);
		}
		public TerminalNode WS() { return getToken(RegularExpressionPCREParser.WS, 0); }
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
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(117);
				multiple();
				}
				break;
			case 2:
				{
				setState(118);
				comment();
				}
				break;
			case 3:
				{
				setState(119);
				group();
				}
				break;
			case 4:
				{
				setState(120);
				anchor();
				}
				break;
			case 5:
				{
				setState(121);
				repetition();
				}
				break;
			case 6:
				{
				setState(122);
				list();
				}
				break;
			case 7:
				{
				setState(123);
				characters();
				}
				break;
			case 8:
				{
				setState(124);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
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
					setState(127);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(128);
					expression(5);
					}
					} 
				}
				setState(133);
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

	public static class SubExpressionContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public RepetitionContext repetition() {
			return getRuleContext(RepetitionContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitSubExpression(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_subExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(135);
				group();
				}
				break;
			case 2:
				{
				setState(136);
				repetition();
				}
				break;
			case 3:
				{
				setState(137);
				comment();
				}
				break;
			case 4:
				{
				setState(138);
				list();
				}
				break;
			case 5:
				{
				setState(139);
				characters();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_subExpression);
					setState(142);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(143);
					subExpression(4);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public NumericalGroupContext numericalGroup() {
			return getRuleContext(NumericalGroupContext.class,0);
		}
		public NamedGroupContext namedGroup() {
			return getRuleContext(NamedGroupContext.class,0);
		}
		public NoCaptureGroupContext noCaptureGroup() {
			return getRuleContext(NoCaptureGroupContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_group);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				numericalGroup();
				}
				break;
			case NAMESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				namedGroup();
				}
				break;
			case NOCAPTUREGROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				noCaptureGroup();
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

	public static class NamedGroupContext extends ParserRuleContext {
		public TerminalNode NAMESTART() { return getToken(RegularExpressionPCREParser.NAMESTART, 0); }
		public GroupNameContext groupName() {
			return getRuleContext(GroupNameContext.class,0);
		}
		public TerminalNode NAMEEND() { return getToken(RegularExpressionPCREParser.NAMEEND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionPCREParser.CLOSE, 0); }
		public NamedGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterNamedGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitNamedGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitNamedGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedGroupContext namedGroup() throws RecognitionException {
		NamedGroupContext _localctx = new NamedGroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namedGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(NAMESTART);
			setState(155);
			groupName();
			setState(156);
			match(NAMEEND);
			setState(157);
			expression(0);
			setState(158);
			match(CLOSE);
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

	public static class GroupNameContext extends ParserRuleContext {
		public CharactersContext characters() {
			return getRuleContext(CharactersContext.class,0);
		}
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			characters();
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

	public static class NoCaptureGroupContext extends ParserRuleContext {
		public TerminalNode NOCAPTUREGROUP() { return getToken(RegularExpressionPCREParser.NOCAPTUREGROUP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionPCREParser.CLOSE, 0); }
		public NoCaptureGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noCaptureGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterNoCaptureGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitNoCaptureGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitNoCaptureGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoCaptureGroupContext noCaptureGroup() throws RecognitionException {
		NoCaptureGroupContext _localctx = new NoCaptureGroupContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_noCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(NOCAPTUREGROUP);
			setState(163);
			expression(0);
			setState(164);
			match(CLOSE);
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
		public LazyContext lazy() {
			return getRuleContext(LazyContext.class,0);
		}
		public GreedyContext greedy() {
			return getRuleContext(GreedyContext.class,0);
		}
		public ExactContext exact() {
			return getRuleContext(ExactContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quantifier);
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				lazy();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				greedy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				exact();
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

	public static class LazyContext extends ParserRuleContext {
		public LazyOneOrMoreContext lazyOneOrMore() {
			return getRuleContext(LazyOneOrMoreContext.class,0);
		}
		public LazyZeroOrMoreContext lazyZeroOrMore() {
			return getRuleContext(LazyZeroOrMoreContext.class,0);
		}
		public LazyConditionalContext lazyConditional() {
			return getRuleContext(LazyConditionalContext.class,0);
		}
		public LazyAtLeastContext lazyAtLeast() {
			return getRuleContext(LazyAtLeastContext.class,0);
		}
		public LazyBetweenContext lazyBetween() {
			return getRuleContext(LazyBetweenContext.class,0);
		}
		public LazyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLazy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLazy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyContext lazy() throws RecognitionException {
		LazyContext _localctx = new LazyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lazy);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				lazyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				lazyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				lazyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				lazyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				lazyBetween();
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

	public static class GreedyContext extends ParserRuleContext {
		public GreedyOneOrMoreContext greedyOneOrMore() {
			return getRuleContext(GreedyOneOrMoreContext.class,0);
		}
		public GreedyZeroOrMoreContext greedyZeroOrMore() {
			return getRuleContext(GreedyZeroOrMoreContext.class,0);
		}
		public GreedyConditionalContext greedyConditional() {
			return getRuleContext(GreedyConditionalContext.class,0);
		}
		public GreedyAtLeastContext greedyAtLeast() {
			return getRuleContext(GreedyAtLeastContext.class,0);
		}
		public GreedyBetweenContext greedyBetween() {
			return getRuleContext(GreedyBetweenContext.class,0);
		}
		public GreedyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGreedy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGreedy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyContext greedy() throws RecognitionException {
		GreedyContext _localctx = new GreedyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_greedy);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				greedyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				greedyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				greedyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				greedyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				greedyBetween();
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

	public static class GreedyOneOrMoreContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(RegularExpressionPCREParser.PLUS, 0); }
		public GreedyOneOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyOneOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGreedyOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGreedyOneOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyOneOrMoreContext greedyOneOrMore() throws RecognitionException {
		GreedyOneOrMoreContext _localctx = new GreedyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_greedyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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

	public static class GreedyZeroOrMoreContext extends ParserRuleContext {
		public TerminalNode ASTERISC() { return getToken(RegularExpressionPCREParser.ASTERISC, 0); }
		public GreedyZeroOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyZeroOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGreedyZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGreedyZeroOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyZeroOrMoreContext greedyZeroOrMore() throws RecognitionException {
		GreedyZeroOrMoreContext _localctx = new GreedyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_greedyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static class GreedyConditionalContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(RegularExpressionPCREParser.QUESTION, 0); }
		public GreedyConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGreedyConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGreedyConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyConditionalContext greedyConditional() throws RecognitionException {
		GreedyConditionalContext _localctx = new GreedyConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_greedyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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

	public static class GreedyAtLeastContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public TerminalNode COMMA() { return getToken(RegularExpressionPCREParser.COMMA, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionPCREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionPCREParser.DIGIT, i);
		}
		public GreedyAtLeastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyAtLeast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGreedyAtLeast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGreedyAtLeast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyAtLeastContext greedyAtLeast() throws RecognitionException {
		GreedyAtLeastContext _localctx = new GreedyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_greedyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(CURLYOPEN);
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
			setState(197);
			match(COMMA);
			setState(198);
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

	public static class GreedyBetweenContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public FirstValueContext firstValue() {
			return getRuleContext(FirstValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionPCREParser.COMMA, 0); }
		public LastValueContext lastValue() {
			return getRuleContext(LastValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public GreedyBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyBetween; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGreedyBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGreedyBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyBetweenContext greedyBetween() throws RecognitionException {
		GreedyBetweenContext _localctx = new GreedyBetweenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_greedyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(CURLYOPEN);
			setState(201);
			firstValue();
			setState(202);
			match(COMMA);
			setState(203);
			lastValue();
			setState(204);
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

	public static class LazyOneOrMoreContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(RegularExpressionPCREParser.PLUS, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionPCREParser.QUESTION, 0); }
		public LazyOneOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyOneOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLazyOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLazyOneOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyOneOrMoreContext lazyOneOrMore() throws RecognitionException {
		LazyOneOrMoreContext _localctx = new LazyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lazyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PLUS);
			setState(207);
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

	public static class LazyZeroOrMoreContext extends ParserRuleContext {
		public TerminalNode ASTERISC() { return getToken(RegularExpressionPCREParser.ASTERISC, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionPCREParser.QUESTION, 0); }
		public LazyZeroOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyZeroOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLazyZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLazyZeroOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyZeroOrMoreContext lazyZeroOrMore() throws RecognitionException {
		LazyZeroOrMoreContext _localctx = new LazyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lazyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ASTERISC);
			setState(210);
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

	public static class LazyConditionalContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(RegularExpressionPCREParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(RegularExpressionPCREParser.QUESTION, i);
		}
		public LazyConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLazyConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLazyConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyConditionalContext lazyConditional() throws RecognitionException {
		LazyConditionalContext _localctx = new LazyConditionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lazyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(QUESTION);
			setState(213);
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

	public static class LazyAtLeastContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public TerminalNode COMMA() { return getToken(RegularExpressionPCREParser.COMMA, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionPCREParser.QUESTION, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionPCREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionPCREParser.DIGIT, i);
		}
		public LazyAtLeastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyAtLeast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLazyAtLeast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLazyAtLeast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyAtLeastContext lazyAtLeast() throws RecognitionException {
		LazyAtLeastContext _localctx = new LazyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lazyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(CURLYOPEN);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				match(DIGIT);
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(221);
			match(COMMA);
			setState(222);
			match(CURLYCLOSE);
			setState(223);
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

	public static class LazyBetweenContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public FirstValueContext firstValue() {
			return getRuleContext(FirstValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionPCREParser.COMMA, 0); }
		public LastValueContext lastValue() {
			return getRuleContext(LastValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionPCREParser.QUESTION, 0); }
		public LazyBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyBetween; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLazyBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLazyBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyBetweenContext lazyBetween() throws RecognitionException {
		LazyBetweenContext _localctx = new LazyBetweenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lazyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(CURLYOPEN);
			setState(226);
			firstValue();
			setState(227);
			match(COMMA);
			setState(228);
			lastValue();
			setState(229);
			match(CURLYCLOSE);
			setState(230);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(RegularExpressionPCREParser.COMMENT, 0); }
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionPCREParser.CLOSE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(COMMENT);
			setState(233);
			commentText();
			setState(234);
			match(CLOSE);
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

	public static class CommentTextContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public CommentTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterCommentText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitCommentText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCommentText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentTextContext commentText() throws RecognitionException {
		CommentTextContext _localctx = new CommentTextContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_commentText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				character();
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
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

	public static class MultipleContext extends ParserRuleContext {
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(RegularExpressionPCREParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(RegularExpressionPCREParser.PIPE, i);
		}
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiple);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			subExpression(0);
			setState(244); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(242);
					match(PIPE);
					setState(243);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(246); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class NumericalGroupContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(RegularExpressionPCREParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionPCREParser.CLOSE, 0); }
		public NumericalGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterNumericalGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitNumericalGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitNumericalGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalGroupContext numericalGroup() throws RecognitionException {
		NumericalGroupContext _localctx = new NumericalGroupContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_numericalGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(OPEN);
			setState(249);
			expression(0);
			setState(250);
			match(CLOSE);
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
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitAnchor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_anchor);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case CIRCUMFLEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				startAnchor();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionPCREParser.CIRCUMFLEX, 0); }
		public StartAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startAnchor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterStartAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitStartAnchor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitStartAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartAnchorContext startAnchor() throws RecognitionException {
		StartAnchorContext _localctx = new StartAnchorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_startAnchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		public TerminalNode DOLAR() { return getToken(RegularExpressionPCREParser.DOLAR, 0); }
		public EndAnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endAnchor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterEndAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitEndAnchor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitEndAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndAnchorContext endAnchor() throws RecognitionException {
		EndAnchorContext _localctx = new EndAnchorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_endAnchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterRepetition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitRepetition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitRepetition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionContext repetition() throws RecognitionException {
		RepetitionContext _localctx = new RepetitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_repetition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			quantified();
			setState(261);
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
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public QuantifiedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantified; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterQuantified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitQuantified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitQuantified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedContext quantified() throws RecognitionException {
		QuantifiedContext _localctx = new QuantifiedContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_quantified);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case NAMESTART:
			case NOCAPTUREGROUP:
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				group();
				}
				break;
			case BRACKETOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				list();
				}
				break;
			case CLASSOPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				charclass();
				}
				break;
			case SPACE:
			case DIGIT:
			case LATIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
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

	public static class OneOrMoreContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(RegularExpressionPCREParser.PLUS, 0); }
		public OneOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitOneOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneOrMoreContext oneOrMore() throws RecognitionException {
		OneOrMoreContext _localctx = new OneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_oneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		public TerminalNode ASTERISC() { return getToken(RegularExpressionPCREParser.ASTERISC, 0); }
		public ZeroOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitZeroOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeroOrMoreContext zeroOrMore() throws RecognitionException {
		ZeroOrMoreContext _localctx = new ZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_zeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		public TerminalNode QUESTION() { return getToken(RegularExpressionPCREParser.QUESTION, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public ExactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterExact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitExact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitExact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExactContext exact() throws RecognitionException {
		ExactContext _localctx = new ExactContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(CURLYOPEN);
			setState(276);
			value();
			setState(277);
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
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionPCREParser.COMMA, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public AtLeastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atLeast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterAtLeast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitAtLeast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtLeastContext atLeast() throws RecognitionException {
		AtLeastContext _localctx = new AtLeastContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_atLeast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(CURLYOPEN);
			setState(280);
			value();
			setState(281);
			match(COMMA);
			setState(282);
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
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public FirstValueContext firstValue() {
			return getRuleContext(FirstValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionPCREParser.COMMA, 0); }
		public LastValueContext lastValue() {
			return getRuleContext(LastValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(CURLYOPEN);
			setState(285);
			firstValue();
			setState(286);
			match(COMMA);
			setState(287);
			lastValue();
			setState(288);
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionPCREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionPCREParser.DIGIT, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				match(DIGIT);
				}
				}
				setState(293); 
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
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionPCREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionPCREParser.DIGIT, i);
		}
		public FirstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterFirstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitFirstValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitFirstValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstValueContext firstValue() throws RecognitionException {
		FirstValueContext _localctx = new FirstValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_firstValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				match(DIGIT);
				}
				}
				setState(298); 
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
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionPCREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionPCREParser.DIGIT, i);
		}
		public LastValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLastValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLastValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLastValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastValueContext lastValue() throws RecognitionException {
		LastValueContext _localctx = new LastValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lastValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				match(DIGIT);
				}
				}
				setState(303); 
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
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list);
		try {
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				negativeList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				positiveList();
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
		public TerminalNode BRACKETOPEN() { return getToken(RegularExpressionPCREParser.BRACKETOPEN, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionPCREParser.CIRCUMFLEX, 0); }
		public TerminalNode BRACKETCLOSE() { return getToken(RegularExpressionPCREParser.BRACKETCLOSE, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<CharclassContext> charclass() {
			return getRuleContexts(CharclassContext.class);
		}
		public CharclassContext charclass(int i) {
			return getRuleContext(CharclassContext.class,i);
		}
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public NegativeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterNegativeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitNegativeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitNegativeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeListContext negativeList() throws RecognitionException {
		NegativeListContext _localctx = new NegativeListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_negativeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(BRACKETOPEN);
			setState(310);
			match(CIRCUMFLEX);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(314);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(311);
					range();
					}
					break;
				case 2:
					{
					setState(312);
					charclass();
					}
					break;
				case 3:
					{
					setState(313);
					character();
					}
					break;
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSOPEN) | (1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(318);
			match(BRACKETCLOSE);
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
		public TerminalNode BRACKETOPEN() { return getToken(RegularExpressionPCREParser.BRACKETOPEN, 0); }
		public TerminalNode BRACKETCLOSE() { return getToken(RegularExpressionPCREParser.BRACKETCLOSE, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<CharclassContext> charclass() {
			return getRuleContexts(CharclassContext.class);
		}
		public CharclassContext charclass(int i) {
			return getRuleContext(CharclassContext.class,i);
		}
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public PositiveListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterPositiveList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitPositiveList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitPositiveList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositiveListContext positiveList() throws RecognitionException {
		PositiveListContext _localctx = new PositiveListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_positiveList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(BRACKETOPEN);
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(324);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(321);
					range();
					}
					break;
				case 2:
					{
					setState(322);
					charclass();
					}
					break;
				case 3:
					{
					setState(323);
					character();
					}
					break;
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSOPEN) | (1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(328);
			match(BRACKETCLOSE);
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
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public TerminalNode DASH() { return getToken(RegularExpressionPCREParser.DASH, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			character();
			setState(331);
			match(DASH);
			setState(332);
			character();
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
		public TerminalNode CLASSOPEN() { return getToken(RegularExpressionPCREParser.CLASSOPEN, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public TerminalNode CLASSCLOSE() { return getToken(RegularExpressionPCREParser.CLASSCLOSE, 0); }
		public CharclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterCharclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitCharclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCharclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharclassContext charclass() throws RecognitionException {
		CharclassContext _localctx = new CharclassContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_charclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(CLASSOPEN);
			setState(335);
			classname();
			setState(336);
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
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classname);
		try {
			setState(350);
			switch (_input.LA(1)) {
			case ALNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				alnum();
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				alpha();
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				blank();
				}
				break;
			case CNTRL:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				cntrl();
				}
				break;
			case DIGITCLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				digitclass();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				graph();
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 7);
				{
				setState(344);
				lower();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(345);
				print();
				}
				break;
			case PUNCT:
				enterOuterAlt(_localctx, 9);
				{
				setState(346);
				punct();
				}
				break;
			case SPACECLASS:
				enterOuterAlt(_localctx, 10);
				{
				setState(347);
				spaceclass();
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 11);
				{
				setState(348);
				upper();
				}
				break;
			case XDIGIT:
				enterOuterAlt(_localctx, 12);
				{
				setState(349);
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
		public TerminalNode ALNUM() { return getToken(RegularExpressionPCREParser.ALNUM, 0); }
		public AlnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterAlnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitAlnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAlnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlnumContext alnum() throws RecognitionException {
		AlnumContext _localctx = new AlnumContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_alnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		public TerminalNode ALPHA() { return getToken(RegularExpressionPCREParser.ALPHA, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_alpha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		public TerminalNode BLANK() { return getToken(RegularExpressionPCREParser.BLANK, 0); }
		public BlankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_blank);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		public TerminalNode CNTRL() { return getToken(RegularExpressionPCREParser.CNTRL, 0); }
		public CntrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cntrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterCntrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitCntrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCntrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CntrlContext cntrl() throws RecognitionException {
		CntrlContext _localctx = new CntrlContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		public TerminalNode DIGITCLASS() { return getToken(RegularExpressionPCREParser.DIGITCLASS, 0); }
		public DigitclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterDigitclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitDigitclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitDigitclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitclassContext digitclass() throws RecognitionException {
		DigitclassContext _localctx = new DigitclassContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_digitclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		public TerminalNode GRAPH() { return getToken(RegularExpressionPCREParser.GRAPH, 0); }
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitGraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		public TerminalNode LOWER() { return getToken(RegularExpressionPCREParser.LOWER, 0); }
		public LowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterLower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitLower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		public TerminalNode PRINT() { return getToken(RegularExpressionPCREParser.PRINT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public TerminalNode PUNCT() { return getToken(RegularExpressionPCREParser.PUNCT, 0); }
		public PunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterPunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitPunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitPunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunctContext punct() throws RecognitionException {
		PunctContext _localctx = new PunctContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_punct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		public TerminalNode SPACECLASS() { return getToken(RegularExpressionPCREParser.SPACECLASS, 0); }
		public SpaceclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterSpaceclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitSpaceclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitSpaceclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceclassContext spaceclass() throws RecognitionException {
		SpaceclassContext _localctx = new SpaceclassContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_spaceclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
		public TerminalNode UPPER() { return getToken(RegularExpressionPCREParser.UPPER, 0); }
		public UpperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterUpper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitUpper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitUpper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_upper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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
		public TerminalNode XDIGIT() { return getToken(RegularExpressionPCREParser.XDIGIT, 0); }
		public XdigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterXdigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitXdigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitXdigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdigitContext xdigit() throws RecognitionException {
		XdigitContext _localctx = new XdigitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_xdigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		public TerminalNode DOT() { return getToken(RegularExpressionPCREParser.DOT, 0); }
		public AnycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anychar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterAnychar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitAnychar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAnychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_anychar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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

	public static class CharactersContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionPCREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionPCREParser.DIGIT, i);
		}
		public List<TerminalNode> LATIN() { return getTokens(RegularExpressionPCREParser.LATIN); }
		public TerminalNode LATIN(int i) {
			return getToken(RegularExpressionPCREParser.LATIN, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(RegularExpressionPCREParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(RegularExpressionPCREParser.SPACE, i);
		}
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitCharacters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCharacters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_characters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(378);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(381); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public TerminalNode DIGIT() { return getToken(RegularExpressionPCREParser.DIGIT, 0); }
		public TerminalNode LATIN() { return getToken(RegularExpressionPCREParser.LATIN, 0); }
		public TerminalNode SPACE() { return getToken(RegularExpressionPCREParser.SPACE, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionPCREListener ) ((RegularExpressionPCREListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0)) ) {
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
		case 1:
			return subExpression_sempred((SubExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean subExpression_sempred(SubExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0080\n\2\3\2\3\2\7\2\u0084\n\2\f\2\16\2"+
		"\u0087\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u008f\n\3\3\3\3\3\7\3\u0093\n"+
		"\3\f\3\16\3\u0096\13\3\3\4\3\4\3\4\5\4\u009b\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00ac\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00b3\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\6\16\u00c4\n\16\r\16\16\16\u00c5\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\6\23\u00dc\n\23\r\23\16\23\u00dd\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26\u00f0\n\26"+
		"\r\26\16\26\u00f1\3\27\3\27\3\27\6\27\u00f7\n\27\r\27\16\27\u00f8\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\5\31\u0101\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\5\35\u010e\n\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\6$\u0126\n$\r$\16"+
		"$\u0127\3%\6%\u012b\n%\r%\16%\u012c\3&\6&\u0130\n&\r&\16&\u0131\3\'\3"+
		"\'\5\'\u0136\n\'\3(\3(\3(\3(\3(\6(\u013d\n(\r(\16(\u013e\3(\3(\3)\3)\3"+
		")\3)\6)\u0147\n)\r)\16)\u0148\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0161\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\6:\u017e\n:\r:\16:\u017f\3;\3;\3;\2\4\2\4<\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprt\2\3\3\2$&\u0180\2\177\3\2\2\2\4\u008e\3\2\2\2\6\u009a\3\2\2\2\b"+
		"\u009c\3\2\2\2\n\u00a2\3\2\2\2\f\u00a4\3\2\2\2\16\u00ab\3\2\2\2\20\u00b2"+
		"\3\2\2\2\22\u00b9\3\2\2\2\24\u00bb\3\2\2\2\26\u00bd\3\2\2\2\30\u00bf\3"+
		"\2\2\2\32\u00c1\3\2\2\2\34\u00ca\3\2\2\2\36\u00d0\3\2\2\2 \u00d3\3\2\2"+
		"\2\"\u00d6\3\2\2\2$\u00d9\3\2\2\2&\u00e3\3\2\2\2(\u00ea\3\2\2\2*\u00ef"+
		"\3\2\2\2,\u00f3\3\2\2\2.\u00fa\3\2\2\2\60\u0100\3\2\2\2\62\u0102\3\2\2"+
		"\2\64\u0104\3\2\2\2\66\u0106\3\2\2\28\u010d\3\2\2\2:\u010f\3\2\2\2<\u0111"+
		"\3\2\2\2>\u0113\3\2\2\2@\u0115\3\2\2\2B\u0119\3\2\2\2D\u011e\3\2\2\2F"+
		"\u0125\3\2\2\2H\u012a\3\2\2\2J\u012f\3\2\2\2L\u0135\3\2\2\2N\u0137\3\2"+
		"\2\2P\u0142\3\2\2\2R\u014c\3\2\2\2T\u0150\3\2\2\2V\u0160\3\2\2\2X\u0162"+
		"\3\2\2\2Z\u0164\3\2\2\2\\\u0166\3\2\2\2^\u0168\3\2\2\2`\u016a\3\2\2\2"+
		"b\u016c\3\2\2\2d\u016e\3\2\2\2f\u0170\3\2\2\2h\u0172\3\2\2\2j\u0174\3"+
		"\2\2\2l\u0176\3\2\2\2n\u0178\3\2\2\2p\u017a\3\2\2\2r\u017d\3\2\2\2t\u0181"+
		"\3\2\2\2vw\b\2\1\2w\u0080\5,\27\2x\u0080\5(\25\2y\u0080\5\6\4\2z\u0080"+
		"\5\60\31\2{\u0080\5\66\34\2|\u0080\5L\'\2}\u0080\5r:\2~\u0080\7\'\2\2"+
		"\177v\3\2\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177"+
		"|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0085\3\2\2\2\u0081\u0082\f"+
		"\6\2\2\u0082\u0084\5\2\2\7\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\3\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0088\u0089\b\3\1\2\u0089\u008f\5\6\4\2\u008a\u008f\5\66\34\2\u008b\u008f"+
		"\5(\25\2\u008c\u008f\5L\'\2\u008d\u008f\5r:\2\u008e\u0088\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0094\3\2\2\2\u0090\u0091\f\5\2\2\u0091\u0093\5\4\3\6\u0092"+
		"\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\5\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\5.\30\2\u0098\u009b"+
		"\5\b\5\2\u0099\u009b\5\f\7\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\7\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\n\6\2"+
		"\u009e\u009f\7\4\2\2\u009f\u00a0\5\2\2\2\u00a0\u00a1\7\25\2\2\u00a1\t"+
		"\3\2\2\2\u00a2\u00a3\5r:\2\u00a3\13\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5"+
		"\u00a6\5\2\2\2\u00a6\u00a7\7\25\2\2\u00a7\r\3\2\2\2\u00a8\u00ac\5\20\t"+
		"\2\u00a9\u00ac\5\22\n\2\u00aa\u00ac\5@!\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00b3\5\36\20\2\u00ae"+
		"\u00b3\5 \21\2\u00af\u00b3\5\"\22\2\u00b0\u00b3\5$\23\2\u00b1\u00b3\5"+
		"&\24\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00ba\5\24\13"+
		"\2\u00b5\u00ba\5\26\f\2\u00b6\u00ba\5\30\r\2\u00b7\u00ba\5\32\16\2\u00b8"+
		"\u00ba\5\34\17\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\23\3\2\2\2\u00bb"+
		"\u00bc\7\n\2\2\u00bc\25\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\27\3\2\2\2"+
		"\u00bf\u00c0\7\t\2\2\u00c0\31\3\2\2\2\u00c1\u00c3\7\f\2\2\u00c2\u00c4"+
		"\7%\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\7\r"+
		"\2\2\u00c9\33\3\2\2\2\u00ca\u00cb\7\f\2\2\u00cb\u00cc\5H%\2\u00cc\u00cd"+
		"\7\b\2\2\u00cd\u00ce\5J&\2\u00ce\u00cf\7\r\2\2\u00cf\35\3\2\2\2\u00d0"+
		"\u00d1\7\n\2\2\u00d1\u00d2\7\t\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\7\13\2"+
		"\2\u00d4\u00d5\7\t\2\2\u00d5!\3\2\2\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8"+
		"\7\t\2\2\u00d8#\3\2\2\2\u00d9\u00db\7\f\2\2\u00da\u00dc\7%\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2\7\t"+
		"\2\2\u00e2%\3\2\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5\5H%\2\u00e5\u00e6"+
		"\7\b\2\2\u00e6\u00e7\5J&\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9\7\t\2\2\u00e9"+
		"\'\3\2\2\2\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5*\26\2\u00ec\u00ed\7\25\2"+
		"\2\u00ed)\3\2\2\2\u00ee\u00f0\5t;\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2+\3\2\2\2\u00f3\u00f6"+
		"\5\4\3\2\u00f4\u00f5\7\23\2\2\u00f5\u00f7\5\4\3\2\u00f6\u00f4\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9-\3"+
		"\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\5\2\2\2\u00fc\u00fd\7\25\2\2\u00fd"+
		"/\3\2\2\2\u00fe\u0101\5\62\32\2\u00ff\u0101\5\64\33\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u00ff\3\2\2\2\u0101\61\3\2\2\2\u0102\u0103\7\21\2\2\u0103\63"+
		"\3\2\2\2\u0104\u0105\7\22\2\2\u0105\65\3\2\2\2\u0106\u0107\58\35\2\u0107"+
		"\u0108\5\16\b\2\u0108\67\3\2\2\2\u0109\u010e\5\6\4\2\u010a\u010e\5L\'"+
		"\2\u010b\u010e\5T+\2\u010c\u010e\5t;\2\u010d\u0109\3\2\2\2\u010d\u010a"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e9\3\2\2\2\u010f"+
		"\u0110\7\n\2\2\u0110;\3\2\2\2\u0111\u0112\7\13\2\2\u0112=\3\2\2\2\u0113"+
		"\u0114\7\t\2\2\u0114?\3\2\2\2\u0115\u0116\7\f\2\2\u0116\u0117\5F$\2\u0117"+
		"\u0118\7\r\2\2\u0118A\3\2\2\2\u0119\u011a\7\f\2\2\u011a\u011b\5F$\2\u011b"+
		"\u011c\7\b\2\2\u011c\u011d\7\r\2\2\u011dC\3\2\2\2\u011e\u011f\7\f\2\2"+
		"\u011f\u0120\5H%\2\u0120\u0121\7\b\2\2\u0121\u0122\5J&\2\u0122\u0123\7"+
		"\r\2\2\u0123E\3\2\2\2\u0124\u0126\7%\2\2\u0125\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128G\3\2\2\2\u0129"+
		"\u012b\7%\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012dI\3\2\2\2\u012e\u0130\7%\2\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"K\3\2\2\2\u0133\u0136\5N(\2\u0134\u0136\5P)\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0134\3\2\2\2\u0136M\3\2\2\2\u0137\u0138\7\16\2\2\u0138\u013c\7\21\2"+
		"\2\u0139\u013d\5R*\2\u013a\u013d\5T+\2\u013b\u013d\5t;\2\u013c\u0139\3"+
		"\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\17"+
		"\2\2\u0141O\3\2\2\2\u0142\u0146\7\16\2\2\u0143\u0147\5R*\2\u0144\u0147"+
		"\5T+\2\u0145\u0147\5t;\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7\17\2\2\u014bQ\3\2\2\2\u014c\u014d"+
		"\5t;\2\u014d\u014e\7\20\2\2\u014e\u014f\5t;\2\u014fS\3\2\2\2\u0150\u0151"+
		"\7\26\2\2\u0151\u0152\5V,\2\u0152\u0153\7\27\2\2\u0153U\3\2\2\2\u0154"+
		"\u0161\5X-\2\u0155\u0161\5Z.\2\u0156\u0161\5\\/\2\u0157\u0161\5^\60\2"+
		"\u0158\u0161\5`\61\2\u0159\u0161\5b\62\2\u015a\u0161\5d\63\2\u015b\u0161"+
		"\5f\64\2\u015c\u0161\5h\65\2\u015d\u0161\5j\66\2\u015e\u0161\5l\67\2\u015f"+
		"\u0161\5n8\2\u0160\u0154\3\2\2\2\u0160\u0155\3\2\2\2\u0160\u0156\3\2\2"+
		"\2\u0160\u0157\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a"+
		"\3\2\2\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161W\3\2\2\2\u0162\u0163\7\30\2\2"+
		"\u0163Y\3\2\2\2\u0164\u0165\7\31\2\2\u0165[\3\2\2\2\u0166\u0167\7\32\2"+
		"\2\u0167]\3\2\2\2\u0168\u0169\7\33\2\2\u0169_\3\2\2\2\u016a\u016b\7\34"+
		"\2\2\u016ba\3\2\2\2\u016c\u016d\7\35\2\2\u016dc\3\2\2\2\u016e\u016f\7"+
		"\36\2\2\u016fe\3\2\2\2\u0170\u0171\7\37\2\2\u0171g\3\2\2\2\u0172\u0173"+
		"\7 \2\2\u0173i\3\2\2\2\u0174\u0175\7!\2\2\u0175k\3\2\2\2\u0176\u0177\7"+
		"\"\2\2\u0177m\3\2\2\2\u0178\u0179\7#\2\2\u0179o\3\2\2\2\u017a\u017b\7"+
		"\7\2\2\u017bq\3\2\2\2\u017c\u017e\t\2\2\2\u017d\u017c\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180s\3\2\2\2\u0181"+
		"\u0182\t\2\2\2\u0182u\3\2\2\2\32\177\u0085\u008e\u0094\u009a\u00ab\u00b2"+
		"\u00b9\u00c5\u00dd\u00f1\u00f8\u0100\u010d\u0127\u012c\u0131\u0135\u013c"+
		"\u013e\u0146\u0148\u0160\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}