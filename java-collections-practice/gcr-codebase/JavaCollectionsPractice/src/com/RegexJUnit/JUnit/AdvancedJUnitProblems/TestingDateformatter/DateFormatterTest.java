package com.RegexJUnit.JUnit.AdvancedJUnitProblems.TestingDateformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.format.DateTimeParseException;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
    }

    @Test
    void testAnotherValidDate() {
        assertEquals("01-01-2024", formatter.formatDate("2024-01-01"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(DateTimeParseException.class, () -> formatter.formatDate("2024-13-01"));
    }

    @Test
    void testIncorrectFormat() {
        assertThrows(DateTimeParseException.class, () -> formatter.formatDate("01/01/2024"));
    }
}
