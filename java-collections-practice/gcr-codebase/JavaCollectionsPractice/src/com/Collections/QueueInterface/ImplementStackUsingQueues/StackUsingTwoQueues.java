package com.Collections.QueueInterface.ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingTwoQueues {

    private Queue<Integer> primaryQueue;
    private Queue<Integer> secondaryQueue;

    public StackUsingTwoQueues() {
        primaryQueue = new LinkedList<>();
        secondaryQueue = new LinkedList<>();
    }

    // Push operation
    public void push(int value) {

        // Step 1: Add new element to secondary queue
        secondaryQueue.add(value);

        // Step 2: Move all elements from primary to secondary
        while (!primaryQueue.isEmpty()) {
            secondaryQueue.add(primaryQueue.remove());
        }

        // Step 3: Swap queues
        Queue<Integer> temp = primaryQueue;
        primaryQueue = secondaryQueue;
        secondaryQueue = temp;
    }

    // Pop operation
    public int pop() {
        if (primaryQueue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return primaryQueue.remove();
    }

    // Top operation
    public int top() {
        if (primaryQueue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return primaryQueue.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return primaryQueue.isEmpty();
    }
}

