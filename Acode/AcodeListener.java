// Generated from Acode.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AcodeParser}.
 */
public interface AcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull AcodeParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull AcodeParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull AcodeParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull AcodeParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Val}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull AcodeParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull AcodeParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull AcodeParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull AcodeParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull AcodeParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull AcodeParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull AcodeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull AcodeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak(@NotNull AcodeParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak(@NotNull AcodeParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(@NotNull AcodeParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(@NotNull AcodeParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Una}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull AcodeParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull AcodeParser.UnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull AcodeParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull AcodeParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block_st}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_st(@NotNull AcodeParser.Block_stContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block_st}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_st(@NotNull AcodeParser.Block_stContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull AcodeParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull AcodeParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Extern}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExtern(@NotNull AcodeParser.ExternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Extern}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExtern(@NotNull AcodeParser.ExternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull AcodeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull AcodeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull AcodeParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull AcodeParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull AcodeParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull AcodeParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alloc_array}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAlloc_array(@NotNull AcodeParser.Alloc_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alloc_array}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAlloc_array(@NotNull AcodeParser.Alloc_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull AcodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull AcodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull AcodeParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull AcodeParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#own_assign}.
	 * @param ctx the parse tree
	 */
	void enterOwn_assign(@NotNull AcodeParser.Own_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#own_assign}.
	 * @param ctx the parse tree
	 */
	void exitOwn_assign(@NotNull AcodeParser.Own_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull AcodeParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull AcodeParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmp(@NotNull AcodeParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmp(@NotNull AcodeParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull AcodeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull AcodeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmp(@NotNull AcodeParser.EmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmp(@NotNull AcodeParser.EmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull AcodeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull AcodeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(@NotNull AcodeParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(@NotNull AcodeParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull AcodeParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull AcodeParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicType}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(@NotNull AcodeParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicType}
	 * labeled alternative in {@link AcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(@NotNull AcodeParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull AcodeParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull AcodeParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(@NotNull AcodeParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(@NotNull AcodeParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull AcodeParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull AcodeParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull AcodeParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull AcodeParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssVar}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssVar(@NotNull AcodeParser.AssVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssVar}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssVar(@NotNull AcodeParser.AssVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull AcodeParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull AcodeParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcodeParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull AcodeParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcodeParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull AcodeParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull AcodeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull AcodeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull AcodeParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link AcodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull AcodeParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull AcodeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull AcodeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Own_ass}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOwn_ass(@NotNull AcodeParser.Own_assContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Own_ass}
	 * labeled alternative in {@link AcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOwn_ass(@NotNull AcodeParser.Own_assContext ctx);
}