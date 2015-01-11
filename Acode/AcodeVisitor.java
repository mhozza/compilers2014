// Generated from Acode.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AcodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AcodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull AcodeParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull AcodeParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(@NotNull AcodeParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull AcodeParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull AcodeParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull AcodeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(@NotNull AcodeParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(@NotNull AcodeParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull AcodeParser.UnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull AcodeParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block_st}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_st(@NotNull AcodeParser.Block_stContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull AcodeParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Extern}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern(@NotNull AcodeParser.ExternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull AcodeParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull AcodeParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull AcodeParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alloc_array}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlloc_array(@NotNull AcodeParser.Alloc_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull AcodeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull AcodeParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#own_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwn_assign(@NotNull AcodeParser.Own_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull AcodeParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(@NotNull AcodeParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull AcodeParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull AcodeParser.EmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull AcodeParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(@NotNull AcodeParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull AcodeParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicType}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(@NotNull AcodeParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull AcodeParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(@NotNull AcodeParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull AcodeParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull AcodeParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssVar}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssVar(@NotNull AcodeParser.AssVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull AcodeParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcodeParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull AcodeParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull AcodeParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull AcodeParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull AcodeParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Own_ass}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwn_ass(@NotNull AcodeParser.Own_assContext ctx);
}