package com.StacksandQueues.QueueUsingStacks;

public class TwoStackQueueRunner {

    public static void main(String[] args) {

        TwoStackQueueService queue = new TwoStackQueueService();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();

        queue.enqueue(40);
        queue.displayQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Edge case
    }
}
