package com.Day10.PayXpress;

public class WaterBillPayment extends UtilityBillBase {

    public WaterBillPayment(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(30);
        markAsPaid();
        System.out.println("Water Bill Paid: ₹" + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Please pay your water bill.");
    }
}
