package com.Day10.PayXpress;

public class ElectricityBillPayment extends UtilityBillBase {

    public ElectricityBillPayment(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        double finalAmount = calculateLateFee(50);
        markAsPaid();
        System.out.println("Electricity Bill Paid: ₹" + finalAmount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Electricity bill due soon!");
    }
}
