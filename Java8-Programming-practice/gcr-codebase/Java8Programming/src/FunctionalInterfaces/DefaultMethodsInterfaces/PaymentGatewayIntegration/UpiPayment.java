package FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public class UpiPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("UPI payment of ₹" + amount + " successful");
    }
}
