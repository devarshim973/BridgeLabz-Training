import java.util.Scanner;

public class StringLengthWithoutLength {

    //find length of string without using length()
    public static int findStringLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index goes out of bounds
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method result
        int customLength = findStringLength(text);

        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength using user-defined method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

    }
}
