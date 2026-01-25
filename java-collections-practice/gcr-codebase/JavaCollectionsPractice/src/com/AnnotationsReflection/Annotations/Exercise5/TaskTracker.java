package com.AnnotationsReflection.Annotations.Exercise5;

public class TaskTracker {

    @BugReport(description = "Null pointer exception on login")
    @BugReport(description = "UI misalignment on dashboard")
    public void performTask() {
        System.out.println("Executing task...");
    }
}
