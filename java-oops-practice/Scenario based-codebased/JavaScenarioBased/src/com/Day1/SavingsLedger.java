package com.Day1;

public class SavingsLedger extends AbstractAccountBase {

    private double interestRate;

    public SavingsLedger(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance in savings account");
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}
