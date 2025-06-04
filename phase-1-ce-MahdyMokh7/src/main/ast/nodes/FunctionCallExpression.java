package main.ast.nodes;

import main.visitor.IVisitor;

public class FunctionCallExpression extends Expression {
    private Expression function;
    private ArgumentExpressionList arguments;

    public void setFunction(Expression function) {
        this.function = function;
    }

    public Expression getFunction() {
        return function;
    }

    public void setArguments(ArgumentExpressionList arguments) {
        this.arguments = arguments;
    }

    public ArgumentExpressionList getArguments() {
        return arguments;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
