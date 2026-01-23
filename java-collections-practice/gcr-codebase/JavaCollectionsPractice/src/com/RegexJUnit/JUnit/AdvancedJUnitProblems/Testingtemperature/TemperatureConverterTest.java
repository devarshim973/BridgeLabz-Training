package com.RegexJUnit.JUnit.AdvancedJUnitProblems.Testingtemperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.001);
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.001);
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
    }
}
