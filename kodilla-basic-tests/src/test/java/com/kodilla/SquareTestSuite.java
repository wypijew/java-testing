package com.kodilla;

import com.kodilla.Calculator;
import org.junit.jupiter.api.Test;

import static com.kodilla.ResultChecker1.assertEquals1;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTestSuite {

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5.0;
        double b = 0.0;
        double c = -4;
        double squareResultA = calculator.square(a);
        assertEquals(25.0, squareResultA, 0.001);
        double squareResultB = calculator.square(b);
        assertEquals(0.0, squareResultB, 0.001);
        double squareResultC = calculator.square(c);
        assertEquals(16.0, squareResultC, 0.001);
    }
}
