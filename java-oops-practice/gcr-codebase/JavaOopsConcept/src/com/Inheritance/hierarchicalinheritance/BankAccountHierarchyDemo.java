package com.Inheritance.hierarchicalinheritance;

public class BankAccountHierarchyDemo {
    public static void main(String[] args) {

        // Create accounts
        SavingsBankAccount savings = new SavingsBankAccount("S001", 5000, 4.5);
        CheckingBankAccount checking = new CheckingBankAccount("C001", 3000, 1000);
        FixedDepositBankAccount fd = new FixedDepositBankAccount("F001", 10000, 12);

        // Store in BaseAccount array for hierarchical demonstration
        BaseAccount[] accounts = {savings, checking, fd};

        System.out.println("Bank Account Details:\n");
        for (BaseAccount a : accounts) {
            if (a instanceof SavingsBankAccount) {
                ((SavingsBankAccount) a).displayAccountType();
            } else if (a instanceof CheckingBankAccount) {
                ((CheckingBankAccount) a).displayAccountType();
            } else if (a instanceof FixedDepositBankAccount) {
                ((FixedDepositBankAccount) a).displayAccountType();
            }
            System.out.println("--------------------------");
        }
    }
}