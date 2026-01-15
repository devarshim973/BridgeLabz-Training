package com.day4.ZipZipMart;

public class SalesTransaction {

    private String transactionDate; // YYYY-MM-DD
    private double amount;

    public SalesTransaction(String transactionDate, double amount) {
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void displayTransaction() {
        System.out.println(
            "Date: " + transactionDate + ", Amount: ₹" + amount
        );
    }
}
