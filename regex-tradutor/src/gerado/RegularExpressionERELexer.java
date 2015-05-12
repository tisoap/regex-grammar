package gerado;

// Generated from RegularExpressionERELexer.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COMMA=2, QUESTION=3, PLUS=4, ASTERISC=5, CURLYOPEN=6, CURLYCLOSE=7, 
		LISTOPEN=8, LISTCLOSE=9, DASH=10, CIRCUMFLEX=11, DOLAR=12, PIPE=13, GROUPOPEN=14, 
		GROUPCLOSE=15, ESCAPE=16, DIGIT=17, CLASSOPEN=18, OTHER=19, WS=20, DIGITCLASS=21, 
		SPACECLASS=22, ALNUM=23, ALPHA=24, BLANK=25, CNTRL=26, GRAPH=27, LOWER=28, 
		PRINT=29, PUNCT=30, UPPER=31, XDIGIT=32, CLASSCLOSE=33;
	public static final int CLASS = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CLASS"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"DOT", "COMMA", "QUESTION", "PLUS", "ASTERISC", "CURLYOPEN", "CURLYCLOSE", 
		"LISTOPEN", "LISTCLOSE", "DASH", "CIRCUMFLEX", "DOLAR", "PIPE", "GROUPOPEN", 
		"GROUPCLOSE", "ESCAPE", "DIGIT", "CLASSOPEN", "OTHER", "WS", "DIGITCLASS", 
		"SPACECLASS", "ALNUM", "ALPHA", "BLANK", "CNTRL", "GRAPH", "LOWER", "PRINT", 
		"PUNCT", "UPPER", "XDIGIT", "CLASSCLOSE"
	};


	public RegularExpressionERELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegularExpressionERELexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00c1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\2\2#\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26"+
		"\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32"+
		"\64\33\66\348\35:\36<\37> @!B\"D#\4\2\3\5\3\2\62;\2\2\4\2\2!\u0081\u00a1"+
		"\u00bf\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16"+
		"\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2"+
		"\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$"+
		"\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3"+
		"\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3"+
		"<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\4F\3\2\2\2\6H\3"+
		"\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20R\3\2\2\2\22T\3"+
		"\2\2\2\24V\3\2\2\2\26X\3\2\2\2\30Z\3\2\2\2\32\\\3\2\2\2\34^\3\2\2\2\36"+
		"`\3\2\2\2 b\3\2\2\2\"d\3\2\2\2$f\3\2\2\2&h\3\2\2\2(m\3\2\2\2*o\3\2\2\2"+
		",s\3\2\2\2.y\3\2\2\2\60\177\3\2\2\2\62\u0085\3\2\2\2\64\u008b\3\2\2\2"+
		"\66\u0091\3\2\2\28\u0097\3\2\2\2:\u009d\3\2\2\2<\u00a3\3\2\2\2>\u00a9"+
		"\3\2\2\2@\u00af\3\2\2\2B\u00b5\3\2\2\2D\u00bc\3\2\2\2FG\7\60\2\2G\5\3"+
		"\2\2\2HI\7.\2\2I\7\3\2\2\2JK\7A\2\2K\t\3\2\2\2LM\7-\2\2M\13\3\2\2\2NO"+
		"\7,\2\2O\r\3\2\2\2PQ\7}\2\2Q\17\3\2\2\2RS\7\177\2\2S\21\3\2\2\2TU\7]\2"+
		"\2U\23\3\2\2\2VW\7_\2\2W\25\3\2\2\2XY\7/\2\2Y\27\3\2\2\2Z[\7`\2\2[\31"+
		"\3\2\2\2\\]\7&\2\2]\33\3\2\2\2^_\7~\2\2_\35\3\2\2\2`a\7*\2\2a\37\3\2\2"+
		"\2bc\7+\2\2c!\3\2\2\2de\7^\2\2e#\3\2\2\2fg\t\2\2\2g%\3\2\2\2hi\7]\2\2"+
		"ij\7<\2\2jk\3\2\2\2kl\b\23\2\2l\'\3\2\2\2mn\n\3\2\2n)\3\2\2\2op\t\4\2"+
		"\2pq\3\2\2\2qr\b\25\3\2r+\3\2\2\2st\7f\2\2tu\7k\2\2uv\7i\2\2vw\7k\2\2"+
		"wx\7v\2\2x-\3\2\2\2yz\7u\2\2z{\7r\2\2{|\7c\2\2|}\7e\2\2}~\7g\2\2~/\3\2"+
		"\2\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u0084\7o\2\2\u0084\61\3\2\2\2\u0085\u0086\7c\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7r\2\2\u0088\u0089\7j\2\2\u0089\u008a\7c\2\2\u008a"+
		"\63\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7n\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7m\2\2\u0090\65\3\2\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7n\2\2"+
		"\u0096\67\3\2\2\2\u0097\u0098\7i\2\2\u0098\u0099\7t\2\2\u0099\u009a\7"+
		"c\2\2\u009a\u009b\7r\2\2\u009b\u009c\7j\2\2\u009c9\3\2\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2;\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8=\3\2\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7e\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae?\3\2\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7r\2"+
		"\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4A\3\2"+
		"\2\2\u00b5\u00b6\7z\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9"+
		"\7i\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7v\2\2\u00bbC\3\2\2\2\u00bc\u00bd"+
		"\7<\2\2\u00bd\u00be\7_\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\"\4\2\u00c0"+
		"E\3\2\2\2\4\2\3\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}