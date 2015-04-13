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
		NAMESTART=1, NAMEEND=2, NOCAPTUREGROUP=3, COMMENT=4, SPACE=5, DOT=6, COMMA=7, 
		QUESTION=8, PLUS=9, ASTERISC=10, CURLYOPEN=11, CURLYCLOSE=12, BRACKETOPEN=13, 
		BRACKETCLOSE=14, DASH=15, CIRCUMFLEX=16, DOLAR=17, PIPE=18, OPEN=19, CLOSE=20, 
		CLASSOPEN=21, CLASSCLOSE=22, REVERSESOLIDUS=23, ALNUM=24, ALPHA=25, BLANK=26, 
		CNTRL=27, DIGITCLASS=28, GRAPH=29, LOWER=30, PRINT=31, PUNCT=32, SPACECLASS=33, 
		UPPER=34, XDIGIT=35, DIGIT=36, LATIN=37, ALL=38, WS=39;
	public static final int
		RULE_expression = 0, RULE_subExpression = 1, RULE_group = 2, RULE_numericalGroup = 3, 
		RULE_namedGroup = 4, RULE_groupName = 5, RULE_noCaptureGroup = 6, RULE_quantifier = 7, 
		RULE_lazy = 8, RULE_greedy = 9, RULE_greedyOneOrMore = 10, RULE_greedyZeroOrMore = 11, 
		RULE_greedyConditional = 12, RULE_greedyAtLeast = 13, RULE_greedyBetween = 14, 
		RULE_lazyOneOrMore = 15, RULE_lazyZeroOrMore = 16, RULE_lazyConditional = 17, 
		RULE_lazyAtLeast = 18, RULE_lazyBetween = 19, RULE_comment = 20, RULE_commentText = 21, 
		RULE_multiple = 22, RULE_anchor = 23, RULE_startAnchor = 24, RULE_endAnchor = 25, 
		RULE_repetition = 26, RULE_quantified = 27, RULE_oneOrMore = 28, RULE_zeroOrMore = 29, 
		RULE_conditional = 30, RULE_exact = 31, RULE_atLeast = 32, RULE_between = 33, 
		RULE_value = 34, RULE_firstValue = 35, RULE_lastValue = 36, RULE_list = 37, 
		RULE_negativeList = 38, RULE_positiveList = 39, RULE_listElement = 40, 
		RULE_range = 41, RULE_charclass = 42, RULE_classname = 43, RULE_alnum = 44, 
		RULE_alpha = 45, RULE_blank = 46, RULE_cntrl = 47, RULE_digitclass = 48, 
		RULE_graph = 49, RULE_lower = 50, RULE_print = 51, RULE_punct = 52, RULE_spaceclass = 53, 
		RULE_upper = 54, RULE_xdigit = 55, RULE_anychar = 56, RULE_escaped = 57, 
		RULE_special = 58, RULE_listEscaped = 59, RULE_listEspecial = 60, RULE_characters = 61, 
		RULE_character = 62;
	public static final String[] ruleNames = {
		"expression", "subExpression", "group", "numericalGroup", "namedGroup", 
		"groupName", "noCaptureGroup", "quantifier", "lazy", "greedy", "greedyOneOrMore", 
		"greedyZeroOrMore", "greedyConditional", "greedyAtLeast", "greedyBetween", 
		"lazyOneOrMore", "lazyZeroOrMore", "lazyConditional", "lazyAtLeast", "lazyBetween", 
		"comment", "commentText", "multiple", "anchor", "startAnchor", "endAnchor", 
		"repetition", "quantified", "oneOrMore", "zeroOrMore", "conditional", 
		"exact", "atLeast", "between", "value", "firstValue", "lastValue", "list", 
		"negativeList", "positiveList", "listElement", "range", "charclass", "classname", 
		"alnum", "alpha", "blank", "cntrl", "digitclass", "graph", "lower", "print", 
		"punct", "spaceclass", "upper", "xdigit", "anychar", "escaped", "special", 
		"listEscaped", "listEspecial", "characters", "character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'(?<'", "'>'", "'(?:'", "'(?#'", "' '", "'.'", "','", "'?'", "'+'", 
		"'*'", "'{'", "'}'", "'['", "']'", "'-'", "'^'", "'$'", "'|'", "'('", 
		"')'", "'[:'", "':]'", "'\\'", "'alnum'", "'alpha'", "'blank'", "'cntrl'", 
		"'digit'", "'graph'", "'lower'", "'print'", "'punct'", "'space'", "'upper'", 
		"'xdigit'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMESTART", "NAMEEND", "NOCAPTUREGROUP", "COMMENT", "SPACE", "DOT", 
		"COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", "BRACKETOPEN", 
		"BRACKETCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", "PIPE", "OPEN", "CLOSE", 
		"CLASSOPEN", "CLASSCLOSE", "REVERSESOLIDUS", "ALNUM", "ALPHA", "BLANK", 
		"CNTRL", "DIGITCLASS", "GRAPH", "LOWER", "PRINT", "PUNCT", "SPACECLASS", 
		"UPPER", "XDIGIT", "DIGIT", "LATIN", "ALL", "WS"
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
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(127);
				multiple();
				}
				break;
			case 2:
				{
				setState(128);
				comment();
				}
				break;
			case 3:
				{
				setState(129);
				anchor();
				}
				break;
			case 4:
				{
				setState(130);
				repetition();
				}
				break;
			case 5:
				{
				setState(131);
				list();
				}
				break;
			case 6:
				{
				setState(132);
				charclass();
				}
				break;
			case 7:
				{
				setState(133);
				anychar();
				}
				break;
			case 8:
				{
				setState(134);
				characters();
				}
				break;
			case 9:
				{
				setState(135);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
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
					setState(138);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(139);
					expression(7);
					}
					} 
				}
				setState(144);
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
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(146);
				group();
				}
				break;
			case 2:
				{
				setState(147);
				repetition();
				}
				break;
			case 3:
				{
				setState(148);
				comment();
				}
				break;
			case 4:
				{
				setState(149);
				list();
				}
				break;
			case 5:
				{
				setState(150);
				charclass();
				}
				break;
			case 6:
				{
				setState(151);
				anychar();
				}
				break;
			case 7:
				{
				setState(152);
				characters();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
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
					setState(155);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(156);
					subExpression(6);
					}
					} 
				}
				setState(161);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_group);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				numericalGroup();
				}
				break;
			case NAMESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				namedGroup();
				}
				break;
			case NOCAPTUREGROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitNumericalGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalGroupContext numericalGroup() throws RecognitionException {
		NumericalGroupContext _localctx = new NumericalGroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericalGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(OPEN);
			setState(168);
			expression(0);
			setState(169);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitNamedGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedGroupContext namedGroup() throws RecognitionException {
		NamedGroupContext _localctx = new NamedGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namedGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(NAMESTART);
			setState(172);
			groupName();
			setState(173);
			match(NAMEEND);
			setState(174);
			expression(0);
			setState(175);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitNoCaptureGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoCaptureGroupContext noCaptureGroup() throws RecognitionException {
		NoCaptureGroupContext _localctx = new NoCaptureGroupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_noCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NOCAPTUREGROUP);
			setState(180);
			expression(0);
			setState(181);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_quantifier);
		try {
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				lazy();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				greedy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyContext lazy() throws RecognitionException {
		LazyContext _localctx = new LazyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lazy);
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				lazyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				lazyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				lazyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				lazyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyContext greedy() throws RecognitionException {
		GreedyContext _localctx = new GreedyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_greedy);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				greedyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				greedyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				greedyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				greedyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyOneOrMoreContext greedyOneOrMore() throws RecognitionException {
		GreedyOneOrMoreContext _localctx = new GreedyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_greedyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyZeroOrMoreContext greedyZeroOrMore() throws RecognitionException {
		GreedyZeroOrMoreContext _localctx = new GreedyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_greedyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyConditionalContext greedyConditional() throws RecognitionException {
		GreedyConditionalContext _localctx = new GreedyConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_greedyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyAtLeastContext greedyAtLeast() throws RecognitionException {
		GreedyAtLeastContext _localctx = new GreedyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_greedyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(CURLYOPEN);
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
			setState(214);
			match(COMMA);
			setState(215);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGreedyBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyBetweenContext greedyBetween() throws RecognitionException {
		GreedyBetweenContext _localctx = new GreedyBetweenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_greedyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(CURLYOPEN);
			setState(218);
			firstValue();
			setState(219);
			match(COMMA);
			setState(220);
			lastValue();
			setState(221);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyOneOrMoreContext lazyOneOrMore() throws RecognitionException {
		LazyOneOrMoreContext _localctx = new LazyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lazyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(PLUS);
			setState(224);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyZeroOrMoreContext lazyZeroOrMore() throws RecognitionException {
		LazyZeroOrMoreContext _localctx = new LazyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lazyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ASTERISC);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyConditionalContext lazyConditional() throws RecognitionException {
		LazyConditionalContext _localctx = new LazyConditionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lazyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(QUESTION);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyAtLeastContext lazyAtLeast() throws RecognitionException {
		LazyAtLeastContext _localctx = new LazyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lazyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(CURLYOPEN);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				match(DIGIT);
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(238);
			match(COMMA);
			setState(239);
			match(CURLYCLOSE);
			setState(240);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLazyBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyBetweenContext lazyBetween() throws RecognitionException {
		LazyBetweenContext _localctx = new LazyBetweenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lazyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CURLYOPEN);
			setState(243);
			firstValue();
			setState(244);
			match(COMMA);
			setState(245);
			lastValue();
			setState(246);
			match(CURLYCLOSE);
			setState(247);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(COMMENT);
			setState(250);
			commentText();
			setState(251);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCommentText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentTextContext commentText() throws RecognitionException {
		CommentTextContext _localctx = new CommentTextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_commentText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				character();
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN) | (1L << ALL))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiple);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			subExpression(0);
			setState(261); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(259);
					match(PIPE);
					setState(260);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(263); 
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
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_anchor);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case CIRCUMFLEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				startAnchor();
				}
				break;
			case DOLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
			setState(269);
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
			setState(271);
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
			setState(273);
			quantified();
			setState(274);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitQuantified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedContext quantified() throws RecognitionException {
		QuantifiedContext _localctx = new QuantifiedContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_quantified);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case NAMESTART:
			case NOCAPTUREGROUP:
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				group();
				}
				break;
			case BRACKETOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				list();
				}
				break;
			case CLASSOPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				charclass();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				anychar();
				}
				break;
			case REVERSESOLIDUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				escaped();
				}
				break;
			case SPACE:
			case DIGIT:
			case LATIN:
			case ALL:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
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
			setState(284);
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
			setState(286);
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
			setState(288);
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
			setState(290);
			match(CURLYOPEN);
			setState(291);
			value();
			setState(292);
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
			setState(294);
			match(CURLYOPEN);
			setState(295);
			value();
			setState(296);
			match(COMMA);
			setState(297);
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
			setState(299);
			match(CURLYOPEN);
			setState(300);
			firstValue();
			setState(301);
			match(COMMA);
			setState(302);
			lastValue();
			setState(303);
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
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				match(DIGIT);
				}
				}
				setState(308); 
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
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				match(DIGIT);
				}
				}
				setState(313); 
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
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(315);
				match(DIGIT);
				}
				}
				setState(318); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list);
		try {
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				negativeList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public NegativeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeList; }
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
			setState(324);
			match(BRACKETOPEN);
			setState(325);
			match(CIRCUMFLEX);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << CLASSOPEN) | (1L << REVERSESOLIDUS) | (1L << DIGIT) | (1L << LATIN) | (1L << ALL))) != 0)) {
				{
				{
				setState(326);
				listElement();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
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
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public PositiveListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveList; }
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
			setState(334);
			match(BRACKETOPEN);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << CLASSOPEN) | (1L << REVERSESOLIDUS) | (1L << DIGIT) | (1L << LATIN) | (1L << ALL))) != 0)) {
				{
				{
				setState(335);
				listElement();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
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

	public static class ListElementContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CharclassContext charclass() {
			return getRuleContext(CharclassContext.class,0);
		}
		public ListEscapedContext listEscaped() {
			return getRuleContext(ListEscapedContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_listElement);
		try {
			setState(347);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				charclass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				listEscaped();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(RegularExpressionPCREParser.DASH, 0); }
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public List<ListEscapedContext> listEscaped() {
			return getRuleContexts(ListEscapedContext.class);
		}
		public ListEscapedContext listEscaped(int i) {
			return getRuleContext(ListEscapedContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			switch (_input.LA(1)) {
			case SPACE:
			case DIGIT:
			case LATIN:
			case ALL:
				{
				setState(349);
				character();
				}
				break;
			case REVERSESOLIDUS:
				{
				setState(350);
				listEscaped();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(353);
			match(DASH);
			setState(356);
			switch (_input.LA(1)) {
			case SPACE:
			case DIGIT:
			case LATIN:
			case ALL:
				{
				setState(354);
				character();
				}
				break;
			case REVERSESOLIDUS:
				{
				setState(355);
				listEscaped();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCharclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharclassContext charclass() throws RecognitionException {
		CharclassContext _localctx = new CharclassContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_charclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(CLASSOPEN);
			setState(359);
			classname();
			setState(360);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classname);
		try {
			setState(374);
			switch (_input.LA(1)) {
			case ALNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				alnum();
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				alpha();
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				blank();
				}
				break;
			case CNTRL:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				cntrl();
				}
				break;
			case DIGITCLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				digitclass();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				graph();
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
				lower();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(369);
				print();
				}
				break;
			case PUNCT:
				enterOuterAlt(_localctx, 9);
				{
				setState(370);
				punct();
				}
				break;
			case SPACECLASS:
				enterOuterAlt(_localctx, 10);
				{
				setState(371);
				spaceclass();
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 11);
				{
				setState(372);
				upper();
				}
				break;
			case XDIGIT:
				enterOuterAlt(_localctx, 12);
				{
				setState(373);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAlnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlnumContext alnum() throws RecognitionException {
		AlnumContext _localctx = new AlnumContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_alnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alpha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_blank);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCntrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CntrlContext cntrl() throws RecognitionException {
		CntrlContext _localctx = new CntrlContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitDigitclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitclassContext digitclass() throws RecognitionException {
		DigitclassContext _localctx = new DigitclassContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_digitclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitLower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitPunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunctContext punct() throws RecognitionException {
		PunctContext _localctx = new PunctContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_punct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitSpaceclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceclassContext spaceclass() throws RecognitionException {
		SpaceclassContext _localctx = new SpaceclassContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_spaceclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitUpper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_upper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitXdigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdigitContext xdigit() throws RecognitionException {
		XdigitContext _localctx = new XdigitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_xdigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitAnychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_anychar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		public TerminalNode REVERSESOLIDUS() { return getToken(RegularExpressionPCREParser.REVERSESOLIDUS, 0); }
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public EscapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitEscaped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapedContext escaped() throws RecognitionException {
		EscapedContext _localctx = new EscapedContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_escaped);
		try {
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(REVERSESOLIDUS);
				setState(403);
				special();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(REVERSESOLIDUS);
				setState(405);
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
		public TerminalNode DOT() { return getToken(RegularExpressionPCREParser.DOT, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionPCREParser.QUESTION, 0); }
		public TerminalNode PLUS() { return getToken(RegularExpressionPCREParser.PLUS, 0); }
		public TerminalNode ASTERISC() { return getToken(RegularExpressionPCREParser.ASTERISC, 0); }
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionPCREParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionPCREParser.CURLYCLOSE, 0); }
		public TerminalNode BRACKETOPEN() { return getToken(RegularExpressionPCREParser.BRACKETOPEN, 0); }
		public TerminalNode BRACKETCLOSE() { return getToken(RegularExpressionPCREParser.BRACKETCLOSE, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionPCREParser.CIRCUMFLEX, 0); }
		public TerminalNode DOLAR() { return getToken(RegularExpressionPCREParser.DOLAR, 0); }
		public TerminalNode PIPE() { return getToken(RegularExpressionPCREParser.PIPE, 0); }
		public TerminalNode OPEN() { return getToken(RegularExpressionPCREParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(RegularExpressionPCREParser.CLOSE, 0); }
		public TerminalNode REVERSESOLIDUS() { return getToken(RegularExpressionPCREParser.REVERSESOLIDUS, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << QUESTION) | (1L << PLUS) | (1L << ASTERISC) | (1L << CURLYOPEN) | (1L << CURLYCLOSE) | (1L << BRACKETOPEN) | (1L << BRACKETCLOSE) | (1L << CIRCUMFLEX) | (1L << DOLAR) | (1L << PIPE) | (1L << OPEN) | (1L << CLOSE) | (1L << REVERSESOLIDUS))) != 0)) ) {
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

	public static class ListEscapedContext extends ParserRuleContext {
		public TerminalNode REVERSESOLIDUS() { return getToken(RegularExpressionPCREParser.REVERSESOLIDUS, 0); }
		public ListEspecialContext listEspecial() {
			return getRuleContext(ListEspecialContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ListEscapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listEscaped; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitListEscaped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListEscapedContext listEscaped() throws RecognitionException {
		ListEscapedContext _localctx = new ListEscapedContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_listEscaped);
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(REVERSESOLIDUS);
				setState(411);
				listEspecial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(REVERSESOLIDUS);
				setState(413);
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

	public static class ListEspecialContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(RegularExpressionPCREParser.DASH, 0); }
		public TerminalNode BRACKETOPEN() { return getToken(RegularExpressionPCREParser.BRACKETOPEN, 0); }
		public TerminalNode BRACKETCLOSE() { return getToken(RegularExpressionPCREParser.BRACKETCLOSE, 0); }
		public TerminalNode REVERSESOLIDUS() { return getToken(RegularExpressionPCREParser.REVERSESOLIDUS, 0); }
		public ListEspecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listEspecial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitListEspecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListEspecialContext listEspecial() throws RecognitionException {
		ListEspecialContext _localctx = new ListEspecialContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_listEspecial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRACKETOPEN) | (1L << BRACKETCLOSE) | (1L << DASH) | (1L << REVERSESOLIDUS))) != 0)) ) {
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
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCharacters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_characters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(418);
					character();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(421); 
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
		public TerminalNode DIGIT() { return getToken(RegularExpressionPCREParser.DIGIT, 0); }
		public TerminalNode LATIN() { return getToken(RegularExpressionPCREParser.LATIN, 0); }
		public TerminalNode SPACE() { return getToken(RegularExpressionPCREParser.SPACE, 0); }
		public TerminalNode ALL() { return getToken(RegularExpressionPCREParser.ALL, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionPCREVisitor ) return ((RegularExpressionPCREVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN) | (1L << ALL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u008b\n"+
		"\2\3\2\3\2\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u009c\n\3\3\3\3\3\7\3\u00a0\n\3\f\3\16\3\u00a3\13\3\3\4\3\4"+
		"\3\4\5\4\u00a8\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00bd\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\5\13\u00cb\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\6\17\u00d5\n\17\r\17\16\17\u00d6\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\6\24\u00ed\n\24\r\24\16\24\u00ee\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u0101\n\27\r\27\16"+
		"\27\u0102\3\30\3\30\3\30\6\30\u0108\n\30\r\30\16\30\u0109\3\31\3\31\5"+
		"\31\u010e\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u011d\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\6$\u0135\n$\r$\16$\u0136\3%\6%\u013a"+
		"\n%\r%\16%\u013b\3&\6&\u013f\n&\r&\16&\u0140\3\'\3\'\5\'\u0145\n\'\3("+
		"\3(\3(\7(\u014a\n(\f(\16(\u014d\13(\3(\3(\3)\3)\7)\u0153\n)\f)\16)\u0156"+
		"\13)\3)\3)\3*\3*\3*\3*\5*\u015e\n*\3+\3+\5+\u0162\n+\3+\3+\3+\5+\u0167"+
		"\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0179\n-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\5;\u0199\n;\3<\3<\3=\3="+
		"\3=\3=\5=\u01a1\n=\3>\3>\3?\6?\u01a6\n?\r?\16?\u01a7\3@\3@\3@\2\4\2\4"+
		"A\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\5\6\2\b\b\n\20\22\26\31\31\4\2\17\21\31"+
		"\31\4\2\7\7&(\u01ab\2\u008a\3\2\2\2\4\u009b\3\2\2\2\6\u00a7\3\2\2\2\b"+
		"\u00a9\3\2\2\2\n\u00ad\3\2\2\2\f\u00b3\3\2\2\2\16\u00b5\3\2\2\2\20\u00bc"+
		"\3\2\2\2\22\u00c3\3\2\2\2\24\u00ca\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce\3"+
		"\2\2\2\32\u00d0\3\2\2\2\34\u00d2\3\2\2\2\36\u00db\3\2\2\2 \u00e1\3\2\2"+
		"\2\"\u00e4\3\2\2\2$\u00e7\3\2\2\2&\u00ea\3\2\2\2(\u00f4\3\2\2\2*\u00fb"+
		"\3\2\2\2,\u0100\3\2\2\2.\u0104\3\2\2\2\60\u010d\3\2\2\2\62\u010f\3\2\2"+
		"\2\64\u0111\3\2\2\2\66\u0113\3\2\2\28\u011c\3\2\2\2:\u011e\3\2\2\2<\u0120"+
		"\3\2\2\2>\u0122\3\2\2\2@\u0124\3\2\2\2B\u0128\3\2\2\2D\u012d\3\2\2\2F"+
		"\u0134\3\2\2\2H\u0139\3\2\2\2J\u013e\3\2\2\2L\u0144\3\2\2\2N\u0146\3\2"+
		"\2\2P\u0150\3\2\2\2R\u015d\3\2\2\2T\u0161\3\2\2\2V\u0168\3\2\2\2X\u0178"+
		"\3\2\2\2Z\u017a\3\2\2\2\\\u017c\3\2\2\2^\u017e\3\2\2\2`\u0180\3\2\2\2"+
		"b\u0182\3\2\2\2d\u0184\3\2\2\2f\u0186\3\2\2\2h\u0188\3\2\2\2j\u018a\3"+
		"\2\2\2l\u018c\3\2\2\2n\u018e\3\2\2\2p\u0190\3\2\2\2r\u0192\3\2\2\2t\u0198"+
		"\3\2\2\2v\u019a\3\2\2\2x\u01a0\3\2\2\2z\u01a2\3\2\2\2|\u01a5\3\2\2\2~"+
		"\u01a9\3\2\2\2\u0080\u0081\b\2\1\2\u0081\u008b\5.\30\2\u0082\u008b\5*"+
		"\26\2\u0083\u008b\5\60\31\2\u0084\u008b\5\66\34\2\u0085\u008b\5L\'\2\u0086"+
		"\u008b\5V,\2\u0087\u008b\5r:\2\u0088\u008b\5|?\2\u0089\u008b\7)\2\2\u008a"+
		"\u0080\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u0084\3\2"+
		"\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u0090\3\2\2\2\u008c\u008d\f\b"+
		"\2\2\u008d\u008f\5\2\2\t\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\3\3\2\2\2\u0092\u0090\3\2\2\2"+
		"\u0093\u0094\b\3\1\2\u0094\u009c\5\6\4\2\u0095\u009c\5\66\34\2\u0096\u009c"+
		"\5*\26\2\u0097\u009c\5L\'\2\u0098\u009c\5V,\2\u0099\u009c\5r:\2\u009a"+
		"\u009c\5|?\2\u009b\u0093\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2"+
		"\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u00a1\3\2\2\2\u009d\u009e\f\7\2\2\u009e\u00a0\5\4\3\b\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a8\5\b\5\2\u00a5\u00a8"+
		"\5\n\6\2\u00a6\u00a8\5\16\b\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\7\3\2\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab"+
		"\5\2\2\2\u00ab\u00ac\7\26\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\3\2\2\u00ae"+
		"\u00af\5\f\7\2\u00af\u00b0\7\4\2\2\u00b0\u00b1\5\2\2\2\u00b1\u00b2\7\26"+
		"\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\5|?\2\u00b4\r\3\2\2\2\u00b5\u00b6\7"+
		"\5\2\2\u00b6\u00b7\5\2\2\2\u00b7\u00b8\7\26\2\2\u00b8\17\3\2\2\2\u00b9"+
		"\u00bd\5\22\n\2\u00ba\u00bd\5\24\13\2\u00bb\u00bd\5@!\2\u00bc\u00b9\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\21\3\2\2\2\u00be"+
		"\u00c4\5 \21\2\u00bf\u00c4\5\"\22\2\u00c0\u00c4\5$\23\2\u00c1\u00c4\5"+
		"&\24\2\u00c2\u00c4\5(\25\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\23\3\2\2"+
		"\2\u00c5\u00cb\5\26\f\2\u00c6\u00cb\5\30\r\2\u00c7\u00cb\5\32\16\2\u00c8"+
		"\u00cb\5\34\17\2\u00c9\u00cb\5\36\20\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6"+
		"\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\25\3\2\2\2\u00cc\u00cd\7\13\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\7\f\2\2"+
		"\u00cf\31\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1\33\3\2\2\2\u00d2\u00d4\7\r"+
		"\2\2\u00d3\u00d5\7&\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\t"+
		"\2\2\u00d9\u00da\7\16\2\2\u00da\35\3\2\2\2\u00db\u00dc\7\r\2\2\u00dc\u00dd"+
		"\5H%\2\u00dd\u00de\7\t\2\2\u00de\u00df\5J&\2\u00df\u00e0\7\16\2\2\u00e0"+
		"\37\3\2\2\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\7\n\2\2\u00e3!\3\2\2\2\u00e4"+
		"\u00e5\7\f\2\2\u00e5\u00e6\7\n\2\2\u00e6#\3\2\2\2\u00e7\u00e8\7\n\2\2"+
		"\u00e8\u00e9\7\n\2\2\u00e9%\3\2\2\2\u00ea\u00ec\7\r\2\2\u00eb\u00ed\7"+
		"&\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\7\16"+
		"\2\2\u00f2\u00f3\7\n\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\7\r\2\2\u00f5\u00f6"+
		"\5H%\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\5J&\2\u00f8\u00f9\7\16\2\2\u00f9"+
		"\u00fa\7\n\2\2\u00fa)\3\2\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\5,\27\2"+
		"\u00fd\u00fe\7\26\2\2\u00fe+\3\2\2\2\u00ff\u0101\5~@\2\u0100\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"-\3\2\2\2\u0104\u0107\5\4\3\2\u0105\u0106\7\24\2\2\u0106\u0108\5\4\3\2"+
		"\u0107\u0105\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a/\3\2\2\2\u010b\u010e\5\62\32\2\u010c\u010e\5\64\33\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\61\3\2\2\2\u010f\u0110\7\22\2"+
		"\2\u0110\63\3\2\2\2\u0111\u0112\7\23\2\2\u0112\65\3\2\2\2\u0113\u0114"+
		"\58\35\2\u0114\u0115\5\20\t\2\u0115\67\3\2\2\2\u0116\u011d\5\6\4\2\u0117"+
		"\u011d\5L\'\2\u0118\u011d\5V,\2\u0119\u011d\5r:\2\u011a\u011d\5t;\2\u011b"+
		"\u011d\5~@\2\u011c\u0116\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u0118\3\2\2"+
		"\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d9"+
		"\3\2\2\2\u011e\u011f\7\13\2\2\u011f;\3\2\2\2\u0120\u0121\7\f\2\2\u0121"+
		"=\3\2\2\2\u0122\u0123\7\n\2\2\u0123?\3\2\2\2\u0124\u0125\7\r\2\2\u0125"+
		"\u0126\5F$\2\u0126\u0127\7\16\2\2\u0127A\3\2\2\2\u0128\u0129\7\r\2\2\u0129"+
		"\u012a\5F$\2\u012a\u012b\7\t\2\2\u012b\u012c\7\16\2\2\u012cC\3\2\2\2\u012d"+
		"\u012e\7\r\2\2\u012e\u012f\5H%\2\u012f\u0130\7\t\2\2\u0130\u0131\5J&\2"+
		"\u0131\u0132\7\16\2\2\u0132E\3\2\2\2\u0133\u0135\7&\2\2\u0134\u0133\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"G\3\2\2\2\u0138\u013a\7&\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cI\3\2\2\2\u013d\u013f\7&\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141K\3\2\2\2\u0142\u0145\5N(\2\u0143\u0145\5P)\2\u0144\u0142\3"+
		"\2\2\2\u0144\u0143\3\2\2\2\u0145M\3\2\2\2\u0146\u0147\7\17\2\2\u0147\u014b"+
		"\7\22\2\2\u0148\u014a\5R*\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014e\u014f\7\20\2\2\u014fO\3\2\2\2\u0150\u0154\7\17\2\2\u0151\u0153"+
		"\5R*\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\20"+
		"\2\2\u0158Q\3\2\2\2\u0159\u015e\5T+\2\u015a\u015e\5V,\2\u015b\u015e\5"+
		"x=\2\u015c\u015e\5~@\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015c\3\2\2\2\u015eS\3\2\2\2\u015f\u0162\5~@\2\u0160\u0162"+
		"\5x=\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0166\7\21\2\2\u0164\u0167\5~@\2\u0165\u0167\5x=\2\u0166\u0164\3\2\2"+
		"\2\u0166\u0165\3\2\2\2\u0167U\3\2\2\2\u0168\u0169\7\27\2\2\u0169\u016a"+
		"\5X-\2\u016a\u016b\7\30\2\2\u016bW\3\2\2\2\u016c\u0179\5Z.\2\u016d\u0179"+
		"\5\\/\2\u016e\u0179\5^\60\2\u016f\u0179\5`\61\2\u0170\u0179\5b\62\2\u0171"+
		"\u0179\5d\63\2\u0172\u0179\5f\64\2\u0173\u0179\5h\65\2\u0174\u0179\5j"+
		"\66\2\u0175\u0179\5l\67\2\u0176\u0179\5n8\2\u0177\u0179\5p9\2\u0178\u016c"+
		"\3\2\2\2\u0178\u016d\3\2\2\2\u0178\u016e\3\2\2\2\u0178\u016f\3\2\2\2\u0178"+
		"\u0170\3\2\2\2\u0178\u0171\3\2\2\2\u0178\u0172\3\2\2\2\u0178\u0173\3\2"+
		"\2\2\u0178\u0174\3\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179Y\3\2\2\2\u017a\u017b\7\32\2\2\u017b[\3\2\2\2\u017c"+
		"\u017d\7\33\2\2\u017d]\3\2\2\2\u017e\u017f\7\34\2\2\u017f_\3\2\2\2\u0180"+
		"\u0181\7\35\2\2\u0181a\3\2\2\2\u0182\u0183\7\36\2\2\u0183c\3\2\2\2\u0184"+
		"\u0185\7\37\2\2\u0185e\3\2\2\2\u0186\u0187\7 \2\2\u0187g\3\2\2\2\u0188"+
		"\u0189\7!\2\2\u0189i\3\2\2\2\u018a\u018b\7\"\2\2\u018bk\3\2\2\2\u018c"+
		"\u018d\7#\2\2\u018dm\3\2\2\2\u018e\u018f\7$\2\2\u018fo\3\2\2\2\u0190\u0191"+
		"\7%\2\2\u0191q\3\2\2\2\u0192\u0193\7\b\2\2\u0193s\3\2\2\2\u0194\u0195"+
		"\7\31\2\2\u0195\u0199\5v<\2\u0196\u0197\7\31\2\2\u0197\u0199\5~@\2\u0198"+
		"\u0194\3\2\2\2\u0198\u0196\3\2\2\2\u0199u\3\2\2\2\u019a\u019b\t\2\2\2"+
		"\u019bw\3\2\2\2\u019c\u019d\7\31\2\2\u019d\u01a1\5z>\2\u019e\u019f\7\31"+
		"\2\2\u019f\u01a1\5~@\2\u01a0\u019c\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1y"+
		"\3\2\2\2\u01a2\u01a3\t\3\2\2\u01a3{\3\2\2\2\u01a4\u01a6\5~@\2\u01a5\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"}\3\2\2\2\u01a9\u01aa\t\4\2\2\u01aa\177\3\2\2\2\35\u008a\u0090\u009b\u00a1"+
		"\u00a7\u00bc\u00c3\u00ca\u00d6\u00ee\u0102\u0109\u010d\u011c\u0136\u013b"+
		"\u0140\u0144\u014b\u0154\u015d\u0161\u0166\u0178\u0198\u01a0\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}