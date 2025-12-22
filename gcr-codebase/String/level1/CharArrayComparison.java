import java.util.Scanner;

public class CharArrayComparison {

    // return characters of a string without using toCharArray()
    public static char[] getCharsUsingCharAt(String text) {
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    //  compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] userChars = getCharsUsingCharAt(text);

        char[] builtInChars = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(userChars, builtInChars);

        System.out.print("\nCharacters using user-defined method: ");
        for (char c : userChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("Are both character arrays equal? " + result);

    }
}
