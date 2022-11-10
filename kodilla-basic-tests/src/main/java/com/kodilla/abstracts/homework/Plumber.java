package com.kodilla.abstracts.homework;

public class Plumber extends Job {


    public Plumber(int salary) {
        super(salary);
    }

    public int getSalary() {
        int salary = 4500;
        System.out.println("The salary is " + salary);
        return salary;
    }

    @Override
    public void getResponsibilities() {
        System.out.println("The responsibilities are:" + "installing" + ", " + "maintenance" + ", " + "technical supervision.");
    }
}
