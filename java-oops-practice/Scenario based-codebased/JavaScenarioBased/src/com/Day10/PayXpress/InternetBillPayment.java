package com.Day10.PayXpress;

public class InternetBillPayment extends UtilityBillBase {

    public InternetBillPayment(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(100);
        markAsPaid();
        System.out.println("Internet Bill Paid: ₹" + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Internet service will be suspended soon!");
    }
}
