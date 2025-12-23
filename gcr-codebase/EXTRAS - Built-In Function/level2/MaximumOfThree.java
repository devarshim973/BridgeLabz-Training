import java.util.Scanner;

public class MaximumOfThree {

    // take an integer input from user
    public static int takeInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    //  find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = takeInput(sc, "Enter first number: ");
        int num2 = takeInput(sc, "Enter second number: ");
        int num3 = takeInput(sc, "Enter third number: ");

        int maximum = findMaximum(num1, num2, num3);

        System.out.println("Maximum number is: " + maximum);

    }
}
