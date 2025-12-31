package com.Inheritance.hierarchicalinheritance;

public class BaseAccount {
    String accountNumber;
    double balance;

    public BaseAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}