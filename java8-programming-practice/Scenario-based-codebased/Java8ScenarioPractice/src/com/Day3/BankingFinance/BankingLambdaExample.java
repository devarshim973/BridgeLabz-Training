package com.Day3.BankingFinance;

import java.util.ArrayList;
import java.util.List;

public class BankingLambdaExample {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(101, "Amit", 8000));
        accounts.add(new Account(102, "Riya", 12000));
        accounts.add(new Account(103, "Suresh", 4000));
        double minimumBalance = 5000;
        
        
        		 // 1. Check minimum balance rule
                System.out.println("Minimum Balance Check:");
                accounts.forEach(a ->
                        System.out.println(
                                a.getHolderName() + " -> " +
                                (a.getBalance() >= minimumBalance ? "Maintained" : "Not Maintained")
                        )
                );

                System.out.println("--------------------");

                // 2. Calculate simple interest (P * R * T / 100)
                double rate = 5; // 5%
                int time = 2;    // 2 years

                System.out.println("Simple Interest:");
                accounts.forEach(a -> {
                    double interest = (a.getBalance() * rate * time) / 100;
                    System.out.println(a.getHolderName() + " -> Interest: " + interest);
                });

                System.out.println("--------------------");

                // 3. Validate withdrawal amount
                double withdrawAmount = 3000;
                System.out.println("Withdrawal Validation:");
                accounts.forEach(a ->
                        System.out.println(
                                a.getHolderName() + " -> " +
                                (a.getBalance() >= withdrawAmount ? "Withdrawal Allowed" : "Insufficient Balance")
                        )
                );

                System.out.println("--------------------");

                // 4. Print account details using lambda
                System.out.println("Account Details:");
                accounts.forEach(a -> System.out.println(a));

                System.out.println("--------------------");

                // 5. Compare two account balances using lambda
                Account acc1 = accounts.get(0);
                Account acc2 = accounts.get(1);

                int result = Double.compare(acc1.getBalance(), acc2.getBalance());

                if (result > 0) {
                    System.out.println(acc1.getHolderName() + " has higher balance");
                } else if (result < 0) {
                    System.out.println(acc2.getHolderName() + " has higher balance");
                } else {
                    System.out.println("Both accounts have equal balance");
                }
        		

    }
}