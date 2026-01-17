package com.Collections.QueueInterface.CircularBufferSimulation;

public class CircularBufferApp {

    public static void main(String[] args) {

        CircularBuffer circularBuffer = new CircularBuffer(3);

        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        circularBuffer.display();

        circularBuffer.insert(4);
        circularBuffer.display();
    }
}
