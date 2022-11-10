package com.kodilla.abstracts.homework;

public class Application1 {
    public static void main(String[] args) {
        Plumber plumber = new Plumber(4500);
        System.out.println("A plumber");
        plumber.getSalary();
        plumber.getResponsibilities();

        Architect architect = new Architect(5500);
        System.out.println("An architect");
        architect.getSalary();
        architect.getResponsibilities();

        Soldier soldier = new Soldier(6500);
        System.out.println("A soldier");
        soldier.getSalary();
        soldier.getResponsibilities();
    }
}
