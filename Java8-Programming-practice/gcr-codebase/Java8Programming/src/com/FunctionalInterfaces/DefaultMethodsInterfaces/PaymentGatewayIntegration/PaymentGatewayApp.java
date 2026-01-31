package FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public class PaymentGatewayApp {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiPayment();
        upi.pay(1500);
        upi.refund(500);

        PaymentProcessor card = new CreditCardPayment();
        card.pay(3000);
        card.refund(1000);
    }
}
