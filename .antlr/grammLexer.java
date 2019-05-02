// Generated from /home/alejandro/Documents/Escuela/8vo/Compiladores/proyecto/gramm.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, QUANTITATIVE=9, 
		OBJECT=10, RELOP=11, STATUS=12, TIMEUNIT=13, LOGICALOPERATOR=14, STATUSUSER=15, 
		XML=16, SUBCHECK=17, INT=18, ID=19, WS=20, IP=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "QUANTITATIVE", 
		"OBJECT", "RELOP", "STATUS", "TIMEUNIT", "LOGICALOPERATOR", "STATUSUSER", 
		"XML", "SUBCHECK", "INT", "ID", "WS", "IP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'is the ip address'", "'is'", "'for'", "'Login Attempts from the Same Source'", 
		"'of'", "'events occur'", "'having'", null, null, null, null, null, null, 
		null, null, "'subcheck-Validation'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "QUANTITATIVE", 
		"OBJECT", "RELOP", "STATUS", "TIMEUNIT", "LOGICALOPERATOR", "STATUSUSER", 
		"XML", "SUBCHECK", "INT", "ID", "WS", "IP"
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


	public grammLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u018b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bf\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0115\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u012e\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0135\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0155\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u015d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u0174\n\23\r\23"+
		"\16\23\u0175\3\24\6\24\u0179\n\24\r\24\16\24\u017a\3\25\6\25\u017e\n\25"+
		"\r\25\16\25\u017f\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\2"+
		"\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\3\2\62;\5\2\62;C\\c|\5\2\13\f"+
		"\17\17\"\"\2\u01a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3"+
		"\2\2\2\5\60\3\2\2\2\7B\3\2\2\2\tE\3\2\2\2\13I\3\2\2\2\rm\3\2\2\2\17p\3"+
		"\2\2\2\21}\3\2\2\2\23\u009f\3\2\2\2\25\u00be\3\2\2\2\27\u00e4\3\2\2\2"+
		"\31\u0114\3\2\2\2\33\u012d\3\2\2\2\35\u0134\3\2\2\2\37\u0154\3\2\2\2!"+
		"\u015c\3\2\2\2#\u015e\3\2\2\2%\u0173\3\2\2\2\'\u0178\3\2\2\2)\u017d\3"+
		"\2\2\2+\u0183\3\2\2\2-.\7k\2\2./\7h\2\2/\4\3\2\2\2\60\61\7k\2\2\61\62"+
		"\7u\2\2\62\63\7\"\2\2\63\64\7v\2\2\64\65\7j\2\2\65\66\7g\2\2\66\67\7\""+
		"\2\2\678\7k\2\289\7r\2\29:\7\"\2\2:;\7c\2\2;<\7f\2\2<=\7f\2\2=>\7t\2\2"+
		">?\7g\2\2?@\7u\2\2@A\7u\2\2A\6\3\2\2\2BC\7k\2\2CD\7u\2\2D\b\3\2\2\2EF"+
		"\7h\2\2FG\7q\2\2GH\7t\2\2H\n\3\2\2\2IJ\7N\2\2JK\7q\2\2KL\7i\2\2LM\7k\2"+
		"\2MN\7p\2\2NO\7\"\2\2OP\7C\2\2PQ\7v\2\2QR\7v\2\2RS\7g\2\2ST\7o\2\2TU\7"+
		"r\2\2UV\7v\2\2VW\7u\2\2WX\7\"\2\2XY\7h\2\2YZ\7t\2\2Z[\7q\2\2[\\\7o\2\2"+
		"\\]\7\"\2\2]^\7v\2\2^_\7j\2\2_`\7g\2\2`a\7\"\2\2ab\7U\2\2bc\7c\2\2cd\7"+
		"o\2\2de\7g\2\2ef\7\"\2\2fg\7U\2\2gh\7q\2\2hi\7w\2\2ij\7t\2\2jk\7e\2\2"+
		"kl\7g\2\2l\f\3\2\2\2mn\7q\2\2no\7h\2\2o\16\3\2\2\2pq\7g\2\2qr\7x\2\2r"+
		"s\7g\2\2st\7p\2\2tu\7v\2\2uv\7u\2\2vw\7\"\2\2wx\7q\2\2xy\7e\2\2yz\7e\2"+
		"\2z{\7w\2\2{|\7t\2\2|\20\3\2\2\2}~\7j\2\2~\177\7c\2\2\177\u0080\7x\2\2"+
		"\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7i\2\2\u0083\22\3\2"+
		"\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086\u00a0\7{\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7q\2\2\u0089\u008a\7o\2\2\u008a\u00a0\7g\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\u00a0\7n\2\2\u008e\u008f\7p\2\2"+
		"\u008f\u0090\7q\2\2\u0090\u0091\7p\2\2\u0091\u00a0\7g\2\2\u0092\u0093"+
		"\7f\2\2\u0093\u0094\7k\2\2\u0094\u0095\7h\2\2\u0095\u0096\7h\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a\7p\2\2"+
		"\u009a\u00a0\7v\2\2\u009b\u009c\7u\2\2\u009c\u009d\7c\2\2\u009d\u009e"+
		"\7o\2\2\u009e\u00a0\7g\2\2\u009f\u0084\3\2\2\2\u009f\u0087\3\2\2\2\u009f"+
		"\u008b\3\2\2\2\u009f\u008e\3\2\2\2\u009f\u0092\3\2\2\2\u009f\u009b\3\2"+
		"\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7c\2\2\u00a7"+
		"\u00a8\7o\2\2\u00a8\u00bf\7g\2\2\u00a9\u00aa\7k\2\2\u00aa\u00bf\7r\2\2"+
		"\u00ab\u00ac\7r\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2\u00b2"+
		"\u00bf\7f\2\2\u00b3\u00b4\7k\2\2\u00b4\u00bf\7f\2\2\u00b5\u00b6\7u\2\2"+
		"\u00b6\u00b7\7q\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7e\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00bf\7r\2\2\u00be\u00a1\3\2\2\2\u00be\u00a9\3\2\2\2\u00be\u00ab\3\2"+
		"\2\2\u00be\u00b3\3\2\2\2\u00be\u00b5\3\2\2\2\u00bf\26\3\2\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7u\2\2\u00c4"+
		"\u00c5\7\"\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7c\2"+
		"\2\u00c8\u00e5\7p\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf"+
		"\u00d0\7t\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7j\2"+
		"\2\u00d3\u00d4\7c\2\2\u00d4\u00e5\7p\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7s\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da"+
		"\u00db\7u\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7v\2\2\u00dd\u00e5\7q\2"+
		"\2\u00de\u00df\7y\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2"+
		"\7j\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e5\7p\2\2\u00e4\u00c0\3\2\2\2\u00e4"+
		"\u00c9\3\2\2\2\u00e4\u00d5\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5\30\3\2\2"+
		"\2\u00e6\u00e7\7H\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7n\2\2\u00ea\u00eb\7g\2\2\u00eb\u0115\7f\2\2\u00ec\u00ed\7C\2\2\u00ed"+
		"\u00ee\7e\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7r\2\2"+
		"\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\u0115\7f\2\2\u00f4\u00f5"+
		"\7U\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7e\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc\u0115\7f\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100"+
		"\7k\2\2\u0100\u0101\7n\2\2\u0101\u0102\7g\2\2\u0102\u0115\7f\2\2\u0103"+
		"\u0104\7c\2\2\u0104\u0105\7e\2\2\u0105\u0106\7e\2\2\u0106\u0107\7g\2\2"+
		"\u0107\u0108\7r\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u0115"+
		"\7f\2\2\u010b\u010c\7u\2\2\u010c\u010d\7w\2\2\u010d\u010e\7e\2\2\u010e"+
		"\u010f\7e\2\2\u010f\u0110\7g\2\2\u0110\u0111\7g\2\2\u0111\u0112\7f\2\2"+
		"\u0112\u0113\7g\2\2\u0113\u0115\7f\2\2\u0114\u00e6\3\2\2\2\u0114\u00ec"+
		"\3\2\2\2\u0114\u00f4\3\2\2\2\u0114\u00fd\3\2\2\2\u0114\u0103\3\2\2\2\u0114"+
		"\u010b\3\2\2\2\u0115\32\3\2\2\2\u0116\u0117\7u\2\2\u0117\u0118\7g\2\2"+
		"\u0118\u0119\7e\2\2\u0119\u011a\7q\2\2\u011a\u011b\7p\2\2\u011b\u011c"+
		"\7f\2\2\u011c\u012e\7u\2\2\u011d\u011e\7o\2\2\u011e\u011f\7k\2\2\u011f"+
		"\u0120\7p\2\2\u0120\u0121\7w\2\2\u0121\u0122\7v\2\2\u0122\u0123\7g\2\2"+
		"\u0123\u012e\7u\2\2\u0124\u0125\7j\2\2\u0125\u0126\7q\2\2\u0126\u0127"+
		"\7w\2\2\u0127\u0128\7t\2\2\u0128\u012e\7u\2\2\u0129\u012a\7f\2\2\u012a"+
		"\u012b\7c\2\2\u012b\u012c\7{\2\2\u012c\u012e\7u\2\2\u012d\u0116\3\2\2"+
		"\2\u012d\u011d\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0129\3\2\2\2\u012e\34"+
		"\3\2\2\2\u012f\u0130\7c\2\2\u0130\u0131\7p\2\2\u0131\u0135\7f\2\2\u0132"+
		"\u0133\7q\2\2\u0133\u0135\7t\2\2\u0134\u012f\3\2\2\2\u0134\u0132\3\2\2"+
		"\2\u0135\36\3\2\2\2\u0136\u0137\7G\2\2\u0137\u0138\7p\2\2\u0138\u0139"+
		"\7c\2\2\u0139\u013a\7d\2\2\u013a\u013b\7n\2\2\u013b\u013c\7g\2\2\u013c"+
		"\u0155\7f\2\2\u013d\u013e\7F\2\2\u013e\u013f\7k\2\2\u013f\u0140\7u\2\2"+
		"\u0140\u0141\7c\2\2\u0141\u0142\7d\2\2\u0142\u0143\7n\2\2\u0143\u0144"+
		"\7g\2\2\u0144\u0155\7f\2\2\u0145\u0146\7g\2\2\u0146\u0147\7p\2\2\u0147"+
		"\u0148\7c\2\2\u0148\u0149\7d\2\2\u0149\u014a\7n\2\2\u014a\u014b\7g\2\2"+
		"\u014b\u0155\7f\2\2\u014c\u014d\7f\2\2\u014d\u014e\7k\2\2\u014e\u014f"+
		"\7u\2\2\u014f\u0150\7c\2\2\u0150\u0151\7d\2\2\u0151\u0152\7n\2\2\u0152"+
		"\u0153\7g\2\2\u0153\u0155\7f\2\2\u0154\u0136\3\2\2\2\u0154\u013d\3\2\2"+
		"\2\u0154\u0145\3\2\2\2\u0154\u014c\3\2\2\2\u0155 \3\2\2\2\u0156\u0157"+
		"\7z\2\2\u0157\u0158\7o\2\2\u0158\u015d\7n\2\2\u0159\u015a\7Z\2\2\u015a"+
		"\u015b\7O\2\2\u015b\u015d\7N\2\2\u015c\u0156\3\2\2\2\u015c\u0159\3\2\2"+
		"\2\u015d\"\3\2\2\2\u015e\u015f\7u\2\2\u015f\u0160\7w\2\2\u0160\u0161\7"+
		"d\2\2\u0161\u0162\7e\2\2\u0162\u0163\7j\2\2\u0163\u0164\7g\2\2\u0164\u0165"+
		"\7e\2\2\u0165\u0166\7m\2\2\u0166\u0167\7/\2\2\u0167\u0168\7X\2\2\u0168"+
		"\u0169\7c\2\2\u0169\u016a\7n\2\2\u016a\u016b\7k\2\2\u016b\u016c\7f\2\2"+
		"\u016c\u016d\7c\2\2\u016d\u016e\7v\2\2\u016e\u016f\7k\2\2\u016f\u0170"+
		"\7q\2\2\u0170\u0171\7p\2\2\u0171$\3\2\2\2\u0172\u0174\t\2\2\2\u0173\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"&\3\2\2\2\u0177\u0179\t\3\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2"+
		"\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b(\3\2\2\2\u017c\u017e\t"+
		"\4\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b\25\2\2\u0182*\3\2\2\2"+
		"\u0183\u0184\5%\23\2\u0184\u0185\7\60\2\2\u0185\u0186\5%\23\2\u0186\u0187"+
		"\7\60\2\2\u0187\u0188\5%\23\2\u0188\u0189\7\60\2\2\u0189\u018a\5%\23\2"+
		"\u018a,\3\2\2\2\16\2\u009f\u00be\u00e4\u0114\u012d\u0134\u0154\u015c\u0175"+
		"\u017a\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}