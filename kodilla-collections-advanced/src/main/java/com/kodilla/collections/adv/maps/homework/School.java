package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    private String name;
    private List<Integer> numberOfStudentsPerClass;

    public School(String name, List<Integer> numberOfStudentsPerClass) {
        this.name = name;
        this.numberOfStudentsPerClass = numberOfStudentsPerClass;
    }

    public String getName() {
            return name;
    }

    public int getTotalStudents() {
        int total = 0;
        for (int numberOfStudents : numberOfStudentsPerClass) {
            total += numberOfStudents;
        }
        return total;
    }
}
