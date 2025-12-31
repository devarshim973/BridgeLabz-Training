package com.Inheritance.hierarchicalinheritance;

public class FixedDepositBankAccount extends BaseAccount {
    int tenureMonths;

    public FixedDepositBankAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    void displayAccountType() {
        displayAccountInfo();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenureMonths + " months");
    }
}