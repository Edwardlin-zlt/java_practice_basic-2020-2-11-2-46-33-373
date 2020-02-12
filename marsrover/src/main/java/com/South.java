package com;

public class South extends Direction implements changeDirection {
    public South() {
        super('S');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('E');
    }

    @Override
    public Direction turnRight() {
        return new Direction('S');
    }
}
