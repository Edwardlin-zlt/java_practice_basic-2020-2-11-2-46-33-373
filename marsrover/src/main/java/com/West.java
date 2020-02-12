package com;

public class West extends Direction implements changeDirection {
    public West() {
        super('W');
    }

    @Override
    public Direction turnLeft() {
        return new Direction('S');
    }

    @Override
    public Direction turnRight() {
        return new Direction('N');
    }
}
