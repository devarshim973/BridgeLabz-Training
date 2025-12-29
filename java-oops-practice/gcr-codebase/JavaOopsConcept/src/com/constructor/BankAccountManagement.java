package com.constructor;

public class BankAccountManagement {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(101, "Ravi Kumar", 5000);

        account.displaySavingsAccountDetails();

        System.out.println("---------------------------");

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("After transactions:");
        account.displaySavingsAccountDetails();
    }
}
