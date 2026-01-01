package com.Day1;

abstract class AbstractAccountBase {

    protected double balance;

    public AbstractAccountBase(double initialBalance) {
        this.balance = initialBalance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdrawAmount(double amount);

    public double getBalance() {
        return balance;
    }
}
