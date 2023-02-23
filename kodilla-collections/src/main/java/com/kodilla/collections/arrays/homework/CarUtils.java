package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Blue;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Red;
import com.kodilla.collections.interfaces.homework.Yellow;

public class CarUtils {

    public static void describeCar(Car car) {

        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed() + " km/h");
        System.out.println("-----------------------------");

    }

    private static String getCarName(Car car) {
        if (car instanceof Yellow)
            return "Yellow";
        else if (car instanceof Blue)
            return "Blue";
        else if (car instanceof Red)
            return "Red";
        else
            return "Unknown car name";
    }
}
