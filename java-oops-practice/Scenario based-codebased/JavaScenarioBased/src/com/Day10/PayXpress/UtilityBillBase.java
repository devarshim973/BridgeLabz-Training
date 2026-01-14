package com.Day10.PayXpress;

public abstract class UtilityBillBase implements IPayable {

    private String billType;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;

    // Constructor for recurring bills
    public UtilityBillBase(String billType, double amount, String dueDate) {
        this.billType = billType;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Operator usage: base amount + penalty
    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Encapsulation: no direct setter for payment status
    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected String getBillType() {
        return billType;
    }
}
