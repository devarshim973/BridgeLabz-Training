package com.Day3.MyBankManagingCustomerAccounts;

public interface ITransaction {

    void deposit(double amount);

    void withdraw(double amount);

    double checkBalance();
}
