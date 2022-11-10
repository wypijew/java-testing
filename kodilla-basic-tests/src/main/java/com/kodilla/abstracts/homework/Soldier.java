package com.kodilla.abstracts.homework;

public class Soldier extends Job {


    public Soldier(int salary) {
        super(salary);
    }

    public int getSalary() {
        int salary = 6500;
        System.out.println("The salary is " + salary);
        return salary;
    }

    @Override
    public void getResponsibilities() {
        System.out.println("The responsibilities are:" + "defense activities" + ", " + "obeying orders" + ", " + "domestic service.");

    }
}
