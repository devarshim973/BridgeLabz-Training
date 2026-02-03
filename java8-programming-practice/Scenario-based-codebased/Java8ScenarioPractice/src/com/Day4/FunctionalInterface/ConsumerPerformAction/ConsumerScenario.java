package com.Day4.FunctionalInterface.ConsumerPerformAction;


import java.util.function.Consumer;

public class ConsumerScenario {

    public static void main(String[] args) {

        // 1. Print student details using Consumer
        Consumer<String> printStudent =
                student -> System.out.println("Student Details: " + student);
        printStudent.accept("ID: 1, Name: Rahul");

        // 2. Log employee login activity using Consumer
        Consumer<String> employeeLogin =
                emp -> System.out.println("Employee Login: " + emp);
        employeeLogin.accept("Amit logged in");

        // 3. Print order confirmation message using Consumer
        Consumer<Integer> orderConfirmation =
                orderId -> System.out.println("Order confirmed. Order ID: " + orderId);
        orderConfirmation.accept(101);

        // 4. Display account balance using Consumer
        Consumer<Double> displayBalance =
                balance -> System.out.println("Account Balance: ₹" + balance);
        displayBalance.accept(25000.50);

        // 5. Send notification message using Consumer
        Consumer<String> notification =
                msg -> System.out.println("Notification: " + msg);
        notification.accept("Payment Successful");
    }
}
