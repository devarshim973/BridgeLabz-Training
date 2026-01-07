package com.TimeandSpaceComplexity;

class FibonacciComputationComparison {

    // ---------------- Recursive Fibonacci ----------------
    // Time Complexity: O(2^N)
    // Space Complexity: O(N) due to recursion stack
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // ---------------- Iterative Fibonacci ----------------
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {

        int n = 30;

        // -------- Recursive Execution --------
        long recursiveStart = System.nanoTime();
        int recursiveResult = fibonacciRecursive(n);
        long recursiveEnd = System.nanoTime();

        // -------- Iterative Execution --------
        long iterativeStart = System.nanoTime();
        int iterativeResult = fibonacciIterative(n);
        long iterativeEnd = System.nanoTime();

        System.out.println("Fibonacci Number (N): " + n);

        System.out.println("Recursive Result: " + recursiveResult);
        System.out.println("Recursive Time (ms): " +
                (recursiveEnd - recursiveStart) / 1_000_000.0);

        System.out.println("Iterative Result: " + iterativeResult);
        System.out.println("Iterative Time (ms): " +
                (iterativeEnd - iterativeStart) / 1_000_000.0);
    }
}
