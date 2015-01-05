// Generated from siii.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link siiiParser}.
 */
public interface siiiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link siiiParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull siiiParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull siiiParser.RetContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull siiiParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull siiiParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValList}.
	 * @param ctx the parse tree
	 */
	void enterValList(@NotNull siiiParser.ValListContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValList}.
	 * @param ctx the parse tree
	 */
	void exitValList(@NotNull siiiParser.ValListContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValBool}.
	 * @param ctx the parse tree
	 */
	void enterValBool(@NotNull siiiParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValBool}.
	 * @param ctx the parse tree
	 */
	void exitValBool(@NotNull siiiParser.ValBoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull siiiParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull siiiParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#VarID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(@NotNull siiiParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#VarID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(@NotNull siiiParser.VarIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull siiiParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull siiiParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#simple_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimple_assignment(@NotNull siiiParser.Simple_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#simple_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimple_assignment(@NotNull siiiParser.Simple_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull siiiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull siiiParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull siiiParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull siiiParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#extern_func_def}.
	 * @param ctx the parse tree
	 */
	void enterExtern_func_def(@NotNull siiiParser.Extern_func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#extern_func_def}.
	 * @param ctx the parse tree
	 */
	void exitExtern_func_def(@NotNull siiiParser.Extern_func_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#Compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull siiiParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#Compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull siiiParser.CompareContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(@NotNull siiiParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(@NotNull siiiParser.UnaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(@NotNull siiiParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(@NotNull siiiParser.Func_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#BitAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitAnd(@NotNull siiiParser.BitAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#BitAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitAnd(@NotNull siiiParser.BitAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValChar}.
	 * @param ctx the parse tree
	 */
	void enterValChar(@NotNull siiiParser.ValCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValChar}.
	 * @param ctx the parse tree
	 */
	void exitValChar(@NotNull siiiParser.ValCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(@NotNull siiiParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(@NotNull siiiParser.BoolNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValRange}.
	 * @param ctx the parse tree
	 */
	void enterValRange(@NotNull siiiParser.ValRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValRange}.
	 * @param ctx the parse tree
	 */
	void exitValRange(@NotNull siiiParser.ValRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull siiiParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull siiiParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull siiiParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull siiiParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#Func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull siiiParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#Func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull siiiParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(@NotNull siiiParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(@NotNull siiiParser.TypeBasicContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull siiiParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull siiiParser.ReadContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#typelist}.
	 * @param ctx the parse tree
	 */
	void enterTypelist(@NotNull siiiParser.TypelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#typelist}.
	 * @param ctx the parse tree
	 */
	void exitTypelist(@NotNull siiiParser.TypelistContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull siiiParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull siiiParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#BoolOr}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(@NotNull siiiParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#BoolOr}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(@NotNull siiiParser.BoolOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#Value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull siiiParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#Value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull siiiParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValNull}.
	 * @param ctx the parse tree
	 */
	void enterValNull(@NotNull siiiParser.ValNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValNull}.
	 * @param ctx the parse tree
	 */
	void exitValNull(@NotNull siiiParser.ValNullContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(@NotNull siiiParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(@NotNull siiiParser.Var_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValVar}.
	 * @param ctx the parse tree
	 */
	void enterValVar(@NotNull siiiParser.ValVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValVar}.
	 * @param ctx the parse tree
	 */
	void exitValVar(@NotNull siiiParser.ValVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValInt}.
	 * @param ctx the parse tree
	 */
	void enterValInt(@NotNull siiiParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValInt}.
	 * @param ctx the parse tree
	 */
	void exitValInt(@NotNull siiiParser.ValIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull siiiParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull siiiParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull siiiParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull siiiParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#BitOr}.
	 * @param ctx the parse tree
	 */
	void enterBitOr(@NotNull siiiParser.BitOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#BitOr}.
	 * @param ctx the parse tree
	 */
	void exitBitOr(@NotNull siiiParser.BitOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#BoolAnd}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(@NotNull siiiParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#BoolAnd}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(@NotNull siiiParser.BoolAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#Paren}.
	 * @param ctx the parse tree
	 */
	void enterParen(@NotNull siiiParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#Paren}.
	 * @param ctx the parse tree
	 */
	void exitParen(@NotNull siiiParser.ParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull siiiParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull siiiParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(@NotNull siiiParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(@NotNull siiiParser.Param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull siiiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull siiiParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#complex_assignment}.
	 * @param ctx the parse tree
	 */
	void enterComplex_assignment(@NotNull siiiParser.Complex_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#complex_assignment}.
	 * @param ctx the parse tree
	 */
	void exitComplex_assignment(@NotNull siiiParser.Complex_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#VarList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(@NotNull siiiParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#VarList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(@NotNull siiiParser.VarListContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull siiiParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull siiiParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#Index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull siiiParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#Index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull siiiParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull siiiParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull siiiParser.Func_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#ValString}.
	 * @param ctx the parse tree
	 */
	void enterValString(@NotNull siiiParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#ValString}.
	 * @param ctx the parse tree
	 */
	void exitValString(@NotNull siiiParser.ValStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull siiiParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull siiiParser.Block_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull siiiParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull siiiParser.TypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link siiiParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(@NotNull siiiParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link siiiParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(@NotNull siiiParser.Simple_statementContext ctx);
}