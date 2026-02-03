package com.Day4.NullPointerException.BankingApplication;

class Loan {

    private String loanType;
    private double amount;

    public Loan(String loanType, double amount) {
        this.loanType = loanType;
        this.amount = amount;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getAmount() {
        return amount;
    }
}
