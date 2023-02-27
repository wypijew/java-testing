package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Blue;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Red;
import com.kodilla.collections.interfaces.homework.Yellow;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Blue blue = new Blue(100);
        cars.add(blue);
        cars.add(new Yellow(150));
        cars.add(new Red(200));

        cars.remove(2);
        cars.remove(blue);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
