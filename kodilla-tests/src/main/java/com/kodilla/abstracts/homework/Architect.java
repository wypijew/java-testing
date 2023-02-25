package com.kodilla.abstracts.homework;

public class Architect extends Job {
    public Architect(int salary, String responsibilities) {
        super(salary, responsibilities);
        this.responsibilities = responsibilities;


    }


    public int getSalary() {
        int salary = 5500;
        System.out.println("The salary is " + salary);
        return salary;
    }

    @Override
    public String getResponsibilities() {
        System.out.println("The responsibilities are:" + "creating projects" + ", " + "construction control" + ", " + "modernization.");

        return this.responsibilities;
    }
}
