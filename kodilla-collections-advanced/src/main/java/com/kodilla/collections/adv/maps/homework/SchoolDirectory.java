package com.kodilla.collections.adv.maps.homework;

import java.util.*;

public class SchoolDirectory {
    public static void main(String[] args) {

        Principal principal1 = new Principal("John Jameson");
        Principal principal2 = new Principal("Janine Smith");
        Principal principal3 = new Principal("Bob Green");

        Map<Principal, School> schools = new HashMap<>();
        School school1 = new School("Primary School", Arrays.asList(20, 25, 30));
        School school2 = new School("Middle School", Arrays.asList(50, 55, 60));
        School school3 = new School("High School", Arrays.asList(100, 110, 120));

        schools.put(principal1, school1);
        schools.put(principal2, school2);
        schools.put(principal3, school3);

        for (Map.Entry<Principal, School> schoolEntry : schools.entrySet()) {
            System.out.println("Principal: " + schoolEntry.getKey().getName() + ", School: " + schoolEntry.getValue().getName() +
                    ", Number of students: " + schoolEntry.getValue().getTotalStudents());
        }
    }
}
