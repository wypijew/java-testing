package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car yellow = new Yellow(0);
        Car red = new Red(0);
        Car blue = new Blue(0);

        doRace(yellow);
        doRace(red);
        doRace(blue);
    }
    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println("Final speed of " + car.getClass().getSimpleName() + ": " + car.getSpeed());
    }
}
