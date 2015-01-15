// Generated from Omnomnom.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OmnomnomParser}.
 */
public interface OmnomnomListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Write}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite(@NotNull OmnomnomParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Write}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite(@NotNull OmnomnomParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull OmnomnomParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull OmnomnomParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Delete}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull OmnomnomParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Delete}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull OmnomnomParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull OmnomnomParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull OmnomnomParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(@NotNull OmnomnomParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(@NotNull OmnomnomParser.FblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeTuple}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeTuple(@NotNull OmnomnomParser.TypeTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeTuple}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeTuple(@NotNull OmnomnomParser.TypeTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Set}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull OmnomnomParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Set}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull OmnomnomParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValTuple}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValTuple(@NotNull OmnomnomParser.ValTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValTuple}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValTuple(@NotNull OmnomnomParser.ValTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link OmnomnomParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssign(@NotNull OmnomnomParser.SimpleAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssign}
	 * labeled alternative in {@link OmnomnomParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssign(@NotNull OmnomnomParser.SimpleAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Una}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull OmnomnomParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull OmnomnomParser.UnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterExtern(@NotNull OmnomnomParser.ExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitExtern(@NotNull OmnomnomParser.ExternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Remove}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterRemove(@NotNull OmnomnomParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Remove}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitRemove(@NotNull OmnomnomParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Read}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull OmnomnomParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull OmnomnomParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValId}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValId(@NotNull OmnomnomParser.ValIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValId}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValId(@NotNull OmnomnomParser.ValIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull OmnomnomParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull OmnomnomParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull OmnomnomParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull OmnomnomParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValString(@NotNull OmnomnomParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValString(@NotNull OmnomnomParser.ValStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull OmnomnomParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull OmnomnomParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expon}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpon(@NotNull OmnomnomParser.ExponContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expon}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpon(@NotNull OmnomnomParser.ExponContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(@NotNull OmnomnomParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(@NotNull OmnomnomParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull OmnomnomParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull OmnomnomParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull OmnomnomParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull OmnomnomParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(@NotNull OmnomnomParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(@NotNull OmnomnomParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull OmnomnomParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull OmnomnomParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValFloat}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValFloat(@NotNull OmnomnomParser.ValFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValFloat}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValFloat(@NotNull OmnomnomParser.ValFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#typelist}.
	 * @param ctx the parse tree
	 */
	void enterTypelist(@NotNull OmnomnomParser.TypelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#typelist}.
	 * @param ctx the parse tree
	 */
	void exitTypelist(@NotNull OmnomnomParser.TypelistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetTuple}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGetTuple(@NotNull OmnomnomParser.GetTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetTuple}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGetTuple(@NotNull OmnomnomParser.GetTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValBool(@NotNull OmnomnomParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValBool(@NotNull OmnomnomParser.ValBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Def}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterDef(@NotNull OmnomnomParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Def}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitDef(@NotNull OmnomnomParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull OmnomnomParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull OmnomnomParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bin}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBin(@NotNull OmnomnomParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bin}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBin(@NotNull OmnomnomParser.BinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValInt(@NotNull OmnomnomParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValInt(@NotNull OmnomnomParser.ValIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull OmnomnomParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull OmnomnomParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmp(@NotNull OmnomnomParser.EmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmp(@NotNull OmnomnomParser.EmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OmnomnomParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(@NotNull OmnomnomParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link OmnomnomParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(@NotNull OmnomnomParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull OmnomnomParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull OmnomnomParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValArray}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValArray(@NotNull OmnomnomParser.ValArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValArray}
	 * labeled alternative in {@link OmnomnomParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValArray(@NotNull OmnomnomParser.ValArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBasic}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(@NotNull OmnomnomParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBasic}
	 * labeled alternative in {@link OmnomnomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(@NotNull OmnomnomParser.TypeBasicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDef}
	 * labeled alternative in {@link OmnomnomParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(@NotNull OmnomnomParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDef}
	 * labeled alternative in {@link OmnomnomParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(@NotNull OmnomnomParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Append}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterAppend(@NotNull OmnomnomParser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Append}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitAppend(@NotNull OmnomnomParser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Length}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull OmnomnomParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Length}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull OmnomnomParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGet(@NotNull OmnomnomParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGet(@NotNull OmnomnomParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull OmnomnomParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull OmnomnomParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull OmnomnomParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull OmnomnomParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull OmnomnomParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link OmnomnomParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull OmnomnomParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull OmnomnomParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link OmnomnomParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull OmnomnomParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FCall}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFCall(@NotNull OmnomnomParser.FCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FCall}
	 * labeled alternative in {@link OmnomnomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFCall(@NotNull OmnomnomParser.FCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inc}
	 * labeled alternative in {@link OmnomnomParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterInc(@NotNull OmnomnomParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inc}
	 * labeled alternative in {@link OmnomnomParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitInc(@NotNull OmnomnomParser.IncContext ctx);
}