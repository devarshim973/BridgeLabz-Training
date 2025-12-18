import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {

            System.out.println("Factors of " + number + " are:");

            int counter = 1;

            // Find factors using while loop
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
