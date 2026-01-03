package com.StacksandQueues.StockSpanProblem;

import java.util.Stack;

public class StockSpanCalculator {

    public int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];

        Stack<Integer> indexStack = new Stack<>();

        // First day span is always 1
        span[0] = 1;
        indexStack.push(0);

        // Calculate span for remaining days
        for (int i = 1; i < n; i++) {

            // Pop while current price is higher or equal
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= prices[i]) {
                indexStack.pop();
            }

            // If stack empty, price is highest so far
            span[i] = indexStack.isEmpty() ? (i + 1) : (i - indexStack.peek());

            // Push current index
            indexStack.push(i);
        }

        return span;
    }
}
