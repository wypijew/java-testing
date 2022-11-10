package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int a;

    public Square(double area, double perimeter) {
        super(area, perimeter);
    }

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        double result = a * a;
        System.out.println("The area equals: " + result);
        return result;
    }

    public double getPerimeter() {
        double result = 4 * a;
        System.out.println("The perimeter equals: " + result);
        return result;
    }
}
