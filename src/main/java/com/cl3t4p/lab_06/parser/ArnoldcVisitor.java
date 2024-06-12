// Generated from /home/cl3t4p/uni/linguaggi/lab/lab_06/src/main/Arnoldc.g4 by ANTLR 4.13.1
package com.cl3t4p.lab_06.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArnoldcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArnoldcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArnoldcParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ArnoldcParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldcParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(ArnoldcParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldcParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(ArnoldcParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parseError}
	 * labeled alternative in {@link ArnoldcParser#perse_error_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseError(ArnoldcParser.ParseErrorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link ArnoldcParser#call_fun_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(ArnoldcParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ArnoldcParser#print_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ArnoldcParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link ArnoldcParser#var_decl_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(ArnoldcParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifEnd}
	 * labeled alternative in {@link ArnoldcParser#if_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfEnd(ArnoldcParser.IfEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ArnoldcParser#while_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ArnoldcParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ArnoldcParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(ArnoldcParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ArnoldcParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str}
	 * labeled alternative in {@link ArnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(ArnoldcParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssign}
	 * labeled alternative in {@link ArnoldcParser#var_assign_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(ArnoldcParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignFun}
	 * labeled alternative in {@link ArnoldcParser#var_assign_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignFun(ArnoldcParser.VarAssignFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opMinPlusMultModDiv}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMinPlusMultModDiv(ArnoldcParser.OpMinPlusMultModDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opEq}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEq(ArnoldcParser.OpEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opEqGr}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEqGr(ArnoldcParser.OpEqGrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opAndOr}
	 * labeled alternative in {@link ArnoldcParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAndOr(ArnoldcParser.OpAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDeclNonReturn}
	 * labeled alternative in {@link ArnoldcParser#fun_decl_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclNonReturn(ArnoldcParser.FunDeclNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDeclReturn}
	 * labeled alternative in {@link ArnoldcParser#fun_decl_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclReturn(ArnoldcParser.FunDeclReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldcParser#fun_decl_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_decl_args(ArnoldcParser.Fun_decl_argsContext ctx);
}