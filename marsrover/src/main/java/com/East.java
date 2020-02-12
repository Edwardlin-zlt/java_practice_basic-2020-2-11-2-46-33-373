package com;

public class East extends Direction implements changeDirection {

    public East() {
        super('E');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('N');
    }

    @Override
    public Direction turnRight() {
        return new Direction('S');
    }
}
