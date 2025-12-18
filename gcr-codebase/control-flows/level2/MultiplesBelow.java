import java.util.Scanner;

public class MultiplesBelow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop from 100 to 1 (backward)
            for (int i = 100; i >= 1; i--) {

                // Check if i is a multiple of the given number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
    }
}
