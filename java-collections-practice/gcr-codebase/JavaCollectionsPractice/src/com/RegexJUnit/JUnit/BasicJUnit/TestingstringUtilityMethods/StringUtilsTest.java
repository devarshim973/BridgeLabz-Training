package com.RegexJUnit.JUnit.BasicJUnit.TestingstringUtilityMethods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    void reverseTest() {
        assertEquals("avaJ", stringUtils.reverse("Java"));
    }

    @Test
    void palindromeTestTrue() {
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    void palindromeTestFalse() {
        assertFalse(stringUtils.isPalindrome("java"));
    }

    @Test
    void toUpperCaseTest() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
}
