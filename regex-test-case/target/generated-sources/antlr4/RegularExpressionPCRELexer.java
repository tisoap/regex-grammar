// Generated from RegularExpressionPCRE.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularExpressionPCRELexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NAMESTART", "NAMEEND", "NOCAPTUREGROUP", "COMMENT", "SPACE", "DOT", "COMMA", 
		"QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", "BRACKETOPEN", 
		"BRACKETCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", "PIPE", "OPEN", "CLOSE", 
		"CLASSOPEN", "CLASSCLOSE", "REVERSESOLIDUS", "ALNUM", "ALPHA", "BLANK", 
		"CNTRL", "DIGITCLASS", "GRAPH", "LOWER", "PRINT", "PUNCT", "SPACECLASS", 
		"UPPER", "XDIGIT", "DIGIT", "LATIN", "ALL", "WS"
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


	public RegularExpressionPCRELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegularExpressionPCRE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3("+
		"\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\6\3\2\62;\4\2C\\c|\3\2\2\1\4\2\13"+
		"\f\17\17\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2"+
		"\2\5U\3\2\2\2\7W\3\2\2\2\t[\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2"+
		"\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2"+
		"\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}"+
		"\3\2\2\2+\177\3\2\2\2-\u0082\3\2\2\2/\u0085\3\2\2\2\61\u0087\3\2\2\2\63"+
		"\u008d\3\2\2\2\65\u0093\3\2\2\2\67\u0099\3\2\2\29\u009f\3\2\2\2;\u00a5"+
		"\3\2\2\2=\u00ab\3\2\2\2?\u00b1\3\2\2\2A\u00b7\3\2\2\2C\u00bd\3\2\2\2E"+
		"\u00c3\3\2\2\2G\u00c9\3\2\2\2I\u00d0\3\2\2\2K\u00d2\3\2\2\2M\u00d4\3\2"+
		"\2\2O\u00d6\3\2\2\2QR\7*\2\2RS\7A\2\2ST\7>\2\2T\4\3\2\2\2UV\7@\2\2V\6"+
		"\3\2\2\2WX\7*\2\2XY\7A\2\2YZ\7<\2\2Z\b\3\2\2\2[\\\7*\2\2\\]\7A\2\2]^\7"+
		"%\2\2^\n\3\2\2\2_`\7\"\2\2`\f\3\2\2\2ab\7\60\2\2b\16\3\2\2\2cd\7.\2\2"+
		"d\20\3\2\2\2ef\7A\2\2f\22\3\2\2\2gh\7-\2\2h\24\3\2\2\2ij\7,\2\2j\26\3"+
		"\2\2\2kl\7}\2\2l\30\3\2\2\2mn\7\177\2\2n\32\3\2\2\2op\7]\2\2p\34\3\2\2"+
		"\2qr\7_\2\2r\36\3\2\2\2st\7/\2\2t \3\2\2\2uv\7`\2\2v\"\3\2\2\2wx\7&\2"+
		"\2x$\3\2\2\2yz\7~\2\2z&\3\2\2\2{|\7*\2\2|(\3\2\2\2}~\7+\2\2~*\3\2\2\2"+
		"\177\u0080\7]\2\2\u0080\u0081\7<\2\2\u0081,\3\2\2\2\u0082\u0083\7<\2\2"+
		"\u0083\u0084\7_\2\2\u0084.\3\2\2\2\u0085\u0086\7^\2\2\u0086\60\3\2\2\2"+
		"\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7p\2\2\u008a\u008b"+
		"\7w\2\2\u008b\u008c\7o\2\2\u008c\62\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f"+
		"\7n\2\2\u008f\u0090\7r\2\2\u0090\u0091\7j\2\2\u0091\u0092\7c\2\2\u0092"+
		"\64\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7n\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7p\2\2\u0097\u0098\7m\2\2\u0098\66\3\2\2\2\u0099\u009a\7e\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d\u009e\7n\2\2"+
		"\u009e8\3\2\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7i\2"+
		"\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7v\2\2\u00a4:\3\2\2\2\u00a5\u00a6\7"+
		"i\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa"+
		"\7j\2\2\u00aa<\3\2\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae"+
		"\7y\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7t\2\2\u00b0>\3\2\2\2\u00b1\u00b2"+
		"\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6@\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7v\2\2\u00bcB\3\2\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7e\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2D\3\2\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7r\2"+
		"\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2\u00c8F\3\2"+
		"\2\2\u00c9\u00ca\7z\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd"+
		"\7i\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7v\2\2\u00cfH\3\2\2\2\u00d0\u00d1"+
		"\t\2\2\2\u00d1J\3\2\2\2\u00d2\u00d3\t\3\2\2\u00d3L\3\2\2\2\u00d4\u00d5"+
		"\t\4\2\2\u00d5N\3\2\2\2\u00d6\u00d7\t\5\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\b(\2\2\u00d9P\3\2\2\2\3\2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}