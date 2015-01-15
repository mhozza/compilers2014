// Generated from siii.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link siiiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface siiiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull siiiParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#complex_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_assignment(@NotNull siiiParser.Complex_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#simple_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_assignment(@NotNull siiiParser.Simple_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#extern_func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_func_def(@NotNull siiiParser.Extern_func_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull siiiParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBasic}
	 * labeled alternative in {@link siiiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(@NotNull siiiParser.TypeBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(@NotNull siiiParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull siiiParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull siiiParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarID}
	 * labeled alternative in {@link siiiParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(@NotNull siiiParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValList}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValList(@NotNull siiiParser.ValListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarList}
	 * labeled alternative in {@link siiiParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(@NotNull siiiParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull siiiParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(@NotNull siiiParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeList}
	 * labeled alternative in {@link siiiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull siiiParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull siiiParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull siiiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(@NotNull siiiParser.ValStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValChar(@NotNull siiiParser.ValCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull siiiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull siiiParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull siiiParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(@NotNull siiiParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValNull}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNull(@NotNull siiiParser.ValNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull siiiParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull siiiParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValRange}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValRange(@NotNull siiiParser.ValRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull siiiParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#typelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypelist(@NotNull siiiParser.TypelistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOr}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOr(@NotNull siiiParser.BitOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(@NotNull siiiParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull siiiParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull siiiParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(@NotNull siiiParser.ValIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(@NotNull siiiParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValVar}
	 * labeled alternative in {@link siiiParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValVar(@NotNull siiiParser.ValVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull siiiParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(@NotNull siiiParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull siiiParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull siiiParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(@NotNull siiiParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAnd}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAnd(@NotNull siiiParser.BitAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull siiiParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link siiiParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull siiiParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(@NotNull siiiParser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(@NotNull siiiParser.BoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(@NotNull siiiParser.BoolAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link siiiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull siiiParser.ParenContext ctx);
}