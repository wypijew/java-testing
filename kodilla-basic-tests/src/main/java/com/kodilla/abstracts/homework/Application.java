package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The circle");
        circle.getArea();
        circle.getPerimeter();

        Triangle triangle = new Triangle(5, 4);
        System.out.println("The triangle");
        triangle.getArea();
        triangle.getPerimeter();

        Square square = new Square(8);
        System.out.println("The square");
        square.getArea();
        square.getPerimeter();



    }
}
