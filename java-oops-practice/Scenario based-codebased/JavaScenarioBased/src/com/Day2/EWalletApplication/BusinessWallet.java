package com.Day2.EWalletApplication;

public class BusinessWallet extends Wallet {

    public BusinessWallet(double balance) {
        super(balance);
    }

    public BusinessWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        double tax = amount * 0.05; // 5% tax
        double totalDeduction = amount + tax;

        if (amount > 50000) {
            System.out.println("Transfer limit exceeded for Business Wallet");
            return false;
        }

        if (debit(totalDeduction)) {
            receiver.getWallet().credit(amount);
            return true;
        }
        return false;
    }
}
