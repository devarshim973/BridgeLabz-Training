package com.Day4.FunctionalInterface.FunctionDataTransformation;


import java.util.function.Function;

public class FunctionScenarioExample {

    public static void main(String[] args) {

        // 1. Convert student marks into grade (A/B/C)
        Function<Integer, String> marksToGrade = marks -> {
            if (marks >= 75) return "A";
            else if (marks >= 60) return "B";
            else return "C";
        };

        int marks = 72;
        System.out.println("Grade: " + marksToGrade.apply(marks));

        System.out.println("--------------------");

        // 2. Payroll system: monthly salary → annual salary
        Function<Double, Double> annualSalary =
                monthlySalary -> monthlySalary * 12;

        double monthlySalary = 30000;
        System.out.println("Annual Salary: " +
                annualSalary.apply(monthlySalary));

        System.out.println("--------------------");

        // 3. Convert product price into discounted price (10% discount)
        Function<Double, Double> discountedPrice =
                price -> price * 0.90;

        double price = 1000;
        System.out.println("Discounted Price: " +
                discountedPrice.apply(price));

        System.out.println("--------------------");

        // 4. Convert employee name into uppercase
        Function<String, String> toUpperCase =
                name -> name.toUpperCase();

        String empName = "Amit";
        System.out.println("Uppercase Name: " +
                toUpperCase.apply(empName));

        System.out.println("--------------------");

        // 5. Convert Celsius temperature into Fahrenheit
        Function<Double, Double> celsiusToFahrenheit =
                c -> (c * 9 / 5) + 32;

        double celsius = 30;
        System.out.println("Fahrenheit: " +
                celsiusToFahrenheit.apply(celsius));
    }
}
