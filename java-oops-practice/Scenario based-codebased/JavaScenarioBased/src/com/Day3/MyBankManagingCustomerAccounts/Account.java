package com.Day3.MyBankManagingCustomerAccounts;

public class Account {

    protected String accountNumber;
    private double balance; // Encapsulation

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Check balance
    public double checkBalance() {
        return balance;
    }

    // Polymorphic interest calculation
    public double calculateInterest() {
        return 0.0; // Base account has no interest
    }
}
