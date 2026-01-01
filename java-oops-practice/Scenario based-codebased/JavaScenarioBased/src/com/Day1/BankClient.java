package com.Day1;

public class BankClient {

    private String clientName;
    private AbstractAccountBase account;

    public BankClient(String clientName, AbstractAccountBase account) {
        this.clientName = clientName;
        this.account = account;
    }

    public void deposit(double amount) {
        account.depositAmount(amount);
    }

    public void withdraw(double amount) {
        account.withdrawAmount(amount);
    }

    public void showBalance() {
        System.out.println(clientName + " Balance: " + account.getBalance());
    }
}
