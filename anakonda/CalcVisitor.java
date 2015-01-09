import java.util.HashMap;
import java.util.Map;

public class CalcVisitor extends calculatorBaseVisitor<Integer> {
        Map<String, Integer> mem = new HashMap<String, Integer>();

        @Override
        public Integer visitAssign(calculatorParser.AssignContext ctx) {
                String identifier = ctx.lvalue().getText();
                int value = visit(ctx.expression());
                mem.put(identifier, value);
                return value;
        }

        @Override
        public Integer visitPrint(calculatorParser.PrintContext ctx) {
                int value = visit(ctx.expression());
                System.out.println(value);
                return 0;
        }

        @Override
        public Integer visitAdd(calculatorParser.AddContext ctx) {
                int value1 = visit(ctx.expression(0));
                int value2 = visit(ctx.expression(1));
                if (ctx.op.getType() == calculatorParser.ADD) {
                        return value1 + value2;
                }
                return value1 - value2;
        }

        @Override 
        public Integer visitMul(calculatorParser.MulContext ctx) {
                int value1 = visit(ctx.expression(0));
                int value2 = visit(ctx.expression(1));
                if (ctx.op.getType() == calculatorParser.MUL) {
                        return value1 * value2;
                }
                return value1 / value2;
        }

        @Override 
        public Integer visitExp(calculatorParser.ExpContext ctx) {
                int value1 = visit(ctx.expression(0));
                int value2 = visit(ctx.expression(1));
                return (int)Math.pow((double)value1, (double)value2);
        }

        @Override
        public Integer visitPar(calculatorParser.ParContext ctx) {
                return visit(ctx.expression());
        }


        @Override
        public Integer visitUna(calculatorParser.UnaContext ctx) {
                int value = visit(ctx.expression());
                if (ctx.op.getType() == calculatorParser.ADD) {
                        return value;
                }
                return -value;
        }

        @Override
        public Integer visitVar(calculatorParser.VarContext ctx) {
                String id = ctx.STRING().getText();
                if (mem.containsKey(id))  return mem.get(id);
                return 0;
        }

        @Override
        public Integer visitInt(calculatorParser.IntContext ctx) {
                return Integer.valueOf(ctx.INT().getText());
        }

        @Override 
        public Integer visitBlock(calculatorParser.BlockContext ctx) {
                return visit(ctx.statements());
        }

        @Override 
        public Integer visitIf(calculatorParser.IfContext ctx) {
                int val = visit(ctx.expression());
                if (val != 0) val = 1;

                if (ctx.statement((val + 1) % 2) != null)
                {
                    return visit(ctx.statement((val + 1) % 2));
                }
                return 0;
        }

        @Override
        public Integer visitWhile(calculatorParser.WhileContext ctx) {
                int val = 0;
                while (visit(ctx.expression()) != 0) val = visit(ctx.statement());
                return val;
        }

        @Override 
        public Integer visitNot(calculatorParser.NotContext ctx) {
                if (visit(ctx.expression()) == 0) return 1;
                return 0;
        }

        @Override
        public Integer visitAnd(calculatorParser.AndContext ctx) {
                if ((visit(ctx.expression(0)) != 0) && (visit(ctx.expression(1)) != 0)) return 1;
                return 0;
        }

        @Override
        public Integer visitOr(calculatorParser.OrContext ctx) {
                if ((visit(ctx.expression(0)) != 0) || (visit(ctx.expression(1)) != 0)) return 1;
                return 0;
        }

        @Override
        public Integer visitInit(calculatorParser.InitContext ctx) {
                visit(ctx.statements());
                return 0;
        }
        
        @Override
        public Integer visitStatements(calculatorParser.StatementsContext ctx) {
                for(calculatorParser.StatementContext s: ctx.statement()) {
                        visit(s);
                }
                return 0;
        }

}
