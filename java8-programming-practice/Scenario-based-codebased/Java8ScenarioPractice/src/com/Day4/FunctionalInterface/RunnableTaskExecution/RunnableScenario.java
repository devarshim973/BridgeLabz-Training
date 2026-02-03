package com.Day4.FunctionalInterface.RunnableTaskExecution;


public class RunnableScenario {

    public static void main(String[] args) {

        // 1. Run a background task using Runnable
        Runnable backgroundTask =
                () -> System.out.println("Background task is running...");
        new Thread(backgroundTask).start();

        // 2. Execute a file cleanup task using Runnable
        Runnable fileCleanupTask =
                () -> System.out.println("File cleanup task executed...");
        new Thread(fileCleanupTask).start();

        // 3. Print a message in a separate thread using Runnable
        Runnable printMessage =
                () -> System.out.println("Hello from a separate thread!");
        new Thread(printMessage).start();
    }
}
