import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Maximum digits allowed
        int maxDigit = 10;

        int[] digits = new int[maxDigit];
          int index = 0;
        while (number != 0) {
            digits[index] = number % 10; // Get last digit
            number = number / 10;         // Remove last digit
            index++;

            // Stop if array size reaches maxDigit
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the result
        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);
    }
}
