package com.StacksandQueues.StackUsingRecursion;

import java.util.Stack;

public class RecursiveStackSortRunner {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        RecursiveStackSorter sorter = new RecursiveStackSorter();
        sorter.sortStack(stack);

        System.out.println("Sorted Stack (Ascending): " + stack);
    }
}
