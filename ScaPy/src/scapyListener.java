// Generated from scapy.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scapyParser}.
 */
public interface scapyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scapyParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull scapyParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull scapyParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Super_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSuper_assignment(@NotNull scapyParser.Super_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Super_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSuper_assignment(@NotNull scapyParser.Super_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarString}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarString(@NotNull scapyParser.VarStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarString}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarString(@NotNull scapyParser.VarStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare_simple_var}
	 * labeled alternative in {@link scapyParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_simple_var(@NotNull scapyParser.Declare_simple_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare_simple_var}
	 * labeled alternative in {@link scapyParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_simple_var(@NotNull scapyParser.Declare_simple_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Una}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull scapyParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull scapyParser.UnaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProcDef}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterProcDef(@NotNull scapyParser.ProcDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProcDef}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitProcDef(@NotNull scapyParser.ProcDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarFloat}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarFloat(@NotNull scapyParser.VarFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarFloat}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarFloat(@NotNull scapyParser.VarFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull scapyParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull scapyParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmp(@NotNull scapyParser.EmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmp(@NotNull scapyParser.EmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull scapyParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull scapyParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull scapyParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull scapyParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare_array_var}
	 * labeled alternative in {@link scapyParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_array_var(@NotNull scapyParser.Declare_array_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare_array_var}
	 * labeled alternative in {@link scapyParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_array_var(@NotNull scapyParser.Declare_array_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#import_function}.
	 * @param ctx the parse tree
	 */
	void enterImport_function(@NotNull scapyParser.Import_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#import_function}.
	 * @param ctx the parse tree
	 */
	void exitImport_function(@NotNull scapyParser.Import_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code F_Return}
	 * labeled alternative in {@link scapyParser#func_statement}.
	 * @param ctx the parse tree
	 */
	void enterF_Return(@NotNull scapyParser.F_ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code F_Return}
	 * labeled alternative in {@link scapyParser#func_statement}.
	 * @param ctx the parse tree
	 */
	void exitF_Return(@NotNull scapyParser.F_ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarInt}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarInt(@NotNull scapyParser.VarIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarInt}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarInt(@NotNull scapyParser.VarIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull scapyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull scapyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Create_array_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterCreate_array_assignment(@NotNull scapyParser.Create_array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Create_array_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitCreate_array_assignment(@NotNull scapyParser.Create_array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarArray}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarArray(@NotNull scapyParser.VarArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarArray}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarArray(@NotNull scapyParser.VarArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull scapyParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull scapyParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(@NotNull scapyParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(@NotNull scapyParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull scapyParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull scapyParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull scapyParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull scapyParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull scapyParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull scapyParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarBool}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarBool(@NotNull scapyParser.VarBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarBool}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarBool(@NotNull scapyParser.VarBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#proc_statements}.
	 * @param ctx the parse tree
	 */
	void enterProc_statements(@NotNull scapyParser.Proc_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#proc_statements}.
	 * @param ctx the parse tree
	 */
	void exitProc_statements(@NotNull scapyParser.Proc_statementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull scapyParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull scapyParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull scapyParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull scapyParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Base}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBase(@NotNull scapyParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Base}
	 * labeled alternative in {@link scapyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBase(@NotNull scapyParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#func_statements}.
	 * @param ctx the parse tree
	 */
	void enterFunc_statements(@NotNull scapyParser.Func_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#func_statements}.
	 * @param ctx the parse tree
	 */
	void exitFunc_statements(@NotNull scapyParser.Func_statementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull scapyParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull scapyParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(@NotNull scapyParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(@NotNull scapyParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(@NotNull scapyParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(@NotNull scapyParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull scapyParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull scapyParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarVar}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarVar(@NotNull scapyParser.VarVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarVar}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarVar(@NotNull scapyParser.VarVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull scapyParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull scapyParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull scapyParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull scapyParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BReturn}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBReturn(@NotNull scapyParser.BReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BReturn}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBReturn(@NotNull scapyParser.BReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arraylist}
	 * labeled alternative in {@link scapyParser#array_list}.
	 * @param ctx the parse tree
	 */
	void enterArraylist(@NotNull scapyParser.ArraylistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arraylist}
	 * labeled alternative in {@link scapyParser#array_list}.
	 * @param ctx the parse tree
	 */
	void exitArraylist(@NotNull scapyParser.ArraylistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull scapyParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull scapyParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simple_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimple_assignment(@NotNull scapyParser.Simple_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simple_assignment}
	 * labeled alternative in {@link scapyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimple_assignment(@NotNull scapyParser.Simple_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code F_Base}
	 * labeled alternative in {@link scapyParser#func_statement}.
	 * @param ctx the parse tree
	 */
	void enterF_Base(@NotNull scapyParser.F_BaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code F_Base}
	 * labeled alternative in {@link scapyParser#func_statement}.
	 * @param ctx the parse tree
	 */
	void exitF_Base(@NotNull scapyParser.F_BaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull scapyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull scapyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare_var}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var(@NotNull scapyParser.Declare_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare_var}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var(@NotNull scapyParser.Declare_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link scapyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull scapyParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link scapyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull scapyParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BasicType}
	 * labeled alternative in {@link scapyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(@NotNull scapyParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BasicType}
	 * labeled alternative in {@link scapyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(@NotNull scapyParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#proc_def}.
	 * @param ctx the parse tree
	 */
	void enterProc_def(@NotNull scapyParser.Proc_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#proc_def}.
	 * @param ctx the parse tree
	 */
	void exitProc_def(@NotNull scapyParser.Proc_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarChar}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarChar(@NotNull scapyParser.VarCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarChar}
	 * labeled alternative in {@link scapyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarChar(@NotNull scapyParser.VarCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull scapyParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull scapyParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull scapyParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link scapyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull scapyParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare_simple_const}
	 * labeled alternative in {@link scapyParser#declare_const}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_simple_const(@NotNull scapyParser.Declare_simple_constContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare_simple_const}
	 * labeled alternative in {@link scapyParser#declare_const}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_simple_const(@NotNull scapyParser.Declare_simple_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link scapyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull scapyParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link scapyParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull scapyParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare_con}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_con(@NotNull scapyParser.Declare_conContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare_con}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_con(@NotNull scapyParser.Declare_conContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BCall}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBCall(@NotNull scapyParser.BCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BCall}
	 * labeled alternative in {@link scapyParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBCall(@NotNull scapyParser.BCallContext ctx);
}