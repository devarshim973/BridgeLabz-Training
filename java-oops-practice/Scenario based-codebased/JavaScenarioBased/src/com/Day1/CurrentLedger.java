package com.Day1;

public class CurrentLedger extends AbstractAccountBase {

    public CurrentLedger(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdrawAmount(double amount) {
        balance -= amount;
        System.out.println("Current Account Withdrawn: " + amount);
    }
}
