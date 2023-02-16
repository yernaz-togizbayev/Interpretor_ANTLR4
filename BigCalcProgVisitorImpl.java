import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;


public class BigCalcProgVisitorImpl extends BigCalcProgBaseVisitor<BigDecimal> {
	
	private final Map<String, BigDecimal> varMap = new HashMap<>();
	
	@Override
	public BigDecimal visitProg(BigCalcProgParser.ProgContext ctx) {
		BigDecimal res = BigDecimal.ZERO;
		for (BigCalcProgParser.StatementContext statement : ctx.statement())
			res = visit(statement);
		return res;
	}
	
    @Override
    public BigDecimal visitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx) {
    	return visit(ctx.expression());
    }
    
    @Override
    public BigDecimal visitAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx) {
    	return visit(ctx.assignment());
    }
    
    @Override
    public BigDecimal visitAssignment(BigCalcProgParser.AssignmentContext ctx) {
    	BigDecimal num = visit(ctx.expression());
    	varMap.put(ctx.Var().getText(), num);
    	return num;
    }
    
    @Override
    public BigDecimal visitParentheses(BigCalcProgParser.ParenthesesContext ctx) {
    	return visit(ctx.expression());
    }

    @Override
    public BigDecimal visitMulDiv(BigCalcProgParser.MulDivContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            return left.multiply(right);
        } else {
            return left.divide(right, 10, RoundingMode.HALF_UP);
        }
    }

    @Override
    public BigDecimal visitAddSub(BigCalcProgParser.AddSubContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("+")) {
            return left.add(right);
        } else {
            return left.subtract(right);
        }
    }

    @Override
    public BigDecimal visitNum(BigCalcProgParser.NumContext ctx) {
        return new BigDecimal(ctx.Number().getText());
    }
    
    @Override
    public BigDecimal visitVar(BigCalcProgParser.VarContext ctx) {
    	String Variable = ctx.Var().getText();
    	if (varMap.containsKey(Variable))
    		return varMap.get(Variable);
    	else {
			System.out.println("Warning: undefined variable: " + Variable);
			return BigDecimal.ZERO;
		}
    }
    
    @Override
    public BigDecimal visitConditional(BigCalcProgParser.ConditionalContext ctx) {
    	final BigDecimal expr0  = visit(ctx.expression(0));
    	final BigDecimal expr1  = visit(ctx.expression(1));
    	final BigDecimal expr2  = visit(ctx.expression(2));
    	
		return expr0.doubleValue() != 0.0 ? expr1 : expr2;
    }
    
    public BigDecimal visitPow (BigCalcProgParser.PowContext ctx) {
    	BigDecimal lVal = visit(ctx.expression(0));
    	BigDecimal rVal = visit(ctx.expression(1));
    	
    	return lVal.pow(rVal.intValue());
    }
    
    /*
    @Override
    public BigDecimal visitWarning(BigCalcProgParser.WarningContext ctx) {
    	return new BigDecimal(ctx.getText());
    }
	*/
}
