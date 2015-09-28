package generated;

// Generated from RegularExpressionERELexer.g4 by ANTLR 4.5
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
		DOT=1, COMMA=2, QUESTION=3, PLUS=4, ASTERISC=5, CURLYOPEN=6, CURLYCLOSE=7, 
		LISTOPEN=8, LISTCLOSE=9, DASH=10, CIRCUMFLEX=11, DOLAR=12, PIPE=13, GROUPOPEN=14, 
		GROUPCLOSE=15, ESCAPE=16, DIGIT=17, CLASSOPEN=18, OTHER=19, WS=20, DIGITCLASS=21, 
		SPACECLASS=22, ALNUM=23, ALPHA=24, BLANK=25, CNTRL=26, GRAPH=27, LOWER=28, 
		PRINT=29, PUNCT=30, UPPER=31, XDIGIT=32, ERRORCLASS=33, CLASSCLOSE=34;
	public static final int CLASS = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CLASS"
	};

	public static final String[] ruleNames = {
		"DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", 
		"LISTOPEN", "LISTCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", "PIPE", "GROUPOPEN", 
		"GROUPCLOSE", "ESCAPE", "DIGIT", "CLASSOPEN", "OTHER", "WS", "DIGITCLASS", 
		"SPACECLASS", "ALNUM", "ALPHA", "BLANK", "CNTRL", "GRAPH", "LOWER", "PRINT", 
		"PUNCT", "UPPER", "XDIGIT", "ERRORCLASS", "CLASSCLOSE"
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


	public RegularExpressionERELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegularExpressionERELexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00c5\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3#\3#\3#\3#\3#\2\2$\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31"+
		"\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$\4\2\3\5\3\2\62;\2\2\4\2\2!\u0081"+
		"\u00a1\u00c3\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2"+
		"\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2"+
		"\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2"+
		"\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2"+
		"\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2"+
		"\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2"+
		"\4H\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20"+
		"T\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2\30\\\3\2\2\2\32^\3\2\2\2"+
		"\34`\3\2\2\2\36b\3\2\2\2 d\3\2\2\2\"f\3\2\2\2$h\3\2\2\2&j\3\2\2\2(o\3"+
		"\2\2\2*q\3\2\2\2,u\3\2\2\2.{\3\2\2\2\60\u0081\3\2\2\2\62\u0087\3\2\2\2"+
		"\64\u008d\3\2\2\2\66\u0093\3\2\2\28\u0099\3\2\2\2:\u009f\3\2\2\2<\u00a5"+
		"\3\2\2\2>\u00ab\3\2\2\2@\u00b1\3\2\2\2B\u00b7\3\2\2\2D\u00be\3\2\2\2F"+
		"\u00c0\3\2\2\2HI\7\60\2\2I\5\3\2\2\2JK\7.\2\2K\7\3\2\2\2LM\7A\2\2M\t\3"+
		"\2\2\2NO\7-\2\2O\13\3\2\2\2PQ\7,\2\2Q\r\3\2\2\2RS\7}\2\2S\17\3\2\2\2T"+
		"U\7\177\2\2U\21\3\2\2\2VW\7]\2\2W\23\3\2\2\2XY\7_\2\2Y\25\3\2\2\2Z[\7"+
		"/\2\2[\27\3\2\2\2\\]\7`\2\2]\31\3\2\2\2^_\7&\2\2_\33\3\2\2\2`a\7~\2\2"+
		"a\35\3\2\2\2bc\7*\2\2c\37\3\2\2\2de\7+\2\2e!\3\2\2\2fg\7^\2\2g#\3\2\2"+
		"\2hi\t\2\2\2i%\3\2\2\2jk\7]\2\2kl\7<\2\2lm\3\2\2\2mn\b\23\2\2n\'\3\2\2"+
		"\2op\n\3\2\2p)\3\2\2\2qr\t\4\2\2rs\3\2\2\2st\b\25\3\2t+\3\2\2\2uv\7f\2"+
		"\2vw\7k\2\2wx\7i\2\2xy\7k\2\2yz\7v\2\2z-\3\2\2\2{|\7u\2\2|}\7r\2\2}~\7"+
		"c\2\2~\177\7e\2\2\177\u0080\7g\2\2\u0080/\3\2\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7p\2\2\u0084\u0085\7w\2\2\u0085\u0086\7o\2\2"+
		"\u0086\61\3\2\2\2\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7"+
		"r\2\2\u008a\u008b\7j\2\2\u008b\u008c\7c\2\2\u008c\63\3\2\2\2\u008d\u008e"+
		"\7d\2\2\u008e\u008f\7n\2\2\u008f\u0090\7c\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7m\2\2\u0092\65\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7n\2\2\u0098\67\3\2\2\2\u0099"+
		"\u009a\7i\2\2\u009a\u009b\7t\2\2\u009b\u009c\7c\2\2\u009c\u009d\7r\2\2"+
		"\u009d\u009e\7j\2\2\u009e9\3\2\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7q\2"+
		"\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7t\2\2\u00a4;\3\2"+
		"\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7v\2\2\u00aa=\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad"+
		"\7w\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"?\3\2\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7r\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7t\2\2\u00b6A\3\2\2\2\u00b7\u00b8\7z\2\2\u00b8"+
		"\u00b9\7f\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7k\2\2"+
		"\u00bc\u00bd\7v\2\2\u00bdC\3\2\2\2\u00be\u00bf\n\3\2\2\u00bfE\3\2\2\2"+
		"\u00c0\u00c1\7<\2\2\u00c1\u00c2\7_\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\b#\4\2\u00c4G\3\2\2\2\4\2\3\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}