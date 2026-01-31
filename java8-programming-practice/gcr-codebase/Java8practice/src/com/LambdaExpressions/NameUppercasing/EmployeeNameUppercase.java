package com.LambdaExpressions.NameUppercasing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameUppercase {

    public static void main(String[] args) {

        List<String> employeeNames =
                Arrays.asList("rahul", "anita", "vijay", "meena");

        List<String> upperCaseNames = employeeNames.stream()
                .map(String::toUpperCase)   // method reference
                .collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}
