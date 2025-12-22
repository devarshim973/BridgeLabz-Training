import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        //generate Runtime Exception
        System.out.println(text.charAt(text.length()));
    }

    // handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Error Message: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();


        // Handling the exception
        handleException(text);

    }
}
