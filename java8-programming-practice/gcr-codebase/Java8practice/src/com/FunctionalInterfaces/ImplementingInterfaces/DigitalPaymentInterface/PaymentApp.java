package com.FunctionalInterfaces.ImplementingInterfaces.DigitalPaymentInterface;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentMethod upi = new UpiPayment();
        PaymentMethod card = new CreditCardPayment();
        PaymentMethod wallet = new WalletPayment();

        upi.pay(1500);
        card.pay(3200);
        wallet.pay(500);
    }
}
