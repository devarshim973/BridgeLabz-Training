package com.objectModeling;

class Bank {

    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, int accNo, double balance) {
        Account account = new Account(accNo, balance, bankName);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.name +
                " in " + bankName);
    }
}

