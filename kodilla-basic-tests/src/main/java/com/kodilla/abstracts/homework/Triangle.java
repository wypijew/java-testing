package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private int a;
    private int h;

    public Triangle(double area, double perimeter) {
        super(area, perimeter);
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        double result = 0.5 * a + h;
        System.out.println("The area equals: " + result);
        return result;
    }

    public double getPerimeter() {
        double result = 3 * a;
        System.out.println("The perimeter equals: " + result);
        return result;
    }
}
