import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    //  generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index greater than array length
        System.out.println("Accessing element: " + names[names.length]);
    }

    //handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element: " + names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled!");
            System.out.println("Reason: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled!");
            System.out.println("Reason: " + e.getMessage());
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Taking names input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }


        // handle runtime exception
        handleException(names);

        sc.close();
    }
}
