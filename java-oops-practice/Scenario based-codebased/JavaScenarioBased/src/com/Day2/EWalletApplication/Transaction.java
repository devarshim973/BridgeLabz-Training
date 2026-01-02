package com.Day2.EWalletApplication;

public class Transaction {
    private String sender;
    private String receiver;
    private double amount;

    public Transaction(String sender, String receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public void displayTransaction() {
        System.out.println(sender + " transferred ₹" + amount + " to " + receiver);
    }
}
