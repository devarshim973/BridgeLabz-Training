package com.Day3.MyBankManagingCustomerAccounts;

public class MyBankApplication {

    public static void main(String[] args) {

        // Create accounts
        SavingsAccount sa = new SavingsAccount("SAV1001", 5000, 5.0);
        CurrentAccount ca = new CurrentAccount("CUR2001", 2000, 1000);

        // Deposit
        sa.deposit(1500);
        ca.deposit(500);

        // Withdraw
        sa.withdraw(2000);
        ca.withdraw(2500); // uses overdraft

        // Check balance
        System.out.println("Savings Account Balance: " + sa.checkBalance());
        System.out.println("Current Account Balance: " + ca.checkBalance());

        // Interest calculation (polymorphism)
        sa.calculateInterest();
        ca.calculateInterest();
    }
}
