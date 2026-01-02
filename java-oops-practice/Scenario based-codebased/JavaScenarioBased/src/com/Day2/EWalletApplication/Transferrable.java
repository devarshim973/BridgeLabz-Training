package com.Day2.EWalletApplication;

public interface Transferrable {
    boolean transferTo(User receiver, double amount);
}
