package com.Day9.BudgetWise;

class AnnualBudgetTracker extends BaseBudget {

    public AnnualBudgetTracker(double income, double limit,
                               Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("==== Annual Financial Summary ====");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + calculateTotalExpenses());
        System.out.println("Yearly Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (calculateTotalExpenses() > spendingLimit) {
            System.out.println("⚠ Annual spending limit exceeded!");
        }
    }
}
