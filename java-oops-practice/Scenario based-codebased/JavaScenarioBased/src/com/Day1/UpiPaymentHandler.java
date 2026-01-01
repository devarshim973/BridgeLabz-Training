package com.Day1;

public class UpiPaymentHandler extends AbstractPaymentUnit {

    private String upiId;

    public UpiPaymentHandler(String paymentId, String upiId) {
        super(paymentId);
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI Payment of ₹" + amount + " processed");
    }
}
