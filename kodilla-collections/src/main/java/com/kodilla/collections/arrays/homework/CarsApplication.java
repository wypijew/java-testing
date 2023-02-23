package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Blue;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Red;
import com.kodilla.collections.interfaces.homework.Yellow;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = showCar();
        }

        for (Car car : cars) {
            int speed = random.nextInt(200) + 1;
            CarUtils.describeCar(car, speed);
        }
    }

    public static Car showCar() {
        int shownCarName = RANDOM.nextInt(3); // losowanie numeru nazwy samochodu
        int speed = RANDOM.nextInt(200) + 1; // losowanie prędkości od 1 do 100 km/h

        if (shownCarName == 0) {
            Car car = new Yellow();
            car.increaseSpeed();
            System.out.println("Yellow " + speed);
            return car;
        }
        else if (shownCarName == 1) {
            Car car = new Blue();
            car.increaseSpeed();
            System.out.println("Blue " + speed);
            return car;
        }
        else {
            Car car = new Red();
            car.increaseSpeed();
            System.out.println("Red " + speed);
            return car;
        }
    }
}




//        if (shownCarName == 0) {
//            Car car = new Yellow();
//            car.getSpeed();
//            System.out.println("Yellow" + car.getSpeed());
//            return new Yellow();
//        } else if (shownCarName == 1) {
//            Car car = new Blue();
//            car.getSpeed();
//            System.out.println("Blue" + car.getSpeed());
//            return new Blue();
//        } else {
//            Car car = new Red();
//            car.getSpeed();
//            System.out.println("Red" + car.getSpeed());
//            return new Red();
//        }



//    public static Car showCar() {
//        int shownCarName = RANDOM.nextInt(3); // losowanie numeru nazwy samochodu
//        int speed = RANDOM.nextInt(200) + 1; // losowanie prędkości od 1 do 100 km/h
//
//        if (shownCarName == 0) {
//            System.out.println("Yellow" + speed);
//            return new Yellow();
//        } else if (shownCarName == 1) {
//            System.out.println("Blue" + speed);
//            return new Blue();
//        } else {
//            System.out.println("Red" + speed);
//            return new Red();
//        }
//    }