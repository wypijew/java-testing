package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a,b);

        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct1) {
            System.out.println("Metoda różnic działa poprawnie dla liczb" + a + " i " + b);
        } else {
            System.out.println("Metoda różnic nie działa poprawnie dla liczb" + a + " i " + b);
        }

        int squareResult = calculator.square(a);

        boolean correct2 = ResultChecker.assertEquals(25, squareResult);
        if (correct2) {
            System.out.println("Metoda kwadratów działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda kwadratów nie działa poprawnie dla liczby " + a);
        }

    }
}
