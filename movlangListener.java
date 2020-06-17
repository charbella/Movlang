// Generated from movlang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link movlangParser}.
 */
public interface movlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link movlangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(movlangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(movlangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(movlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(movlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#regToReg}.
	 * @param ctx the parse tree
	 */
	void enterRegToReg(movlangParser.RegToRegContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#regToReg}.
	 * @param ctx the parse tree
	 */
	void exitRegToReg(movlangParser.RegToRegContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#regToMem}.
	 * @param ctx the parse tree
	 */
	void enterRegToMem(movlangParser.RegToMemContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#regToMem}.
	 * @param ctx the parse tree
	 */
	void exitRegToMem(movlangParser.RegToMemContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#memToReg}.
	 * @param ctx the parse tree
	 */
	void enterMemToReg(movlangParser.MemToRegContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#memToReg}.
	 * @param ctx the parse tree
	 */
	void exitMemToReg(movlangParser.MemToRegContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#conToReg}.
	 * @param ctx the parse tree
	 */
	void enterConToReg(movlangParser.ConToRegContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#conToReg}.
	 * @param ctx the parse tree
	 */
	void exitConToReg(movlangParser.ConToRegContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#conToMem}.
	 * @param ctx the parse tree
	 */
	void enterConToMem(movlangParser.ConToMemContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#conToMem}.
	 * @param ctx the parse tree
	 */
	void exitConToMem(movlangParser.ConToMemContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#mem}.
	 * @param ctx the parse tree
	 */
	void enterMem(movlangParser.MemContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#mem}.
	 * @param ctx the parse tree
	 */
	void exitMem(movlangParser.MemContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(movlangParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(movlangParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(movlangParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(movlangParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link movlangParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(movlangParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link movlangParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(movlangParser.ConstantContext ctx);
}