import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
       //create scanner class for input
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check for valid input
        if (number > 0 && power >= 0) {

            int result = 1;
            int counter = 0;

            // Calculate power using while loop
            while (counter < power) {
                result = result * number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);

        } else {
            System.out.println("Please enter valid positive integers.");
        }
    }
}
