package com.Day2.EWalletApplication;

public class EWalletApplication {
    public static void main(String[] args) {

        Wallet personalWallet = new PersonalWallet(10000, 500);
        Wallet businessWallet = new BusinessWallet(80000);

        User userA = new User(1, "Ravi", personalWallet);
        User userB = new User(2, "Neha", businessWallet);

        boolean success = userA.getWallet().transferTo(userB, 3000);

        if (success) {
            Transaction txn = new Transaction(
                    userA.getUserName(),
                    userB.getUserName(),
                    3000
            );
            txn.displayTransaction();
        }

        System.out.println("Ravi Balance: ₹" + userA.getWallet().getBalance());
        System.out.println("Neha Balance: ₹" + userB.getWallet().getBalance());
    }
}
