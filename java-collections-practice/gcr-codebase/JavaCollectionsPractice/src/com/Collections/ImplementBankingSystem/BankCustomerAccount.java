package com.Collections.ImplementBankingSystem;

public class BankCustomerAccount {

    private String accountNumber;
    private String customerName;
    private double balance;

    public BankCustomerAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return customerName + " (" + accountNumber + ") : $" + balance;
    }
}
