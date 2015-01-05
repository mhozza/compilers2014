// Generated from src/Omnomnom.g4 by ANTLR 4.1
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
	 * Visit a parse tree produced by {@link OmnomnomParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull OmnomnomParser.ArglistContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#ValBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(@NotNull OmnomnomParser.ValBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull OmnomnomParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#ValFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFloat(@NotNull OmnomnomParser.ValFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Una}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull OmnomnomParser.UnaContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull OmnomnomParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#ValArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValArray(@NotNull OmnomnomParser.ValArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(@NotNull OmnomnomParser.ParamlistContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull OmnomnomParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull OmnomnomParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull OmnomnomParser.ExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#fblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFblock(@NotNull OmnomnomParser.FblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#FCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCall(@NotNull OmnomnomParser.FCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Emp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull OmnomnomParser.EmpContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#ValId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValId(@NotNull OmnomnomParser.ValIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull OmnomnomParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(@NotNull OmnomnomParser.WriteContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#extern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern(@NotNull OmnomnomParser.ExternContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#SimpleAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssign(@NotNull OmnomnomParser.SimpleAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#TypeTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTuple(@NotNull OmnomnomParser.TypeTupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(@NotNull OmnomnomParser.RemoveContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#For}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull OmnomnomParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(@NotNull OmnomnomParser.SetContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(@NotNull OmnomnomParser.DeleteContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#typelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypelist(@NotNull OmnomnomParser.TypelistContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#VarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(@NotNull OmnomnomParser.VarDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull OmnomnomParser.RetContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull OmnomnomParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull OmnomnomParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#TypeBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(@NotNull OmnomnomParser.TypeBasicContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull OmnomnomParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#ValInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(@NotNull OmnomnomParser.ValIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull OmnomnomParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull OmnomnomParser.ParContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(@NotNull OmnomnomParser.IncContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(@NotNull OmnomnomParser.AppendContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(@NotNull OmnomnomParser.InitializationContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull OmnomnomParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin(@NotNull OmnomnomParser.BinContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#ValTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValTuple(@NotNull OmnomnomParser.ValTupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Expon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpon(@NotNull OmnomnomParser.ExponContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull OmnomnomParser.LengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#ValString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(@NotNull OmnomnomParser.ValStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#GetTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetTuple(@NotNull OmnomnomParser.GetTupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull OmnomnomParser.ReadContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#Get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(@NotNull OmnomnomParser.GetContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull OmnomnomParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link OmnomnomParser#TypeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(@NotNull OmnomnomParser.TypeArrayContext ctx);
}