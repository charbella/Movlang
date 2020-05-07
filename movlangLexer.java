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
		REG=10, CONST=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"REG", "CONST", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mov'", "','", "'['", "']'", "'BYTE PTR ['", "'WORD PTR ['", "'DWORD PTR ['", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "REG", "CONST", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\6\f\177\n\f\r\f\16"+
		"\f\u0080\3\r\6\r\u0084\n\r\r\r\16\r\u0085\3\r\3\r\2\2\16\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\4\3\2\62;\4\2\13\f\"\""+
		"\2\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2"+
		"\13%\3\2\2\2\r\60\3\2\2\2\17;\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25{\3\2"+
		"\2\2\27~\3\2\2\2\31\u0083\3\2\2\2\33\34\7o\2\2\34\35\7q\2\2\35\36\7x\2"+
		"\2\36\4\3\2\2\2\37 \7.\2\2 \6\3\2\2\2!\"\7]\2\2\"\b\3\2\2\2#$\7_\2\2$"+
		"\n\3\2\2\2%&\7D\2\2&\'\7[\2\2\'(\7V\2\2()\7G\2\2)*\7\"\2\2*+\7R\2\2+,"+
		"\7V\2\2,-\7T\2\2-.\7\"\2\2./\7]\2\2/\f\3\2\2\2\60\61\7Y\2\2\61\62\7Q\2"+
		"\2\62\63\7T\2\2\63\64\7F\2\2\64\65\7\"\2\2\65\66\7R\2\2\66\67\7V\2\2\67"+
		"8\7T\2\289\7\"\2\29:\7]\2\2:\16\3\2\2\2;<\7F\2\2<=\7Y\2\2=>\7Q\2\2>?\7"+
		"T\2\2?@\7F\2\2@A\7\"\2\2AB\7R\2\2BC\7V\2\2CD\7T\2\2DE\7\"\2\2EF\7]\2\2"+
		"F\20\3\2\2\2GH\7-\2\2H\22\3\2\2\2IJ\7/\2\2J\24\3\2\2\2KL\7g\2\2LM\7c\2"+
		"\2M|\7z\2\2NO\7g\2\2OP\7d\2\2P|\7z\2\2QR\7g\2\2RS\7e\2\2S|\7z\2\2TU\7"+
		"g\2\2UV\7f\2\2V|\7z\2\2WX\7g\2\2XY\7u\2\2Y|\7k\2\2Z[\7g\2\2[\\\7f\2\2"+
		"\\|\7k\2\2]^\7g\2\2^_\7u\2\2_|\7r\2\2`a\7g\2\2ab\7d\2\2b|\7r\2\2cd\7c"+
		"\2\2d|\7z\2\2ef\7d\2\2f|\7z\2\2gh\7e\2\2h|\7z\2\2ij\7f\2\2j|\7z\2\2kl"+
		"\7c\2\2l|\7j\2\2mn\7d\2\2n|\7j\2\2op\7e\2\2p|\7j\2\2qr\7f\2\2r|\7j\2\2"+
		"st\7c\2\2t|\7n\2\2uv\7d\2\2v|\7n\2\2wx\7e\2\2x|\7n\2\2yz\7f\2\2z|\7n\2"+
		"\2{K\3\2\2\2{N\3\2\2\2{Q\3\2\2\2{T\3\2\2\2{W\3\2\2\2{Z\3\2\2\2{]\3\2\2"+
		"\2{`\3\2\2\2{c\3\2\2\2{e\3\2\2\2{g\3\2\2\2{i\3\2\2\2{k\3\2\2\2{m\3\2\2"+
		"\2{o\3\2\2\2{q\3\2\2\2{s\3\2\2\2{u\3\2\2\2{w\3\2\2\2{y\3\2\2\2|\26\3\2"+
		"\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\30\3\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\b\r\2\2\u0088\32\3\2\2\2\6\2{\u0080\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}