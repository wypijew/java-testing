package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        System.out.println();
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        TheScreen theScreen = new TheScreen(2015);
        theScreen.turnOn();
        theScreen.turnOff();


        TheRadiator theRadiator = new TheRadiator(2018);
        theRadiator.turnOn();
        theRadiator.turnOff();

    }
}
