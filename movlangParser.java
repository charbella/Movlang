// Generated from movlang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class movlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, REG=15, DEC_NUMBER=16, 
		HEX_NUMBER=17, HEX_DIGIT=18, DIGIT=19, WS=20;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_regToReg = 2, RULE_regToMem = 3, 
		RULE_memToReg = 4, RULE_conToReg = 5, RULE_conToMem = 6, RULE_mem = 7, 
		RULE_location = 8, RULE_address = 9, RULE_constant = 10;
	public static final String[] ruleNames = {
		"program", "statement", "regToReg", "regToMem", "memToReg", "conToReg", 
		"conToMem", "mem", "location", "address", "constant"
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

	@Override
	public String getGrammarFileName() { return "movlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public movlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public RegToRegContext regToReg() {
			return getRuleContext(RegToRegContext.class,0);
		}
		public RegToMemContext regToMem() {
			return getRuleContext(RegToMemContext.class,0);
		}
		public MemToRegContext memToReg() {
			return getRuleContext(MemToRegContext.class,0);
		}
		public ConToRegContext conToReg() {
			return getRuleContext(ConToRegContext.class,0);
		}
		public ConToMemContext conToMem() {
			return getRuleContext(ConToMemContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				regToReg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				regToMem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				memToReg();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				conToReg();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				conToMem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegToRegContext extends ParserRuleContext {
		public List<TerminalNode> REG() { return getTokens(movlangParser.REG); }
		public TerminalNode REG(int i) {
			return getToken(movlangParser.REG, i);
		}
		public RegToRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regToReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterRegToReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitRegToReg(this);
		}
	}

	public final RegToRegContext regToReg() throws RecognitionException {
		RegToRegContext _localctx = new RegToRegContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(REG);
			setState(36);
			match(T__1);
			setState(37);
			match(REG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegToMemContext extends ParserRuleContext {
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
		public TerminalNode REG() { return getToken(movlangParser.REG, 0); }
		public RegToMemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regToMem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterRegToMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitRegToMem(this);
		}
	}

	public final RegToMemContext regToMem() throws RecognitionException {
		RegToMemContext _localctx = new RegToMemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_regToMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			mem();
			setState(41);
			match(T__1);
			setState(42);
			match(REG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemToRegContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(movlangParser.REG, 0); }
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
		public MemToRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memToReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterMemToReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitMemToReg(this);
		}
	}

	public final MemToRegContext memToReg() throws RecognitionException {
		MemToRegContext _localctx = new MemToRegContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(REG);
			setState(46);
			match(T__1);
			setState(47);
			mem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConToRegContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(movlangParser.REG, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConToRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conToReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterConToReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitConToReg(this);
		}
	}

	public final ConToRegContext conToReg() throws RecognitionException {
		ConToRegContext _localctx = new ConToRegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			match(REG);
			setState(51);
			match(T__1);
			setState(52);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConToMemContext extends ParserRuleContext {
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConToMemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conToMem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterConToMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitConToMem(this);
		}
	}

	public final ConToMemContext conToMem() throws RecognitionException {
		ConToMemContext _localctx = new ConToMemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conToMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			mem();
			setState(56);
			match(T__1);
			setState(57);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public MemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitMem(this);
		}
	}

	public final MemContext mem() throws RecognitionException {
		MemContext _localctx = new MemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mem);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__2);
				setState(60);
				location();
				setState(61);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__4);
				setState(64);
				location();
				setState(65);
				match(T__3);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__5);
				setState(68);
				location();
				setState(69);
				match(T__3);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(T__6);
				setState(72);
				location();
				setState(73);
				match(T__3);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				address();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				match(T__7);
				setState(77);
				address();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				match(T__8);
				setState(79);
				address();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				match(T__9);
				setState(81);
				address();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public List<TerminalNode> REG() { return getTokens(movlangParser.REG); }
		public TerminalNode REG(int i) {
			return getToken(movlangParser.REG, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_location);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(REG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(REG);
				setState(86);
				match(T__10);
				setState(87);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(REG);
				setState(89);
				match(T__11);
				setState(90);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(REG);
				setState(92);
				match(T__10);
				setState(93);
				match(REG);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(REG);
				setState(95);
				match(T__11);
				setState(96);
				match(REG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(REG);
				setState(98);
				match(T__10);
				setState(99);
				match(REG);
				setState(100);
				match(T__12);
				setState(101);
				constant();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				match(REG);
				setState(103);
				match(T__12);
				setState(104);
				constant();
				setState(105);
				match(T__10);
				setState(106);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(movlangParser.HEX_NUMBER, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__13);
			setState(111);
			match(HEX_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(movlangParser.HEX_NUMBER, 0); }
		public TerminalNode DEC_NUMBER() { return getToken(movlangParser.DEC_NUMBER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==DEC_NUMBER || _la==HEX_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tU\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\3\3\2\22\23\2|\2\31\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b)\3\2"+
		"\2\2\n.\3\2\2\2\f\63\3\2\2\2\168\3\2\2\2\20T\3\2\2\2\22n\3\2\2\2\24p\3"+
		"\2\2\2\26s\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2"+
		"\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35#\5\6\4\2\36#\5\b\5\2\37#\5\n\6\2 #"+
		"\5\f\7\2!#\5\16\b\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2"+
		"\"!\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%&\7\21\2\2&\'\7\4\2\2\'(\7\21\2\2(\7"+
		"\3\2\2\2)*\7\3\2\2*+\5\20\t\2+,\7\4\2\2,-\7\21\2\2-\t\3\2\2\2./\7\3\2"+
		"\2/\60\7\21\2\2\60\61\7\4\2\2\61\62\5\20\t\2\62\13\3\2\2\2\63\64\7\3\2"+
		"\2\64\65\7\21\2\2\65\66\7\4\2\2\66\67\5\26\f\2\67\r\3\2\2\289\7\3\2\2"+
		"9:\5\20\t\2:;\7\4\2\2;<\5\26\f\2<\17\3\2\2\2=>\7\5\2\2>?\5\22\n\2?@\7"+
		"\6\2\2@U\3\2\2\2AB\7\7\2\2BC\5\22\n\2CD\7\6\2\2DU\3\2\2\2EF\7\b\2\2FG"+
		"\5\22\n\2GH\7\6\2\2HU\3\2\2\2IJ\7\t\2\2JK\5\22\n\2KL\7\6\2\2LU\3\2\2\2"+
		"MU\5\24\13\2NO\7\n\2\2OU\5\24\13\2PQ\7\13\2\2QU\5\24\13\2RS\7\f\2\2SU"+
		"\5\24\13\2T=\3\2\2\2TA\3\2\2\2TE\3\2\2\2TI\3\2\2\2TM\3\2\2\2TN\3\2\2\2"+
		"TP\3\2\2\2TR\3\2\2\2U\21\3\2\2\2Vo\7\21\2\2WX\7\21\2\2XY\7\r\2\2Yo\5\26"+
		"\f\2Z[\7\21\2\2[\\\7\16\2\2\\o\5\26\f\2]^\7\21\2\2^_\7\r\2\2_o\7\21\2"+
		"\2`a\7\21\2\2ab\7\16\2\2bo\7\21\2\2cd\7\21\2\2de\7\r\2\2ef\7\21\2\2fg"+
		"\7\17\2\2go\5\26\f\2hi\7\21\2\2ij\7\17\2\2jk\5\26\f\2kl\7\r\2\2lm\5\26"+
		"\f\2mo\3\2\2\2nV\3\2\2\2nW\3\2\2\2nZ\3\2\2\2n]\3\2\2\2n`\3\2\2\2nc\3\2"+
		"\2\2nh\3\2\2\2o\23\3\2\2\2pq\7\20\2\2qr\7\23\2\2r\25\3\2\2\2st\t\2\2\2"+
		"t\27\3\2\2\2\6\33\"Tn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}