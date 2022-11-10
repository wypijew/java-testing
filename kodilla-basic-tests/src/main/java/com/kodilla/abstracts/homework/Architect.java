package com.kodilla.abstracts.homework;

public class Architect extends Job {
    public Architect(int salary) {
        super(salary);
    }

    public int getSalary() {
        int salary = 5500;
        System.out.println("The salary is " + salary);
        return salary;
    }

    @Override
    public void getResponsibilities() {
        System.out.println("The responsibilities are:" + "creating projects" + ", " + "construction control" + ", " + "modernization.");
    }
}
