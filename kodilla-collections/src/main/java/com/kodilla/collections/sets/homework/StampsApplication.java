package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stamp 1", 10.0, 5.0, true));
        stamps.add(new Stamp("Stamp 2", 8.0, 4.0, false));
        stamps.add(new Stamp("Stamp 3", 10.0, 5.0, true));
        stamps.add(new Stamp("Stamp 1", 10.0, 5.0, true));
        stamps.add(new Stamp("Stamp 4", 9.0, 6.0, false));

        System.out.println("Number of stamps in the collection: " + stamps.size());
        System.out.println("Stamps in the collection: ");
        for (Stamp stamp : stamps) {
            System.out.println("Name: " + stamp.getName() + ", Length: " + stamp.getLength() + ", Width: " + stamp.getWidth() + ", Stamped: " + stamp.isStamped());
        }

    }
}
