package com.Day1;

public class BankingApplicationRunner {

    public static void main(String[] args) {

        SavingsLedger savingsAccount =
                new SavingsLedger(10000, 5.0);

        BankClient clientOne =
                new BankClient("Rahul", savingsAccount);

        clientOne.deposit(2000);
        clientOne.withdraw(3000);
        savingsAccount.calculateInterest();
        clientOne.showBalance();

        System.out.println("-----------");

        CurrentLedger currentAccount =
                new CurrentLedger(5000);

        BankClient clientTwo =
                new BankClient("Anita", currentAccount);

        clientTwo.withdraw(6000);
        clientTwo.showBalance();
    }
}
