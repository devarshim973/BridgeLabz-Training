package FunctionalInterfaces.MarkerInterfaces.SensitiveDataTagging;

public class CreditCard implements SensitiveData {

    private String cardNumber;
    private String cardHolder;

    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public String toString() {
        return "CreditCard{cardNumber='" + cardNumber + "', cardHolder='" + cardHolder + "'}";
    }
}
