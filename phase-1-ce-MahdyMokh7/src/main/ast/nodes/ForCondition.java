package main.ast.nodes;

import main.visitor.IVisitor;

public class ForCondition extends Node {
    private final ForDeclaration forDeclaration;
    private final Expression initialExpression;
    private final ForExpression conditionExpression;
    private final ForExpression updateExpression;

    public ForCondition(ForDeclaration forDeclaration, Expression initialExpression,
                        ForExpression conditionExpression, ForExpression updateExpression) {
        this.forDeclaration = forDeclaration;
        this.initialExpression = initialExpression;
        this.conditionExpression = conditionExpression;
        this.updateExpression = updateExpression;
    }

    public ForDeclaration getForDeclaration() {
        return forDeclaration;
    }

    public Expression getInitialExpression() {
        return initialExpression;
    }

    public ForExpression getConditionExpression() {
        return conditionExpression;
    }

    public ForExpression getUpdateExpression() {
        return updateExpression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
