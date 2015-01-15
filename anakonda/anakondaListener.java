// Generated from anakonda.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link anakondaParser}.
 */
public interface anakondaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Types}
	 * labeled alternative in {@link anakondaParser#typelist}.
	 * @param ctx the parse tree
	 */
	void enterTypes(@NotNull anakondaParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Types}
	 * labeled alternative in {@link anakondaParser#typelist}.
	 * @param ctx the parse tree
	 */
	void exitTypes(@NotNull anakondaParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#forcycle}.
	 * @param ctx the parse tree
	 */
	void enterForcycle(@NotNull anakondaParser.ForcycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#forcycle}.
	 * @param ctx the parse tree
	 */
	void exitForcycle(@NotNull anakondaParser.ForcycleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompression(@NotNull anakondaParser.CompressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompression(@NotNull anakondaParser.CompressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(@NotNull anakondaParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(@NotNull anakondaParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Readpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadpression(@NotNull anakondaParser.ReadpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Readpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadpression(@NotNull anakondaParser.ReadpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Incpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncpression(@NotNull anakondaParser.IncpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Incpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncpression(@NotNull anakondaParser.IncpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddpression(@NotNull anakondaParser.AddpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddpression(@NotNull anakondaParser.AddpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarList}
	 * labeled alternative in {@link anakondaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarList(@NotNull anakondaParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarList}
	 * labeled alternative in {@link anakondaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarList(@NotNull anakondaParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Valpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValpression(@NotNull anakondaParser.ValpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Valpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValpression(@NotNull anakondaParser.ValpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValChar(@NotNull anakondaParser.ValCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValChar(@NotNull anakondaParser.ValCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull anakondaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull anakondaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link anakondaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull anakondaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link anakondaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull anakondaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#normal_assign}.
	 * @param ctx the parse tree
	 */
	void enterNormal_assign(@NotNull anakondaParser.Normal_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#normal_assign}.
	 * @param ctx the parse tree
	 */
	void exitNormal_assign(@NotNull anakondaParser.Normal_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull anakondaParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull anakondaParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeList}
	 * labeled alternative in {@link anakondaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull anakondaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeList}
	 * labeled alternative in {@link anakondaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull anakondaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull anakondaParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull anakondaParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull anakondaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull anakondaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull anakondaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull anakondaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#call_fun}.
	 * @param ctx the parse tree
	 */
	void enterCall_fun(@NotNull anakondaParser.Call_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#call_fun}.
	 * @param ctx the parse tree
	 */
	void exitCall_fun(@NotNull anakondaParser.Call_funContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multipression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultipression(@NotNull anakondaParser.MultipressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multipression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultipression(@NotNull anakondaParser.MultipressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#whilecycle}.
	 * @param ctx the parse tree
	 */
	void enterWhilecycle(@NotNull anakondaParser.WhilecycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#whilecycle}.
	 * @param ctx the parse tree
	 */
	void exitWhilecycle(@NotNull anakondaParser.WhilecycleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Params}
	 * labeled alternative in {@link anakondaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull anakondaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Params}
	 * labeled alternative in {@link anakondaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull anakondaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValVar}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValVar(@NotNull anakondaParser.ValVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValVar}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValVar(@NotNull anakondaParser.ValVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull anakondaParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull anakondaParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#define_fun}.
	 * @param ctx the parse tree
	 */
	void enterDefine_fun(@NotNull anakondaParser.Define_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#define_fun}.
	 * @param ctx the parse tree
	 */
	void exitDefine_fun(@NotNull anakondaParser.Define_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#extern_func_def}.
	 * @param ctx the parse tree
	 */
	void enterExtern_func_def(@NotNull anakondaParser.Extern_func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#extern_func_def}.
	 * @param ctx the parse tree
	 */
	void exitExtern_func_def(@NotNull anakondaParser.Extern_func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#combined_assign}.
	 * @param ctx the parse tree
	 */
	void enterCombined_assign(@NotNull anakondaParser.Combined_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#combined_assign}.
	 * @param ctx the parse tree
	 */
	void exitCombined_assign(@NotNull anakondaParser.Combined_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull anakondaParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull anakondaParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull anakondaParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull anakondaParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFun}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallFun(@NotNull anakondaParser.CallFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFun}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallFun(@NotNull anakondaParser.CallFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValList}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValList(@NotNull anakondaParser.ValListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValList}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValList(@NotNull anakondaParser.ValListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValVoid}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValVoid(@NotNull anakondaParser.ValVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValVoid}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValVoid(@NotNull anakondaParser.ValVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Andpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndpression(@NotNull anakondaParser.AndpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Andpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndpression(@NotNull anakondaParser.AndpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull anakondaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull anakondaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValString(@NotNull anakondaParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValString(@NotNull anakondaParser.ValStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecpression(@NotNull anakondaParser.DecpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecpression(@NotNull anakondaParser.DecpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValRange}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValRange(@NotNull anakondaParser.ValRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValRange}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValRange(@NotNull anakondaParser.ValRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Args}
	 * labeled alternative in {@link anakondaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull anakondaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Args}
	 * labeled alternative in {@link anakondaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull anakondaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValBool(@NotNull anakondaParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValBool(@NotNull anakondaParser.ValBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#define_var}.
	 * @param ctx the parse tree
	 */
	void enterDefine_var(@NotNull anakondaParser.Define_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#define_var}.
	 * @param ctx the parse tree
	 */
	void exitDefine_var(@NotNull anakondaParser.Define_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValInt(@NotNull anakondaParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link anakondaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValInt(@NotNull anakondaParser.ValIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull anakondaParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull anakondaParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Notpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotpression(@NotNull anakondaParser.NotpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Notpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotpression(@NotNull anakondaParser.NotpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#oneline_statement}.
	 * @param ctx the parse tree
	 */
	void enterOneline_statement(@NotNull anakondaParser.Oneline_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#oneline_statement}.
	 * @param ctx the parse tree
	 */
	void exitOneline_statement(@NotNull anakondaParser.Oneline_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull anakondaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull anakondaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(@NotNull anakondaParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(@NotNull anakondaParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListIndex(@NotNull anakondaParser.ListIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListIndex(@NotNull anakondaParser.ListIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Orpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrpression(@NotNull anakondaParser.OrpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Orpression}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrpression(@NotNull anakondaParser.OrpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarName}
	 * labeled alternative in {@link anakondaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarName(@NotNull anakondaParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarName}
	 * labeled alternative in {@link anakondaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarName(@NotNull anakondaParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Precedence}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence(@NotNull anakondaParser.PrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Precedence}
	 * labeled alternative in {@link anakondaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence(@NotNull anakondaParser.PrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link anakondaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull anakondaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link anakondaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull anakondaParser.AssignContext ctx);
}