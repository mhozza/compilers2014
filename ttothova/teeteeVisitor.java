// Generated from teetee.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link teeteeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface teeteeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull teeteeParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull teeteeParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull teeteeParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull teeteeParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(@NotNull teeteeParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(@NotNull teeteeParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull teeteeParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull teeteeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull teeteeParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link teeteeParser#decl_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull teeteeParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull teeteeParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull teeteeParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull teeteeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull teeteeParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(@NotNull teeteeParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(@NotNull teeteeParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull teeteeParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#fparameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFparameters(@NotNull teeteeParser.FparametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleVar}
	 * labeled alternative in {@link teeteeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVar(@NotNull teeteeParser.SimpleVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull teeteeParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#array_resize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_resize(@NotNull teeteeParser.Array_resizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull teeteeParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull teeteeParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#callfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunction(@NotNull teeteeParser.CallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull teeteeParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull teeteeParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull teeteeParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While_stmt}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(@NotNull teeteeParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignArray}
	 * labeled alternative in {@link teeteeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArray(@NotNull teeteeParser.AssignArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull teeteeParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull teeteeParser.UnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull teeteeParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link teeteeParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(@NotNull teeteeParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(@NotNull teeteeParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotArray}
	 * labeled alternative in {@link teeteeParser#aarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotArray(@NotNull teeteeParser.NotArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull teeteeParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(@NotNull teeteeParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initFunctions}
	 * labeled alternative in {@link teeteeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitFunctions(@NotNull teeteeParser.InitFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initStatements}
	 * labeled alternative in {@link teeteeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitStatements(@NotNull teeteeParser.InitStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(@NotNull teeteeParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongIf}
	 * labeled alternative in {@link teeteeParser#if_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongIf(@NotNull teeteeParser.LongIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block_stmt}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(@NotNull teeteeParser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull teeteeParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Com}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(@NotNull teeteeParser.ComContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayVar}
	 * labeled alternative in {@link teeteeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVar(@NotNull teeteeParser.ArrayVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Resize}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResize(@NotNull teeteeParser.ResizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link teeteeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(@NotNull teeteeParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link teeteeParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull teeteeParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(@NotNull teeteeParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull teeteeParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link teeteeParser#aarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull teeteeParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull teeteeParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link teeteeParser#ftype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFtype(@NotNull teeteeParser.FtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortIf}
	 * labeled alternative in {@link teeteeParser#if_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortIf(@NotNull teeteeParser.ShortIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull teeteeParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull teeteeParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link teeteeParser#decl_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(@NotNull teeteeParser.ArrayDeclContext ctx);
}