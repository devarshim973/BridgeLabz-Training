package com.RegexJUnit.JUnit.BasicJUnit.TestingCalculatorClass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void addTest() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractTest() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void multiplyTest() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divideTest() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
