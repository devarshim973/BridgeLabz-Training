package com.Inheritance.hierarchicalinheritance;

public class SavingsBankAccount extends BaseAccount {
    double interestRate;

    public SavingsBankAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        displayAccountInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}