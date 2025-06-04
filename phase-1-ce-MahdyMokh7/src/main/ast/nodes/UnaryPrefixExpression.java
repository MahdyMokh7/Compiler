package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class UnaryPrefixExpression extends Expression {
    private final List<String> operators = new ArrayList<>();
    private Expression operand;

    public void addOperator(String op) {
        operators.add(op);
    }

    public List<String> getOperators() {
        return operators;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
