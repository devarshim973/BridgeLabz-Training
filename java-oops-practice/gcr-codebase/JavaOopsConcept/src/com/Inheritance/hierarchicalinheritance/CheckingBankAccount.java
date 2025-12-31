package com.Inheritance.hierarchicalinheritance;

public class CheckingBankAccount extends BaseAccount {
    double withdrawalLimit;

    public CheckingBankAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        displayAccountInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}