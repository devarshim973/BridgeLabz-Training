package com.Day2.EWalletApplication;

public class User {
    private int userId;
    private String userName;
    private Wallet wallet;

    public User(int userId, String userName, Wallet wallet) {
        this.userId = userId;
        this.userName = userName;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getUserName() {
        return userName;
    }
}
