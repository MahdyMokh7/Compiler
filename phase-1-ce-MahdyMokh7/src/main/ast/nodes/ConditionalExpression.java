package main.ast.nodes;

import main.visitor.IVisitor;

public class ConditionalExpression extends Expression {
    private Expression condition;
    private Expression ifTrue;
    private Expression ifFalse;

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setIfTrue(Expression ifTrue) {
        this.ifTrue = ifTrue;
    }

    public Expression getIfTrue() {
        return ifTrue;
    }

    public void setIfFalse(Expression ifFalse) {
        this.ifFalse = ifFalse;
    }

    public Expression getIfFalse() {
        return ifFalse;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
