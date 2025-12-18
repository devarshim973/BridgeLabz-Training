import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        //  Use while loop to process each digit
        while (originalNumber != 0) {

            //  Find last digit using modulus
            int digit = originalNumber % 10;

            sum = sum + (digit * digit * digit);

            //  Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        //Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

    }
}
