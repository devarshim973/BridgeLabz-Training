package com.Collections.QueueInterface.ReverseQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReversalOperator {

    // Reverse queue using only queue operations
    public static void reverseQueue(Queue<Integer> queue) {

        if (queue.isEmpty()) {
            return;
        }

        // Remove front element
        int front = queue.remove();

        // Reverse remaining queue
        reverseQueue(queue);

        // Add removed element to rear
        queue.add(front);
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
