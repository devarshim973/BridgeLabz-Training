package com.Collections.QueueInterface.CircularBufferSimulation;

class CircularBuffer {

    private int[] buffer;
    private int front;
    private int rear;
    private int count;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        front = 0;
        rear = 0;
        count = 0;
    }

    // Insert element into circular buffer
    public void insert(int value) {

        buffer[rear] = value;
        rear = (rear + 1) % capacity;

        if (count < capacity) {
            count++;
        } else {
            // Buffer full → overwrite oldest
            front = (front + 1) % capacity;
        }
    }

    // Display buffer elements from oldest to newest
    public void display() {
        System.out.print("Buffer: [ ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(buffer[index] + " ");
        }
        System.out.println("]");
    }
}

