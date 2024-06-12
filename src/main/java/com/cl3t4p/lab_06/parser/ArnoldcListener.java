// Generated from /home/cl3t4p/uni/linguaggi/lab/lab_06/src/main/Arnoldc.g4 by ANTLR 4.13.1
package com.cl3t4p.lab_06.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArnoldcParser}.
 */
public interface ArnoldcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArnoldcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArnoldcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArnoldcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldcParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(ArnoldcParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldcParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(ArnoldcParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldcParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(ArnoldcParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldcParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(ArnoldcParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parseError}
	 * labeled alternative in {@link ArnoldcParser#perse_error_cmd}.
	 * @param ctx the parse tree
	 */
	void enterParseError(ArnoldcParser.ParseErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parseError}
	 * labeled alternative in {@link ArnoldcParser#perse_error_cmd}.
	 * @param ctx the parse tree
	 */
	void exitParseError(ArnoldcParser.ParseErrorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link ArnoldcParser#call_fun_cmd}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(ArnoldcParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link ArnoldcParser#call_fun_cmd}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(ArnoldcParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link ArnoldcParser#print_cmd}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ArnoldcParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ArnoldcParser#print_cmd}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ArnoldcParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link ArnoldcParser#var_decl_cmd}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ArnoldcParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link ArnoldcParser#var_decl_cmd}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ArnoldcParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifEnd}
	 * labeled alternative in {@link ArnoldcParser#if_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIfEnd(ArnoldcParser.IfEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifEnd}
	 * labeled alternative in {@link ArnoldcParser#if_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIfEnd(ArnoldcParser.IfEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ArnoldcParser#while_cmd}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ArnoldcParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ArnoldcParser#while_cmd}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ArnoldcParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterId(ArnoldcParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitId(ArnoldcParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNat(ArnoldcParser.NatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNat(ArnoldcParser.NatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBool(ArnoldcParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBool(ArnoldcParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterStr(ArnoldcParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code str}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitStr(ArnoldcParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssign}
	 * labeled alternative in {@link ArnoldcParser#var_assign_cmd}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(ArnoldcParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssign}
	 * labeled alternative in {@link ArnoldcParser#var_assign_cmd}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(ArnoldcParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignFun}
	 * labeled alternative in {@link ArnoldcParser#var_assign_fun}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignFun(ArnoldcParser.VarAssignFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignFun}
	 * labeled alternative in {@link ArnoldcParser#var_assign_fun}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignFun(ArnoldcParser.VarAssignFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opMinPlusMultModDiv}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpMinPlusMultModDiv(ArnoldcParser.OpMinPlusMultModDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opMinPlusMultModDiv}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpMinPlusMultModDiv(ArnoldcParser.OpMinPlusMultModDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opEq}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpEq(ArnoldcParser.OpEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opEq}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpEq(ArnoldcParser.OpEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opEqGr}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpEqGr(ArnoldcParser.OpEqGrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opEqGr}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpEqGr(ArnoldcParser.OpEqGrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opAndOr}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOpAndOr(ArnoldcParser.OpAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opAndOr}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOpAndOr(ArnoldcParser.OpAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclNonReturn}
	 * labeled alternative in {@link ArnoldcParser#fun_decl_cmd}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclNonReturn(ArnoldcParser.FunDeclNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclNonReturn}
	 * labeled alternative in {@link ArnoldcParser#fun_decl_cmd}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclNonReturn(ArnoldcParser.FunDeclNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclReturn}
	 * labeled alternative in {@link ArnoldcParser#fun_decl_cmd}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclReturn(ArnoldcParser.FunDeclReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclReturn}
	 * labeled alternative in {@link ArnoldcParser#fun_decl_cmd}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclReturn(ArnoldcParser.FunDeclReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldcParser#fun_decl_args}.
	 * @param ctx the parse tree
	 */
	void enterFun_decl_args(ArnoldcParser.Fun_decl_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldcParser#fun_decl_args}.
	 * @param ctx the parse tree
	 */
	void exitFun_decl_args(ArnoldcParser.Fun_decl_argsContext ctx);
}