package com.Day4.NullPointerException.BankingApplication;

import java.util.Optional;

class BankAccount {

    private int accountNumber;
    private String holderName;
    private String nominee;          // may be null
    private Double balance;           // may be null
    private String transactionRef;    // may be null
    private String creditCard;        // may be null
    private int loan;                // may be null

    public BankAccount(int accountNumber, String holderName, String nominee,
                       Double balance, String transactionRef,
                       String creditCard, int Loan) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.nominee = nominee;
        this.balance = balance;
        this.transactionRef = transactionRef;
        this.creditCard = creditCard;
        this.loan = Loan;
    }

    public BankAccount(int accountNumber2, String holderName2, Object nominee2, Object balance2, String transactionRef2,
			String creditCard2, Loan homeLoan) {
		// TODO Auto-generated constructor stub
	}

	// 1. Nominee handling
    public Optional<String> getNominee() {
        return Optional.ofNullable(nominee);
    }

    // 2. Loan details
    public Optional<Integer> getLoan() {
        return Optional.ofNullable(loan);
    }

    // 3. Balance with minimum default
    public Optional<Double> getBalance() {
        return Optional.ofNullable(balance);
    }

    // 4. Transaction reference safely
    public Optional<String> getTransactionRef() {
        return Optional.ofNullable(transactionRef);
    }

    // 5. Credit card details
    public Optional<String> getCreditCard() {
        return Optional.ofNullable(creditCard);
    }
}
