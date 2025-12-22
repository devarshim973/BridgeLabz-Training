import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // generate NumberFormatException
    public static void generateException(String text) {

        // This will throw NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Number is: " + number);
    }

    //handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Error Message: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
            System.out.println("Error Message: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a value: ");
        String text = sc.next();

        // Refactored code with exception handling
        handleException(text);

        sc.close();
    }
}
