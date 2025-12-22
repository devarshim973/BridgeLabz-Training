import java.util.Scanner;

public class ConvertToUpperCase {

    //  convert text to uppercase using charAt() and ASCII logic
    public static String toUpperCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference (32)
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    // compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the complete text: ");
        String text = sc.nextLine();

        String customUpper = toUpperCaseUsingCharAt(text);

        // Convert using method
        String builtInUpper = text.toUpperCase();

        // Compare both strings
        boolean isSame = compareStrings(customUpper, builtInUpper);

        // Display results
        System.out.println("\nUppercase using charAt(): " + customUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
