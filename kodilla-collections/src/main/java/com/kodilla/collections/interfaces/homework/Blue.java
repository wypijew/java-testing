package com.kodilla.collections.interfaces.homework;

public class Blue implements Car {
    private int speed;

    public Blue(int speed) {
        this.speed = speed;
    }

    @Override

    public int getSpeed() {

        return speed;
    }

    @Override

    public void increaseSpeed() {

        speed += 12;
    }

    @Override

    public void decreaseSpeed() {

        speed -= 6;
    }
}

