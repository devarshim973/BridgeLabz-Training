package com.AnnotationsReflection.Reflection.AdvancedLevel.MethodExecutionTiming;

import java.lang.reflect.Method;

public class MethodTimer {

    public static void main(String[] args) {

        try {
            // Load class dynamically
            Class<?> clazz = MathTasks.class;
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Get all methods
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {

                long start = System.nanoTime(); // start time
                method.invoke(obj);             // invoke method
                long end = System.nanoTime();   // end time

                System.out.println("Method: " + method.getName() +
                        " executed in " + (end - start) / 1_000_000 + " ms");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
