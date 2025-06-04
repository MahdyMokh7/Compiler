package main.ast.nodes;

import main.visitor.IVisitor;

public class ContinueStatement extends JumpStatement {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
