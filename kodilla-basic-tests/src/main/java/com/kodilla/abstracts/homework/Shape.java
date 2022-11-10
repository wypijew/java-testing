package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double area;
    private double perimeter;

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape() {
        super();
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
