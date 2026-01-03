package com.Day3.MyBankManagingCustomerAccounts;

public class SavingsAccount extends Account {

    private double interestRate; // Annual interest %

    public SavingsAccount(String accountNumber, double openingBalance, double interestRate) {
        super(accountNumber, openingBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        double interest = checkBalance() * interestRate / 100; // Operator used
        System.out.println("Interest for Savings Account " + accountNumber + ": " + interest);
        return interest;
    }
}
