package com.StacksandQueues.QueueUsingStacks;

import java.util.Stack;

public class TwoStackQueueService {

    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    // Constructor
    public TwoStackQueueService() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int element) {
        pushStack.push(element);
        System.out.println("Enqueued: " + element);
    }

    // Dequeue operation
    public int dequeue() {

        // If queue is empty
        if (pushStack.isEmpty() && popStack.isEmpty()) {
            System.out.println("Queue is empty. Dequeue not possible.");
            return -1;
        }

        // Transfer elements if popStack is empty
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        int removedElement = popStack.pop();
        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }

    // Display queue elements
    public void displayQueue() {

        if (pushStack.isEmpty() && popStack.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");

        // Print elements ready to dequeue
        for (int i = popStack.size() - 1; i >= 0; i--) {
            System.out.print(popStack.get(i) + " ");
        }

        // Print newly enqueued elements
        for (int i = 0; i < pushStack.size(); i++) {
            System.out.print(pushStack.get(i) + " ");
        }

        System.out.println();
    }
}
