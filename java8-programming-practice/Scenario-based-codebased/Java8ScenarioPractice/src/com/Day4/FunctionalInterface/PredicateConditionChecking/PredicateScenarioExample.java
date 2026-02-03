package com.Day4.FunctionalInterface.PredicateConditionChecking;



import java.util.function.Predicate;

public class PredicateScenarioExample {

    public static void main(String[] args) {

        // 1. Student system: exam eligibility (attendance ≥ 75%)
        Predicate<Integer> examEligible = attendance -> attendance >= 75;

        int attendance = 80;
        System.out.println("Student Exam Eligible: " +
                examEligible.test(attendance));

        System.out.println("--------------------");

        // 2. Employee system: salary > 30000
        Predicate<Double> highSalary = salary -> salary > 30000;

        double salary = 35000;
        System.out.println("Employee Salary > 30000: " +
                highSalary.test(salary));

        System.out.println("--------------------");

        // 3. Bank application: withdrawal validation
        double balance = 10000;
        Predicate<Double> validWithdrawal =
                withdrawAmount -> withdrawAmount > 0 && withdrawAmount <= balance;

        double withdrawAmount = 5000;
        System.out.println("Valid Withdrawal: " +
                validWithdrawal.test(withdrawAmount));

        System.out.println("--------------------");

        // 4. E-commerce app: free delivery eligibility (amount > 500)
        Predicate<Double> freeDelivery = orderAmount -> orderAmount > 500;

        double orderAmount = 750;
        System.out.println("Free Delivery Eligible: " +
                freeDelivery.test(orderAmount));

        System.out.println("--------------------");

        // 5. Check whether number is even or odd
        Predicate<Integer> isEven = number -> number % 2 == 0;

        int number = 15;
        System.out.println(number + " is Even: " +
                isEven.test(number));
    }
}
