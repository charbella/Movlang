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
		T__0=1, T__1=2, REG=3, MEM=4, NUM=5, CONST=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "REG", "MEM", "NUM", "CONST", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mov'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "REG", "MEM", "NUM", "CONST", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t;\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\6\6,\n\6\r\6\16\6-\3\7\6\7\61\n\7\r\7\16\7\62\3\b\6\b\66"+
		"\n\b\r\b\16\b\67\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\3\2"+
		"\62;\4\2\13\f\"\"\2@\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\25\3\2\2\2\7#\3\2"+
		"\2\2\t%\3\2\2\2\13+\3\2\2\2\r\60\3\2\2\2\17\65\3\2\2\2\21\22\7o\2\2\22"+
		"\23\7q\2\2\23\24\7x\2\2\24\4\3\2\2\2\25\26\7.\2\2\26\6\3\2\2\2\27\30\7"+
		"t\2\2\30\31\7c\2\2\31$\7z\2\2\32\33\7t\2\2\33\34\7d\2\2\34$\7z\2\2\35"+
		"\36\7t\2\2\36\37\7e\2\2\37$\7z\2\2 !\7t\2\2!\"\7f\2\2\"$\7z\2\2#\27\3"+
		"\2\2\2#\32\3\2\2\2#\35\3\2\2\2# \3\2\2\2$\b\3\2\2\2%&\7n\2\2&\'\7x\2\2"+
		"\'(\3\2\2\2()\5\13\6\2)\n\3\2\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2"+
		"\2\2-.\3\2\2\2.\f\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\16\3\2\2\2\64\66\t\3\2\2\65\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\b\2\2:\20\3\2\2\2\7\2"+
		"#-\62\67\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}