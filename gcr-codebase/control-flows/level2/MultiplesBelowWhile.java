import java.util.Scanner;

public class MultiplesBelowWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 100;

            // Loop from 100 to 1 using while
            while (counter > 0) {

                // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--;
            }

        } else {
            System.out.println("Please enter a positive number less than 100.");
        }

        sc.close();
    }
}
