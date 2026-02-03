package com.Day3.BasicSystemTasks;



import java.util.Arrays;
import java.util.List;

public class BasicSystemTasksLambda {

    public static void main(String[] args) {

        // 1. Run a task in a separate thread using lambda
        Thread thread = new Thread(() ->
                System.out.println("Task is running in a separate thread")
        );
        thread.start();

        System.out.println("--------------------");

        // 2. Print numbers from a list using lambda
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.forEach(n -> System.out.println(n));


    }
}

        // 3. Check if a number is even
