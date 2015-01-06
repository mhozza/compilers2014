// Generated from scapy.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scapyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scapyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scapyParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull scapyParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Super_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_assignment(@NotNull scapyParser.Super_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarString}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarString(@NotNull scapyParser.VarStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare_simple_var}
	 * labeled alternative in {@link scapyParser#declare_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_simple_var(@NotNull scapyParser.Declare_simple_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull scapyParser.UnaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProcDef}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDef(@NotNull scapyParser.ProcDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarFloat}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFloat(@NotNull scapyParser.VarFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull scapyParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull scapyParser.EmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull scapyParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull scapyParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare_array_var}
	 * labeled alternative in {@link scapyParser#declare_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_array_var(@NotNull scapyParser.Declare_array_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#import_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_function(@NotNull scapyParser.Import_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code F_Return}
	 * labeled alternative in {@link scapyParser#func_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_Return(@NotNull scapyParser.F_ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarInt}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInt(@NotNull scapyParser.VarIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull scapyParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Create_array_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_array_assignment(@NotNull scapyParser.Create_array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarArray}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArray(@NotNull scapyParser.VarArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull scapyParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(@NotNull scapyParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(@NotNull scapyParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull scapyParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull scapyParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarBool}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBool(@NotNull scapyParser.VarBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#proc_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_statements(@NotNull scapyParser.Proc_statementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull scapyParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull scapyParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Base}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(@NotNull scapyParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#func_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_statements(@NotNull scapyParser.Func_statementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull scapyParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(@NotNull scapyParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(@NotNull scapyParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull scapyParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarVar}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVar(@NotNull scapyParser.VarVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull scapyParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull scapyParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BReturn}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBReturn(@NotNull scapyParser.BReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arraylist}
	 * labeled alternative in {@link scapyParser#array_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraylist(@NotNull scapyParser.ArraylistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull scapyParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Simple_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_assignment(@NotNull scapyParser.Simple_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code F_Base}
	 * labeled alternative in {@link scapyParser#func_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_Base(@NotNull scapyParser.F_BaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull scapyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare_var}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var(@NotNull scapyParser.Declare_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link scapyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull scapyParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicType}
	 * labeled alternative in {@link scapyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(@NotNull scapyParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#proc_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_def(@NotNull scapyParser.Proc_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarChar}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarChar(@NotNull scapyParser.VarCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull scapyParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull scapyParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare_simple_const}
	 * labeled alternative in {@link scapyParser#declare_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_simple_const(@NotNull scapyParser.Declare_simple_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link scapyParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull scapyParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare_con}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_con(@NotNull scapyParser.Declare_conContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BCall}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBCall(@NotNull scapyParser.BCallContext ctx);
}