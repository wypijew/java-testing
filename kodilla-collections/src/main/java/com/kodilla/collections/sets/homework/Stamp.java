package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double length;
    private double width;
    private boolean stamped;

    public Stamp(String name, double length, double width, boolean stamped) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.length, length) == 0 && Double.compare(stamp.width, width) == 0 && stamped == stamp.stamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, width, stamped);
    }
}
