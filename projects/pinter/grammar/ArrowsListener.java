// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrowsParser}.
 */
public interface ArrowsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrowsParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull ArrowsParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull ArrowsParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull ArrowsParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull ArrowsParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#arrow}.
	 * @param ctx the parse tree
	 */
	void enterArrow(@NotNull ArrowsParser.ArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#arrow}.
	 * @param ctx the parse tree
	 */
	void exitArrow(@NotNull ArrowsParser.ArrowContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Una}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull ArrowsParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Una}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull ArrowsParser.UnaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ArrowsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ArrowsParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull ArrowsParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull ArrowsParser.OutputContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#inputArrow}.
	 * @param ctx the parse tree
	 */
	void enterInputArrow(@NotNull ArrowsParser.InputArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#inputArrow}.
	 * @param ctx the parse tree
	 */
	void exitInputArrow(@NotNull ArrowsParser.InputArrowContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(@NotNull ArrowsParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(@NotNull ArrowsParser.EqContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull ArrowsParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull ArrowsParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Blck}.
	 * @param ctx the parse tree
	 */
	void enterBlck(@NotNull ArrowsParser.BlckContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Blck}.
	 * @param ctx the parse tree
	 */
	void exitBlck(@NotNull ArrowsParser.BlckContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#While}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull ArrowsParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#While}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull ArrowsParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull ArrowsParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull ArrowsParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull ArrowsParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull ArrowsParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#otherArrow}.
	 * @param ctx the parse tree
	 */
	void enterOtherArrow(@NotNull ArrowsParser.OtherArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#otherArrow}.
	 * @param ctx the parse tree
	 */
	void exitOtherArrow(@NotNull ArrowsParser.OtherArrowContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#For}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull ArrowsParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#For}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull ArrowsParser.ForContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull ArrowsParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull ArrowsParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull ArrowsParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull ArrowsParser.InputContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull ArrowsParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull ArrowsParser.CallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull ArrowsParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull ArrowsParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#boundedRange}.
	 * @param ctx the parse tree
	 */
	void enterBoundedRange(@NotNull ArrowsParser.BoundedRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#boundedRange}.
	 * @param ctx the parse tree
	 */
	void exitBoundedRange(@NotNull ArrowsParser.BoundedRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#singleRange}.
	 * @param ctx the parse tree
	 */
	void enterSingleRange(@NotNull ArrowsParser.SingleRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#singleRange}.
	 * @param ctx the parse tree
	 */
	void exitSingleRange(@NotNull ArrowsParser.SingleRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Par}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull ArrowsParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Par}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull ArrowsParser.ParContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull ArrowsParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull ArrowsParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(@NotNull ArrowsParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(@NotNull ArrowsParser.FunContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#outputArrow}.
	 * @param ctx the parse tree
	 */
	void enterOutputArrow(@NotNull ArrowsParser.OutputArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#outputArrow}.
	 * @param ctx the parse tree
	 */
	void exitOutputArrow(@NotNull ArrowsParser.OutputArrowContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Qstr}.
	 * @param ctx the parse tree
	 */
	void enterQstr(@NotNull ArrowsParser.QstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Qstr}.
	 * @param ctx the parse tree
	 */
	void exitQstr(@NotNull ArrowsParser.QstrContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull ArrowsParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull ArrowsParser.NotContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#singleInput}.
	 * @param ctx the parse tree
	 */
	void enterSingleInput(@NotNull ArrowsParser.SingleInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#singleInput}.
	 * @param ctx the parse tree
	 */
	void exitSingleInput(@NotNull ArrowsParser.SingleInputContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull ArrowsParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull ArrowsParser.LvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull ArrowsParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull ArrowsParser.OrContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Arw}.
	 * @param ctx the parse tree
	 */
	void enterArw(@NotNull ArrowsParser.ArwContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Arw}.
	 * @param ctx the parse tree
	 */
	void exitArw(@NotNull ArrowsParser.ArwContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull ArrowsParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull ArrowsParser.ReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void enterQuotedString(@NotNull ArrowsParser.QuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void exitQuotedString(@NotNull ArrowsParser.QuotedStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#If}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull ArrowsParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#If}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull ArrowsParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#Var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull ArrowsParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#Var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull ArrowsParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ArrowsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ArrowsParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#And}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull ArrowsParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#And}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull ArrowsParser.AndContext ctx);

	/**
	 * Enter a parse tree produced by {@link ArrowsParser#singleOutput}.
	 * @param ctx the parse tree
	 */
	void enterSingleOutput(@NotNull ArrowsParser.SingleOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrowsParser#singleOutput}.
	 * @param ctx the parse tree
	 */
	void exitSingleOutput(@NotNull ArrowsParser.SingleOutputContext ctx);
}