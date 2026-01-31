package com.FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public interface PaymentProcessor {

    // Existing abstract method
    void pay(double amount);

    // New feature added later – backward compatible
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " is processed using standard flow");
    }
}
