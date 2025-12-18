import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize count variable
        int count = 0;

        //  if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {

                // Remove last digit
                number = number / 10;
                count++;
            }
        }
        System.out.println("Number of digits = " + count);

    }
}
