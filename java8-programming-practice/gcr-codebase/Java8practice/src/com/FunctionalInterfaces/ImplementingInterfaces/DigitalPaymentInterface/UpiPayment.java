package com.FunctionalInterfaces.ImplementingInterfaces.DigitalPaymentInterface;

public class UpiPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
