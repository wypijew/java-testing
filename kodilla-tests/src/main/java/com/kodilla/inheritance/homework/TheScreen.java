package com.kodilla.inheritance.homework;

public class TheScreen extends OperatingSystem {

    public TheScreen(int productionYear) {
        super(productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("The screen was turned on");
    }

    public void turnOff() {
        System.out.println("The screen was turned off");
    }
}
