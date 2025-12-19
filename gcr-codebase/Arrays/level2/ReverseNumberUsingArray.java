import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }

        int[] digits = new int[digitCount];

        // Store digits in array
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        int[] reversed = new int[digitCount];

        // Copy digits into reversed array
        for (int i = 0; i < digitCount; i++) {
            reversed[i] = digits[i];
        }

        System.out.print("Reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversed[i]);
        }
    }
}
