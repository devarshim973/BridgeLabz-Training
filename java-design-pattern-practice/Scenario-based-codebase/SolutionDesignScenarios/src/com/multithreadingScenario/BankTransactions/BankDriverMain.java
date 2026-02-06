package com.multithreadingScenario.BankTransactions;

public class BankDriverMain {

    public static void main(String[] args) {

        BankConcurrentSystem bank = new BankConcurrentSystem();

        int accountNumber = 101;
        bank.createAccount(accountNumber, 2000);

        CustomerWorkerThread customer1 =
                new CustomerWorkerThread(1, accountNumber, bank);

        CustomerWorkerThread customer2 =
                new CustomerWorkerThread(2, accountNumber, bank);

        CustomerWorkerThread customer3 =
                new CustomerWorkerThread(3, accountNumber, bank);

        customer1.start();
        customer2.start();
        customer3.start();

        try {
            customer1.join();
            customer2.join();
            customer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Balance: " +
                bank.getBalance(accountNumber));
    }
}
