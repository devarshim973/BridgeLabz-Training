package com.Day9.BudgetWise;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class BudgetWiseExecutionEngine {

    public static void main(String[] args) {

        Map<String, Double> categoryLimits = new HashMap<>();
        categoryLimits.put("Food", 5000.0);
        categoryLimits.put("Travel", 3000.0);

        BaseBudget monthlyBudget =
                new MonthlyBudgetTracker(30000, 20000, categoryLimits);

        monthlyBudget.addTransaction(
                new FinanceTransaction(4000, "EXPENSE",
                        LocalDate.now(), "Food"));

        monthlyBudget.addTransaction(
                new FinanceTransaction(3500, "EXPENSE",
                        LocalDate.now(), "Travel"));

        monthlyBudget.generateReport();
        monthlyBudget.detectOverspend();
    }
}
