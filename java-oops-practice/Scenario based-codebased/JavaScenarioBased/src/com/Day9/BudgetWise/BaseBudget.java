package com.Day9.BudgetWise;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

abstract class BaseBudget implements IAnalyzable {

    protected double income;
    protected double spendingLimit;

    private List<FinanceTransaction> transactions;
    protected Map<String, Double> categoryLimits;

    protected BaseBudget(double income, double limit,
                         Map<String, Double> categoryLimits) {
        this.income = income;
        this.spendingLimit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(FinanceTransaction transaction) {
        transactions.add(transaction);
    }

    protected double calculateTotalExpenses() {
        double total = 0;
        for (FinanceTransaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double calculateNetSavings() {
        return income - calculateTotalExpenses();
    }

    protected List<FinanceTransaction> getTransactions() {
        return transactions;
    }
}
