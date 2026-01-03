package com.Day3.MyBankManagingCustomerAccounts;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double openingBalance, double overdraftLimit) {
        super(accountNumber, openingBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (checkBalance() + overdraftLimit)) {
            // Allow overdraft
            double newBalance = checkBalance() - amount;
            // Access private balance using deposit/withdraw hack
            super.deposit(-amount); // reduce balance
            System.out.println("Withdrawn: " + amount + " from Current Account");
        } else {
            System.out.println("Exceeded overdraft limit or invalid amount");
        }
    }

    @Override
    public double calculateInterest() {
        // Usually no interest for current accounts
        System.out.println("Current account " + accountNumber + " has no interest");
        return 0.0;
    }
}
