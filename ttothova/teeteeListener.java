// Generated from teetee.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link teeteeParser}.
 */
public interface teeteeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull teeteeParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull teeteeParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull teeteeParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull teeteeParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull teeteeParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull teeteeParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull teeteeParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull teeteeParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(@NotNull teeteeParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(@NotNull teeteeParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak(@NotNull teeteeParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak(@NotNull teeteeParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull teeteeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull teeteeParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull teeteeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull teeteeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull teeteeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull teeteeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link teeteeParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull teeteeParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link teeteeParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull teeteeParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull teeteeParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull teeteeParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull teeteeParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull teeteeParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull teeteeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull teeteeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull teeteeParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull teeteeParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull teeteeParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull teeteeParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(@NotNull teeteeParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(@NotNull teeteeParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull teeteeParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull teeteeParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#fparameters}.
	 * @param ctx the parse tree
	 */
	void enterFparameters(@NotNull teeteeParser.FparametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#fparameters}.
	 * @param ctx the parse tree
	 */
	void exitFparameters(@NotNull teeteeParser.FparametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleVar}
	 * labeled alternative in {@link teeteeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVar(@NotNull teeteeParser.SimpleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleVar}
	 * labeled alternative in {@link teeteeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVar(@NotNull teeteeParser.SimpleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull teeteeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull teeteeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#array_resize}.
	 * @param ctx the parse tree
	 */
	void enterArray_resize(@NotNull teeteeParser.Array_resizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#array_resize}.
	 * @param ctx the parse tree
	 */
	void exitArray_resize(@NotNull teeteeParser.Array_resizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull teeteeParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull teeteeParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull teeteeParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull teeteeParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void enterCallfunction(@NotNull teeteeParser.CallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void exitCallfunction(@NotNull teeteeParser.CallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull teeteeParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull teeteeParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull teeteeParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull teeteeParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull teeteeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull teeteeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While_stmt}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(@NotNull teeteeParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While_stmt}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(@NotNull teeteeParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignArray}
	 * labeled alternative in {@link teeteeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignArray(@NotNull teeteeParser.AssignArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignArray}
	 * labeled alternative in {@link teeteeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignArray(@NotNull teeteeParser.AssignArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull teeteeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull teeteeParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Una}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull teeteeParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull teeteeParser.UnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull teeteeParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull teeteeParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link teeteeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(@NotNull teeteeParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link teeteeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(@NotNull teeteeParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue(@NotNull teeteeParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue(@NotNull teeteeParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotArray}
	 * labeled alternative in {@link teeteeParser#aarray}.
	 * @param ctx the parse tree
	 */
	void enterNotArray(@NotNull teeteeParser.NotArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotArray}
	 * labeled alternative in {@link teeteeParser#aarray}.
	 * @param ctx the parse tree
	 */
	void exitNotArray(@NotNull teeteeParser.NotArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull teeteeParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull teeteeParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(@NotNull teeteeParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(@NotNull teeteeParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initFunctions}
	 * labeled alternative in {@link teeteeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInitFunctions(@NotNull teeteeParser.InitFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initFunctions}
	 * labeled alternative in {@link teeteeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInitFunctions(@NotNull teeteeParser.InitFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initStatements}
	 * labeled alternative in {@link teeteeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInitStatements(@NotNull teeteeParser.InitStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initStatements}
	 * labeled alternative in {@link teeteeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInitStatements(@NotNull teeteeParser.InitStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterChar(@NotNull teeteeParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitChar(@NotNull teeteeParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LongIf}
	 * labeled alternative in {@link teeteeParser#if_form}.
	 * @param ctx the parse tree
	 */
	void enterLongIf(@NotNull teeteeParser.LongIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LongIf}
	 * labeled alternative in {@link teeteeParser#if_form}.
	 * @param ctx the parse tree
	 */
	void exitLongIf(@NotNull teeteeParser.LongIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block_stmt}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(@NotNull teeteeParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block_stmt}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(@NotNull teeteeParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull teeteeParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull teeteeParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Com}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCom(@NotNull teeteeParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Com}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCom(@NotNull teeteeParser.ComContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayVar}
	 * labeled alternative in {@link teeteeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterArrayVar(@NotNull teeteeParser.ArrayVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayVar}
	 * labeled alternative in {@link teeteeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitArrayVar(@NotNull teeteeParser.ArrayVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Resize}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResize(@NotNull teeteeParser.ResizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Resize}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResize(@NotNull teeteeParser.ResizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link teeteeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(@NotNull teeteeParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link teeteeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(@NotNull teeteeParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link teeteeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull teeteeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link teeteeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull teeteeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(@NotNull teeteeParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(@NotNull teeteeParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull teeteeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull teeteeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link teeteeParser#aarray}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull teeteeParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link teeteeParser#aarray}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull teeteeParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull teeteeParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull teeteeParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link teeteeParser#ftype}.
	 * @param ctx the parse tree
	 */
	void enterFtype(@NotNull teeteeParser.FtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link teeteeParser#ftype}.
	 * @param ctx the parse tree
	 */
	void exitFtype(@NotNull teeteeParser.FtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortIf}
	 * labeled alternative in {@link teeteeParser#if_form}.
	 * @param ctx the parse tree
	 */
	void enterShortIf(@NotNull teeteeParser.ShortIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortIf}
	 * labeled alternative in {@link teeteeParser#if_form}.
	 * @param ctx the parse tree
	 */
	void exitShortIf(@NotNull teeteeParser.ShortIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull teeteeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link teeteeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull teeteeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull teeteeParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link teeteeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull teeteeParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link teeteeParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(@NotNull teeteeParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link teeteeParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(@NotNull teeteeParser.ArrayDeclContext ctx);
}