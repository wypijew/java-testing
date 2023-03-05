package com.kodilla.collections.advanced.maps.homework;

import java.util.Objects;

public class Principal {
    private final String name;

    public Principal(String name) {
            this.name = name;
    }

    public String getName() {
            return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return name.equals(principal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Principal: " + name;
    }
}
