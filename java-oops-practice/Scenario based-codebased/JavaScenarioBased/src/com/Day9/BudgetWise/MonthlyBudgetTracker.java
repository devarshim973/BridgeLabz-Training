package com.Day9.BudgetWise;

import java.util.Map;

class MonthlyBudgetTracker extends BaseBudget {

    public MonthlyBudgetTracker(double income, double limit,
                                Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("---- Monthly Budget Report ----");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + calculateTotalExpenses());
        System.out.println("Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> categorySpend = new java.util.HashMap<>();

        for (FinanceTransaction t : getTransactions()) {
            if (t.getType().equals("EXPENSE")) {
                categorySpend.put(
                    t.getCategory(),
                    categorySpend.getOrDefault(t.getCategory(), 0.0)
                            + t.getAmount()
                );
            }
        }

        for (String category : categoryLimits.keySet()) {
            if (categorySpend.getOrDefault(category, 0.0)
                    > categoryLimits.get(category)) {
                System.out.println("Overspending in category: " + category);
            }
        }
    }
}
