package com.encapsulationandpolymorphism.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystemApplication {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount savings =
                new SavingsAccount("SAV-101", "Rohit", 80000);

        BankAccount current =
                new CurrentAccount("CUR-202", "Anita", 150000);

        accounts.add(savings);
        accounts.add(current);

        // Polymorphism: dynamic interest calculation
        for (BankAccount account : accounts) {

            double interest = account.calculateInterest();

            System.out.println(
                    account.getHolderName() +
                    " | Interest Earned: " + interest
            );
        }

        // Loan processing using interface
        Loanable loanAccount = (Loanable) savings;

        if (loanAccount.calculateLoanEligibility()) {
            loanAccount.applyForLoan(50000);
        }
    }
}

