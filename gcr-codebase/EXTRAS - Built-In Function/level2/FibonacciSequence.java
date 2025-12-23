import java.util.Scanner;

public class FibonacciSequence {

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int terms) {

        int first = 0, second = 1;

        // Print Fibonacci numbers
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}
