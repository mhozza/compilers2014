// Generated from Saral.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SaralParser}.
 */
public interface SaralListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull SaralParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull SaralParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#var_definition}.
	 * @param ctx the parse tree
	 */
	void enterVar_definition(@NotNull SaralParser.Var_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#var_definition}.
	 * @param ctx the parse tree
	 */
	void exitVar_definition(@NotNull SaralParser.Var_definitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarID}
	 * labeled alternative in {@link SaralParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarID(@NotNull SaralParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarID}
	 * labeled alternative in {@link SaralParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarID(@NotNull SaralParser.VarIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SaralParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SaralParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull SaralParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull SaralParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(@NotNull SaralParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(@NotNull SaralParser.Array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValChar(@NotNull SaralParser.ValCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValChar(@NotNull SaralParser.ValCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#typeSimple}.
	 * @param ctx the parse tree
	 */
	void enterTypeSimple(@NotNull SaralParser.TypeSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#typeSimple}.
	 * @param ctx the parse tree
	 */
	void exitTypeSimple(@NotNull SaralParser.TypeSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SaralParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SaralParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull SaralParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull SaralParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull SaralParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull SaralParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull SaralParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull SaralParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(@NotNull SaralParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(@NotNull SaralParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#func_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunc_definition(@NotNull SaralParser.Func_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#func_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunc_definition(@NotNull SaralParser.Func_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull SaralParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull SaralParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull SaralParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull SaralParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarArray}
	 * labeled alternative in {@link SaralParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVarArray(@NotNull SaralParser.VarArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarArray}
	 * labeled alternative in {@link SaralParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVarArray(@NotNull SaralParser.VarArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull SaralParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull SaralParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull SaralParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull SaralParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#read2}.
	 * @param ctx the parse tree
	 */
	void enterRead2(@NotNull SaralParser.Read2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#read2}.
	 * @param ctx the parse tree
	 */
	void exitRead2(@NotNull SaralParser.Read2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(@NotNull SaralParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(@NotNull SaralParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(@NotNull SaralParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(@NotNull SaralParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValVar}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValVar(@NotNull SaralParser.ValVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValVar}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValVar(@NotNull SaralParser.ValVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#extern_proc_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtern_proc_declaration(@NotNull SaralParser.Extern_proc_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#extern_proc_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtern_proc_declaration(@NotNull SaralParser.Extern_proc_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#const_definition}.
	 * @param ctx the parse tree
	 */
	void enterConst_definition(@NotNull SaralParser.Const_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#const_definition}.
	 * @param ctx the parse tree
	 */
	void exitConst_definition(@NotNull SaralParser.Const_definitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull SaralParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull SaralParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull SaralParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull SaralParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#write2}.
	 * @param ctx the parse tree
	 */
	void enterWrite2(@NotNull SaralParser.Write2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#write2}.
	 * @param ctx the parse tree
	 */
	void exitWrite2(@NotNull SaralParser.Write2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(@NotNull SaralParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(@NotNull SaralParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull SaralParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull SaralParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(@NotNull SaralParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(@NotNull SaralParser.TypeBasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(@NotNull SaralParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(@NotNull SaralParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull SaralParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull SaralParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull SaralParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull SaralParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SaralParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SaralParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValString(@NotNull SaralParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValString(@NotNull SaralParser.ValStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#func_block}.
	 * @param ctx the parse tree
	 */
	void enterFunc_block(@NotNull SaralParser.Func_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#func_block}.
	 * @param ctx the parse tree
	 */
	void exitFunc_block(@NotNull SaralParser.Func_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#extern_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtern_func_declaration(@NotNull SaralParser.Extern_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#extern_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtern_func_declaration(@NotNull SaralParser.Extern_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValFloat}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValFloat(@NotNull SaralParser.ValFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValFloat}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValFloat(@NotNull SaralParser.ValFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValBool(@NotNull SaralParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValBool(@NotNull SaralParser.ValBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SaralParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SaralParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValInt(@NotNull SaralParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link SaralParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValInt(@NotNull SaralParser.ValIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(@NotNull SaralParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(@NotNull SaralParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#proc_definition}.
	 * @param ctx the parse tree
	 */
	void enterProc_definition(@NotNull SaralParser.Proc_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#proc_definition}.
	 * @param ctx the parse tree
	 */
	void exitProc_definition(@NotNull SaralParser.Proc_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull SaralParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull SaralParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaralParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(@NotNull SaralParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaralParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(@NotNull SaralParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(@NotNull SaralParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(@NotNull SaralParser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(@NotNull SaralParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(@NotNull SaralParser.BoolOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(@NotNull SaralParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(@NotNull SaralParser.BoolAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(@NotNull SaralParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link SaralParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(@NotNull SaralParser.ParenContext ctx);
}