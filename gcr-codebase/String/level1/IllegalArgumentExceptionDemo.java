import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // generate IllegalArgumentException
    public static void generateException(String text) {
      // generate a Runtime Exception
        System.out.println(text.substring(5, 2));
    }

    // handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
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

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();


        // Calling method that handles the exception
        handleException(text);

        sc.close();
    }
}
