package com.AnnotationsReflection.Annotations.Exercise4;


public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Ritika")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }
}
