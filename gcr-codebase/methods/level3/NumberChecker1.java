import java.util.Scanner;

public class NumberChecker1 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0) return 1;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = Math.abs(number);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double findSumOfSquares(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    // Method to find frequency of each digit

    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        // Count frequency
        for (int d : digits) {
            frequency[d][1]++;
        }

        return frequency;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.print("\nDigits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        int sum = findSumOfDigits(digits);
        double sumOfSquares = findSumOfSquares(digits);

        System.out.println("\n\nSum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        System.out.println("Harshad Number: " +
                (isHarshadNumber(number, digits) ? "Yes" : "No"));

        int[][] frequency = findDigitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }

    }
}
