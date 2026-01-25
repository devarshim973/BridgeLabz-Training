package com.RegexJUnit.Regex.BasicRegexProblems;

class LicensePlateValidation {

    public static boolean isValid(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static void main(String[] args) {
        System.out.println(isValid("AB1234"));
        System.out.println(isValid("A12345"));
    }
}
