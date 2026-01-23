package com.RegexJUnit.JUnit.BasicJUnit.TestingExceptionHandling;

public class MathUtils {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
