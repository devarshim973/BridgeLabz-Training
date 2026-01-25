package com.AnnotationsReflection.Annotations.BeginnerLevel.LogExecutionTime;


public class TaskProcessor {

    @LogExecutionTime
    public void taskFast() {
        for (int i = 0; i < 1000; i++); // quick task
    }

    @LogExecutionTime
    public void taskSlow() {
        try {
            Thread.sleep(500); // simulate slow task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void taskNormal() {
        for (int i = 0; i < 100000; i++); // normal task
    }
}
