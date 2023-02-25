package com.kodilla.abstracts.homework;

public class Person {
    private int age;
    private String firstName;
    private Job job;

    public Person(int age, String firstName, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void showResponsibilities() {
        System.out.println(this.firstName + " is " + this.age + " years old and his responsibilities are: " + this.job.getResponsibilities());
    }

    }



