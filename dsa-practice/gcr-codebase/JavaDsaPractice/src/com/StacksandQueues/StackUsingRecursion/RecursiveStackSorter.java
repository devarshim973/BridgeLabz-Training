package com.StacksandQueues.StackUsingRecursion;

import java.util.Stack;

public class RecursiveStackSorter {

    // Method to sort the stack using recursion
    public void sortStack(Stack<Integer> stack) {

        // Base case: empty stack
        if (stack.isEmpty()) {
            return;
        }

        // Step 1: Pop top element
        int topElement = stack.pop();

        // Step 2: Sort remaining stack
        sortStack(stack);

        // Step 3: Insert element in sorted order
        insertInSortedOrder(stack, topElement);
    }

    // Helper method to insert element at correct position
    private void insertInSortedOrder(Stack<Integer> stack, int value) {

        // If stack is empty or top element is smaller
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        // Remove top element
        int temp = stack.pop();

        // Recursive call
        insertInSortedOrder(stack, value);

        // Push back the removed element
        stack.push(temp);
    }
}
