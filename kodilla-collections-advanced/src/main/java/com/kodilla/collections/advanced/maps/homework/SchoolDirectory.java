package com.kodilla.collections.advanced.maps.homework;

import java.util.*;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        schools.put(new Principal("John Jameson"), new School("Primary School", Arrays.asList(20, 25, 30)));
        schools.put(new Principal("Janine Smith"), new School("Middle School",Arrays.asList(50, 55, 60)));
        schools.put(new Principal("Bob Green"), new School("High School", Arrays.asList(100, 110, 120)));

        for (Map.Entry<Principal, School> schoolEntry : schools.entrySet()) {
            System.out.println("Principal: " + schoolEntry.getKey().getName() + ", School: " + schoolEntry.getValue().getName() +
                    ", Number of students: " + schoolEntry.getValue().getTotalStudents());
        }
    }
}
