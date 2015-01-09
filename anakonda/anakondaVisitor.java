// Generated from anakonda.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link anakondaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface anakondaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link anakondaParser#Types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(@NotNull anakondaParser.TypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull anakondaParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Readpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadpression(@NotNull anakondaParser.ReadpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(@NotNull anakondaParser.ValBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Orpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrpression(@NotNull anakondaParser.OrpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ListIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIndex(@NotNull anakondaParser.ListIndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValChar(@NotNull anakondaParser.ValCharContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValRange(@NotNull anakondaParser.ValRangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#normal_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_assign(@NotNull anakondaParser.Normal_assignContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Notpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotpression(@NotNull anakondaParser.NotpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#CallFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFun(@NotNull anakondaParser.CallFunContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(@NotNull anakondaParser.DecrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#TypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull anakondaParser.TypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(@NotNull anakondaParser.IncrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull anakondaParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Decpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecpression(@NotNull anakondaParser.DecpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(@NotNull anakondaParser.UnaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull anakondaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValVoid(@NotNull anakondaParser.ValVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(@NotNull anakondaParser.ValStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Incpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncpression(@NotNull anakondaParser.IncpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#call_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_fun(@NotNull anakondaParser.Call_funContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull anakondaParser.RetContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#define_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_fun(@NotNull anakondaParser.Define_funContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValList(@NotNull anakondaParser.ValListContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull anakondaParser.RangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#oneline_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneline_statement(@NotNull anakondaParser.Oneline_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#VarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(@NotNull anakondaParser.VarNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Multipression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipression(@NotNull anakondaParser.MultipressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull anakondaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#extern_func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_func_def(@NotNull anakondaParser.Extern_func_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#define_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_var(@NotNull anakondaParser.Define_varContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Valpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValpression(@NotNull anakondaParser.ValpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#PrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull anakondaParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(@NotNull anakondaParser.IfblockContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull anakondaParser.ArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Precedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence(@NotNull anakondaParser.PrecedenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#combined_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_assign(@NotNull anakondaParser.Combined_assignContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull anakondaParser.ReadContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Andpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndpression(@NotNull anakondaParser.AndpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#whilecycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilecycle(@NotNull anakondaParser.WhilecycleContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValVar(@NotNull anakondaParser.ValVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#ValInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(@NotNull anakondaParser.ValIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull anakondaParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull anakondaParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Addpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddpression(@NotNull anakondaParser.AddpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompression(@NotNull anakondaParser.CompressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#VarList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(@NotNull anakondaParser.VarListContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#forcycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcycle(@NotNull anakondaParser.ForcycleContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#Params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull anakondaParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link anakondaParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(@NotNull anakondaParser.Block_statementContext ctx);
}