// Generated from scapy.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scapyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, STRING=4, CHAR=5, MUL=6, DIV=7, ADD=8, SUB=9, 
		MOD=10, EXP=11, EQ=12, NE=13, LE=14, GE=15, GT=16, LT=17, ADD_ASS=18, 
		SUB_ASS=19, MUL_ASS=20, DIV_ASS=21, MOD_ASS=22, TYPE_INT=23, TYPE_CHAR=24, 
		TYPE_STRING=25, TYPE_BOOLEAN=26, TYPE_FLOAT=27, TYPE_ARRAY=28, ASSIGN=29, 
		IF=30, ELSE=31, WHILE=32, AND=33, OR=34, NOT=35, VAR=36, VAL=37, DEF=38, 
		RET=39, IMPORT=40, FOR=41, ARROW=42, UNTIL=43, OPENBLOCK=44, CLOSEBLOCK=45, 
		OPENPARENT=46, CLOSEPARENT=47, OPENBRACKET=48, CLOSEBRACKET=49, COMMA=50, 
		COLON=51, NEWLINE=52, ID=53, COMMENT=54, WHITESPACE=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'"
	};
	public static final String[] ruleNames = {
		"INT", "FLOAT", "BOOL", "STRING", "CHAR", "MUL", "DIV", "ADD", "SUB", 
		"MOD", "EXP", "EQ", "NE", "LE", "GE", "GT", "LT", "ADD_ASS", "SUB_ASS", 
		"MUL_ASS", "DIV_ASS", "MOD_ASS", "TYPE_INT", "TYPE_CHAR", "TYPE_STRING", 
		"TYPE_BOOLEAN", "TYPE_FLOAT", "TYPE_ARRAY", "ASSIGN", "IF", "ELSE", "WHILE", 
		"AND", "OR", "NOT", "VAR", "VAL", "DEF", "RET", "IMPORT", "FOR", "ARROW", 
		"UNTIL", "OPENBLOCK", "CLOSEBLOCK", "OPENPARENT", "CLOSEPARENT", "OPENBRACKET", 
		"CLOSEBRACKET", "COMMA", "COLON", "NEWLINE", "ID", "COMMENT", "WHITESPACE", 
		"DIGIT"
	};


	public scapyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scapy.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u0156\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\6\2u\n\2\r\2\16\2v\3"+
		"\3\6\3z\n\3\r\3\16\3{\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008e\n\4\3\5\3\5\3\5\7\5\u0093\n\5"+
		"\f\5\16\5\u0096\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\7\66\u0143\n\66\f\66\16\66\u0146\13\66"+
		"\3\67\3\67\7\67\u014a\n\67\f\67\16\67\u014d\13\67\3\67\3\67\38\38\38\3"+
		"8\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q\2\3\2\t\3\2$$\3\2))\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17"+
		"\17\4\2\13\13\"\"\3\2\62;\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3t\3\2\2\2\5y\3\2\2\2\7\u008d"+
		"\3\2\2\2\t\u008f\3\2\2\2\13\u0099\3\2\2\2\r\u009d\3\2\2\2\17\u009f\3\2"+
		"\2\2\21\u00a1\3\2\2\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2"+
		"\2\31\u00a9\3\2\2\2\33\u00ac\3\2\2\2\35\u00af\3\2\2\2\37\u00b2\3\2\2\2"+
		"!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bc\3\2\2\2)\u00bf\3"+
		"\2\2\2+\u00c2\3\2\2\2-\u00c5\3\2\2\2/\u00c8\3\2\2\2\61\u00cc\3\2\2\2\63"+
		"\u00d1\3\2\2\2\65\u00d8\3\2\2\2\67\u00e0\3\2\2\29\u00e6\3\2\2\2;\u00ec"+
		"\3\2\2\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f6\3\2\2\2C\u00fc\3\2\2\2E"+
		"\u0100\3\2\2\2G\u0103\3\2\2\2I\u0107\3\2\2\2K\u010b\3\2\2\2M\u010f\3\2"+
		"\2\2O\u0113\3\2\2\2Q\u011a\3\2\2\2S\u0121\3\2\2\2U\u0125\3\2\2\2W\u0128"+
		"\3\2\2\2Y\u012e\3\2\2\2[\u0130\3\2\2\2]\u0132\3\2\2\2_\u0134\3\2\2\2a"+
		"\u0136\3\2\2\2c\u0138\3\2\2\2e\u013a\3\2\2\2g\u013c\3\2\2\2i\u013e\3\2"+
		"\2\2k\u0140\3\2\2\2m\u0147\3\2\2\2o\u0150\3\2\2\2q\u0154\3\2\2\2su\5q"+
		"9\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\4\3\2\2\2xz\5q9\2yx\3\2\2"+
		"\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\7\60\2\2~\u0080\5q9"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\6\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u008e\7g\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7w\2\2\u008c\u008e\7g\2\2"+
		"\u008d\u0084\3\2\2\2\u008d\u0089\3\2\2\2\u008e\b\3\2\2\2\u008f\u0094\7"+
		"$\2\2\u0090\u0093\n\2\2\2\u0091\u0093\5i\65\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7$\2\2\u0098"+
		"\n\3\2\2\2\u0099\u009a\7)\2\2\u009a\u009b\n\3\2\2\u009b\u009c\7)\2\2\u009c"+
		"\f\3\2\2\2\u009d\u009e\7,\2\2\u009e\16\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\20\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4"+
		"\24\3\2\2\2\u00a5\u00a6\7\'\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7`\2\2\u00a8"+
		"\30\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab\32\3\2\2\2\u00ac"+
		"\u00ad\7#\2\2\u00ad\u00ae\7?\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7>\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b4"+
		" \3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8"+
		"$\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba\u00bb\7?\2\2\u00bb&\3\2\2\2\u00bc\u00bd"+
		"\7/\2\2\u00bd\u00be\7?\2\2\u00be(\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c1"+
		"\7?\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4\7?\2\2\u00c4,"+
		"\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6\u00c7\7?\2\2\u00c7.\3\2\2\2\u00c8\u00c9"+
		"\7K\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\60\3\2\2\2\u00cc\u00cd"+
		"\7E\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\62\3\2\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7i\2\2\u00d7\64\3\2\2\2\u00d8"+
		"\u00d9\7D\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7n\2\2"+
		"\u00dc\u00dd\7g\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7p\2\2\u00df\66\3\2"+
		"\2\2\u00e0\u00e1\7H\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7c\2\2\u00e4\u00e5\7v\2\2\u00e58\3\2\2\2\u00e6\u00e7\7C\2\2\u00e7\u00e8"+
		"\7t\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7{\2\2\u00eb"+
		":\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7h\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4"+
		"\7u\2\2\u00f4\u00f5\7g\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8"+
		"\7j\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"B\3\2\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7f\2\2\u00ff"+
		"D\3\2\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102F\3\2\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7q\2\2\u0105\u0106\7v\2\2\u0106H\3\2\2\2\u0107\u0108"+
		"\7x\2\2\u0108\u0109\7c\2\2\u0109\u010a\7t\2\2\u010aJ\3\2\2\2\u010b\u010c"+
		"\7x\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010eL\3\2\2\2\u010f\u0110"+
		"\7f\2\2\u0110\u0111\7g\2\2\u0111\u0112\7h\2\2\u0112N\3\2\2\2\u0113\u0114"+
		"\7t\2\2\u0114\u0115\7g\2\2\u0115\u0116\7v\2\2\u0116\u0117\7w\2\2\u0117"+
		"\u0118\7t\2\2\u0118\u0119\7p\2\2\u0119P\3\2\2\2\u011a\u011b\7k\2\2\u011b"+
		"\u011c\7o\2\2\u011c\u011d\7r\2\2\u011d\u011e\7q\2\2\u011e\u011f\7t\2\2"+
		"\u011f\u0120\7v\2\2\u0120R\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123\7q\2"+
		"\2\u0123\u0124\7t\2\2\u0124T\3\2\2\2\u0125\u0126\7>\2\2\u0126\u0127\7"+
		"/\2\2\u0127V\3\2\2\2\u0128\u0129\7w\2\2\u0129\u012a\7p\2\2\u012a\u012b"+
		"\7v\2\2\u012b\u012c\7k\2\2\u012c\u012d\7n\2\2\u012dX\3\2\2\2\u012e\u012f"+
		"\7}\2\2\u012fZ\3\2\2\2\u0130\u0131\7\177\2\2\u0131\\\3\2\2\2\u0132\u0133"+
		"\7*\2\2\u0133^\3\2\2\2\u0134\u0135\7+\2\2\u0135`\3\2\2\2\u0136\u0137\7"+
		"]\2\2\u0137b\3\2\2\2\u0138\u0139\7_\2\2\u0139d\3\2\2\2\u013a\u013b\7."+
		"\2\2\u013bf\3\2\2\2\u013c\u013d\7<\2\2\u013dh\3\2\2\2\u013e\u013f\7\f"+
		"\2\2\u013fj\3\2\2\2\u0140\u0144\t\4\2\2\u0141\u0143\t\5\2\2\u0142\u0141"+
		"\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"l\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014b\7%\2\2\u0148\u014a\n\6\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\b\67\2\2\u014f"+
		"n\3\2\2\2\u0150\u0151\t\7\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b8\2\2\u0153"+
		"p\3\2\2\2\u0154\u0155\t\b\2\2\u0155r\3\2\2\2\13\2v{\u0081\u008d\u0092"+
		"\u0094\u0144\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}