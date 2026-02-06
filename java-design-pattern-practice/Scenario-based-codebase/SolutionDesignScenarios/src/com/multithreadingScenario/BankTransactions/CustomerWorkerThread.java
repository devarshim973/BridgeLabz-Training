package com.multithreadingScenario.BankTransactions;

class CustomerWorkerThread extends Thread {

    private final int customerId;
    private final int accountNumber;
    private final BankConcurrentSystem bank;

    public CustomerWorkerThread(int customerId, int accountNumber, BankConcurrentSystem bank) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.bank = bank;
        setName("Customer-" + customerId);
    }

    @Override
    public void run() {

        bank.deposit(accountNumber, 1000);

        try {
            Thread.sleep(100); // simulate processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bank.withdraw(accountNumber, 500);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bank.withdraw(accountNumber, 700);
    }
}
