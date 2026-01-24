package com.AnnotationsReflection.Reflection.AdvancedLevel.MethodExecutionTiming;


public class MathTasks {

    public void task1() {
        for (int i = 0; i < 1000000; i++);
    }

    public void task2() {
        long sum = 0;
        for (int i = 0; i < 1000000; i++) sum += i;
    }

    public void task3() {
        try { Thread.sleep(500); } catch (InterruptedException e) {}
    }
}
