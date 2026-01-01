package com.Day1;

public class CardPaymentHandler extends AbstractPaymentUnit {

    private String cardNumber;

    public CardPaymentHandler(String paymentId, String cardNumber) {
        super(paymentId);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Card Payment of ₹" + amount + " processed");
    }
}

