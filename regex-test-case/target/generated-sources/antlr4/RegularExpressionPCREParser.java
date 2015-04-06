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
		NAMESTART=1, NAMEEND=2, NOCAPTUREGROUP=3, COMMENT=4, COMMA=5, QUESTION=6, 
		PLUS=7, ASTERISC=8, CURLYOPEN=9, CURLYCLOSE=10, BRACKETOPEN=11, BRACKETCLOSE=12, 
		DASH=13, CIRCUMFLEX=14, PIPE=15, OPEN=16, CLOSE=17, SPACE=18, DIGIT=19, 
		LATIN=20, WS=21;
	public static final int
		RULE_expression = 0, RULE_subExpression = 1, RULE_group = 2, RULE_namedGroup = 3, 
		RULE_groupName = 4, RULE_noCaptureGroup = 5, RULE_quantifier = 6, RULE_lazy = 7, 
		RULE_greedy = 8, RULE_greedyOneOrMore = 9, RULE_greedyZeroOrMore = 10, 
		RULE_greedyConditional = 11, RULE_greedyAtLeast = 12, RULE_greedyBetween = 13, 
		RULE_lazyOneOrMore = 14, RULE_lazyZeroOrMore = 15, RULE_lazyConditional = 16, 
		RULE_lazyAtLeast = 17, RULE_lazyBetween = 18, RULE_comment = 19, RULE_commentText = 20, 
		RULE_multiple = 21, RULE_numericalGroup = 22, RULE_repetition = 23, RULE_quantified = 24, 
		RULE_oneOrMore = 25, RULE_zeroOrMore = 26, RULE_conditional = 27, RULE_exact = 28, 
		RULE_atLeast = 29, RULE_between = 30, RULE_value = 31, RULE_firstValue = 32, 
		RULE_lastValue = 33, RULE_list = 34, RULE_negativeList = 35, RULE_positiveList = 36, 
		RULE_range = 37, RULE_characters = 38, RULE_character = 39;
	public static final String[] ruleNames = {
		"expression", "subExpression", "group", "namedGroup", "groupName", "noCaptureGroup", 
		"quantifier", "lazy", "greedy", "greedyOneOrMore", "greedyZeroOrMore", 
		"greedyConditional", "greedyAtLeast", "greedyBetween", "lazyOneOrMore", 
		"lazyZeroOrMore", "lazyConditional", "lazyAtLeast", "lazyBetween", "comment", 
		"commentText", "multiple", "numericalGroup", "repetition", "quantified", 
		"oneOrMore", "zeroOrMore", "conditional", "exact", "atLeast", "between", 
		"value", "firstValue", "lastValue", "list", "negativeList", "positiveList", 
		"range", "characters", "character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'(?<'", "'>'", "'(?:'", "'(?#'", "','", "'?'", "'+'", "'*'", "'{'", 
		"'}'", "'['", "']'", "'-'", "'^'", "'|'", "'('", "')'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMESTART", "NAMEEND", "NOCAPTUREGROUP", "COMMENT", "COMMA", "QUESTION", 
		"PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", "BRACKETOPEN", "BRACKETCLOSE", 
		"DASH", "CIRCUMFLEX", "PIPE", "OPEN", "CLOSE", "SPACE", "DIGIT", "LATIN", 
		"WS"
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
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(81);
				multiple();
				}
				break;
			case 2:
				{
				setState(82);
				comment();
				}
				break;
			case 3:
				{
				setState(83);
				group();
				}
				break;
			case 4:
				{
				setState(84);
				repetition();
				}
				break;
			case 5:
				{
				setState(85);
				list();
				}
				break;
			case 6:
				{
				setState(86);
				characters();
				}
				break;
			case 7:
				{
				setState(87);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
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
					setState(90);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(91);
					expression(5);
					}
					} 
				}
				setState(96);
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
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(98);
				group();
				}
				break;
			case 2:
				{
				setState(99);
				repetition();
				}
				break;
			case 3:
				{
				setState(100);
				comment();
				}
				break;
			case 4:
				{
				setState(101);
				list();
				}
				break;
			case 5:
				{
				setState(102);
				characters();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
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
					setState(105);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(106);
					subExpression(4);
					}
					} 
				}
				setState(111);
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
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_group);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				numericalGroup();
				}
				break;
			case NAMESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				namedGroup();
				}
				break;
			case NOCAPTUREGROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
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
	}

	public final NamedGroupContext namedGroup() throws RecognitionException {
		NamedGroupContext _localctx = new NamedGroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namedGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(NAMESTART);
			setState(118);
			groupName();
			setState(119);
			match(NAMEEND);
			setState(120);
			expression(0);
			setState(121);
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
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
	}

	public final NoCaptureGroupContext noCaptureGroup() throws RecognitionException {
		NoCaptureGroupContext _localctx = new NoCaptureGroupContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_noCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NOCAPTUREGROUP);
			setState(126);
			expression(0);
			setState(127);
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
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quantifier);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				lazy();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				greedy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
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
	}

	public final LazyContext lazy() throws RecognitionException {
		LazyContext _localctx = new LazyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lazy);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				lazyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				lazyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				lazyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				lazyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
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
	}

	public final GreedyContext greedy() throws RecognitionException {
		GreedyContext _localctx = new GreedyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_greedy);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				greedyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				greedyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				greedyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				greedyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
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
	}

	public final GreedyOneOrMoreContext greedyOneOrMore() throws RecognitionException {
		GreedyOneOrMoreContext _localctx = new GreedyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_greedyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
	}

	public final GreedyZeroOrMoreContext greedyZeroOrMore() throws RecognitionException {
		GreedyZeroOrMoreContext _localctx = new GreedyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_greedyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
	}

	public final GreedyConditionalContext greedyConditional() throws RecognitionException {
		GreedyConditionalContext _localctx = new GreedyConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_greedyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
	}

	public final GreedyAtLeastContext greedyAtLeast() throws RecognitionException {
		GreedyAtLeastContext _localctx = new GreedyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_greedyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CURLYOPEN);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(DIGIT);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(160);
			match(COMMA);
			setState(161);
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
	}

	public final GreedyBetweenContext greedyBetween() throws RecognitionException {
		GreedyBetweenContext _localctx = new GreedyBetweenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_greedyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CURLYOPEN);
			setState(164);
			firstValue();
			setState(165);
			match(COMMA);
			setState(166);
			lastValue();
			setState(167);
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
	}

	public final LazyOneOrMoreContext lazyOneOrMore() throws RecognitionException {
		LazyOneOrMoreContext _localctx = new LazyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lazyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(PLUS);
			setState(170);
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
	}

	public final LazyZeroOrMoreContext lazyZeroOrMore() throws RecognitionException {
		LazyZeroOrMoreContext _localctx = new LazyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lazyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ASTERISC);
			setState(173);
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
	}

	public final LazyConditionalContext lazyConditional() throws RecognitionException {
		LazyConditionalContext _localctx = new LazyConditionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lazyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(QUESTION);
			setState(176);
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
	}

	public final LazyAtLeastContext lazyAtLeast() throws RecognitionException {
		LazyAtLeastContext _localctx = new LazyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lazyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(CURLYOPEN);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				match(DIGIT);
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(184);
			match(COMMA);
			setState(185);
			match(CURLYCLOSE);
			setState(186);
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
	}

	public final LazyBetweenContext lazyBetween() throws RecognitionException {
		LazyBetweenContext _localctx = new LazyBetweenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lazyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(CURLYOPEN);
			setState(189);
			firstValue();
			setState(190);
			match(COMMA);
			setState(191);
			lastValue();
			setState(192);
			match(CURLYCLOSE);
			setState(193);
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
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(COMMENT);
			setState(196);
			commentText();
			setState(197);
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
	}

	public final CommentTextContext commentText() throws RecognitionException {
		CommentTextContext _localctx = new CommentTextContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_commentText);
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
				character();
				}
				}
				setState(202); 
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
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiple);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			subExpression(0);
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(205);
					match(PIPE);
					setState(206);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
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
	}

	public final NumericalGroupContext numericalGroup() throws RecognitionException {
		NumericalGroupContext _localctx = new NumericalGroupContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_numericalGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(OPEN);
			setState(212);
			expression(0);
			setState(213);
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
	}

	public final RepetitionContext repetition() throws RecognitionException {
		RepetitionContext _localctx = new RepetitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_repetition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			quantified();
			setState(216);
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
	}

	public final QuantifiedContext quantified() throws RecognitionException {
		QuantifiedContext _localctx = new QuantifiedContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_quantified);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case NAMESTART:
			case NOCAPTUREGROUP:
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				group();
				}
				break;
			case BRACKETOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				list();
				}
				break;
			case SPACE:
			case DIGIT:
			case LATIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
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
	}

	public final OneOrMoreContext oneOrMore() throws RecognitionException {
		OneOrMoreContext _localctx = new OneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_oneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
	}

	public final ZeroOrMoreContext zeroOrMore() throws RecognitionException {
		ZeroOrMoreContext _localctx = new ZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_zeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
	}

	public final ExactContext exact() throws RecognitionException {
		ExactContext _localctx = new ExactContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CURLYOPEN);
			setState(230);
			value();
			setState(231);
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
	}

	public final AtLeastContext atLeast() throws RecognitionException {
		AtLeastContext _localctx = new AtLeastContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atLeast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(CURLYOPEN);
			setState(234);
			value();
			setState(235);
			match(COMMA);
			setState(236);
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
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(CURLYOPEN);
			setState(239);
			firstValue();
			setState(240);
			match(COMMA);
			setState(241);
			lastValue();
			setState(242);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				match(DIGIT);
				}
				}
				setState(247); 
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
	}

	public final FirstValueContext firstValue() throws RecognitionException {
		FirstValueContext _localctx = new FirstValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_firstValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				match(DIGIT);
				}
				}
				setState(252); 
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
	}

	public final LastValueContext lastValue() throws RecognitionException {
		LastValueContext _localctx = new LastValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lastValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				match(DIGIT);
				}
				}
				setState(257); 
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
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_list);
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				negativeList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
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
		public List<CharactersContext> characters() {
			return getRuleContexts(CharactersContext.class);
		}
		public CharactersContext characters(int i) {
			return getRuleContext(CharactersContext.class,i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
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
	}

	public final NegativeListContext negativeList() throws RecognitionException {
		NegativeListContext _localctx = new NegativeListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_negativeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(BRACKETOPEN);
			setState(264);
			match(CIRCUMFLEX);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(267);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(265);
					characters();
					}
					break;
				case 2:
					{
					setState(266);
					range();
					}
					break;
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(271);
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
		public List<CharactersContext> characters() {
			return getRuleContexts(CharactersContext.class);
		}
		public CharactersContext characters(int i) {
			return getRuleContext(CharactersContext.class,i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
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
	}

	public final PositiveListContext positiveList() throws RecognitionException {
		PositiveListContext _localctx = new PositiveListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_positiveList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(BRACKETOPEN);
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(276);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(274);
					characters();
					}
					break;
				case 2:
					{
					setState(275);
					range();
					}
					break;
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(280);
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
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			character();
			setState(283);
			match(DASH);
			setState(284);
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
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_characters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(286);
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
				setState(289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0128\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2[\n\2\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3j\n\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\4\3\4\3\4\5"+
		"\4v\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5"+
		"\b\u0087\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0095\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\6\16\u009f\n\16\r\16\16"+
		"\16\u00a0\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\6\23\u00b7\n\23\r\23\16\23\u00b8"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\6\26\u00cb\n\26\r\26\16\26\u00cc\3\27\3\27\3\27\6\27\u00d2"+
		"\n\27\r\27\16\27\u00d3\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\5\32\u00e0\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\6!\u00f8\n!\r!\16!\u00f9"+
		"\3\"\6\"\u00fd\n\"\r\"\16\"\u00fe\3#\6#\u0102\n#\r#\16#\u0103\3$\3$\5"+
		"$\u0108\n$\3%\3%\3%\3%\6%\u010e\n%\r%\16%\u010f\3%\3%\3&\3&\3&\6&\u0117"+
		"\n&\r&\16&\u0118\3&\3&\3\'\3\'\3\'\3\'\3(\6(\u0122\n(\r(\16(\u0123\3)"+
		"\3)\3)\2\4\2\4*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNP\2\3\3\2\24\26\u0126\2Z\3\2\2\2\4i\3\2\2\2\6u\3\2\2"+
		"\2\bw\3\2\2\2\n}\3\2\2\2\f\177\3\2\2\2\16\u0086\3\2\2\2\20\u008d\3\2\2"+
		"\2\22\u0094\3\2\2\2\24\u0096\3\2\2\2\26\u0098\3\2\2\2\30\u009a\3\2\2\2"+
		"\32\u009c\3\2\2\2\34\u00a5\3\2\2\2\36\u00ab\3\2\2\2 \u00ae\3\2\2\2\"\u00b1"+
		"\3\2\2\2$\u00b4\3\2\2\2&\u00be\3\2\2\2(\u00c5\3\2\2\2*\u00ca\3\2\2\2,"+
		"\u00ce\3\2\2\2.\u00d5\3\2\2\2\60\u00d9\3\2\2\2\62\u00df\3\2\2\2\64\u00e1"+
		"\3\2\2\2\66\u00e3\3\2\2\28\u00e5\3\2\2\2:\u00e7\3\2\2\2<\u00eb\3\2\2\2"+
		">\u00f0\3\2\2\2@\u00f7\3\2\2\2B\u00fc\3\2\2\2D\u0101\3\2\2\2F\u0107\3"+
		"\2\2\2H\u0109\3\2\2\2J\u0113\3\2\2\2L\u011c\3\2\2\2N\u0121\3\2\2\2P\u0125"+
		"\3\2\2\2RS\b\2\1\2S[\5,\27\2T[\5(\25\2U[\5\6\4\2V[\5\60\31\2W[\5F$\2X"+
		"[\5N(\2Y[\7\27\2\2ZR\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2Z"+
		"X\3\2\2\2ZY\3\2\2\2[`\3\2\2\2\\]\f\6\2\2]_\5\2\2\7^\\\3\2\2\2_b\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2a\3\3\2\2\2b`\3\2\2\2cd\b\3\1\2dj\5\6\4\2ej\5\60"+
		"\31\2fj\5(\25\2gj\5F$\2hj\5N(\2ic\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2"+
		"\2ih\3\2\2\2jo\3\2\2\2kl\f\5\2\2ln\5\4\3\6mk\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2p\5\3\2\2\2qo\3\2\2\2rv\5.\30\2sv\5\b\5\2tv\5\f\7\2ur\3\2"+
		"\2\2us\3\2\2\2ut\3\2\2\2v\7\3\2\2\2wx\7\3\2\2xy\5\n\6\2yz\7\4\2\2z{\5"+
		"\2\2\2{|\7\23\2\2|\t\3\2\2\2}~\5N(\2~\13\3\2\2\2\177\u0080\7\5\2\2\u0080"+
		"\u0081\5\2\2\2\u0081\u0082\7\23\2\2\u0082\r\3\2\2\2\u0083\u0087\5\20\t"+
		"\2\u0084\u0087\5\22\n\2\u0085\u0087\5:\36\2\u0086\u0083\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\17\3\2\2\2\u0088\u008e\5\36\20"+
		"\2\u0089\u008e\5 \21\2\u008a\u008e\5\"\22\2\u008b\u008e\5$\23\2\u008c"+
		"\u008e\5&\24\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\21\3\2\2\2\u008f\u0095"+
		"\5\24\13\2\u0090\u0095\5\26\f\2\u0091\u0095\5\30\r\2\u0092\u0095\5\32"+
		"\16\2\u0093\u0095\5\34\17\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\23\3\2\2"+
		"\2\u0096\u0097\7\t\2\2\u0097\25\3\2\2\2\u0098\u0099\7\n\2\2\u0099\27\3"+
		"\2\2\2\u009a\u009b\7\b\2\2\u009b\31\3\2\2\2\u009c\u009e\7\13\2\2\u009d"+
		"\u009f\7\25\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3"+
		"\u00a4\7\f\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7\5B\""+
		"\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\5D#\2\u00a9\u00aa\7\f\2\2\u00aa\35"+
		"\3\2\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ad\7\b\2\2\u00ad\37\3\2\2\2\u00ae"+
		"\u00af\7\n\2\2\u00af\u00b0\7\b\2\2\u00b0!\3\2\2\2\u00b1\u00b2\7\b\2\2"+
		"\u00b2\u00b3\7\b\2\2\u00b3#\3\2\2\2\u00b4\u00b6\7\13\2\2\u00b5\u00b7\7"+
		"\25\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\7\f"+
		"\2\2\u00bc\u00bd\7\b\2\2\u00bd%\3\2\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0"+
		"\5B\"\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\5D#\2\u00c2\u00c3\7\f\2\2\u00c3"+
		"\u00c4\7\b\2\2\u00c4\'\3\2\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7\5*\26\2"+
		"\u00c7\u00c8\7\23\2\2\u00c8)\3\2\2\2\u00c9\u00cb\5P)\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"+\3\2\2\2\u00ce\u00d1\5\4\3\2\u00cf\u00d0\7\21\2\2\u00d0\u00d2\5\4\3\2"+
		"\u00d1\u00cf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4-\3\2\2\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5\2\2\2\u00d7"+
		"\u00d8\7\23\2\2\u00d8/\3\2\2\2\u00d9\u00da\5\62\32\2\u00da\u00db\5\16"+
		"\b\2\u00db\61\3\2\2\2\u00dc\u00e0\5\6\4\2\u00dd\u00e0\5F$\2\u00de\u00e0"+
		"\5P)\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\63\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2\65\3\2\2\2\u00e3\u00e4\7\n\2\2\u00e4"+
		"\67\3\2\2\2\u00e5\u00e6\7\b\2\2\u00e69\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8"+
		"\u00e9\5@!\2\u00e9\u00ea\7\f\2\2\u00ea;\3\2\2\2\u00eb\u00ec\7\13\2\2\u00ec"+
		"\u00ed\5@!\2\u00ed\u00ee\7\7\2\2\u00ee\u00ef\7\f\2\2\u00ef=\3\2\2\2\u00f0"+
		"\u00f1\7\13\2\2\u00f1\u00f2\5B\"\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\5D"+
		"#\2\u00f4\u00f5\7\f\2\2\u00f5?\3\2\2\2\u00f6\u00f8\7\25\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"A\3\2\2\2\u00fb\u00fd\7\25\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffC\3\2\2\2\u0100\u0102\7"+
		"\25\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104E\3\2\2\2\u0105\u0108\5H%\2\u0106\u0108\5J&\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108G\3\2\2\2\u0109\u010a\7\r\2\2"+
		"\u010a\u010d\7\20\2\2\u010b\u010e\5N(\2\u010c\u010e\5L\'\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\16\2\2\u0112I\3\2\2\2"+
		"\u0113\u0116\7\r\2\2\u0114\u0117\5N(\2\u0115\u0117\5L\'\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\16\2\2\u011bK\3\2\2\2"+
		"\u011c\u011d\5P)\2\u011d\u011e\7\17\2\2\u011e\u011f\5P)\2\u011fM\3\2\2"+
		"\2\u0120\u0122\t\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124O\3\2\2\2\u0125\u0126\t\2\2\2\u0126"+
		"Q\3\2\2\2\30Z`iou\u0086\u008d\u0094\u00a0\u00b8\u00cc\u00d3\u00df\u00f9"+
		"\u00fe\u0103\u0107\u010d\u010f\u0116\u0118\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}