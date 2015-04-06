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
		COMMA=1, QUESTION=2, PLUS=3, ASTERISC=4, CURLYOPEN=5, CURLYCLOSE=6, BRACKETOPEN=7, 
		BRACKETCLOSE=8, DASH=9, CIRCUMFLEX=10, PIPE=11, OPEN=12, CLOSE=13, SPACE=14, 
		DIGIT=15, LATIN=16, WS=17;
	public static final int
		RULE_expression = 0, RULE_multiple = 1, RULE_subExpression = 2, RULE_group = 3, 
		RULE_numericalGroup = 4, RULE_repetition = 5, RULE_quantified = 6, RULE_quantifier = 7, 
		RULE_oneOrMore = 8, RULE_zeroOrMore = 9, RULE_conditional = 10, RULE_exact = 11, 
		RULE_atLeast = 12, RULE_between = 13, RULE_value = 14, RULE_firstValue = 15, 
		RULE_lastValue = 16, RULE_list = 17, RULE_negativeList = 18, RULE_positiveList = 19, 
		RULE_range = 20, RULE_characters = 21, RULE_character = 22;
	public static final String[] ruleNames = {
		"expression", "multiple", "subExpression", "group", "numericalGroup", 
		"repetition", "quantified", "quantifier", "oneOrMore", "zeroOrMore", "conditional", 
		"exact", "atLeast", "between", "value", "firstValue", "lastValue", "list", 
		"negativeList", "positiveList", "range", "characters", "character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'?'", "'+'", "'*'", "'{'", "'}'", "'['", "']'", "'-'", "'^'", 
		"'|'", "'('", "')'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", 
		"BRACKETOPEN", "BRACKETCLOSE", "DASH", "CIRCUMFLEX", "PIPE", "OPEN", "CLOSE", 
		"SPACE", "DIGIT", "LATIN", "WS"
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

	public RegularExpressionEREParser(TokenStream input) {
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(47);
				multiple();
				}
				break;
			case 2:
				{
				setState(48);
				group();
				}
				break;
			case 3:
				{
				setState(49);
				repetition();
				}
				break;
			case 4:
				{
				setState(50);
				list();
				}
				break;
			case 5:
				{
				setState(51);
				characters();
				}
				break;
			case 6:
				{
				setState(52);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
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
					setState(55);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(56);
					expression(5);
					}
					} 
				}
				setState(61);
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
			setState(62);
			subExpression(0);
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(63);
					match(PIPE);
					setState(64);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
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
		public RepetitionContext repetition() {
			return getRuleContext(RepetitionContext.class,0);
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
		SubExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_subExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(70);
				group();
				}
				break;
			case 2:
				{
				setState(71);
				repetition();
				}
				break;
			case 3:
				{
				setState(72);
				list();
				}
				break;
			case 4:
				{
				setState(73);
				characters();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
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
					setState(76);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(77);
					subExpression(4);
					}
					} 
				}
				setState(82);
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
		public NumericalGroupContext numericalGroup() {
			return getRuleContext(NumericalGroupContext.class,0);
		}
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
			setState(83);
			numericalGroup();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN() { return getToken(RegularExpressionEREParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionEREParser.CLOSE, 0); }
		public NumericalGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).enterNumericalGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionEREListener ) ((RegularExpressionEREListener)listener).exitNumericalGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionEREVisitor ) return ((RegularExpressionEREVisitor<? extends T>)visitor).visitNumericalGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalGroupContext numericalGroup() throws RecognitionException {
		NumericalGroupContext _localctx = new NumericalGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numericalGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OPEN);
			setState(86);
			expression(0);
			setState(87);
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
		enterRule(_localctx, 10, RULE_repetition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			quantified();
			setState(90);
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
		enterRule(_localctx, 12, RULE_quantified);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				group();
				}
				break;
			case BRACKETOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				list();
				}
				break;
			case SPACE:
			case DIGIT:
			case LATIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
		enterRule(_localctx, 14, RULE_quantifier);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				oneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				zeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				exact();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				atLeast();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
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
		enterRule(_localctx, 16, RULE_oneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 18, RULE_zeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 20, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 22, RULE_exact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(CURLYOPEN);
			setState(112);
			value();
			setState(113);
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
		enterRule(_localctx, 24, RULE_atLeast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CURLYOPEN);
			setState(116);
			value();
			setState(117);
			match(COMMA);
			setState(118);
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
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionEREParser.CURLYOPEN, 0); }
		public FirstValueContext firstValue() {
			return getRuleContext(FirstValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionEREParser.COMMA, 0); }
		public LastValueContext lastValue() {
			return getRuleContext(LastValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionEREParser.CURLYCLOSE, 0); }
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
		enterRule(_localctx, 26, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CURLYOPEN);
			setState(121);
			firstValue();
			setState(122);
			match(COMMA);
			setState(123);
			lastValue();
			setState(124);
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
		enterRule(_localctx, 28, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				match(DIGIT);
				}
				}
				setState(129); 
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
		enterRule(_localctx, 30, RULE_firstValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(DIGIT);
				}
				}
				setState(134); 
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
		enterRule(_localctx, 32, RULE_lastValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(DIGIT);
				}
				}
				setState(139); 
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
		enterRule(_localctx, 34, RULE_list);
		try {
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				negativeList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
		public TerminalNode BRACKETOPEN() { return getToken(RegularExpressionEREParser.BRACKETOPEN, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(RegularExpressionEREParser.CIRCUMFLEX, 0); }
		public TerminalNode BRACKETCLOSE() { return getToken(RegularExpressionEREParser.BRACKETCLOSE, 0); }
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
		enterRule(_localctx, 36, RULE_negativeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(BRACKETOPEN);
			setState(146);
			match(CIRCUMFLEX);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(149);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(147);
					characters();
					}
					break;
				case 2:
					{
					setState(148);
					range();
					}
					break;
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(153);
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
		public TerminalNode BRACKETOPEN() { return getToken(RegularExpressionEREParser.BRACKETOPEN, 0); }
		public TerminalNode BRACKETCLOSE() { return getToken(RegularExpressionEREParser.BRACKETCLOSE, 0); }
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
		enterRule(_localctx, 38, RULE_positiveList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(BRACKETOPEN);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(158);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(156);
					characters();
					}
					break;
				case 2:
					{
					setState(157);
					range();
					}
					break;
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << DIGIT) | (1L << LATIN))) != 0) );
			setState(162);
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
		public TerminalNode DASH() { return getToken(RegularExpressionEREParser.DASH, 0); }
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
		enterRule(_localctx, 40, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			character();
			setState(165);
			match(DASH);
			setState(166);
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
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionEREParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionEREParser.DIGIT, i);
		}
		public List<TerminalNode> LATIN() { return getTokens(RegularExpressionEREParser.LATIN); }
		public TerminalNode LATIN(int i) {
			return getToken(RegularExpressionEREParser.LATIN, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(RegularExpressionEREParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(RegularExpressionEREParser.SPACE, i);
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
		enterRule(_localctx, 42, RULE_characters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(168);
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
				setState(171); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode LATIN() { return getToken(RegularExpressionEREParser.LATIN, 0); }
		public TerminalNode SPACE() { return getToken(RegularExpressionEREParser.SPACE, 0); }
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
		enterRule(_localctx, 44, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		case 2:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\28\n\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3\3\3\3"+
		"\3\6\3D\n\3\r\3\16\3E\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\7\4Q\n\4\f"+
		"\4\16\4T\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\bb\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20"+
		"\u0082\n\20\r\20\16\20\u0083\3\21\6\21\u0087\n\21\r\21\16\21\u0088\3\22"+
		"\6\22\u008c\n\22\r\22\16\22\u008d\3\23\3\23\5\23\u0092\n\23\3\24\3\24"+
		"\3\24\3\24\6\24\u0098\n\24\r\24\16\24\u0099\3\24\3\24\3\25\3\25\3\25\6"+
		"\25\u00a1\n\25\r\25\16\25\u00a2\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27"+
		"\u00ac\n\27\r\27\16\27\u00ad\3\30\3\30\3\30\2\4\2\6\31\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\20\22\u00b5\2\67\3\2\2\2\4@"+
		"\3\2\2\2\6L\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\f[\3\2\2\2\16a\3\2\2\2\20i\3"+
		"\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32u\3\2\2\2\34"+
		"z\3\2\2\2\36\u0081\3\2\2\2 \u0086\3\2\2\2\"\u008b\3\2\2\2$\u0091\3\2\2"+
		"\2&\u0093\3\2\2\2(\u009d\3\2\2\2*\u00a6\3\2\2\2,\u00ab\3\2\2\2.\u00af"+
		"\3\2\2\2\60\61\b\2\1\2\618\5\4\3\2\628\5\b\5\2\638\5\f\7\2\648\5$\23\2"+
		"\658\5,\27\2\668\7\23\2\2\67\60\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67"+
		"\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28=\3\2\2\29:\f\6\2\2:<\5\2\2\7"+
		";9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@C\5\6\4"+
		"\2AB\7\r\2\2BD\5\6\4\2CA\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2"+
		"\2\2GH\b\4\1\2HM\5\b\5\2IM\5\f\7\2JM\5$\23\2KM\5,\27\2LG\3\2\2\2LI\3\2"+
		"\2\2LJ\3\2\2\2LK\3\2\2\2MR\3\2\2\2NO\f\5\2\2OQ\5\6\4\6PN\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TR\3\2\2\2UV\5\n\6\2V\t\3\2\2\2WX\7"+
		"\16\2\2XY\5\2\2\2YZ\7\17\2\2Z\13\3\2\2\2[\\\5\16\b\2\\]\5\20\t\2]\r\3"+
		"\2\2\2^b\5\b\5\2_b\5$\23\2`b\5.\30\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\17"+
		"\3\2\2\2cj\5\22\n\2dj\5\24\13\2ej\5\26\f\2fj\5\30\r\2gj\5\32\16\2hj\5"+
		"\34\17\2ic\3\2\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j"+
		"\21\3\2\2\2kl\7\5\2\2l\23\3\2\2\2mn\7\6\2\2n\25\3\2\2\2op\7\4\2\2p\27"+
		"\3\2\2\2qr\7\7\2\2rs\5\36\20\2st\7\b\2\2t\31\3\2\2\2uv\7\7\2\2vw\5\36"+
		"\20\2wx\7\3\2\2xy\7\b\2\2y\33\3\2\2\2z{\7\7\2\2{|\5 \21\2|}\7\3\2\2}~"+
		"\5\"\22\2~\177\7\b\2\2\177\35\3\2\2\2\u0080\u0082\7\21\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\37\3\2\2\2\u0085\u0087\7\21\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089!\3\2\2\2\u008a\u008c"+
		"\7\21\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e#\3\2\2\2\u008f\u0092\5&\24\2\u0090\u0092\5"+
		"(\25\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092%\3\2\2\2\u0093\u0094"+
		"\7\t\2\2\u0094\u0097\7\f\2\2\u0095\u0098\5,\27\2\u0096\u0098\5*\26\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\n\2\2\u009c"+
		"\'\3\2\2\2\u009d\u00a0\7\t\2\2\u009e\u00a1\5,\27\2\u009f\u00a1\5*\26\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\n\2\2\u00a5"+
		")\3\2\2\2\u00a6\u00a7\5.\30\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\5.\30\2"+
		"\u00a9+\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae-\3\2\2\2\u00af\u00b0"+
		"\t\2\2\2\u00b0/\3\2\2\2\22\67=ELRai\u0083\u0088\u008d\u0091\u0097\u0099"+
		"\u00a0\u00a2\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}