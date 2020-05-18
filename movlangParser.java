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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, REG=16, DEC_NUMBER=17, 
		HEX_NUMBER=18, HEX_DIGIT=19, DIGIT=20, WS=21;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_instruction = 2, RULE_regToReg = 3, 
		RULE_regToMem = 4, RULE_memToReg = 5, RULE_conToReg = 6, RULE_conToMem = 7, 
		RULE_mem = 8, RULE_location = 9, RULE_address = 10, RULE_constant = 11;
	public static final String[] ruleNames = {
		"program", "statement", "instruction", "regToReg", "regToMem", "memToReg", 
		"conToReg", "conToMem", "mem", "location", "address", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'mov'", "','", "'['", "']'", "'BYTE PTR ['", "'WORD PTR ['", 
		"'DWORD PTR ['", "'BYTE PTR '", "'WORD PTR '", "'DWORD PTR '", "'+'", 
		"'-'", "'*'", "'ds:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "REG", "DEC_NUMBER", "HEX_NUMBER", "HEX_DIGIT", 
		"DIGIT", "WS"
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEC_NUMBER || _la==HEX_NUMBER );
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			constant();
			setState(30);
			match(T__0);
			setState(31);
			instruction();
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

	public static class InstructionContext extends ParserRuleContext {
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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				regToReg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				regToMem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				memToReg();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				conToReg();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
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
		enterRule(_localctx, 6, RULE_regToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(41);
			match(REG);
			setState(42);
			match(T__2);
			setState(43);
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
		enterRule(_localctx, 8, RULE_regToMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			mem();
			setState(47);
			match(T__2);
			setState(48);
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
		enterRule(_localctx, 10, RULE_memToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);
			setState(51);
			match(REG);
			setState(52);
			match(T__2);
			setState(53);
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
		enterRule(_localctx, 12, RULE_conToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
			setState(56);
			match(REG);
			setState(57);
			match(T__2);
			setState(58);
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
		enterRule(_localctx, 14, RULE_conToMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
			setState(61);
			mem();
			setState(62);
			match(T__2);
			setState(63);
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
		enterRule(_localctx, 16, RULE_mem);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__3);
				setState(66);
				location();
				setState(67);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__5);
				setState(70);
				location();
				setState(71);
				match(T__4);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(T__6);
				setState(74);
				location();
				setState(75);
				match(T__4);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(T__7);
				setState(78);
				location();
				setState(79);
				match(T__4);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				address();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(T__8);
				setState(83);
				address();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				match(T__9);
				setState(85);
				address();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				match(T__10);
				setState(87);
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
		enterRule(_localctx, 18, RULE_location);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(REG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(REG);
				setState(92);
				match(T__11);
				setState(93);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(REG);
				setState(95);
				match(T__12);
				setState(96);
				constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(REG);
				setState(98);
				match(T__11);
				setState(99);
				match(REG);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(REG);
				setState(101);
				match(T__12);
				setState(102);
				match(REG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(REG);
				setState(104);
				match(T__11);
				setState(105);
				match(REG);
				setState(106);
				match(T__13);
				setState(107);
				constant();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				match(REG);
				setState(109);
				match(T__13);
				setState(110);
				constant();
				setState(111);
				match(T__11);
				setState(112);
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
		enterRule(_localctx, 20, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__14);
			setState(117);
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
		enterRule(_localctx, 22, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n[\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2"+
		"\23\24\2\u0081\2\33\3\2\2\2\4\37\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n/\3\2"+
		"\2\2\f\64\3\2\2\2\169\3\2\2\2\20>\3\2\2\2\22Z\3\2\2\2\24t\3\2\2\2\26v"+
		"\3\2\2\2\30y\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \5\30\r\2 !\7\3\2\2!\"\5\6\4\2\""+
		"\5\3\2\2\2#)\5\b\5\2$)\5\n\6\2%)\5\f\7\2&)\5\16\b\2\')\5\20\t\2(#\3\2"+
		"\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*+\7\4\2\2+,\7"+
		"\22\2\2,-\7\5\2\2-.\7\22\2\2.\t\3\2\2\2/\60\7\4\2\2\60\61\5\22\n\2\61"+
		"\62\7\5\2\2\62\63\7\22\2\2\63\13\3\2\2\2\64\65\7\4\2\2\65\66\7\22\2\2"+
		"\66\67\7\5\2\2\678\5\22\n\28\r\3\2\2\29:\7\4\2\2:;\7\22\2\2;<\7\5\2\2"+
		"<=\5\30\r\2=\17\3\2\2\2>?\7\4\2\2?@\5\22\n\2@A\7\5\2\2AB\5\30\r\2B\21"+
		"\3\2\2\2CD\7\6\2\2DE\5\24\13\2EF\7\7\2\2F[\3\2\2\2GH\7\b\2\2HI\5\24\13"+
		"\2IJ\7\7\2\2J[\3\2\2\2KL\7\t\2\2LM\5\24\13\2MN\7\7\2\2N[\3\2\2\2OP\7\n"+
		"\2\2PQ\5\24\13\2QR\7\7\2\2R[\3\2\2\2S[\5\26\f\2TU\7\13\2\2U[\5\26\f\2"+
		"VW\7\f\2\2W[\5\26\f\2XY\7\r\2\2Y[\5\26\f\2ZC\3\2\2\2ZG\3\2\2\2ZK\3\2\2"+
		"\2ZO\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZV\3\2\2\2ZX\3\2\2\2[\23\3\2\2\2\\u\7"+
		"\22\2\2]^\7\22\2\2^_\7\16\2\2_u\5\30\r\2`a\7\22\2\2ab\7\17\2\2bu\5\30"+
		"\r\2cd\7\22\2\2de\7\16\2\2eu\7\22\2\2fg\7\22\2\2gh\7\17\2\2hu\7\22\2\2"+
		"ij\7\22\2\2jk\7\16\2\2kl\7\22\2\2lm\7\20\2\2mu\5\30\r\2no\7\22\2\2op\7"+
		"\20\2\2pq\5\30\r\2qr\7\16\2\2rs\5\30\r\2su\3\2\2\2t\\\3\2\2\2t]\3\2\2"+
		"\2t`\3\2\2\2tc\3\2\2\2tf\3\2\2\2ti\3\2\2\2tn\3\2\2\2u\25\3\2\2\2vw\7\21"+
		"\2\2wx\7\24\2\2x\27\3\2\2\2yz\t\2\2\2z\31\3\2\2\2\6\35(Zt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}