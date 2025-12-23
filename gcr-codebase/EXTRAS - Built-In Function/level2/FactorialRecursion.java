import java.util.Scanner;

public class FactorialRecursion {

    //  take input from the user
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        return sc.nextInt();
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }

    // Method to display the result
    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {
        int number = getInput();
        long fact = factorial(number);
        displayResult(number, fact);
    }
}
