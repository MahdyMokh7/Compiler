package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class Pointer extends Node {

    public static class Level {
        private final boolean isConst;

        public Level(boolean isConst) {
            this.isConst = isConst;
        }

        public boolean isConst() {
            return isConst;
        }

        @Override
        public String toString() {
            return isConst ? "*const" : "*";
        }
    }

    private final List<Level> levels = new ArrayList<>();

    public void addLevel(boolean isConst) {
        levels.add(new Level(isConst));
    }

    public List<Level> getLevels() {
        return levels;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
