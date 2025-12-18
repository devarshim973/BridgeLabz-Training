import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find all divisors except the number itself
        for (int i = 1; i < number; i++) {

            // Check if i is a divisor of number
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        //  Check Abundant Number condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

    }
}
