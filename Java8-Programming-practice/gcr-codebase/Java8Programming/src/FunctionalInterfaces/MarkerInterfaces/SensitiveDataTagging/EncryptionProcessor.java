package FunctionalInterfaces.MarkerInterfaces.SensitiveDataTagging;

import java.util.Arrays;
import java.util.List;

public class EncryptionProcessor {

    public static void main(String[] args) {

        List<Object> dataObjects = Arrays.asList(
                new CreditCard("1234-5678-9876-5432", "Rahul"),
                new PatientRecord("Anita", "Flu"),
                "Regular String" // not sensitive
        );

        for (Object obj : dataObjects) {
            if (obj instanceof SensitiveData) {
                System.out.println("Encrypting sensitive data: " + obj);
                // perform encryption logic here
            } else {
                System.out.println("No encryption needed: " + obj);
            }
        }
    }
}
