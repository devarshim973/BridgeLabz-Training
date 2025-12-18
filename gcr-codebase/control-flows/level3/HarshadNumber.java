import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        while (originalNumber != 0) {

            // Get last digit
            int digit = originalNumber % 10;

            // Add digit to sum
            sum = sum + digit;

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

    }
}
