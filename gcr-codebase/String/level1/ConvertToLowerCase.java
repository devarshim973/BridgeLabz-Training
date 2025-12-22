import java.util.Scanner;

public class ConvertToLowerCase {

    // convert text to lowercase using charAt() and ASCII logic
    public static String toLowerCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference (32)
                ch = (char) (ch + 32);
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

        String customLower = toLowerCaseUsingCharAt(text);

        String builtInLower = text.toLowerCase();

        // Compare both strings
        boolean isSame = compareStrings(customLower, builtInLower);

        // Display results
        System.out.println("\nLowercase using charAt(): " + customLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Are both results same? " + isSame);

    }
}
