// Generated from siii.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class siiiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, WHITESPACE=13, WHILE=14, FOR=15, IF=16, ELIF=17, 
		ELSE=18, BREAK=19, CONTINUE=20, RET=21, NULL=22, PRINT=23, READ=24, LPAR=25, 
		RPAR=26, LBRACK=27, RBRACK=28, LKUC=29, RKUC=30, BLOCK_START=31, BLOCK_END=32, 
		AND=33, OR=34, NOT=35, ADD=36, SUB=37, MUL=38, DIV=39, MOD=40, ADD_ASSIGN=41, 
		SUB_ASSIGN=42, MUL_ASSIGN=43, DIV_ASSIGN=44, MOD_ASSIGN=45, AND_ASSIGN=46, 
		OR_ASSIGN=47, EQ=48, NE=49, LE=50, GE=51, GT=52, LT=53, BOOL=54, INT=55, 
		ID=56, STRING=57, CHAR=58, COMMENT=59, MULTI_COMMENT=60, NL=61;
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
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "WHITESPACE", "WHILE", "FOR", "IF", "ELIF", "ELSE", 
		"BREAK", "CONTINUE", "RET", "NULL", "PRINT", "READ", "LPAR", "RPAR", "LBRACK", 
		"RBRACK", "LKUC", "RKUC", "BLOCK_START", "BLOCK_END", "AND", "OR", "NOT", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "EQ", "NE", "LE", 
		"GE", "GT", "LT", "BOOL", "INT", "ID", "STRING", "CHAR", "COMMENT", "MULTI_COMMENT", 
		"NL", "NUMBER"
	};


	public siiiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "siii.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u0190\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u014a\n\67\38\38\39\39\79\u0150\n9\f9\169\u0153\139\3:\3:\3:\7:\u0158"+
		"\n:\f:\16:\u015b\13:\3:\3:\3;\3;\3;\3;\3<\3<\7<\u0165\n<\f<\16<\u0168"+
		"\13<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u0172\n=\f=\16=\u0175\13=\3=\3=\3=\3="+
		"\3=\3=\3=\3>\5>\u017f\n>\3>\3>\6>\u0183\n>\r>\16>\u0184\3?\3?\3?\7?\u018a"+
		"\n?\f?\16?\u018d\13?\5?\u018f\n?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}\2\3\2\13\4\2\13\13"+
		"\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\3\2))\4\2\f\f\17\17\6\2%%))^^\u0080"+
		"\u0080\3\2\63;\3\2\62;\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3\177\3\2\2\2\5\u0083\3\2\2\2\7"+
		"\u0088\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2\2\2\17\u0090"+
		"\3\2\2\2\21\u0095\3\2\2\2\23\u009c\3\2\2\2\25\u00a3\3\2\2\2\27\u00a7\3"+
		"\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00af\3\2\2\2\37\u00b6\3\2"+
		"\2\2!\u00ba\3\2\2\2#\u00bd\3\2\2\2%\u00c4\3\2\2\2\'\u00c9\3\2\2\2)\u00d0"+
		"\3\2\2\2+\u00d9\3\2\2\2-\u00de\3\2\2\2/\u00e2\3\2\2\2\61\u00e8\3\2\2\2"+
		"\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E"+
		"\u0102\3\2\2\2G\u0108\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2"+
		"\2\2O\u0110\3\2\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0117\3\2\2\2W\u011a"+
		"\3\2\2\2Y\u011d\3\2\2\2[\u0120\3\2\2\2]\u0123\3\2\2\2_\u0126\3\2\2\2a"+
		"\u0129\3\2\2\2c\u012c\3\2\2\2e\u012f\3\2\2\2g\u0132\3\2\2\2i\u0135\3\2"+
		"\2\2k\u0138\3\2\2\2m\u0149\3\2\2\2o\u014b\3\2\2\2q\u014d\3\2\2\2s\u0154"+
		"\3\2\2\2u\u015e\3\2\2\2w\u0162\3\2\2\2y\u016d\3\2\2\2{\u0182\3\2\2\2}"+
		"\u018e\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7g\2\2\u0081\u0082\7h\2\2"+
		"\u0082\4\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7j\2\2\u0085\u0086\7c"+
		"\2\2\u0086\u0087\7t\2\2\u0087\6\3\2\2\2\u0088\u0089\7x\2\2\u0089\b\3\2"+
		"\2\2\u008a\u008b\7<\2\2\u008b\n\3\2\2\2\u008c\u008d\7~\2\2\u008d\f\3\2"+
		"\2\2\u008e\u008f\7?\2\2\u008f\16\3\2\2\2\u0090\u0091\7d\2\2\u0091\u0092"+
		"\7q\2\2\u0092\u0093\7q\2\2\u0093\u0094\7n\2\2\u0094\20\3\2\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7p\2\2\u009a\u009b\7i\2\2\u009b\22\3\2\2\2\u009c\u009d\7|\2\2\u009d"+
		"\u009e\7x\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7m\2\2"+
		"\u00a1\u00a2\7w\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7"+
		"p\2\2\u00a5\u00a6\7v\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\30"+
		"\3\2\2\2\u00a9\u00aa\7.\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b\16\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7r\2"+
		"\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7m\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7g\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7m\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0"+
		"\7c\2\2\u00c0\u00c1\7m\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7m\2\2\u00c3"+
		"$\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7m\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7u\2\2"+
		"\u00cf(\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7m\2"+
		"\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7"+
		"\7w\2\2\u00d7\u00d8\7l\2\2\u00d8*\3\2\2\2\u00d9\u00da\7x\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7v\2\2\u00dd,\3\2\2\2\u00de\u00df"+
		"\7p\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1.\3\2\2\2\u00e2\u00e3"+
		"\7x\2\2\u00e3\u00e4\7{\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7k\2\2\u00e6"+
		"\u00e7\7u\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\u00eb\7e\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7c\2\2"+
		"\u00ee\u00ef\7l\2\2\u00ef\62\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1\64\3\2\2"+
		"\2\u00f2\u00f3\7+\2\2\u00f3\66\3\2\2\2\u00f4\u00f5\7]\2\2\u00f58\3\2\2"+
		"\2\u00f6\u00f7\7_\2\2\u00f7:\3\2\2\2\u00f8\u00f9\7}\2\2\u00f9<\3\2\2\2"+
		"\u00fa\u00fb\7\177\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd@\3\2\2"+
		"\2\u00fe\u00ff\7@\2\2\u00ffB\3\2\2\2\u0100\u0101\7c\2\2\u0101D\3\2\2\2"+
		"\u0102\u0103\7c\2\2\u0103\u0104\7n\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7d\2\2\u0106\u0107\7q\2\2\u0107F\3\2\2\2\u0108\u0109\7#\2\2\u0109H\3"+
		"\2\2\2\u010a\u010b\7-\2\2\u010bJ\3\2\2\2\u010c\u010d\7/\2\2\u010dL\3\2"+
		"\2\2\u010e\u010f\7,\2\2\u010fN\3\2\2\2\u0110\u0111\7\61\2\2\u0111P\3\2"+
		"\2\2\u0112\u0113\7\'\2\2\u0113R\3\2\2\2\u0114\u0115\7-\2\2\u0115\u0116"+
		"\7-\2\2\u0116T\3\2\2\2\u0117\u0118\7/\2\2\u0118\u0119\7/\2\2\u0119V\3"+
		"\2\2\2\u011a\u011b\7,\2\2\u011b\u011c\7,\2\2\u011cX\3\2\2\2\u011d\u011e"+
		"\7\61\2\2\u011e\u011f\7\61\2\2\u011fZ\3\2\2\2\u0120\u0121\7\'\2\2\u0121"+
		"\u0122\7\'\2\2\u0122\\\3\2\2\2\u0123\u0124\7(\2\2\u0124\u0125\7(\2\2\u0125"+
		"^\3\2\2\2\u0126\u0127\7~\2\2\u0127\u0128\7~\2\2\u0128`\3\2\2\2\u0129\u012a"+
		"\7?\2\2\u012a\u012b\7?\2\2\u012bb\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012e"+
		"\7?\2\2\u012ed\3\2\2\2\u012f\u0130\7>\2\2\u0130\u0131\7?\2\2\u0131f\3"+
		"\2\2\2\u0132\u0133\7@\2\2\u0133\u0134\7?\2\2\u0134h\3\2\2\2\u0135\u0136"+
		"\7@\2\2\u0136\u0137\7@\2\2\u0137j\3\2\2\2\u0138\u0139\7>\2\2\u0139\u013a"+
		"\7>\2\2\u013al\3\2\2\2\u013b\u013c\7p\2\2\u013c\u013d\7g\2\2\u013d\u013e"+
		"\7r\2\2\u013e\u013f\7t\2\2\u013f\u0140\7c\2\2\u0140\u0141\7x\2\2\u0141"+
		"\u0142\7f\2\2\u0142\u014a\7c\2\2\u0143\u0144\7r\2\2\u0144\u0145\7t\2\2"+
		"\u0145\u0146\7c\2\2\u0146\u0147\7x\2\2\u0147\u0148\7f\2\2\u0148\u014a"+
		"\7c\2\2\u0149\u013b\3\2\2\2\u0149\u0143\3\2\2\2\u014an\3\2\2\2\u014b\u014c"+
		"\5}?\2\u014cp\3\2\2\2\u014d\u0151\t\3\2\2\u014e\u0150\t\4\2\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"r\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0159\7$\2\2\u0155\u0158\n\5\2\2\u0156"+
		"\u0158\5{>\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2"+
		"\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015c\u015d\7$\2\2\u015dt\3\2\2\2\u015e\u015f\7)\2\2\u015f\u0160"+
		"\n\6\2\2\u0160\u0161\7)\2\2\u0161v\3\2\2\2\u0162\u0166\7%\2\2\u0163\u0165"+
		"\n\7\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\5{"+
		">\2\u016a\u016b\3\2\2\2\u016b\u016c\b<\2\2\u016cx\3\2\2\2\u016d\u016e"+
		"\7\u0080\2\2\u016e\u016f\7%\2\2\u016f\u0173\3\2\2\2\u0170\u0172\n\b\2"+
		"\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7%\2\2\u0177"+
		"\u0178\7\u0080\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5{>\2\u017a\u017b\3"+
		"\2\2\2\u017b\u017c\b=\2\2\u017cz\3\2\2\2\u017d\u017f\7\17\2\2\u017e\u017d"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\7\f\2\2\u0181"+
		"\u0183\7\17\2\2\u0182\u017e\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3"+
		"\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185|\3\2\2\2\u0186\u018f"+
		"\7\62\2\2\u0187\u018b\t\t\2\2\u0188\u018a\t\n\2\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0186\3\2\2\2\u018e\u0187\3\2\2\2\u018f"+
		"~\3\2\2\2\16\2\u0149\u0151\u0157\u0159\u0166\u0173\u017e\u0182\u0184\u018b"+
		"\u018e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}