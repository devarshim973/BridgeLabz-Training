package com.Day2.EWalletApplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet(double balance) {
        super(balance);
    }

    public PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        double transactionFee = amount * 0.02; // 2% fee
        double totalDeduction = amount + transactionFee;

        if (debit(totalDeduction)) {
            receiver.getWallet().credit(amount);
            return true;
        }
        return false;
    }
}
