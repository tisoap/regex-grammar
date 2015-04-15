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
		SPACE=1, DOT=2, COMMA=3, QUESTION=4, PLUS=5, ASTERISC=6, CURLYOPEN=7, 
		CURLYCLOSE=8, BRACKETOPEN=9, BRACKETCLOSE=10, DASH=11, CIRCUMFLEX=12, 
		DOLAR=13, PIPE=14, OPEN=15, CLOSE=16, CLASSOPEN=17, CLASSCLOSE=18, REVERSESOLIDUS=19, 
		DIGITCLASS=20, SPACECLASS=21, ALNUM=22, ALPHA=23, BLANK=24, CNTRL=25, 
		GRAPH=26, LOWER=27, PRINT=28, PUNCT=29, UPPER=30, XDIGIT=31, DIGIT=32, 
		LATIN=33, OTHER=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", 
		"CURLYCLOSE", "BRACKETOPEN", "BRACKETCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", 
		"PIPE", "OPEN", "CLOSE", "CLASSOPEN", "CLASSCLOSE", "REVERSESOLIDUS", 
		"DIGITCLASS", "SPACECLASS", "ALNUM", "ALPHA", "BLANK", "CNTRL", "GRAPH", 
		"LOWER", "PRINT", "PUNCT", "UPPER", "XDIGIT", "DIGIT", "LATIN", "OTHER", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'.'", "','", "'?'", "'+'", "'*'", "'{'", "'}'", "'['", "']'", 
		"'-'", "'^'", "'$'", "'|'", "'('", "')'", "'[:'", "':]'", "'\\'", "'digit'", 
		"'space'", "'alnum'", "'alpha'", "'blank'", "'cntrl'", "'graph'", "'lower'", 
		"'print'", "'punct'", "'upper'", "'xdigit'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", 
		"CURLYCLOSE", "BRACKETOPEN", "BRACKETCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", 
		"PIPE", "OPEN", "CLOSE", "CLASSOPEN", "CLASSCLOSE", "REVERSESOLIDUS", 
		"DIGITCLASS", "SPACECLASS", "ALNUM", "ALPHA", "BLANK", "CNTRL", "GRAPH", 
		"LOWER", "PRINT", "PUNCT", "UPPER", "XDIGIT", "DIGIT", "LATIN", "OTHER", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\3\2\62;\4\2C\\c|\n"+
		"\2&&*-\60\60\62;AAC`c|~~\4\2\13\f\17\17\u00c3\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2"+
		"\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2"+
		"\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2"+
		"\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%l\3\2\2\2\'o\3\2\2\2)q\3\2\2\2+w\3"+
		"\2\2\2-}\3\2\2\2/\u0083\3\2\2\2\61\u0089\3\2\2\2\63\u008f\3\2\2\2\65\u0095"+
		"\3\2\2\2\67\u009b\3\2\2\29\u00a1\3\2\2\2;\u00a7\3\2\2\2=\u00ad\3\2\2\2"+
		"?\u00b3\3\2\2\2A\u00ba\3\2\2\2C\u00bc\3\2\2\2E\u00be\3\2\2\2G\u00c0\3"+
		"\2\2\2IJ\7\"\2\2J\4\3\2\2\2KL\7\60\2\2L\6\3\2\2\2MN\7.\2\2N\b\3\2\2\2"+
		"OP\7A\2\2P\n\3\2\2\2QR\7-\2\2R\f\3\2\2\2ST\7,\2\2T\16\3\2\2\2UV\7}\2\2"+
		"V\20\3\2\2\2WX\7\177\2\2X\22\3\2\2\2YZ\7]\2\2Z\24\3\2\2\2[\\\7_\2\2\\"+
		"\26\3\2\2\2]^\7/\2\2^\30\3\2\2\2_`\7`\2\2`\32\3\2\2\2ab\7&\2\2b\34\3\2"+
		"\2\2cd\7~\2\2d\36\3\2\2\2ef\7*\2\2f \3\2\2\2gh\7+\2\2h\"\3\2\2\2ij\7]"+
		"\2\2jk\7<\2\2k$\3\2\2\2lm\7<\2\2mn\7_\2\2n&\3\2\2\2op\7^\2\2p(\3\2\2\2"+
		"qr\7f\2\2rs\7k\2\2st\7i\2\2tu\7k\2\2uv\7v\2\2v*\3\2\2\2wx\7u\2\2xy\7r"+
		"\2\2yz\7c\2\2z{\7e\2\2{|\7g\2\2|,\3\2\2\2}~\7c\2\2~\177\7n\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7w\2\2\u0081\u0082\7o\2\2\u0082.\3\2\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7r\2\2\u0086\u0087\7j\2\2\u0087"+
		"\u0088\7c\2\2\u0088\60\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e\7m\2\2\u008e\62\3\2\2\2\u008f"+
		"\u0090\7e\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2"+
		"\u0093\u0094\7n\2\2\u0094\64\3\2\2\2\u0095\u0096\7i\2\2\u0096\u0097\7"+
		"t\2\2\u0097\u0098\7c\2\2\u0098\u0099\7r\2\2\u0099\u009a\7j\2\2\u009a\66"+
		"\3\2\2\2\u009b\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e\7y\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a08\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2"+
		"\u00a6:\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7p\2"+
		"\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7v\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7"+
		"w\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2>\3\2\2\2\u00b3\u00b4\7z\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7i\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"@\3\2\2\2\u00ba\u00bb\t\2\2\2\u00bbB\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd"+
		"D\3\2\2\2\u00be\u00bf\n\4\2\2\u00bfF\3\2\2\2\u00c0\u00c1\t\5\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\b$\2\2\u00c3H\3\2\2\2\3\2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}