// Generated from Omnomnom.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OmnomnomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OmnomnomVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Write}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(@NotNull OmnomnomParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull OmnomnomParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Delete}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(@NotNull OmnomnomParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull OmnomnomParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#fblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFblock(@NotNull OmnomnomParser.FblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeTuple}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTuple(@NotNull OmnomnomParser.TypeTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Set}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(@NotNull OmnomnomParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValTuple}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValTuple(@NotNull OmnomnomParser.ValTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link OmnomnomParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssign(@NotNull OmnomnomParser.SimpleAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull OmnomnomParser.UnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#extern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern(@NotNull OmnomnomParser.ExternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Remove}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(@NotNull OmnomnomParser.RemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull OmnomnomParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValId}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValId(@NotNull OmnomnomParser.ValIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull OmnomnomParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull OmnomnomParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(@NotNull OmnomnomParser.ValStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull OmnomnomParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expon}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpon(@NotNull OmnomnomParser.ExponContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(@NotNull OmnomnomParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull OmnomnomParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull OmnomnomParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(@NotNull OmnomnomParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull OmnomnomParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValFloat}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFloat(@NotNull OmnomnomParser.ValFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#typelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypelist(@NotNull OmnomnomParser.TypelistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetTuple}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetTuple(@NotNull OmnomnomParser.GetTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(@NotNull OmnomnomParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Def}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull OmnomnomParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull OmnomnomParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bin}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin(@NotNull OmnomnomParser.BinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(@NotNull OmnomnomParser.ValIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull OmnomnomParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull OmnomnomParser.EmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(@NotNull OmnomnomParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull OmnomnomParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValArray}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValArray(@NotNull OmnomnomParser.ValArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBasic}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(@NotNull OmnomnomParser.TypeBasicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDef}
	 * labeled alternative in {@link OmnomnomParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(@NotNull OmnomnomParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Append}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(@NotNull OmnomnomParser.AppendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Length}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull OmnomnomParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(@NotNull OmnomnomParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull OmnomnomParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull OmnomnomParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull OmnomnomParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull OmnomnomParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FCall}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCall(@NotNull OmnomnomParser.FCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inc}
	 * labeled alternative in {@link OmnomnomParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(@NotNull OmnomnomParser.IncContext ctx);
}