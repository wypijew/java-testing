package com.kodilla.abstracts.homework;

public class Plumber extends Job {
    public Plumber(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    public int getSalary() {
        int salary = 4500;
        System.out.println("The salary is " + salary);
        return salary;
    }

    @Override
    public String getResponsibilities() {
        System.out.println("The responsibilities are:" + "installing" + ", " + "maintenance" + ", " + "technical supervision.");
        return this.responsibilities;
    }
}
