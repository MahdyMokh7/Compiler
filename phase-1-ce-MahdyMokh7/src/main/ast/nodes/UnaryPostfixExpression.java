package main.ast.nodes;

import main.visitor.IVisitor;

public class UnaryPostfixExpression extends Expression {
    private Expression operand;
    private String operator;

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
