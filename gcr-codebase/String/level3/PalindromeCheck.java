import java.util.Scanner;

public class PalindromeCheck {

     //  Compare characters from start and end using loop
    
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

      // Recursive palindrome check
    
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeUsingLoop(input);
        boolean result2 = isPalindromeUsingRecursion(input, 0, input.length() - 1);
        boolean result3 = isPalindromeUsingArray(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Loop Logic      : " + result1);
        System.out.println("Using Recursion Logic : " + result2);
        System.out.println("Using Array Logic     : " + result3);
    }
}
