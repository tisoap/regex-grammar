package regexGrammar;

// Generated from RegularExpression.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, QUESTION=2, PLUS=3, ASTERISC=4, CURLYOPEN=5, CURLYCLOSE=6, DIGIT=7, 
		PIPE=8, NAMESTART=9, NAMEEND=10, NUMERICALGROUP=11, NOCAPTUREGROUP=12, 
		COMMENT=13, CLOSE=14, CHAR=15, WS=16;
	public static final int
		RULE_expression = 0, RULE_multiple = 1, RULE_subExpression = 2, RULE_group = 3, 
		RULE_numericalGroup = 4, RULE_namedGroup = 5, RULE_groupName = 6, RULE_noCaptureGroup = 7, 
		RULE_repetition = 8, RULE_quantified = 9, RULE_quantifier = 10, RULE_lazy = 11, 
		RULE_greedy = 12, RULE_exact = 13, RULE_greedyOneOrMore = 14, RULE_greedyZeroOrMore = 15, 
		RULE_greedyConditional = 16, RULE_greedyAtLeast = 17, RULE_greedyBetween = 18, 
		RULE_lazyOneOrMore = 19, RULE_lazyZeroOrMore = 20, RULE_lazyConditional = 21, 
		RULE_lazyAtLeast = 22, RULE_lazyBetween = 23, RULE_value = 24, RULE_firstValue = 25, 
		RULE_lastValue = 26, RULE_comment = 27, RULE_commentText = 28, RULE_characters = 29, 
		RULE_character = 30;
	public static final String[] ruleNames = {
		"expression", "multiple", "subExpression", "group", "numericalGroup", 
		"namedGroup", "groupName", "noCaptureGroup", "repetition", "quantified", 
		"quantifier", "lazy", "greedy", "exact", "greedyOneOrMore", "greedyZeroOrMore", 
		"greedyConditional", "greedyAtLeast", "greedyBetween", "lazyOneOrMore", 
		"lazyZeroOrMore", "lazyConditional", "lazyAtLeast", "lazyBetween", "value", 
		"firstValue", "lastValue", "comment", "commentText", "characters", "character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'?'", "'+'", "'*'", "'{'", "'}'", null, "'|'", "'(?<'", 
		"'>'", "'('", "'(?:'", "'(?#'", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", 
		"DIGIT", "PIPE", "NAMESTART", "NAMEEND", "NUMERICALGROUP", "NOCAPTUREGROUP", 
		"COMMENT", "CLOSE", "CHAR", "WS"
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
	public String getGrammarFileName() { return "RegularExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegularExpressionParser(TokenStream input) {
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
		public CharactersContext characters() {
			return getRuleContext(CharactersContext.class,0);
		}
		public TerminalNode WS() { return getToken(RegularExpressionParser.WS, 0); }
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(63);
				multiple();
				}
				break;
			case 2:
				{
				setState(64);
				group();
				}
				break;
			case 3:
				{
				setState(65);
				repetition();
				}
				break;
			case 4:
				{
				setState(66);
				comment();
				}
				break;
			case 5:
				{
				setState(67);
				characters();
				}
				break;
			case 6:
				{
				setState(68);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
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
					setState(71);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(72);
					expression(4);
					}
					} 
				}
				setState(77);
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
		public List<TerminalNode> PIPE() { return getTokens(RegularExpressionParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(RegularExpressionParser.PIPE, i);
		}
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitMultiple(this);
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
			setState(78);
			subExpression(0);
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					match(PIPE);
					setState(80);
					subExpression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CharactersContext characters() {
			return getRuleContext(CharactersContext.class,0);
		}
		public TerminalNode WS() { return getToken(RegularExpressionParser.WS, 0); }
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitSubExpression(this);
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
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(86);
				group();
				}
				break;
			case 2:
				{
				setState(87);
				repetition();
				}
				break;
			case 3:
				{
				setState(88);
				comment();
				}
				break;
			case 4:
				{
				setState(89);
				characters();
				}
				break;
			case 5:
				{
				setState(90);
				match(WS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
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
					setState(93);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(94);
					subExpression(4);
					}
					} 
				}
				setState(99);
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_group);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case NUMERICALGROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				numericalGroup();
				}
				break;
			case NAMESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				namedGroup();
				}
				break;
			case NOCAPTUREGROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
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
		public TerminalNode NUMERICALGROUP() { return getToken(RegularExpressionParser.NUMERICALGROUP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionParser.CLOSE, 0); }
		public NumericalGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterNumericalGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitNumericalGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitNumericalGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalGroupContext numericalGroup() throws RecognitionException {
		NumericalGroupContext _localctx = new NumericalGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numericalGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(NUMERICALGROUP);
			setState(106);
			expression(0);
			setState(107);
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
		public TerminalNode NAMESTART() { return getToken(RegularExpressionParser.NAMESTART, 0); }
		public GroupNameContext groupName() {
			return getRuleContext(GroupNameContext.class,0);
		}
		public TerminalNode NAMEEND() { return getToken(RegularExpressionParser.NAMEEND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionParser.CLOSE, 0); }
		public NamedGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterNamedGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitNamedGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitNamedGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedGroupContext namedGroup() throws RecognitionException {
		NamedGroupContext _localctx = new NamedGroupContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_namedGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(NAMESTART);
			setState(110);
			groupName();
			setState(111);
			match(NAMEEND);
			setState(112);
			expression(0);
			setState(113);
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
		public List<TerminalNode> CHAR() { return getTokens(RegularExpressionParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(RegularExpressionParser.CHAR, i);
		}
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_groupName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				match(CHAR);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NOCAPTUREGROUP() { return getToken(RegularExpressionParser.NOCAPTUREGROUP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionParser.CLOSE, 0); }
		public NoCaptureGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noCaptureGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterNoCaptureGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitNoCaptureGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitNoCaptureGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoCaptureGroupContext noCaptureGroup() throws RecognitionException {
		NoCaptureGroupContext _localctx = new NoCaptureGroupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_noCaptureGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(NOCAPTUREGROUP);
			setState(121);
			expression(0);
			setState(122);
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterRepetition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitRepetition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitRepetition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionContext repetition() throws RecognitionException {
		RepetitionContext _localctx = new RepetitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_repetition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			quantified();
			setState(125);
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterQuantified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitQuantified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitQuantified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedContext quantified() throws RecognitionException {
		QuantifiedContext _localctx = new QuantifiedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quantified);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case NAMESTART:
			case NUMERICALGROUP:
			case NOCAPTUREGROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				group();
				}
				break;
			case DIGIT:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quantifier);
		try {
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				lazy();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				greedy();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterLazy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitLazy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitLazy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyContext lazy() throws RecognitionException {
		LazyContext _localctx = new LazyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lazy);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				lazyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				lazyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				lazyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				lazyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
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
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGreedy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGreedy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGreedy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyContext greedy() throws RecognitionException {
		GreedyContext _localctx = new GreedyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_greedy);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				greedyOneOrMore();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				greedyZeroOrMore();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				greedyConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				greedyAtLeast();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
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

	public static class ExactContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionParser.CURLYOPEN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionParser.CURLYCLOSE, 0); }
		public ExactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterExact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitExact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitExact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExactContext exact() throws RecognitionException {
		ExactContext _localctx = new ExactContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(CURLYOPEN);
			setState(151);
			value();
			setState(152);
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

	public static class GreedyOneOrMoreContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(RegularExpressionParser.PLUS, 0); }
		public GreedyOneOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyOneOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGreedyOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGreedyOneOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGreedyOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyOneOrMoreContext greedyOneOrMore() throws RecognitionException {
		GreedyOneOrMoreContext _localctx = new GreedyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_greedyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		public TerminalNode ASTERISC() { return getToken(RegularExpressionParser.ASTERISC, 0); }
		public GreedyZeroOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyZeroOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGreedyZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGreedyZeroOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGreedyZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyZeroOrMoreContext greedyZeroOrMore() throws RecognitionException {
		GreedyZeroOrMoreContext _localctx = new GreedyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_greedyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		public TerminalNode QUESTION() { return getToken(RegularExpressionParser.QUESTION, 0); }
		public GreedyConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGreedyConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGreedyConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGreedyConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyConditionalContext greedyConditional() throws RecognitionException {
		GreedyConditionalContext _localctx = new GreedyConditionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_greedyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionParser.CURLYOPEN, 0); }
		public TerminalNode COMMA() { return getToken(RegularExpressionParser.COMMA, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionParser.CURLYCLOSE, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionParser.DIGIT, i);
		}
		public GreedyAtLeastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyAtLeast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGreedyAtLeast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGreedyAtLeast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGreedyAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyAtLeastContext greedyAtLeast() throws RecognitionException {
		GreedyAtLeastContext _localctx = new GreedyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_greedyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CURLYOPEN);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				match(DIGIT);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(166);
			match(COMMA);
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

	public static class GreedyBetweenContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionParser.CURLYOPEN, 0); }
		public FirstValueContext firstValue() {
			return getRuleContext(FirstValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionParser.COMMA, 0); }
		public LastValueContext lastValue() {
			return getRuleContext(LastValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionParser.CURLYCLOSE, 0); }
		public GreedyBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greedyBetween; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterGreedyBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitGreedyBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitGreedyBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreedyBetweenContext greedyBetween() throws RecognitionException {
		GreedyBetweenContext _localctx = new GreedyBetweenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_greedyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CURLYOPEN);
			setState(170);
			firstValue();
			setState(171);
			match(COMMA);
			setState(172);
			lastValue();
			setState(173);
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
		public TerminalNode PLUS() { return getToken(RegularExpressionParser.PLUS, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionParser.QUESTION, 0); }
		public LazyOneOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyOneOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterLazyOneOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitLazyOneOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitLazyOneOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyOneOrMoreContext lazyOneOrMore() throws RecognitionException {
		LazyOneOrMoreContext _localctx = new LazyOneOrMoreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lazyOneOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(PLUS);
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

	public static class LazyZeroOrMoreContext extends ParserRuleContext {
		public TerminalNode ASTERISC() { return getToken(RegularExpressionParser.ASTERISC, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionParser.QUESTION, 0); }
		public LazyZeroOrMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyZeroOrMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterLazyZeroOrMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitLazyZeroOrMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitLazyZeroOrMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyZeroOrMoreContext lazyZeroOrMore() throws RecognitionException {
		LazyZeroOrMoreContext _localctx = new LazyZeroOrMoreContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lazyZeroOrMore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ASTERISC);
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

	public static class LazyConditionalContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(RegularExpressionParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(RegularExpressionParser.QUESTION, i);
		}
		public LazyConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterLazyConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitLazyConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitLazyConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyConditionalContext lazyConditional() throws RecognitionException {
		LazyConditionalContext _localctx = new LazyConditionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lazyConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(QUESTION);
			setState(182);
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
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionParser.CURLYOPEN, 0); }
		public TerminalNode COMMA() { return getToken(RegularExpressionParser.COMMA, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionParser.CURLYCLOSE, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionParser.QUESTION, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionParser.DIGIT, i);
		}
		public LazyAtLeastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyAtLeast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterLazyAtLeast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitLazyAtLeast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitLazyAtLeast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyAtLeastContext lazyAtLeast() throws RecognitionException {
		LazyAtLeastContext _localctx = new LazyAtLeastContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lazyAtLeast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(CURLYOPEN);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				match(DIGIT);
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(190);
			match(COMMA);
			setState(191);
			match(CURLYCLOSE);
			setState(192);
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
		public TerminalNode CURLYOPEN() { return getToken(RegularExpressionParser.CURLYOPEN, 0); }
		public FirstValueContext firstValue() {
			return getRuleContext(FirstValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RegularExpressionParser.COMMA, 0); }
		public LastValueContext lastValue() {
			return getRuleContext(LastValueContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(RegularExpressionParser.CURLYCLOSE, 0); }
		public TerminalNode QUESTION() { return getToken(RegularExpressionParser.QUESTION, 0); }
		public LazyBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyBetween; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterLazyBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitLazyBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitLazyBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyBetweenContext lazyBetween() throws RecognitionException {
		LazyBetweenContext _localctx = new LazyBetweenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lazyBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CURLYOPEN);
			setState(195);
			firstValue();
			setState(196);
			match(COMMA);
			setState(197);
			lastValue();
			setState(198);
			match(CURLYCLOSE);
			setState(199);
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionParser.DIGIT, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(DIGIT);
				}
				}
				setState(204); 
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
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionParser.DIGIT, i);
		}
		public FirstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterFirstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitFirstValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitFirstValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstValueContext firstValue() throws RecognitionException {
		FirstValueContext _localctx = new FirstValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_firstValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				match(DIGIT);
				}
				}
				setState(209); 
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
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionParser.DIGIT, i);
		}
		public LastValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterLastValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitLastValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitLastValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastValueContext lastValue() throws RecognitionException {
		LastValueContext _localctx = new LastValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lastValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(DIGIT);
				}
				}
				setState(214); 
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(RegularExpressionParser.COMMENT, 0); }
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(RegularExpressionParser.CLOSE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(COMMENT);
			setState(217);
			commentText();
			setState(218);
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
		public List<TerminalNode> CHAR() { return getTokens(RegularExpressionParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(RegularExpressionParser.CHAR, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionParser.DIGIT, i);
		}
		public CommentTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterCommentText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitCommentText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitCommentText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentTextContext commentText() throws RecognitionException {
		CommentTextContext _localctx = new CommentTextContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_commentText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==DIGIT || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT || _la==CHAR );
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> CHAR() { return getTokens(RegularExpressionParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(RegularExpressionParser.CHAR, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(RegularExpressionParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RegularExpressionParser.DIGIT, i);
		}
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitCharacters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitCharacters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_characters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(225);
					_la = _input.LA(1);
					if ( !(_la==DIGIT || _la==CHAR) ) {
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
				setState(228); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public TerminalNode CHAR() { return getToken(RegularExpressionParser.CHAR, 0); }
		public TerminalNode DIGIT() { return getToken(RegularExpressionParser.DIGIT, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegularExpressionListener ) ((RegularExpressionListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularExpressionVisitor ) return ((RegularExpressionVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==CHAR) ) {
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
			return precpred(_ctx, 3);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u00eb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2H\n\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3"+
		"\3\3\3\3\6\3T\n\3\r\3\16\3U\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\7"+
		"\4b\n\4\f\4\16\4e\13\4\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\6\bw\n\b\r\b\16\bx\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\5\13\u0084\n\13\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0090\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u00a5\n\23\r\23\16\23"+
		"\u00a6\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\6\30\u00bd\n\30\r\30\16\30\u00be\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u00cd"+
		"\n\32\r\32\16\32\u00ce\3\33\6\33\u00d2\n\33\r\33\16\33\u00d3\3\34\6\34"+
		"\u00d7\n\34\r\34\16\34\u00d8\3\35\3\35\3\35\3\35\3\36\6\36\u00e0\n\36"+
		"\r\36\16\36\u00e1\3\37\6\37\u00e5\n\37\r\37\16\37\u00e6\3 \3 \3 \2\4\2"+
		"\6!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2"+
		"\3\4\2\t\t\21\21\u00ec\2G\3\2\2\2\4P\3\2\2\2\6]\3\2\2\2\bi\3\2\2\2\nk"+
		"\3\2\2\2\fo\3\2\2\2\16v\3\2\2\2\20z\3\2\2\2\22~\3\2\2\2\24\u0083\3\2\2"+
		"\2\26\u0088\3\2\2\2\30\u008f\3\2\2\2\32\u0096\3\2\2\2\34\u0098\3\2\2\2"+
		"\36\u009c\3\2\2\2 \u009e\3\2\2\2\"\u00a0\3\2\2\2$\u00a2\3\2\2\2&\u00ab"+
		"\3\2\2\2(\u00b1\3\2\2\2*\u00b4\3\2\2\2,\u00b7\3\2\2\2.\u00ba\3\2\2\2\60"+
		"\u00c4\3\2\2\2\62\u00cc\3\2\2\2\64\u00d1\3\2\2\2\66\u00d6\3\2\2\28\u00da"+
		"\3\2\2\2:\u00df\3\2\2\2<\u00e4\3\2\2\2>\u00e8\3\2\2\2@A\b\2\1\2AH\5\4"+
		"\3\2BH\5\b\5\2CH\5\22\n\2DH\58\35\2EH\5<\37\2FH\7\22\2\2G@\3\2\2\2GB\3"+
		"\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HM\3\2\2\2IJ\f\5\2\2JL\5"+
		"\2\2\6KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OM\3\2\2\2PS"+
		"\5\6\4\2QR\7\n\2\2RT\5\6\4\2SQ\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V"+
		"\5\3\2\2\2WX\b\4\1\2X^\5\b\5\2Y^\5\22\n\2Z^\58\35\2[^\5<\37\2\\^\7\22"+
		"\2\2]W\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^c\3\2\2\2_`\f"+
		"\5\2\2`b\5\6\4\6a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\7\3\2\2\2ec"+
		"\3\2\2\2fj\5\n\6\2gj\5\f\7\2hj\5\20\t\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2"+
		"j\t\3\2\2\2kl\7\r\2\2lm\5\2\2\2mn\7\20\2\2n\13\3\2\2\2op\7\13\2\2pq\5"+
		"\16\b\2qr\7\f\2\2rs\5\2\2\2st\7\20\2\2t\r\3\2\2\2uw\7\21\2\2vu\3\2\2\2"+
		"wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2z{\7\16\2\2{|\5\2\2\2|}\7\20"+
		"\2\2}\21\3\2\2\2~\177\5\24\13\2\177\u0080\5\26\f\2\u0080\23\3\2\2\2\u0081"+
		"\u0084\5\b\5\2\u0082\u0084\5> \2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\25\3\2\2\2\u0085\u0089\5\30\r\2\u0086\u0089\5\32\16\2\u0087\u0089"+
		"\5\34\17\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\27\3\2\2\2\u008a\u0090\5(\25\2\u008b\u0090\5*\26\2\u008c\u0090"+
		"\5,\27\2\u008d\u0090\5.\30\2\u008e\u0090\5\60\31\2\u008f\u008a\3\2\2\2"+
		"\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\31\3\2\2\2\u0091\u0097\5\36\20\2\u0092\u0097\5 \21\2\u0093"+
		"\u0097\5\"\22\2\u0094\u0097\5$\23\2\u0095\u0097\5&\24\2\u0096\u0091\3"+
		"\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\33\3\2\2\2\u0098\u0099\7\7\2\2\u0099\u009a\5\62\32"+
		"\2\u009a\u009b\7\b\2\2\u009b\35\3\2\2\2\u009c\u009d\7\5\2\2\u009d\37\3"+
		"\2\2\2\u009e\u009f\7\6\2\2\u009f!\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1#\3"+
		"\2\2\2\u00a2\u00a4\7\7\2\2\u00a3\u00a5\7\t\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\7\3\2\2\u00a9\u00aa\7\b\2\2\u00aa%\3\2\2\2\u00ab\u00ac"+
		"\7\7\2\2\u00ac\u00ad\5\64\33\2\u00ad\u00ae\7\3\2\2\u00ae\u00af\5\66\34"+
		"\2\u00af\u00b0\7\b\2\2\u00b0\'\3\2\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3"+
		"\7\4\2\2\u00b3)\3\2\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7\4\2\2\u00b6"+
		"+\3\2\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\7\4\2\2\u00b9-\3\2\2\2\u00ba"+
		"\u00bc\7\7\2\2\u00bb\u00bd\7\t\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\7\3\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\7\4\2\2\u00c3/\3\2\2\2"+
		"\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5\64\33\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8"+
		"\5\66\34\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\7\4\2\2\u00ca\61\3\2\2\2\u00cb"+
		"\u00cd\7\t\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\63\3\2\2\2\u00d0\u00d2\7\t\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\65\3\2\2\2\u00d5\u00d7\7\t\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\67\3\2\2\2\u00da\u00db"+
		"\7\17\2\2\u00db\u00dc\5:\36\2\u00dc\u00dd\7\20\2\2\u00dd9\3\2\2\2\u00de"+
		"\u00e0\t\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2;\3\2\2\2\u00e3\u00e5\t\2\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"=\3\2\2\2\u00e8\u00e9\t\2\2\2\u00e9?\3\2\2\2\24GMU]cix\u0083\u0088\u008f"+
		"\u0096\u00a6\u00be\u00ce\u00d3\u00d8\u00e1\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}