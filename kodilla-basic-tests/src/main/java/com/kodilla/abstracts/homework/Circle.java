package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    static final double PI = 3.1415927;
    private int r;

    public Circle(double area, double perimeter) {
        super(area, perimeter);
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        double result = PI * r + r;
        System.out.println("The area equals: " + result);
        return result;
    }

    public double getPerimeter() {
        double result = 2 * PI *r;
        System.out.println("The perimeter equals: " + result);
        return result;
    }
}
