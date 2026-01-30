package FunctionalInterfaces.FunctionalInterfaces.StringLengthChecker;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int characterLimit = 20;

        // Function to get length of a string
        Function<String, Integer> lengthFunction =
                message -> message.length();

        String message = "Appointment confirmed";

        int length = lengthFunction.apply(message);

        if (length > characterLimit) {
            System.out.println("❌ Message exceeds character limit");
        } else {
            System.out.println("✅ Message is within character limit");
        }
    }
}
