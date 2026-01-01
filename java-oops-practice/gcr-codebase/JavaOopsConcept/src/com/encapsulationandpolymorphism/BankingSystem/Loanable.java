package com.encapsulationandpolymorphism.BankingSystem;

interface Loanable {

    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}

