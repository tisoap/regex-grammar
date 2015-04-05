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
				group();
				}
				break;
			case 3:
				{
				setState(83);
				repetition();
				}
				break;
			case 4:
				{
				setState(84);
				comment();
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
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				character();
				}
				}
				setState(126); 
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
			setState(128);
			match(NOCAPTUREGROUP);
			setState(129);
			expression(0);
			setState(130);
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
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				lazy();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				greedy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
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
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				lazyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				lazyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				lazyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				lazyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
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
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				greedyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				greedyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				greedyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				greedyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
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
			setState(151);
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
			setState(153);
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
			setState(155);
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
			setState(157);
			match(CURLYOPEN);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(DIGIT);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(163);
			match(COMMA);
			setState(164);
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
			setState(166);
			match(CURLYOPEN);
			setState(167);
			firstValue();
			setState(168);
			match(COMMA);
			setState(169);
			lastValue();
			setState(170);
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
			setState(172);
			match(PLUS);
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
			setState(175);
			match(ASTERISC);
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
			setState(178);
			match(QUESTION);
			setState(179);
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
			setState(181);
			match(CURLYOPEN);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				match(DIGIT);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(187);
			match(COMMA);
			setState(188);
			match(CURLYCLOSE);
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
			setState(191);
			match(CURLYOPEN);
			setState(192);
			firstValue();
			setState(193);
			match(COMMA);
			setState(194);
			lastValue();
			setState(195);
			match(CURLYCLOSE);
			setState(196);
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
			setState(198);
			match(COMMENT);
			setState(199);
			commentText();
			setState(200);
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
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				character();
				}
				}
				setState(205); 
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
			setState(207);
			subExpression(0);
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(208);
					match(PIPE);
					setState(209);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(214);
			match(OPEN);
			setState(215);
			expression(0);
			setState(216);
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
			setState(218);
			quantified();
			setState(219);
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
			setState(223);
			switch (_input.LA(1)) {
			case NAMESTART:
			case NOCAPTUREGROUP:
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				group();
				}
				break;
			case SPACE:
			case DIGIT:
			case LATIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
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
			setState(225);
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
			setState(227);
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
			setState(229);
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
			setState(231);
			match(CURLYOPEN);
			setState(232);
			value();
			setState(233);
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
			setState(235);
			match(CURLYOPEN);
			setState(236);
			value();
			setState(237);
			match(COMMA);
			setState(238);
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
			setState(240);
			match(CURLYOPEN);
			setState(241);
			firstValue();
			setState(242);
			match(COMMA);
			setState(243);
			lastValue();
			setState(244);
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
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				match(DIGIT);
				}
				}
				setState(249); 
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
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				match(DIGIT);
				}
				}
				setState(254); 
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
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				match(DIGIT);
				}
				}
				setState(259); 
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
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				negativeList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
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
			setState(265);
			match(BRACKETOPEN);
			setState(266);
			match(CIRCUMFLEX);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(269);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(267);
					characters();
					}
					break;
				case 2:
					{
					setState(268);
					range();
					}
					break;
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(273);
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
			setState(275);
			match(BRACKETOPEN);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(278);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(276);
					characters();
					}
					break;
				case 2:
					{
					setState(277);
					range();
					}
					break;
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(282);
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
			setState(284);
			character();
			setState(285);
			match(DASH);
			setState(286);
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
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(288);
					character();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(293);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2[\n\2\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3j\n\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\4\3\4\3\4\5"+
		"\4v\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\6\6\177\n\6\r\6\16\6\u0080\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0091\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\6"+
		"\16\u00a2\n\16\r\16\16\16\u00a3\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\6\23\u00ba"+
		"\n\23\r\23\16\23\u00bb\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26\u00ce\n\26\r\26\16\26\u00cf\3\27"+
		"\3\27\3\27\6\27\u00d5\n\27\r\27\16\27\u00d6\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\5\32\u00e2\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\6!\u00fa"+
		"\n!\r!\16!\u00fb\3\"\6\"\u00ff\n\"\r\"\16\"\u0100\3#\6#\u0104\n#\r#\16"+
		"#\u0105\3$\3$\5$\u010a\n$\3%\3%\3%\3%\6%\u0110\n%\r%\16%\u0111\3%\3%\3"+
		"&\3&\3&\6&\u0119\n&\r&\16&\u011a\3&\3&\3\'\3\'\3\'\3\'\3(\6(\u0124\n("+
		"\r(\16(\u0125\3)\3)\3)\2\4\2\4*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\3\3\2\24\26\u0128\2Z\3\2\2\2\4i\3"+
		"\2\2\2\6u\3\2\2\2\bw\3\2\2\2\n~\3\2\2\2\f\u0082\3\2\2\2\16\u0089\3\2\2"+
		"\2\20\u0090\3\2\2\2\22\u0097\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2"+
		"\30\u009d\3\2\2\2\32\u009f\3\2\2\2\34\u00a8\3\2\2\2\36\u00ae\3\2\2\2 "+
		"\u00b1\3\2\2\2\"\u00b4\3\2\2\2$\u00b7\3\2\2\2&\u00c1\3\2\2\2(\u00c8\3"+
		"\2\2\2*\u00cd\3\2\2\2,\u00d1\3\2\2\2.\u00d8\3\2\2\2\60\u00dc\3\2\2\2\62"+
		"\u00e1\3\2\2\2\64\u00e3\3\2\2\2\66\u00e5\3\2\2\28\u00e7\3\2\2\2:\u00e9"+
		"\3\2\2\2<\u00ed\3\2\2\2>\u00f2\3\2\2\2@\u00f9\3\2\2\2B\u00fe\3\2\2\2D"+
		"\u0103\3\2\2\2F\u0109\3\2\2\2H\u010b\3\2\2\2J\u0115\3\2\2\2L\u011e\3\2"+
		"\2\2N\u0123\3\2\2\2P\u0127\3\2\2\2RS\b\2\1\2S[\5,\27\2T[\5\6\4\2U[\5\60"+
		"\31\2V[\5(\25\2W[\5F$\2X[\5N(\2Y[\7\27\2\2ZR\3\2\2\2ZT\3\2\2\2ZU\3\2\2"+
		"\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[`\3\2\2\2\\]\f\6\2\2]_\5\2"+
		"\2\7^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\3\3\2\2\2b`\3\2\2\2cd\b"+
		"\3\1\2dj\5\6\4\2ej\5\60\31\2fj\5(\25\2gj\5F$\2hj\5N(\2ic\3\2\2\2ie\3\2"+
		"\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jo\3\2\2\2kl\f\5\2\2ln\5\4\3\6mk\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\5\3\2\2\2qo\3\2\2\2rv\5.\30\2sv\5"+
		"\b\5\2tv\5\f\7\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\7\3\2\2\2wx\7\3\2\2xy"+
		"\5\n\6\2yz\7\4\2\2z{\5\2\2\2{|\7\23\2\2|\t\3\2\2\2}\177\5P)\2~}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\13\3\2\2"+
		"\2\u0082\u0083\7\5\2\2\u0083\u0084\5\2\2\2\u0084\u0085\7\23\2\2\u0085"+
		"\r\3\2\2\2\u0086\u008a\5\20\t\2\u0087\u008a\5\22\n\2\u0088\u008a\5:\36"+
		"\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\17"+
		"\3\2\2\2\u008b\u0091\5\36\20\2\u008c\u0091\5 \21\2\u008d\u0091\5\"\22"+
		"\2\u008e\u0091\5$\23\2\u008f\u0091\5&\24\2\u0090\u008b\3\2\2\2\u0090\u008c"+
		"\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\21\3\2\2\2\u0092\u0098\5\24\13\2\u0093\u0098\5\26\f\2\u0094\u0098\5\30"+
		"\r\2\u0095\u0098\5\32\16\2\u0096\u0098\5\34\17\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\23\3\2\2\2\u0099\u009a\7\t\2\2\u009a\25\3\2\2\2\u009b\u009c"+
		"\7\n\2\2\u009c\27\3\2\2\2\u009d\u009e\7\b\2\2\u009e\31\3\2\2\2\u009f\u00a1"+
		"\7\13\2\2\u00a0\u00a2\7\25\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\7\7\2\2\u00a6\u00a7\7\f\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\13\2\2\u00a9"+
		"\u00aa\5B\"\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5D#\2\u00ac\u00ad\7\f\2"+
		"\2\u00ad\35\3\2\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\7\b\2\2\u00b0\37\3"+
		"\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3\7\b\2\2\u00b3!\3\2\2\2\u00b4\u00b5"+
		"\7\b\2\2\u00b5\u00b6\7\b\2\2\u00b6#\3\2\2\2\u00b7\u00b9\7\13\2\2\u00b8"+
		"\u00ba\7\25\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\7\2\2\u00be"+
		"\u00bf\7\f\2\2\u00bf\u00c0\7\b\2\2\u00c0%\3\2\2\2\u00c1\u00c2\7\13\2\2"+
		"\u00c2\u00c3\5B\"\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\5D#\2\u00c5\u00c6"+
		"\7\f\2\2\u00c6\u00c7\7\b\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\7\6\2\2\u00c9"+
		"\u00ca\5*\26\2\u00ca\u00cb\7\23\2\2\u00cb)\3\2\2\2\u00cc\u00ce\5P)\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0+\3\2\2\2\u00d1\u00d4\5\4\3\2\u00d2\u00d3\7\21\2\2\u00d3\u00d5"+
		"\5\4\3\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7-\3\2\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00da\5\2\2\2"+
		"\u00da\u00db\7\23\2\2\u00db/\3\2\2\2\u00dc\u00dd\5\62\32\2\u00dd\u00de"+
		"\5\16\b\2\u00de\61\3\2\2\2\u00df\u00e2\5\6\4\2\u00e0\u00e2\5P)\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\63\3\2\2\2\u00e3\u00e4\7\t\2"+
		"\2\u00e4\65\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6\67\3\2\2\2\u00e7\u00e8\7"+
		"\b\2\2\u00e89\3\2\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\5@!\2\u00eb\u00ec"+
		"\7\f\2\2\u00ec;\3\2\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef\5@!\2\u00ef\u00f0"+
		"\7\7\2\2\u00f0\u00f1\7\f\2\2\u00f1=\3\2\2\2\u00f2\u00f3\7\13\2\2\u00f3"+
		"\u00f4\5B\"\2\u00f4\u00f5\7\7\2\2\u00f5\u00f6\5D#\2\u00f6\u00f7\7\f\2"+
		"\2\u00f7?\3\2\2\2\u00f8\u00fa\7\25\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcA\3\2\2\2\u00fd"+
		"\u00ff\7\25\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101C\3\2\2\2\u0102\u0104\7\25\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"E\3\2\2\2\u0107\u010a\5H%\2\u0108\u010a\5J&\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010aG\3\2\2\2\u010b\u010c\7\r\2\2\u010c\u010f\7\20\2\2"+
		"\u010d\u0110\5N(\2\u010e\u0110\5L\'\2\u010f\u010d\3\2\2\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\7\16\2\2\u0114I\3\2\2\2\u0115\u0118\7\r\2\2"+
		"\u0116\u0119\5N(\2\u0117\u0119\5L\'\2\u0118\u0116\3\2\2\2\u0118\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\7\16\2\2\u011dK\3\2\2\2\u011e\u011f\5P)\2\u011f"+
		"\u0120\7\17\2\2\u0120\u0121\5P)\2\u0121M\3\2\2\2\u0122\u0124\5P)\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126O\3\2\2\2\u0127\u0128\t\2\2\2\u0128Q\3\2\2\2\31Z`iou\u0080\u0089"+
		"\u0090\u0097\u00a3\u00bb\u00cf\u00d6\u00e1\u00fb\u0100\u0105\u0109\u010f"+
		"\u0111\u0118\u011a\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}