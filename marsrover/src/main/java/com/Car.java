package com;

public class Car {
    private Direction currentDirection;
    private String carName;

    public Car() {
    }

    public Car(String carName, Direction currentDirection) {
        this.currentDirection = currentDirection;
        this.carName = carName;
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
        System.out.println(carName + " turned to the left, heading to " + currentDirection.getDirection());
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
        System.out.println(carName + " turned to the right, heading to " + currentDirection.getDirection());
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
