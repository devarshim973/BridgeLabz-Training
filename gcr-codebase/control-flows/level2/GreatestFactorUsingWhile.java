import java.util.Scanner;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if number is greater than 1
        if (number > 1) {

            int greatestFactor = 1;
            int counter = number - 1;

            // Loop from number-1 to 1
            while (counter >= 1) {

                // Check divisibility
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;   // Exit loop after finding greatest factor
                }

                counter--;
            }

            // Display the result
            System.out.println("The greatest factor of " + number +
                               " besides itself is " + greatestFactor);

        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        sc.close();
    }
}
