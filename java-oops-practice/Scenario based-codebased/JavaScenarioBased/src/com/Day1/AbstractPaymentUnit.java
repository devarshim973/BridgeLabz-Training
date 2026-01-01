package com.Day1;

public abstract class AbstractPaymentUnit implements PaymentExecutable {

    protected String paymentId;

    public AbstractPaymentUnit(String paymentId) {
        this.paymentId = paymentId;
    }

    public void showPaymentId() {
        System.out.println("Payment ID: " + paymentId);
    }
}
