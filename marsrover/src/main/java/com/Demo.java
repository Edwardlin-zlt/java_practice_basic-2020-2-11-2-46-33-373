package com;

public class Demo {
    public static void main(String[] args) {
        Car marsRover = new Car("marsRover", new North());

        marsRover.turnLeft();
        marsRover.turnRight();
    }
}
