// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrowsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrowsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrowsParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull ArrowsParser.RangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#arrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow(@NotNull ArrowsParser.ArrowContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull ArrowsParser.ArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Una}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull ArrowsParser.UnaContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ArrowsParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(@NotNull ArrowsParser.OutputContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#inputArrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArrow(@NotNull ArrowsParser.InputArrowContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull ArrowsParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(@NotNull ArrowsParser.EqContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull ArrowsParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Blck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlck(@NotNull ArrowsParser.BlckContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull ArrowsParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull ArrowsParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#otherArrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherArrow(@NotNull ArrowsParser.OtherArrowContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull ArrowsParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#For}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull ArrowsParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull ArrowsParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#PreInc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreInc(@NotNull ArrowsParser.PreIncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull ArrowsParser.InputContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(@NotNull ArrowsParser.CallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull ArrowsParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull ArrowsParser.ParContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull ArrowsParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#outputArrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputArrow(@NotNull ArrowsParser.OutputArrowContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Qstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQstr(@NotNull ArrowsParser.QstrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#PostInc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostInc(@NotNull ArrowsParser.PostIncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull ArrowsParser.NotContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#singleInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInput(@NotNull ArrowsParser.SingleInputContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull ArrowsParser.LvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull ArrowsParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Arw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArw(@NotNull ArrowsParser.ArwContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull ArrowsParser.ReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#quotedString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedString(@NotNull ArrowsParser.QuotedStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull ArrowsParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass(@NotNull ArrowsParser.PassContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#Var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull ArrowsParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#singleOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOutput(@NotNull ArrowsParser.SingleOutputContext ctx);

	/**
	 * Visit a parse tree produced by {@link ArrowsParser#And}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull ArrowsParser.AndContext ctx);
}