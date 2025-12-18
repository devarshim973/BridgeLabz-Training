import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number > 1) {

            int greatestFactor = 1;

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {

                // Check divisibility
                if (number % i == 0) {
                    greatestFactor = i;
                    break;   // Exit loop after finding greatest factor
                }
            }

            // Display result
            System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);

        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

    }
}
