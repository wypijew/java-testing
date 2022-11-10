package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary) {
        this.salary = salary;
    }

    public int getSalary(int salary) {
        return salary;
    }


    public abstract void getResponsibilities();
}
