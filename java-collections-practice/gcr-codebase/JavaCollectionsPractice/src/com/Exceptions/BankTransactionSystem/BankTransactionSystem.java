package com.Exceptions.BankTransactionSystem;

import java.util.Scanner;

//Custom Exception
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//BankAccount class
class BankAccount {
 private double balance;

 // Constructor
 public BankAccount(double initialBalance) {
     if (initialBalance < 0) {
         throw new IllegalArgumentException("Initial balance cannot be negative");
     }
     this.balance = initialBalance;
 }

 // Withdraw method
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount < 0) {
         throw new IllegalArgumentException("Invalid amount!");
     }
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance!");
     }
     balance -= amount;
     System.out.println("Withdrawal successful, new balance: " + balance);
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }
}

//Main class
public class BankTransactionSystem {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Initialize account with some balance
     BankAccount account = new BankAccount(5000);

     System.out.print("Enter withdrawal amount: ");
     double amount = sc.nextDouble();

     try {
         account.withdraw(amount);
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
