package com.kodilla.inheritance.homework;

public class TheRadiator extends OperatingSystem {

    public TheRadiator(int productionYear) {
        super(productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("The radiator was turned on");
    }

    public void turnOff() {
        System.out.println("The radiator was turned off");
    }
}
