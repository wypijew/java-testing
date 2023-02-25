package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int productionYear;

    public OperatingSystem(int productionYear) {
        this.productionYear = productionYear;
    }

    public void turnOff() {
        System.out.println("The operating system was turned off");
    }

    public void turnOn() {
        System.out.println("The operating system was turned on");
    }

    public int getProductionYear() {
        return productionYear;
    }
}
