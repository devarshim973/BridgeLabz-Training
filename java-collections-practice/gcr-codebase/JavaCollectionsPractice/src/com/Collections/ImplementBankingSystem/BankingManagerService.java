package com.Collections.ImplementBankingSystem;

import java.util.*;

public class BankingManagerService {

    // HashMap: AccountNumber -> Customer Account
    private Map<String, BankCustomerAccount> accountMap = new HashMap<>();

    // TreeMap: Balance -> List of Customers (sorted by balance)
    private TreeMap<Double, List<BankCustomerAccount>> balanceSortedMap = new TreeMap<>();

    // Queue: Withdrawal Requests
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Add a customer account
    public void addAccount(BankCustomerAccount account) {
        accountMap.put(account.getAccountNumber(), account);
        balanceSortedMap.computeIfAbsent(account.getBalance(), k -> new ArrayList<>()).add(account);
    }

    // Enqueue a withdrawal request
    public void requestWithdrawal(String accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    // Process all withdrawal requests in order
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            BankCustomerAccount account = accountMap.get(request.getAccountNumber());

            if (account != null && account.withdraw(request.getAmount())) {
                System.out.println("Withdrawal successful: " + account.getCustomerName() +
                        " - $" + request.getAmount());
                // Update balanceSortedMap
                refreshBalanceMap(account);
            } else {
                System.out.println("Withdrawal failed for account: " + request.getAccountNumber());
            }
        }
    }

    // Display accounts sorted by balance
    public void displayAccountsByBalance() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, List<BankCustomerAccount>> entry : balanceSortedMap.entrySet()) {
            for (BankCustomerAccount account : entry.getValue()) {
                System.out.println(account);
            }
        }
    }

    // Helper to refresh balance in TreeMap after withdrawal
    private void refreshBalanceMap(BankCustomerAccount account) {
        // Remove from old balance list
        balanceSortedMap.values().forEach(list -> list.remove(account));

        // Add to new balance
        balanceSortedMap.computeIfAbsent(account.getBalance(), k -> new ArrayList<>()).add(account);
    }

    // Display all accounts
    public void displayAllAccounts() {
        System.out.println("All accounts:");
        accountMap.values().forEach(System.out::println);
    }
}
