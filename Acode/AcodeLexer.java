// Generated from Acode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AcodeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, AND=16, OR=17, NOT=18, 
		NEWLINE=19, ASSIGN=20, BLOCK_START=21, BLOCK_END=22, IF=23, ELSE=24, WHILE=25, 
		FOR=26, PAREN_OPEN=27, PAREN_CLOSE=28, BOOL=29, STRING=30, INT=31, DOUBLE=32, 
		STR=33, CHAR=34, NUMBER=35, DIGIT=36, WHITESPACE=37, ADD=38, SUB=39, MUL=40, 
		DIV=41, MOD=42, EXP=43, ADD_A=44, SUB_A=45, MUL_A=46, DIV_A=47, MOD_A=48, 
		EXP_A=49, EQ=50, NE=51, LE=52, GE=53, GT=54, LT=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'extern'", "'bool'", "','", "'['", "'int'", "';'", "'ret'", "'void'", 
		"'def'", "'double'", "'break'", "'str'", "'elseif'", "'char'", "AND", 
		"OR", "'not'", "'\n'", "':='", "'{'", "'}'", "'if'", "'else'", "'while'", 
		"'for'", "'('", "')'", "BOOL", "STRING", "INT", "DOUBLE", "STR", "CHAR", 
		"NUMBER", "DIGIT", "WHITESPACE", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'=='", "'!='", "'<='", 
		"'>='", "'>'", "'<'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "AND", "OR", "NOT", "NEWLINE", 
		"ASSIGN", "BLOCK_START", "BLOCK_END", "IF", "ELSE", "WHILE", "FOR", "PAREN_OPEN", 
		"PAREN_CLOSE", "BOOL", "STRING", "INT", "DOUBLE", "STR", "CHAR", "NUMBER", 
		"DIGIT", "WHITESPACE", "ADD", "SUB", "MUL", "DIV", "MOD", "EXP", "ADD_A", 
		"SUB_A", "MUL_A", "DIV_A", "MOD_A", "EXP_A", "EQ", "NE", "LE", "GE", "GT", 
		"LT"
	};


	public AcodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Acode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 36: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\29\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00b9\n\21\3\22\3\22\3\22\3\22\5\22\u00bf\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00ed"+
		"\n\36\3\37\3\37\7\37\u00f1\n\37\f\37\16\37\u00f4\13\37\3 \3 \3!\3!\3!"+
		"\7!\u00fb\n!\f!\16!\u00fe\13!\3\"\3\"\7\"\u0102\n\"\f\"\16\"\u0105\13"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\7$\u0110\n$\f$\16$\u0113\13$\5$\u0115"+
		"\n$\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\29"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\2M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62"+
		"\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1\3\2\t\4\2C\\c|\5\2\62;C\\c|\3"+
		"\2$$\3\2))\3\2\63;\3\2\62;\5\2\13\f\"\"~~\u0151\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2"+
		"\2\5s\3\2\2\2\7z\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2"+
		"\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008d\3\2\2\2\25\u0092\3\2\2\2"+
		"\27\u0096\3\2\2\2\31\u009d\3\2\2\2\33\u00a3\3\2\2\2\35\u00a7\3\2\2\2\37"+
		"\u00ae\3\2\2\2!\u00b8\3\2\2\2#\u00be\3\2\2\2%\u00c0\3\2\2\2\'\u00c4\3"+
		"\2\2\2)\u00c6\3\2\2\2+\u00c9\3\2\2\2-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61"+
		"\u00d0\3\2\2\2\63\u00d5\3\2\2\2\65\u00db\3\2\2\2\67\u00df\3\2\2\29\u00e1"+
		"\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f5\3\2\2\2A\u00f7\3\2\2\2C"+
		"\u00ff\3\2\2\2E\u0108\3\2\2\2G\u0114\3\2\2\2I\u0116\3\2\2\2K\u0118\3\2"+
		"\2\2M\u011c\3\2\2\2O\u011e\3\2\2\2Q\u0120\3\2\2\2S\u0122\3\2\2\2U\u0124"+
		"\3\2\2\2W\u0126\3\2\2\2Y\u0128\3\2\2\2[\u012b\3\2\2\2]\u012e\3\2\2\2_"+
		"\u0131\3\2\2\2a\u0134\3\2\2\2c\u0137\3\2\2\2e\u013a\3\2\2\2g\u013d\3\2"+
		"\2\2i\u0140\3\2\2\2k\u0143\3\2\2\2m\u0146\3\2\2\2o\u0148\3\2\2\2qr\7_"+
		"\2\2r\4\3\2\2\2st\7g\2\2tu\7z\2\2uv\7v\2\2vw\7g\2\2wx\7t\2\2xy\7p\2\2"+
		"y\6\3\2\2\2z{\7d\2\2{|\7q\2\2|}\7q\2\2}~\7n\2\2~\b\3\2\2\2\177\u0080\7"+
		".\2\2\u0080\n\3\2\2\2\u0081\u0082\7]\2\2\u0082\f\3\2\2\2\u0083\u0084\7"+
		"k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\16\3\2\2\2\u0087\u0088"+
		"\7=\2\2\u0088\20\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7v\2\2\u008c\22\3\2\2\2\u008d\u008e\7x\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7f\2\2\u0091\24\3\2\2\2\u0092\u0093\7f\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7h\2\2\u0095\26\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7w\2\2\u0099\u009a\7d\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7g\2\2\u009c\30\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7m\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\34\3\2\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\u00ad\7h\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7"+
		"e\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2 "+
		"\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b9\7f\2\2\u00b6"+
		"\u00b7\7(\2\2\u00b7\u00b9\7(\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b6\3\2\2"+
		"\2\u00b9\"\3\2\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bf\7t\2\2\u00bc\u00bd\7"+
		"~\2\2\u00bd\u00bf\7~\2\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"$\3\2\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7\f\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7<\2\2\u00c7"+
		"\u00c8\7?\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7}\2\2\u00ca,\3\2\2\2\u00cb\u00cc"+
		"\7\177\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf"+
		"\60\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da\64\3\2\2\2\u00db"+
		"\u00dc\7h\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de\66\3\2\2\2\u00df"+
		"\u00e0\7*\2\2\u00e08\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2:\3\2\2\2\u00e3\u00e4"+
		"\7h\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00ed\7g\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7w\2\2"+
		"\u00eb\u00ed\7g\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed<\3\2"+
		"\2\2\u00ee\u00f2\t\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3>\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5G$\2\u00f6@\3\2\2\2\u00f7\u00f8\5G$"+
		"\2\u00f8\u00fc\7\60\2\2\u00f9\u00fb\5I%\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdB\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0103\7$\2\2\u0100\u0102\n\4\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7$\2\2\u0107D\3\2\2\2\u0108"+
		"\u0109\7)\2\2\u0109\u010a\n\5\2\2\u010a\u010b\7)\2\2\u010bF\3\2\2\2\u010c"+
		"\u0115\7\62\2\2\u010d\u0111\t\6\2\2\u010e\u0110\5I%\2\u010f\u010e\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u010d\3\2"+
		"\2\2\u0115H\3\2\2\2\u0116\u0117\t\7\2\2\u0117J\3\2\2\2\u0118\u0119\t\b"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b&\2\2\u011bL\3\2\2\2\u011c\u011d"+
		"\7-\2\2\u011dN\3\2\2\2\u011e\u011f\7/\2\2\u011fP\3\2\2\2\u0120\u0121\7"+
		",\2\2\u0121R\3\2\2\2\u0122\u0123\7\61\2\2\u0123T\3\2\2\2\u0124\u0125\7"+
		"\'\2\2\u0125V\3\2\2\2\u0126\u0127\7`\2\2\u0127X\3\2\2\2\u0128\u0129\7"+
		"-\2\2\u0129\u012a\7?\2\2\u012aZ\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d"+
		"\7?\2\2\u012d\\\3\2\2\2\u012e\u012f\7,\2\2\u012f\u0130\7?\2\2\u0130^\3"+
		"\2\2\2\u0131\u0132\7\61\2\2\u0132\u0133\7?\2\2\u0133`\3\2\2\2\u0134\u0135"+
		"\7\'\2\2\u0135\u0136\7?\2\2\u0136b\3\2\2\2\u0137\u0138\7`\2\2\u0138\u0139"+
		"\7?\2\2\u0139d\3\2\2\2\u013a\u013b\7?\2\2\u013b\u013c\7?\2\2\u013cf\3"+
		"\2\2\2\u013d\u013e\7#\2\2\u013e\u013f\7?\2\2\u013fh\3\2\2\2\u0140\u0141"+
		"\7>\2\2\u0141\u0142\7?\2\2\u0142j\3\2\2\2\u0143\u0144\7@\2\2\u0144\u0145"+
		"\7?\2\2\u0145l\3\2\2\2\u0146\u0147\7@\2\2\u0147n\3\2\2\2\u0148\u0149\7"+
		">\2\2\u0149p\3\2\2\2\13\2\u00b8\u00be\u00ec\u00f2\u00fc\u0103\u0111\u0114";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}