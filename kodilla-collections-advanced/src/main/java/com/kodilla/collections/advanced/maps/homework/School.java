package com.kodilla.collections.advanced.maps.homework;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(numberOfStudentsPerClass, school.numberOfStudentsPerClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfStudentsPerClass);
    }

    @Override
    public String toString() {
        return "School: " + name +
                ", NumberOfStudentsPerClass=" + numberOfStudentsPerClass;
    }
}
