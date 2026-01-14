package com.Day10.PayXpress;

public class PayXpressApplication {

    public static void main(String[] args) {

        IPayable electricity = new ElectricityBillPayment(1200, "10-Feb-2026");
        IPayable water = new WaterBillPayment(500, "12-Feb-2026");
        IPayable internet = new InternetBillPayment(1500, "15-Feb-2026");

        electricity.sendReminder();
        electricity.pay();

        water.sendReminder();
        water.pay();

        internet.sendReminder();
        internet.pay();
    }
}
