// Generated from kebab.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link kebabParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface kebabVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link kebabParser#primitive_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_types(@NotNull kebabParser.Primitive_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#set_assign_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_assign_unique(@NotNull kebabParser.Set_assign_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#primitive_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_assign(@NotNull kebabParser.Primitive_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull kebabParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull kebabParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatToInt}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatToInt(@NotNull kebabParser.FloatToIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull kebabParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull kebabParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#hash_map_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_map_declare(@NotNull kebabParser.Hash_map_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull kebabParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#primitive_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_declare(@NotNull kebabParser.Primitive_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Remove}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(@NotNull kebabParser.RemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull kebabParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull kebabParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#string_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_assign(@NotNull kebabParser.String_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull kebabParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull kebabParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull kebabParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull kebabParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(@NotNull kebabParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetContains}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetContains(@NotNull kebabParser.SetContainsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull kebabParser.EmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(@NotNull kebabParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#array_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assign(@NotNull kebabParser.Array_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(@NotNull kebabParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(@NotNull kebabParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntToFloat}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntToFloat(@NotNull kebabParser.IntToFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadChar}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadChar(@NotNull kebabParser.ReadCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull kebabParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(@NotNull kebabParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull kebabParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Long}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong(@NotNull kebabParser.LongContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull kebabParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#set_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_declare(@NotNull kebabParser.Set_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull kebabParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(@NotNull kebabParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#set_remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_remove(@NotNull kebabParser.Set_removeContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#string_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declare(@NotNull kebabParser.String_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadInt}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInt(@NotNull kebabParser.ReadIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#array_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declare(@NotNull kebabParser.Array_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull kebabParser.UnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull kebabParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#hash_map_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_map_assign(@NotNull kebabParser.Hash_map_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(@NotNull kebabParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDo(@NotNull kebabParser.WhileDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCyclus}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCyclus(@NotNull kebabParser.ForCyclusContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#string_declare_and_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declare_and_assign(@NotNull kebabParser.String_declare_and_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(@NotNull kebabParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull kebabParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoPrint}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPrint(@NotNull kebabParser.NoPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(@NotNull kebabParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadString}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadString(@NotNull kebabParser.ReadStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(@NotNull kebabParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#set_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_assign(@NotNull kebabParser.Set_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#primitive_declare_and_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_declare_and_assign(@NotNull kebabParser.Primitive_declare_and_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetSize}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSize(@NotNull kebabParser.SetSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(@NotNull kebabParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull kebabParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#primitive_typesaaa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_typesaaa(@NotNull kebabParser.Primitive_typesaaaContext ctx);
	/**
	 * Visit a parse tree produced by {@link kebabParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull kebabParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Foreach}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(@NotNull kebabParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull kebabParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull kebabParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclareAndAssign}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndAssign(@NotNull kebabParser.DeclareAndAssignContext ctx);
}