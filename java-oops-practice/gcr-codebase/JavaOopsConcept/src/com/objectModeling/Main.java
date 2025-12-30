package com.objectModeling;

public class Main {

    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer rohan = new Customer("Rohan");

        sbi.openAccount(rohan, 101, 5000);
        hdfc.openAccount(rohan, 202, 10000);

        rohan.viewBalance();
    }
}
