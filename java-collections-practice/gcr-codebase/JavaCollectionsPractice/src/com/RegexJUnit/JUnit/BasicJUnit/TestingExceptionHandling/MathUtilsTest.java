package com.RegexJUnit.JUnit.BasicJUnit.TestingExceptionHandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }
}
