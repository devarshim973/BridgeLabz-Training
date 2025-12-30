package com.objectModeling;

import java.util.ArrayList;

class Customer {

    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("\nAccounts of " + name + ":");
        for (Account acc : accounts) {
            acc.displayAccount();
        }
    }
}
