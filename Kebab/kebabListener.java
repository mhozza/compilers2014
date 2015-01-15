// Generated from kebab.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link kebabParser}.
 */
public interface kebabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link kebabParser#primitive_types}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_types(@NotNull kebabParser.Primitive_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#primitive_types}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_types(@NotNull kebabParser.Primitive_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#set_assign_unique}.
	 * @param ctx the parse tree
	 */
	void enterSet_assign_unique(@NotNull kebabParser.Set_assign_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#set_assign_unique}.
	 * @param ctx the parse tree
	 */
	void exitSet_assign_unique(@NotNull kebabParser.Set_assign_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#primitive_assign}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_assign(@NotNull kebabParser.Primitive_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#primitive_assign}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_assign(@NotNull kebabParser.Primitive_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull kebabParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ret}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull kebabParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull kebabParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull kebabParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatToInt}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFloatToInt(@NotNull kebabParser.FloatToIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatToInt}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFloatToInt(@NotNull kebabParser.FloatToIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull kebabParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull kebabParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull kebabParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull kebabParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#hash_map_declare}.
	 * @param ctx the parse tree
	 */
	void enterHash_map_declare(@NotNull kebabParser.Hash_map_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#hash_map_declare}.
	 * @param ctx the parse tree
	 */
	void exitHash_map_declare(@NotNull kebabParser.Hash_map_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull kebabParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull kebabParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#primitive_declare}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_declare(@NotNull kebabParser.Primitive_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#primitive_declare}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_declare(@NotNull kebabParser.Primitive_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Remove}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRemove(@NotNull kebabParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Remove}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRemove(@NotNull kebabParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull kebabParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull kebabParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull kebabParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull kebabParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void enterString_assign(@NotNull kebabParser.String_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#string_assign}.
	 * @param ctx the parse tree
	 */
	void exitString_assign(@NotNull kebabParser.String_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull kebabParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull kebabParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull kebabParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull kebabParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull kebabParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull kebabParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull kebabParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull kebabParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmp(@NotNull kebabParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmp(@NotNull kebabParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetContains}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetContains(@NotNull kebabParser.SetContainsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetContains}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetContains(@NotNull kebabParser.SetContainsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmp(@NotNull kebabParser.EmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmp(@NotNull kebabParser.EmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(@NotNull kebabParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(@NotNull kebabParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void enterArray_assign(@NotNull kebabParser.Array_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void exitArray_assign(@NotNull kebabParser.Array_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDouble(@NotNull kebabParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDouble(@NotNull kebabParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(@NotNull kebabParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(@NotNull kebabParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntToFloat}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntToFloat(@NotNull kebabParser.IntToFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntToFloat}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntToFloat(@NotNull kebabParser.IntToFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadChar}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadChar(@NotNull kebabParser.ReadCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadChar}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadChar(@NotNull kebabParser.ReadCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull kebabParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull kebabParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(@NotNull kebabParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(@NotNull kebabParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull kebabParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull kebabParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Long}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLong(@NotNull kebabParser.LongContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Long}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLong(@NotNull kebabParser.LongContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull kebabParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull kebabParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#set_declare}.
	 * @param ctx the parse tree
	 */
	void enterSet_declare(@NotNull kebabParser.Set_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#set_declare}.
	 * @param ctx the parse tree
	 */
	void exitSet_declare(@NotNull kebabParser.Set_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull kebabParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull kebabParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(@NotNull kebabParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(@NotNull kebabParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#set_remove}.
	 * @param ctx the parse tree
	 */
	void enterSet_remove(@NotNull kebabParser.Set_removeContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#set_remove}.
	 * @param ctx the parse tree
	 */
	void exitSet_remove(@NotNull kebabParser.Set_removeContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#string_declare}.
	 * @param ctx the parse tree
	 */
	void enterString_declare(@NotNull kebabParser.String_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#string_declare}.
	 * @param ctx the parse tree
	 */
	void exitString_declare(@NotNull kebabParser.String_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadInt}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadInt(@NotNull kebabParser.ReadIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadInt}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadInt(@NotNull kebabParser.ReadIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#array_declare}.
	 * @param ctx the parse tree
	 */
	void enterArray_declare(@NotNull kebabParser.Array_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#array_declare}.
	 * @param ctx the parse tree
	 */
	void exitArray_declare(@NotNull kebabParser.Array_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Una}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull kebabParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Una}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull kebabParser.UnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull kebabParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull kebabParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#hash_map_assign}.
	 * @param ctx the parse tree
	 */
	void enterHash_map_assign(@NotNull kebabParser.Hash_map_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#hash_map_assign}.
	 * @param ctx the parse tree
	 */
	void exitHash_map_assign(@NotNull kebabParser.Hash_map_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(@NotNull kebabParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(@NotNull kebabParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileDo(@NotNull kebabParser.WhileDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileDo(@NotNull kebabParser.WhileDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCyclus}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForCyclus(@NotNull kebabParser.ForCyclusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCyclus}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForCyclus(@NotNull kebabParser.ForCyclusContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#string_declare_and_assign}.
	 * @param ctx the parse tree
	 */
	void enterString_declare_and_assign(@NotNull kebabParser.String_declare_and_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#string_declare_and_assign}.
	 * @param ctx the parse tree
	 */
	void exitString_declare_and_assign(@NotNull kebabParser.String_declare_and_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterChar(@NotNull kebabParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitChar(@NotNull kebabParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull kebabParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull kebabParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoPrint}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNoPrint(@NotNull kebabParser.NoPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoPrint}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNoPrint(@NotNull kebabParser.NoPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMod(@NotNull kebabParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMod(@NotNull kebabParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadString}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadString(@NotNull kebabParser.ReadStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadString}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadString(@NotNull kebabParser.ReadStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(@NotNull kebabParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(@NotNull kebabParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#set_assign}.
	 * @param ctx the parse tree
	 */
	void enterSet_assign(@NotNull kebabParser.Set_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#set_assign}.
	 * @param ctx the parse tree
	 */
	void exitSet_assign(@NotNull kebabParser.Set_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#primitive_declare_and_assign}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_declare_and_assign(@NotNull kebabParser.Primitive_declare_and_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#primitive_declare_and_assign}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_declare_and_assign(@NotNull kebabParser.Primitive_declare_and_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetSize}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetSize(@NotNull kebabParser.SetSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetSize}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetSize(@NotNull kebabParser.SetSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(@NotNull kebabParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(@NotNull kebabParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull kebabParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull kebabParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#primitive_typesaaa}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_typesaaa(@NotNull kebabParser.Primitive_typesaaaContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#primitive_typesaaa}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_typesaaa(@NotNull kebabParser.Primitive_typesaaaContext ctx);
	/**
	 * Enter a parse tree produced by {@link kebabParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull kebabParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link kebabParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull kebabParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Foreach}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForeach(@NotNull kebabParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Foreach}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForeach(@NotNull kebabParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull kebabParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull kebabParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull kebabParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link kebabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull kebabParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclareAndAssign}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssign(@NotNull kebabParser.DeclareAndAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclareAndAssign}
	 * labeled alternative in {@link kebabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssign(@NotNull kebabParser.DeclareAndAssignContext ctx);
}