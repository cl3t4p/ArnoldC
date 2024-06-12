// Generated from /home/cl3t4p/uni/linguaggi/lab/lab_06/src/main/Arnoldc.g4 by ANTLR 4.13.1
package com.cl3t4p.lab_06.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArnoldcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, END_IF=3, WHILE=4, END_WHILE=5, OP_PLUS=6, OP_MINUS=7, OP_MULT=8, 
		OP_DIV=9, OP_MOD=10, OP_EQUALS=11, OP_GRTHAN=12, OP_OR=13, OP_AND=14, 
		BEGIN_MAIN=15, END_MAIN=16, FUN_DECL=17, FUN_NON_VOID=18, FUN_ARG_DEC=19, 
		FUN_RETURN=20, FUN_END=21, PARSE_ERROR=22, FUN_CALL=23, OP_CALL_FUN=24, 
		VAR_INIT=25, VAR_SET_INIT=26, PRINT=27, VAR_SET=28, SETVALUE=29, VAR_ENDSET=30, 
		BOOL=31, NAT=32, STRING=33, ID=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_commands = 1, RULE_cmd = 2, RULE_perse_error_cmd = 3, 
		RULE_call_fun_cmd = 4, RULE_print_cmd = 5, RULE_var_decl_cmd = 6, RULE_if_cmd = 7, 
		RULE_while_cmd = 8, RULE_exp = 9, RULE_var_assign_cmd = 10, RULE_var_assign_fun = 11, 
		RULE_operation = 12, RULE_fun_decl_cmd = 13, RULE_fun_decl_args = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "commands", "cmd", "perse_error_cmd", "call_fun_cmd", "print_cmd", 
			"var_decl_cmd", "if_cmd", "while_cmd", "exp", "var_assign_cmd", "var_assign_fun", 
			"operation", "fun_decl_cmd", "fun_decl_args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BECAUSE I'M GOING TO SAY PLEASE'", "'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", 
			"'STICK AROUND'", "'CHILL'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", 
			"'HE HAD TO SPLIT'", "'I LET HIM GO'", "'YOU ARE NOT YOU YOU ARE ME'", 
			"'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", "'KNOCK KNOCK'", 
			"'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", "'LISTEN TO ME VERY CAREFULLY'", 
			"'GIVE THESE PEOPLE AIR'", "'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE'", 
			"'I'LL BE BACK'", "'HASTA LA VISTA, BABY'", "'WHAT THE FUCK DID I DO WRONG'", 
			"'DO IT NOW'", "'GET YOUR ASS TO MARS'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", 
			"'TALK TO THE HAND'", "'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", 
			"'ENOUGH TALK'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "END_IF", "WHILE", "END_WHILE", "OP_PLUS", "OP_MINUS", 
			"OP_MULT", "OP_DIV", "OP_MOD", "OP_EQUALS", "OP_GRTHAN", "OP_OR", "OP_AND", 
			"BEGIN_MAIN", "END_MAIN", "FUN_DECL", "FUN_NON_VOID", "FUN_ARG_DEC", 
			"FUN_RETURN", "FUN_END", "PARSE_ERROR", "FUN_CALL", "OP_CALL_FUN", "VAR_INIT", 
			"VAR_SET_INIT", "PRINT", "VAR_SET", "SETVALUE", "VAR_ENDSET", "BOOL", 
			"NAT", "STRING", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Arnoldc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArnoldcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode BEGIN_MAIN() { return getToken(ArnoldcParser.BEGIN_MAIN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END_MAIN() { return getToken(ArnoldcParser.END_MAIN, 0); }
		public List<Fun_decl_cmdContext> fun_decl_cmd() {
			return getRuleContexts(Fun_decl_cmdContext.class);
		}
		public Fun_decl_cmdContext fun_decl_cmd(int i) {
			return getRuleContext(Fun_decl_cmdContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN_DECL) {
				{
				{
				setState(30);
				fun_decl_cmd();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(BEGIN_MAIN);
			setState(37);
			commands();
			setState(38);
			match(END_MAIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandsContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 465698834L) != 0)) {
				{
				{
				setState(40);
				cmd();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public Var_decl_cmdContext var_decl_cmd() {
			return getRuleContext(Var_decl_cmdContext.class,0);
		}
		public Var_assign_funContext var_assign_fun() {
			return getRuleContext(Var_assign_funContext.class,0);
		}
		public Var_assign_cmdContext var_assign_cmd() {
			return getRuleContext(Var_assign_cmdContext.class,0);
		}
		public Print_cmdContext print_cmd() {
			return getRuleContext(Print_cmdContext.class,0);
		}
		public If_cmdContext if_cmd() {
			return getRuleContext(If_cmdContext.class,0);
		}
		public While_cmdContext while_cmd() {
			return getRuleContext(While_cmdContext.class,0);
		}
		public Fun_decl_cmdContext fun_decl_cmd() {
			return getRuleContext(Fun_decl_cmdContext.class,0);
		}
		public Call_fun_cmdContext call_fun_cmd() {
			return getRuleContext(Call_fun_cmdContext.class,0);
		}
		public Perse_error_cmdContext perse_error_cmd() {
			return getRuleContext(Perse_error_cmdContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_INIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				var_decl_cmd();
				}
				break;
			case OP_CALL_FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				var_assign_fun();
				}
				break;
			case VAR_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				var_assign_cmd();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				print_cmd();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				if_cmd();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				while_cmd();
				}
				break;
			case FUN_DECL:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				fun_decl_cmd();
				}
				break;
			case FUN_CALL:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				call_fun_cmd();
				}
				break;
			case PARSE_ERROR:
				enterOuterAlt(_localctx, 9);
				{
				setState(54);
				perse_error_cmd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Perse_error_cmdContext extends ParserRuleContext {
		public Perse_error_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perse_error_cmd; }
	 
		public Perse_error_cmdContext() { }
		public void copyFrom(Perse_error_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParseErrorContext extends Perse_error_cmdContext {
		public TerminalNode PARSE_ERROR() { return getToken(ArnoldcParser.PARSE_ERROR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParseErrorContext(Perse_error_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterParseError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitParseError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitParseError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perse_error_cmdContext perse_error_cmd() throws RecognitionException {
		Perse_error_cmdContext _localctx = new Perse_error_cmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_perse_error_cmd);
		int _la;
		try {
			_localctx = new ParseErrorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PARSE_ERROR);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
				{
				setState(58);
				exp();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_fun_cmdContext extends ParserRuleContext {
		public Call_fun_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_fun_cmd; }
	 
		public Call_fun_cmdContext() { }
		public void copyFrom(Call_fun_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends Call_fun_cmdContext {
		public TerminalNode FUN_CALL() { return getToken(ArnoldcParser.FUN_CALL, 0); }
		public TerminalNode ID() { return getToken(ArnoldcParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunCallContext(Call_fun_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_fun_cmdContext call_fun_cmd() throws RecognitionException {
		Call_fun_cmdContext _localctx = new Call_fun_cmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call_fun_cmd);
		int _la;
		try {
			_localctx = new FunCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FUN_CALL);
			setState(62);
			match(ID);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
				{
				{
				setState(63);
				exp();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_cmdContext extends ParserRuleContext {
		public Print_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_cmd; }
	 
		public Print_cmdContext() { }
		public void copyFrom(Print_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends Print_cmdContext {
		public TerminalNode PRINT() { return getToken(ArnoldcParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext(Print_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_cmdContext print_cmd() throws RecognitionException {
		Print_cmdContext _localctx = new Print_cmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_cmd);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(PRINT);
			setState(70);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_decl_cmdContext extends ParserRuleContext {
		public Var_decl_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_cmd; }
	 
		public Var_decl_cmdContext() { }
		public void copyFrom(Var_decl_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends Var_decl_cmdContext {
		public TerminalNode VAR_INIT() { return getToken(ArnoldcParser.VAR_INIT, 0); }
		public TerminalNode ID() { return getToken(ArnoldcParser.ID, 0); }
		public TerminalNode VAR_SET_INIT() { return getToken(ArnoldcParser.VAR_SET_INIT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public VarDeclContext(Var_decl_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_cmdContext var_decl_cmd() throws RecognitionException {
		Var_decl_cmdContext _localctx = new Var_decl_cmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl_cmd);
		int _la;
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(VAR_INIT);
			setState(73);
			match(ID);
			setState(74);
			match(VAR_SET_INIT);
			setState(75);
			exp();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32704L) != 0)) {
				{
				{
				setState(76);
				operation();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_cmdContext extends ParserRuleContext {
		public If_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cmd; }
	 
		public If_cmdContext() { }
		public void copyFrom(If_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfEndContext extends If_cmdContext {
		public TerminalNode IF() { return getToken(ArnoldcParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArnoldcParser.ELSE, 0); }
		public TerminalNode END_IF() { return getToken(ArnoldcParser.END_IF, 0); }
		public IfEndContext(If_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterIfEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitIfEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitIfEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_cmdContext if_cmd() throws RecognitionException {
		If_cmdContext _localctx = new If_cmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_cmd);
		try {
			_localctx = new IfEndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			exp();
			setState(84);
			commands();
			setState(85);
			match(ELSE);
			setState(86);
			commands();
			setState(87);
			match(END_IF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_cmdContext extends ParserRuleContext {
		public While_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cmd; }
	 
		public While_cmdContext() { }
		public void copyFrom(While_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends While_cmdContext {
		public TerminalNode WHILE() { return getToken(ArnoldcParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END_WHILE() { return getToken(ArnoldcParser.END_WHILE, 0); }
		public WhileContext(While_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cmdContext while_cmd() throws RecognitionException {
		While_cmdContext _localctx = new While_cmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_cmd);
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(WHILE);
			setState(90);
			exp();
			setState(91);
			commands();
			setState(92);
			match(END_WHILE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(ArnoldcParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterNat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitNat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrContext extends ExpContext {
		public TerminalNode STRING() { return getToken(ArnoldcParser.STRING, 0); }
		public StrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(ArnoldcParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ArnoldcParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(ID);
				}
				break;
			case NAT:
				_localctx = new NatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(NAT);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assign_cmdContext extends ParserRuleContext {
		public Var_assign_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign_cmd; }
	 
		public Var_assign_cmdContext() { }
		public void copyFrom(Var_assign_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignContext extends Var_assign_cmdContext {
		public TerminalNode VAR_SET() { return getToken(ArnoldcParser.VAR_SET, 0); }
		public TerminalNode ID() { return getToken(ArnoldcParser.ID, 0); }
		public TerminalNode SETVALUE() { return getToken(ArnoldcParser.SETVALUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode VAR_ENDSET() { return getToken(ArnoldcParser.VAR_ENDSET, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public VarAssignContext(Var_assign_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assign_cmdContext var_assign_cmd() throws RecognitionException {
		Var_assign_cmdContext _localctx = new Var_assign_cmdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_assign_cmd);
		int _la;
		try {
			_localctx = new VarAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(VAR_SET);
			setState(101);
			match(ID);
			setState(102);
			match(SETVALUE);
			setState(103);
			exp();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32704L) != 0)) {
				{
				{
				setState(104);
				operation();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(VAR_ENDSET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assign_funContext extends ParserRuleContext {
		public Var_assign_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign_fun; }
	 
		public Var_assign_funContext() { }
		public void copyFrom(Var_assign_funContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignFunContext extends Var_assign_funContext {
		public TerminalNode OP_CALL_FUN() { return getToken(ArnoldcParser.OP_CALL_FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(ArnoldcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArnoldcParser.ID, i);
		}
		public TerminalNode FUN_CALL() { return getToken(ArnoldcParser.FUN_CALL, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public VarAssignFunContext(Var_assign_funContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterVarAssignFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitVarAssignFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitVarAssignFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assign_funContext var_assign_fun() throws RecognitionException {
		Var_assign_funContext _localctx = new Var_assign_funContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_assign_fun);
		int _la;
		try {
			_localctx = new VarAssignFunContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(OP_CALL_FUN);
			setState(113);
			match(ID);
			setState(114);
			match(FUN_CALL);
			setState(115);
			match(ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
				{
				{
				setState(116);
				exp();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpAndOrContext extends OperationContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OP_OR() { return getToken(ArnoldcParser.OP_OR, 0); }
		public TerminalNode OP_AND() { return getToken(ArnoldcParser.OP_AND, 0); }
		public OpAndOrContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterOpAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitOpAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitOpAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpMinPlusMultModDivContext extends OperationContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OP_MINUS() { return getToken(ArnoldcParser.OP_MINUS, 0); }
		public TerminalNode OP_PLUS() { return getToken(ArnoldcParser.OP_PLUS, 0); }
		public TerminalNode OP_MULT() { return getToken(ArnoldcParser.OP_MULT, 0); }
		public TerminalNode OP_MOD() { return getToken(ArnoldcParser.OP_MOD, 0); }
		public TerminalNode OP_DIV() { return getToken(ArnoldcParser.OP_DIV, 0); }
		public OpMinPlusMultModDivContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterOpMinPlusMultModDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitOpMinPlusMultModDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitOpMinPlusMultModDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpEqContext extends OperationContext {
		public TerminalNode OP_EQUALS() { return getToken(ArnoldcParser.OP_EQUALS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpEqContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterOpEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitOpEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitOpEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpEqGrContext extends OperationContext {
		public TerminalNode OP_GRTHAN() { return getToken(ArnoldcParser.OP_GRTHAN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpEqGrContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterOpEqGr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitOpEqGr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitOpEqGr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PLUS:
			case OP_MINUS:
			case OP_MULT:
			case OP_DIV:
			case OP_MOD:
				_localctx = new OpMinPlusMultModDivContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((OpMinPlusMultModDivContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1984L) != 0)) ) {
					((OpMinPlusMultModDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				exp();
				}
				break;
			case OP_EQUALS:
				_localctx = new OpEqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(OP_EQUALS);
				setState(125);
				exp();
				}
				break;
			case OP_GRTHAN:
				_localctx = new OpEqGrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(OP_GRTHAN);
				setState(127);
				exp();
				}
				break;
			case OP_OR:
			case OP_AND:
				_localctx = new OpAndOrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				((OpAndOrContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OP_OR || _la==OP_AND) ) {
					((OpAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fun_decl_cmdContext extends ParserRuleContext {
		public Fun_decl_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl_cmd; }
	 
		public Fun_decl_cmdContext() { }
		public void copyFrom(Fun_decl_cmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclNonReturnContext extends Fun_decl_cmdContext {
		public TerminalNode FUN_DECL() { return getToken(ArnoldcParser.FUN_DECL, 0); }
		public TerminalNode ID() { return getToken(ArnoldcParser.ID, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FUN_END() { return getToken(ArnoldcParser.FUN_END, 0); }
		public List<Fun_decl_argsContext> fun_decl_args() {
			return getRuleContexts(Fun_decl_argsContext.class);
		}
		public Fun_decl_argsContext fun_decl_args(int i) {
			return getRuleContext(Fun_decl_argsContext.class,i);
		}
		public FunDeclNonReturnContext(Fun_decl_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterFunDeclNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitFunDeclNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitFunDeclNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclReturnContext extends Fun_decl_cmdContext {
		public TerminalNode FUN_DECL() { return getToken(ArnoldcParser.FUN_DECL, 0); }
		public TerminalNode ID() { return getToken(ArnoldcParser.ID, 0); }
		public TerminalNode FUN_NON_VOID() { return getToken(ArnoldcParser.FUN_NON_VOID, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FUN_RETURN() { return getToken(ArnoldcParser.FUN_RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode FUN_END() { return getToken(ArnoldcParser.FUN_END, 0); }
		public List<Fun_decl_argsContext> fun_decl_args() {
			return getRuleContexts(Fun_decl_argsContext.class);
		}
		public Fun_decl_argsContext fun_decl_args(int i) {
			return getRuleContext(Fun_decl_argsContext.class,i);
		}
		public FunDeclReturnContext(Fun_decl_cmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterFunDeclReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitFunDeclReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitFunDeclReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_decl_cmdContext fun_decl_cmd() throws RecognitionException {
		Fun_decl_cmdContext _localctx = new Fun_decl_cmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fun_decl_cmd);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new FunDeclNonReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(FUN_DECL);
				setState(133);
				match(ID);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN_ARG_DEC) {
					{
					{
					setState(134);
					fun_decl_args();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				commands();
				setState(141);
				match(FUN_END);
				}
				break;
			case 2:
				_localctx = new FunDeclReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(FUN_DECL);
				setState(144);
				match(ID);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN_ARG_DEC) {
					{
					{
					setState(145);
					fun_decl_args();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(FUN_NON_VOID);
				setState(152);
				commands();
				setState(153);
				match(FUN_RETURN);
				setState(154);
				exp();
				setState(155);
				match(FUN_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fun_decl_argsContext extends ParserRuleContext {
		public TerminalNode FUN_ARG_DEC() { return getToken(ArnoldcParser.FUN_ARG_DEC, 0); }
		public TerminalNode ID() { return getToken(ArnoldcParser.ID, 0); }
		public Fun_decl_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).enterFun_decl_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldcListener ) ((ArnoldcListener)listener).exitFun_decl_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldcVisitor ) return ((ArnoldcVisitor<? extends T>)visitor).visitFun_decl_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_decl_argsContext fun_decl_args() throws RecognitionException {
		Fun_decl_argsContext _localctx = new Fun_decl_argsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fun_decl_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FUN_ARG_DEC);
			setState(160);
			match(ID);
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
		"\u0004\u0001#\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004A\b\u0004\n\u0004\f\u0004D\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006N\b\u0006\n\u0006\f\u0006Q\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tc\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nj\b\n\n\n\f\nm\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bv\b\u000b\n\u000b\f\u000by\t\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0083\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0088\b\r\n\r\f\r\u008b\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u0093\b\r\n\r\f\r\u0096\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009e\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001"+
		"\u0000\u0006\n\u0001\u0000\r\u000e\u00ab\u0000!\u0001\u0000\u0000\u0000"+
		"\u0002+\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u00069"+
		"\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000"+
		"\u0000\fH\u0001\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010"+
		"Y\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014d\u0001"+
		"\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018\u0082\u0001\u0000"+
		"\u0000\u0000\u001a\u009d\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000"+
		"\u0000\u0000\u001e \u0003\u001a\r\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005\u000f\u0000\u0000%&\u0003\u0002\u0001\u0000&\'\u0005\u0010\u0000"+
		"\u0000\'\u0001\u0001\u0000\u0000\u0000(*\u0003\u0004\u0002\u0000)(\u0001"+
		"\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000.8\u0003\f\u0006\u0000/8\u0003\u0016\u000b\u000008\u0003\u0014"+
		"\n\u000018\u0003\n\u0005\u000028\u0003\u000e\u0007\u000038\u0003\u0010"+
		"\b\u000048\u0003\u001a\r\u000058\u0003\b\u0004\u000068\u0003\u0006\u0003"+
		"\u00007.\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u000070\u0001\u0000"+
		"\u0000\u000071\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u000073\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u00009;\u0005\u0016"+
		"\u0000\u0000:<\u0003\u0012\t\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0005\u0017\u0000\u0000"+
		">B\u0005\"\u0000\u0000?A\u0003\u0012\t\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\t\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u001b"+
		"\u0000\u0000FG\u0003\u0012\t\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0019\u0000\u0000IJ\u0005\"\u0000\u0000JK\u0005\u001a\u0000\u0000KO\u0003"+
		"\u0012\t\u0000LN\u0003\u0018\f\u0000ML\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"P\r\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005\u0001\u0000"+
		"\u0000ST\u0003\u0012\t\u0000TU\u0003\u0002\u0001\u0000UV\u0005\u0002\u0000"+
		"\u0000VW\u0003\u0002\u0001\u0000WX\u0005\u0003\u0000\u0000X\u000f\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0004\u0000\u0000Z[\u0003\u0012\t\u0000[\\"+
		"\u0003\u0002\u0001\u0000\\]\u0005\u0005\u0000\u0000]\u0011\u0001\u0000"+
		"\u0000\u0000^c\u0005\"\u0000\u0000_c\u0005 \u0000\u0000`c\u0005\u001f"+
		"\u0000\u0000ac\u0005!\u0000\u0000b^\u0001\u0000\u0000\u0000b_\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u0013"+
		"\u0001\u0000\u0000\u0000de\u0005\u001c\u0000\u0000ef\u0005\"\u0000\u0000"+
		"fg\u0005\u001d\u0000\u0000gk\u0003\u0012\t\u0000hj\u0003\u0018\f\u0000"+
		"ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000no\u0005\u001e\u0000\u0000o\u0015\u0001\u0000\u0000\u0000"+
		"pq\u0005\u0018\u0000\u0000qr\u0005\"\u0000\u0000rs\u0005\u0017\u0000\u0000"+
		"sw\u0005\"\u0000\u0000tv\u0003\u0012\t\u0000ut\u0001\u0000\u0000\u0000"+
		"vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000x\u0017\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0007"+
		"\u0000\u0000\u0000{\u0083\u0003\u0012\t\u0000|}\u0005\u000b\u0000\u0000"+
		"}\u0083\u0003\u0012\t\u0000~\u007f\u0005\f\u0000\u0000\u007f\u0083\u0003"+
		"\u0012\t\u0000\u0080\u0081\u0007\u0001\u0000\u0000\u0081\u0083\u0003\u0012"+
		"\t\u0000\u0082z\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000"+
		"\u0082~\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0019\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085"+
		"\u0089\u0005\"\u0000\u0000\u0086\u0088\u0003\u001c\u000e\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0003\u0002\u0001\u0000\u008d\u008e\u0005\u0015\u0000\u0000\u008e\u009e"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0011\u0000\u0000\u0090\u0094"+
		"\u0005\"\u0000\u0000\u0091\u0093\u0003\u001c\u000e\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\u0012\u0000\u0000\u0098\u0099\u0003\u0002\u0001\u0000\u0099\u009a\u0005"+
		"\u0014\u0000\u0000\u009a\u009b\u0003\u0012\t\u0000\u009b\u009c\u0005\u0015"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0084\u0001\u0000"+
		"\u0000\u0000\u009d\u008f\u0001\u0000\u0000\u0000\u009e\u001b\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0005\u0013\u0000\u0000\u00a0\u00a1\u0005\"\u0000"+
		"\u0000\u00a1\u001d\u0001\u0000\u0000\u0000\r!+7;BObkw\u0082\u0089\u0094"+
		"\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}