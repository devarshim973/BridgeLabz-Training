package com.RegexJUnit.JUnit.BasicJUnit.TestingParameterizedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void isEvenTest(int value) {
        assertEquals(value % 2 == 0, numberUtils.isEven(value));
    }
}
