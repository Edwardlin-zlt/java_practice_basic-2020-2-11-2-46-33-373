package com;

public class North extends Direction implements changeDirection {
    public North() {
        super('N');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('W');
    }

    @Override
    public Direction turnRight() {
        return new Direction('E');
    }
}
