package com.RegexJUnit.JUnit.BasicJUnit.PerformanceTestingUsingTimeout;

public class PerformanceUtils {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Simulates a long-running task
        return "Completed";
    }
}
