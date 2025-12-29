package com.constructor;

public class SavingsAccount extends BankAccount {

    // Constructor
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to demonstrate access modifiers
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : " + getBalance());    // private via getter
    }
}

