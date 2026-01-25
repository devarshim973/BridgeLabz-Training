package com.Exceptions.NestedtrycatchBlock;

import java.util.Scanner;

public class NestedTryCatchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try {
            // Outer try: Access array element
            int value = numbers[index];

            try {
                // Inner try: Divide by divisor
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}
