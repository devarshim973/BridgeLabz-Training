import java.util.Scanner;

public class GcdLcmCalculator {

    //  take two integer inputs from the user
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.print("Enter the first number: ");
        numbers[0] = sc.nextInt();
        System.out.print("Enter the second number: ");
        numbers[1] = sc.nextInt();
        return numbers;
    }

    //  calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //  calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // display GCD and LCM
    public static void displayResult(int a, int b, int gcdValue, int lcmValue) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcdValue);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmValue);
    }

    public static void main(String[] args) {
        int[] nums = getInput();
        int gcdValue = gcd(nums[0], nums[1]);
        int lcmValue = lcm(nums[0], nums[1]);
        displayResult(nums[0], nums[1], gcdValue, lcmValue);
    }
}
