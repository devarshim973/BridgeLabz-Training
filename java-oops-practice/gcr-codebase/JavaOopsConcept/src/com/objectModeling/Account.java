package com.objectModeling;

class Account {

    int accountNumber;
    double balance;
    String bankName;

    Account(int accountNumber, double balance, String bankName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }

    void displayAccount() {
        System.out.println("Bank: " + bankName +
                ", Account No: " + accountNumber +
                ", Balance: ₹" + balance);
    }
}
