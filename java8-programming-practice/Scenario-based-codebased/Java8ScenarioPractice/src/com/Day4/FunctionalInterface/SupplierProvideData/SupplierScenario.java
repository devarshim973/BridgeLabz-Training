package com.Day4.FunctionalInterface.SupplierProvideData;


import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierScenario {

    public static void main(String[] args) {

        // 1. Generate OTP using Supplier
        Supplier<Integer> otpSupplier =
                () -> new Random().nextInt(900000) + 100000;
        System.out.println("OTP: " + otpSupplier.get());

        // 2. Generate random student ID using Supplier
        Supplier<Integer> studentIdSupplier =
                () -> new Random().nextInt(1000) + 1;
        System.out.println("Student ID: " + studentIdSupplier.get());

        // 3. Provide current date and time using Supplier
        Supplier<LocalDateTime> dateTimeSupplier =
                () -> LocalDateTime.now();
        System.out.println("Current Date & Time: " + dateTimeSupplier.get());

        // 4. Provide default welcome message using Supplier
        Supplier<String> welcomeSupplier =
                () -> "Welcome to the Application!";
        System.out.println(welcomeSupplier.get());

        // 5. Generate random discount coupon using Supplier
        Supplier<String> couponSupplier =
                () -> "DISCOUNT" + (new Random().nextInt(900) + 100);
        System.out.println("Coupon Code: " + couponSupplier.get());
    }
}
