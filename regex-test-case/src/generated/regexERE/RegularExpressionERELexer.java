package generated.regexERE;

// Generated from RegularExpressionERE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularExpressionERELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, QUESTION=2, PLUS=3, ASTERISC=4, CURLYOPEN=5, CURLYCLOSE=6, BRACKETOPEN=7, 
		BRACKETCLOSE=8, DASH=9, CIRCUMFLEX=10, PIPE=11, OPEN=12, CLOSE=13, SPACE=14, 
		DIGIT=15, LATIN=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", "BRACKETOPEN", 
		"BRACKETCLOSE", "DASH", "CIRCUMFLEX", "PIPE", "OPEN", "CLOSE", "SPACE", 
		"DIGIT", "LATIN", "WS"
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


	public RegularExpressionERELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegularExpressionERE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\3\2\62;\4\2C\\c|\4\2\13"+
		"\f\17\17H\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2"+
		"\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\25\67\3\2\2\2\27"+
		"9\3\2\2\2\31;\3\2\2\2\33=\3\2\2\2\35?\3\2\2\2\37A\3\2\2\2!C\3\2\2\2#E"+
		"\3\2\2\2%&\7.\2\2&\4\3\2\2\2\'(\7A\2\2(\6\3\2\2\2)*\7-\2\2*\b\3\2\2\2"+
		"+,\7,\2\2,\n\3\2\2\2-.\7}\2\2.\f\3\2\2\2/\60\7\177\2\2\60\16\3\2\2\2\61"+
		"\62\7]\2\2\62\20\3\2\2\2\63\64\7_\2\2\64\22\3\2\2\2\65\66\7/\2\2\66\24"+
		"\3\2\2\2\678\7`\2\28\26\3\2\2\29:\7~\2\2:\30\3\2\2\2;<\7*\2\2<\32\3\2"+
		"\2\2=>\7+\2\2>\34\3\2\2\2?@\7\"\2\2@\36\3\2\2\2AB\t\2\2\2B \3\2\2\2CD"+
		"\t\3\2\2D\"\3\2\2\2EF\t\4\2\2FG\3\2\2\2GH\b\22\2\2H$\3\2\2\2\3\2\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}