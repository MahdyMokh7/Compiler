package main.ast.nodes;

import main.visitor.IVisitor;

public class BreakStatement extends JumpStatement {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
