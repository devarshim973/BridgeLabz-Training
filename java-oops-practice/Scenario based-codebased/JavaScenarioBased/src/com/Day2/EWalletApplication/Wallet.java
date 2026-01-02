package com.Day2.EWalletApplication;

public abstract class Wallet implements Transferrable {
    private double balance;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
    }

    protected boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
