// Generated from calculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull calculatorParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull calculatorParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Una}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull calculatorParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Una}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull calculatorParser.UnaContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#DeclareFun}.
	 * @param ctx the parse tree
	 */
	void enterDeclareFun(@NotNull calculatorParser.DeclareFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#DeclareFun}.
	 * @param ctx the parse tree
	 */
	void exitDeclareFun(@NotNull calculatorParser.DeclareFunContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull calculatorParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull calculatorParser.ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull calculatorParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull calculatorParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Emp}.
	 * @param ctx the parse tree
	 */
	void enterEmp(@NotNull calculatorParser.EmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Emp}.
	 * @param ctx the parse tree
	 */
	void exitEmp(@NotNull calculatorParser.EmpContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#While}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull calculatorParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#While}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull calculatorParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull calculatorParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull calculatorParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull calculatorParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull calculatorParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull calculatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull calculatorParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull calculatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull calculatorParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Intpression}.
	 * @param ctx the parse tree
	 */
	void enterIntpression(@NotNull calculatorParser.IntpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Intpression}.
	 * @param ctx the parse tree
	 */
	void exitIntpression(@NotNull calculatorParser.IntpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#CallFun}.
	 * @param ctx the parse tree
	 */
	void enterCallFun(@NotNull calculatorParser.CallFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#CallFun}.
	 * @param ctx the parse tree
	 */
	void exitCallFun(@NotNull calculatorParser.CallFunContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull calculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull calculatorParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull calculatorParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull calculatorParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Par}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull calculatorParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Par}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull calculatorParser.ParContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull calculatorParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull calculatorParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull calculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull calculatorParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull calculatorParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull calculatorParser.NotContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull calculatorParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull calculatorParser.LvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull calculatorParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull calculatorParser.OrContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull calculatorParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull calculatorParser.ReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#If}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull calculatorParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#If}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull calculatorParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#FlExpression}.
	 * @param ctx the parse tree
	 */
	void enterFlExpression(@NotNull calculatorParser.FlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#FlExpression}.
	 * @param ctx the parse tree
	 */
	void exitFlExpression(@NotNull calculatorParser.FlExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#Var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull calculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#Var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull calculatorParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link calculatorParser#And}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull calculatorParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#And}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull calculatorParser.AndContext ctx);
}