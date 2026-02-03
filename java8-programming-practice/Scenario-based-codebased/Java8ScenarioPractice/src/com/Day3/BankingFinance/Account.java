package com.Day3.BankingFinance;

import java.util.ArrayList;
import java.util.List;

class Account {
    private int accountNo;
    private String holderName;
    private double balance;

    public Account(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    @Override
    public String toString() {
        return "Account{accountNo=" + accountNo +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance + '}';
    }
}