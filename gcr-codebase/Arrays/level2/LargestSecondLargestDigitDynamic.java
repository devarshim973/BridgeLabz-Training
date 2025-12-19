import java.util.Scanner;

public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10;

        int[] digits = new int[maxDigit];

        int index = 0;

        while (number != 0) {

            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                // Create temporary array with increased size
                int[] temp = new int[maxDigit];

                // Copy old digits into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            // Store last digit
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Variables to store largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);
    }
}
