package com.multithreadingScenario.BankTransactions;

import java.util.HashMap;
import java.util.Map;

class BankConcurrentSystem {

    private final Map<Integer, Integer> accountBalanceMap = new HashMap<>();

    // Create account
    public synchronized void createAccount(int accountNumber, int initialBalance) {
        accountBalanceMap.put(accountNumber, initialBalance);
        System.out.println("Account created: " + accountNumber + 
                           " with balance " + initialBalance);
    }

    // Deposit money (thread-safe)
    public synchronized void deposit(int accountNumber, int amount) {
        int currentBalance = accountBalanceMap.get(accountNumber);
        int newBalance = currentBalance + amount;
        accountBalanceMap.put(accountNumber, newBalance);

        System.out.println(Thread.currentThread().getName() +
                " deposited " + amount +
                " | Account: " + accountNumber +
                " | Balance: " + newBalance);
    }

    // Withdraw money (thread-safe)
    public synchronized void withdraw(int accountNumber, int amount) {
        int currentBalance = accountBalanceMap.get(accountNumber);

        if (currentBalance >= amount) {
            int newBalance = currentBalance - amount;
            accountBalanceMap.put(accountNumber, newBalance);

            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount +
                    " | Account: " + accountNumber +
                    " | Balance: " + newBalance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " FAILED withdrawal of " + amount +
                    " | Account: " + accountNumber +
                    " | Balance: " + currentBalance);
        }
    }

    // Get balance (thread-safe)
    public synchronized int getBalance(int accountNumber) {
        return accountBalanceMap.get(accountNumber);
    }
}
