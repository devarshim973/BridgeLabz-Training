package com.Collections.ImplementBankingSystem;

public class BankingSystemApplication {

    public static void main(String[] args) {

        BankingManagerService bankManager = new BankingManagerService();

        // Adding customer accounts
        bankManager.addAccount(new BankCustomerAccount("ACC101", "Alice", 5000));
        bankManager.addAccount(new BankCustomerAccount("ACC102", "Bob", 3000));
        bankManager.addAccount(new BankCustomerAccount("ACC103", "Carol", 7000));
        bankManager.addAccount(new BankCustomerAccount("ACC104", "Dave", 4000));

        // Display all accounts
        bankManager.displayAllAccounts();

        // Add withdrawal requests
        bankManager.requestWithdrawal("ACC102", 500);
        bankManager.requestWithdrawal("ACC103", 8000); // exceeds balance
        bankManager.requestWithdrawal("ACC101", 2000);

        // Process withdrawal queue
        bankManager.processWithdrawals();

        // Display accounts sorted by balance
        bankManager.displayAccountsByBalance();
    }
}
