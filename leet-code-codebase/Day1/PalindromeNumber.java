import java.util.Scanner;

public class PalindromeNumber {

    //check palindrome number
    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        // Compare original and reversed number
        return original == reverse;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

    }
}
