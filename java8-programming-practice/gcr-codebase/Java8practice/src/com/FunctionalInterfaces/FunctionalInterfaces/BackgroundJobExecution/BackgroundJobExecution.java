package com.FunctionalInterfaces.FunctionalInterfaces.BackgroundJobExecution;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Runnable task using lambda
        Runnable backgroundTask = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Background job completed!");
        };

        // Run task asynchronously
        Thread workerThread = new Thread(backgroundTask);
        workerThread.start();

        System.out.println("Main thread continues execution...");
    }
}
