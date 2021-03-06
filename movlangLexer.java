// Generated from movlang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class movlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, REG=15, DEC_NUMBER=16, 
		HEX_NUMBER=17, HEX_DIGIT=18, DIGIT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "REG", "DEC_NUMBER", "HEX_NUMBER", 
		"HEX_DIGIT", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mov'", "','", "'['", "']'", "'BYTE PTR ['", "'WORD PTR ['", "'DWORD PTR ['", 
		"'BYTE PTR '", "'WORD PTR '", "'DWORD PTR '", "'+'", "'-'", "'*'", "'ds:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "REG", "DEC_NUMBER", "HEX_NUMBER", "HEX_DIGIT", "DIGIT", 
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


	public movlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "movlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00b1\n\20\3\21\6\21\u00b4\n\21\r\21\16\21\u00b5\3\22\3\22"+
		"\3\22\3\22\6\22\u00bc\n\22\r\22\16\22\u00bd\3\22\6\22\u00c1\n\22\r\22"+
		"\16\22\u00c2\5\22\u00c5\n\22\3\23\3\23\3\24\3\24\3\25\6\25\u00cc\n\25"+
		"\r\25\16\25\u00cd\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\4\5"+
		"\2\62;CHch\4\2\13\f\"\"\2\u00e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\3+\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r@\3\2"+
		"\2\2\17K\3\2\2\2\21W\3\2\2\2\23a\3\2\2\2\25k\3\2\2\2\27v\3\2\2\2\31x\3"+
		"\2\2\2\33z\3\2\2\2\35|\3\2\2\2\37\u00b0\3\2\2\2!\u00b3\3\2\2\2#\u00c4"+
		"\3\2\2\2%\u00c6\3\2\2\2\'\u00c8\3\2\2\2)\u00cb\3\2\2\2+,\7o\2\2,-\7q\2"+
		"\2-.\7x\2\2.\4\3\2\2\2/\60\7.\2\2\60\6\3\2\2\2\61\62\7]\2\2\62\b\3\2\2"+
		"\2\63\64\7_\2\2\64\n\3\2\2\2\65\66\7D\2\2\66\67\7[\2\2\678\7V\2\289\7"+
		"G\2\29:\7\"\2\2:;\7R\2\2;<\7V\2\2<=\7T\2\2=>\7\"\2\2>?\7]\2\2?\f\3\2\2"+
		"\2@A\7Y\2\2AB\7Q\2\2BC\7T\2\2CD\7F\2\2DE\7\"\2\2EF\7R\2\2FG\7V\2\2GH\7"+
		"T\2\2HI\7\"\2\2IJ\7]\2\2J\16\3\2\2\2KL\7F\2\2LM\7Y\2\2MN\7Q\2\2NO\7T\2"+
		"\2OP\7F\2\2PQ\7\"\2\2QR\7R\2\2RS\7V\2\2ST\7T\2\2TU\7\"\2\2UV\7]\2\2V\20"+
		"\3\2\2\2WX\7D\2\2XY\7[\2\2YZ\7V\2\2Z[\7G\2\2[\\\7\"\2\2\\]\7R\2\2]^\7"+
		"V\2\2^_\7T\2\2_`\7\"\2\2`\22\3\2\2\2ab\7Y\2\2bc\7Q\2\2cd\7T\2\2de\7F\2"+
		"\2ef\7\"\2\2fg\7R\2\2gh\7V\2\2hi\7T\2\2ij\7\"\2\2j\24\3\2\2\2kl\7F\2\2"+
		"lm\7Y\2\2mn\7Q\2\2no\7T\2\2op\7F\2\2pq\7\"\2\2qr\7R\2\2rs\7V\2\2st\7T"+
		"\2\2tu\7\"\2\2u\26\3\2\2\2vw\7-\2\2w\30\3\2\2\2xy\7/\2\2y\32\3\2\2\2z"+
		"{\7,\2\2{\34\3\2\2\2|}\7f\2\2}~\7u\2\2~\177\7<\2\2\177\36\3\2\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082\u00b1\7z\2\2\u0083\u0084\7g\2\2"+
		"\u0084\u0085\7d\2\2\u0085\u00b1\7z\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7e\2\2\u0088\u00b1\7z\2\2\u0089\u008a\7g\2\2\u008a\u008b\7f\2\2\u008b"+
		"\u00b1\7z\2\2\u008c\u008d\7g\2\2\u008d\u008e\7u\2\2\u008e\u00b1\7k\2\2"+
		"\u008f\u0090\7g\2\2\u0090\u0091\7f\2\2\u0091\u00b1\7k\2\2\u0092\u0093"+
		"\7g\2\2\u0093\u0094\7u\2\2\u0094\u00b1\7r\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7d\2\2\u0097\u00b1\7r\2\2\u0098\u0099\7c\2\2\u0099\u00b1\7z\2\2"+
		"\u009a\u009b\7d\2\2\u009b\u00b1\7z\2\2\u009c\u009d\7e\2\2\u009d\u00b1"+
		"\7z\2\2\u009e\u009f\7f\2\2\u009f\u00b1\7z\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00b1\7j\2\2\u00a2\u00a3\7d\2\2\u00a3\u00b1\7j\2\2\u00a4\u00a5\7e\2\2"+
		"\u00a5\u00b1\7j\2\2\u00a6\u00a7\7f\2\2\u00a7\u00b1\7j\2\2\u00a8\u00a9"+
		"\7c\2\2\u00a9\u00b1\7n\2\2\u00aa\u00ab\7d\2\2\u00ab\u00b1\7n\2\2\u00ac"+
		"\u00ad\7e\2\2\u00ad\u00b1\7n\2\2\u00ae\u00af\7f\2\2\u00af\u00b1\7n\2\2"+
		"\u00b0\u0080\3\2\2\2\u00b0\u0083\3\2\2\2\u00b0\u0086\3\2\2\2\u00b0\u0089"+
		"\3\2\2\2\u00b0\u008c\3\2\2\2\u00b0\u008f\3\2\2\2\u00b0\u0092\3\2\2\2\u00b0"+
		"\u0095\3\2\2\2\u00b0\u0098\3\2\2\2\u00b0\u009a\3\2\2\2\u00b0\u009c\3\2"+
		"\2\2\u00b0\u009e\3\2\2\2\u00b0\u00a0\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0"+
		"\u00a4\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00aa\3\2"+
		"\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1 \3\2\2\2\u00b2\u00b4"+
		"\5\'\24\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7\62\2\2\u00b8\u00b9"+
		"\7z\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5%\23\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c5\3\2"+
		"\2\2\u00bf\u00c1\5%\23\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b7\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c5$\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7&\3\2"+
		"\2\2\u00c8\u00c9\4\62;\2\u00c9(\3\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\b\25\2\2\u00d0*\3\2\2\2\t\2\u00b0\u00b5\u00bd"+
		"\u00c2\u00c4\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}