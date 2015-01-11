// Generated from Saral.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SaralParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SaralVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull SaralParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(@NotNull SaralParser.Var_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarID}
	 * labeled alternative in {@link SaralParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(@NotNull SaralParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull SaralParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull SaralParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(@NotNull SaralParser.Array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValChar(@NotNull SaralParser.ValCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#typeSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSimple(@NotNull SaralParser.TypeSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull SaralParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull SaralParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull SaralParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(@NotNull SaralParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(@NotNull SaralParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#func_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_definition(@NotNull SaralParser.Func_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull SaralParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull SaralParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarArray}
	 * labeled alternative in {@link SaralParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArray(@NotNull SaralParser.VarArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull SaralParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull SaralParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#read2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead2(@NotNull SaralParser.Read2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(@NotNull SaralParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(@NotNull SaralParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValVar}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValVar(@NotNull SaralParser.ValVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#extern_proc_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_proc_declaration(@NotNull SaralParser.Extern_proc_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#const_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_definition(@NotNull SaralParser.Const_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull SaralParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull SaralParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#write2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite2(@NotNull SaralParser.Write2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(@NotNull SaralParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull SaralParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#typeBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(@NotNull SaralParser.TypeBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(@NotNull SaralParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull SaralParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull SaralParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SaralParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(@NotNull SaralParser.ValStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#func_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_block(@NotNull SaralParser.Func_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#extern_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_func_declaration(@NotNull SaralParser.Extern_func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValFloat}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFloat(@NotNull SaralParser.ValFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(@NotNull SaralParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull SaralParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(@NotNull SaralParser.ValIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(@NotNull SaralParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#proc_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_definition(@NotNull SaralParser.Proc_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull SaralParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SaralParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(@NotNull SaralParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(@NotNull SaralParser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(@NotNull SaralParser.BoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(@NotNull SaralParser.BoolAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull SaralParser.ParenContext ctx);
}