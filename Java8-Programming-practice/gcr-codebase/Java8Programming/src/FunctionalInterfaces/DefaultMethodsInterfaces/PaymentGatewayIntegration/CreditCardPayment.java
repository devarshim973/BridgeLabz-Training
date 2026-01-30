package FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card payment of ₹" + amount + " successful");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Credit Card refund of ₹" + amount + " initiated");
    }
}
