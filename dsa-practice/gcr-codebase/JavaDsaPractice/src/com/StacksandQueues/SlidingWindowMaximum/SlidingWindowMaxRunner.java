package com.StacksandQueues.SlidingWindowMaximum;

public class SlidingWindowMaxRunner {

    public static void main(String[] args) {

        int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;

        SlidingWindowMaxProcessor processor = new SlidingWindowMaxProcessor();
        int[] maxValues = processor.findMaximumInWindows(array, windowSize);

        System.out.println("Sliding Window Maximums:");

        for (int value : maxValues) {
            System.out.print(value + " ");
        }
    }
}

