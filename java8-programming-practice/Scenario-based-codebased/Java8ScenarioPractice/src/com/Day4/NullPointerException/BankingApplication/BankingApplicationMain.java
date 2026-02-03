package com.Day4.NullPointerException.BankingApplication;

public class BankingApplicationMain {

    private static final double MIN_BALANCE = 1000.0;

    public static void main(String[] args) {

        Loan homeLoan = new Loan("Home Loan", 2500000);

        BankAccount account = new BankAccount(
                101,
                "Rohit Sharma",
                null,
                null,
                "TXN12345",
                "VISA-9876",
                homeLoan
        );

        // 1. Nominee
        String nominee = account.getNominee()
                .orElse("No nominee added");
        System.out.println("Nominee: " + nominee);

        // 2. Loan details
        account.getLoan().ifPresent(l ->
                System.out.println("Loan: " + l.getLoan() + ", Amount: " + l.getLoan())
        );

        // 3. Balance with minimum
        double balance = account.getBalance()
                .orElse(MIN_BALANCE);
        System.out.println("Balance: " + balance);

        // 4. Transaction reference
        String txnRef = account.getTransactionRef()
                .orElse("Transaction reference not available");
        System.out.println("Transaction Ref: " + txnRef);

        // 5. Credit card details
        account.getCreditCard().ifPresent(
                cc -> System.out.println("Credit Card: " + cc)
        );
    }
}
