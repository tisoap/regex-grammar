package gerado;

// Generated from LexicalRegularExpressionsERE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexicalRegularExpressionsERE extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, DOT=2, COMMA=3, QUESTION=4, PLUS=5, ASTERISC=6, CURLYOPEN=7, 
		CURLYCLOSE=8, LISTOPEN=9, LISTCLOSE=10, DASH=11, CIRCUMFLEX=12, DOLAR=13, 
		PIPE=14, OPEN=15, CLOSE=16, REVERSESOLIDUS=17, DIGIT=18, LATIN=19, CLASSOPEN=20, 
		OTHER=21, WS=22, DIGITCLASS=23, SPACECLASS=24, ALNUM=25, ALPHA=26, BLANK=27, 
		CNTRL=28, GRAPH=29, LOWER=30, PRINT=31, PUNCT=32, UPPER=33, XDIGIT=34, 
		CLASSCLOSE=35;
	public static final int CLASS = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CLASS"
	};

	public static final String[] ruleNames = {
		"SPACE", "DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", 
		"CURLYCLOSE", "LISTOPEN", "LISTCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", 
		"PIPE", "OPEN", "CLOSE", "REVERSESOLIDUS", "DIGIT", "LATIN", "CLASSOPEN", 
		"OTHER", "WS", "DIGITCLASS", "SPACECLASS", "ALNUM", "ALPHA", "BLANK", 
		"CNTRL", "GRAPH", "LOWER", "PRINT", "PUNCT", "UPPER", "XDIGIT", "CLASSCLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'.'", "','", "'?'", "'+'", "'*'", "'{'", "'}'", "'['", "']'", 
		"'-'", "'^'", "'$'", "'|'", "'('", "')'", "'\\'", null, null, "'[:'", 
		null, null, "'digit'", "'space'", "'alnum'", "'alpha'", "'blank'", "'cntrl'", 
		"'graph'", "'lower'", "'print'", "'punct'", "'upper'", "'xdigit'", "':]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", 
		"CURLYCLOSE", "LISTOPEN", "LISTCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", 
		"PIPE", "OPEN", "CLOSE", "REVERSESOLIDUS", "DIGIT", "LATIN", "CLASSOPEN", 
		"OTHER", "WS", "DIGITCLASS", "SPACECLASS", "ALNUM", "ALPHA", "BLANK", 
		"CNTRL", "GRAPH", "LOWER", "PRINT", "PUNCT", "UPPER", "XDIGIT", "CLASSCLOSE"
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


	public LexicalRegularExpressionsERE(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexicalRegularExpressionsERE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00c9\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\2\2%\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31"+
		"\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$H%\4\2\3\6\3\2\62;\4\2C\\c|\4"+
		"\2\2!\u0081\u00a1\4\2\13\f\17\17\u00c7\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2"+
		"\2\2\2,\3\2\2\2\2.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66"+
		"\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2"+
		"\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2"+
		"\nP\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2"+
		"\26\\\3\2\2\2\30^\3\2\2\2\32`\3\2\2\2\34b\3\2\2\2\36d\3\2\2\2 f\3\2\2"+
		"\2\"h\3\2\2\2$j\3\2\2\2&l\3\2\2\2(n\3\2\2\2*p\3\2\2\2,u\3\2\2\2.w\3\2"+
		"\2\2\60{\3\2\2\2\62\u0081\3\2\2\2\64\u0087\3\2\2\2\66\u008d\3\2\2\28\u0093"+
		"\3\2\2\2:\u0099\3\2\2\2<\u009f\3\2\2\2>\u00a5\3\2\2\2@\u00ab\3\2\2\2B"+
		"\u00b1\3\2\2\2D\u00b7\3\2\2\2F\u00bd\3\2\2\2H\u00c4\3\2\2\2JK\7\"\2\2"+
		"K\5\3\2\2\2LM\7\60\2\2M\7\3\2\2\2NO\7.\2\2O\t\3\2\2\2PQ\7A\2\2Q\13\3\2"+
		"\2\2RS\7-\2\2S\r\3\2\2\2TU\7,\2\2U\17\3\2\2\2VW\7}\2\2W\21\3\2\2\2XY\7"+
		"\177\2\2Y\23\3\2\2\2Z[\7]\2\2[\25\3\2\2\2\\]\7_\2\2]\27\3\2\2\2^_\7/\2"+
		"\2_\31\3\2\2\2`a\7`\2\2a\33\3\2\2\2bc\7&\2\2c\35\3\2\2\2de\7~\2\2e\37"+
		"\3\2\2\2fg\7*\2\2g!\3\2\2\2hi\7+\2\2i#\3\2\2\2jk\7^\2\2k%\3\2\2\2lm\t"+
		"\2\2\2m\'\3\2\2\2no\t\3\2\2o)\3\2\2\2pq\7]\2\2qr\7<\2\2rs\3\2\2\2st\b"+
		"\25\2\2t+\3\2\2\2uv\n\4\2\2v-\3\2\2\2wx\t\5\2\2xy\3\2\2\2yz\b\27\3\2z"+
		"/\3\2\2\2{|\7f\2\2|}\7k\2\2}~\7i\2\2~\177\7k\2\2\177\u0080\7v\2\2\u0080"+
		"\61\3\2\2\2\u0081\u0082\7u\2\2\u0082\u0083\7r\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\63\3\2\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7p\2\2\u008a\u008b\7w\2\2\u008b\u008c\7o\2\2"+
		"\u008c\65\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7"+
		"r\2\2\u0090\u0091\7j\2\2\u0091\u0092\7c\2\2\u0092\67\3\2\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7n\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7m\2\2\u00989\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d\u009e\7n\2\2\u009e;\3\2\2\2\u009f"+
		"\u00a0\7i\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7r\2\2"+
		"\u00a3\u00a4\7j\2\2\u00a4=\3\2\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7q\2"+
		"\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa?\3\2"+
		"\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b0\7v\2\2\u00b0A\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3"+
		"\7w\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"C\3\2\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7r\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bcE\3\2\2\2\u00bd\u00be\7z\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7k\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3G\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5\u00c6\7_\2"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b$\4\2\u00c8I\3\2\2\2\4\2\3\5\4\3\2"+
		"\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}