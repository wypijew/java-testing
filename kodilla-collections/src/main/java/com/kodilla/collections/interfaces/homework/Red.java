package com.kodilla.collections.interfaces.homework;

public class Red implements Car {
    private int speed;

    public Red(int speed) {
        this.speed = speed;
    }

    @Override

    public int getSpeed() {

        return speed;
    }

    @Override

    public void increaseSpeed() {

        speed += 8;
    }

    @Override

    public void decreaseSpeed() {

        speed -= 4;
    }
}