package com.Day1;

public class PaymentApplicationLauncher {

    public static void main(String[] args) {

        PaymentExecutable paymentOne =
                new CardPaymentHandler("PAY101", "1234-5678");

        PaymentExecutable paymentTwo =
                new UpiPaymentHandler("PAY202", "user@upi");

        paymentOne.processPayment(1500);
        paymentTwo.processPayment(2200);
    }
}
