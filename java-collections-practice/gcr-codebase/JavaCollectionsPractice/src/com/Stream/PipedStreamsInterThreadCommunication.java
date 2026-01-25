package com.Stream;


import java.io.*;

public class PipedStreamsInterThreadCommunication {

    public static void main(String[] args) {

        try {
            // Create piped input and output streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // Connect streams

            // Writer Thread
            Thread writer = new Thread(() -> {
                String message = "Hello from Writer Thread!";
                try {
                    System.out.println("Writer: Sending message...");
                    pos.write(message.getBytes());
                    pos.close(); // Close after writing
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Reader Thread
            Thread reader = new Thread(() -> {
                try {
                    int data;
                    System.out.print("Reader: Received message: ");
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data); // Print character by character
                    }
                    System.out.println();
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Start threads
            reader.start();
            writer.start();

            // Wait for threads to finish
            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

