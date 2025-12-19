import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
      // create scanner to take input
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;

        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];

        // Store digits in the array
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}
