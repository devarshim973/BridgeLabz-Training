package com.RegexJUnit.Regex.BasicRegexProblems;

class HexColorValidation {

    public static boolean isValid(String color) {
        return color.matches("^#[0-9a-fA-F]{6}$");
    }

    public static void main(String[] args) {
        System.out.println(isValid("#FFA500"));
        System.out.println(isValid("#ff4500"));
        System.out.println(isValid("#123"));
    }
}
