package com.AnnotationsReflection.Annotations.BeginnerLevel.LogExecutionTime;


import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void main(String[] args) {

        try {
            Class<TaskProcessor> clazz = TaskProcessor.class;
            Object obj = clazz.getDeclaredConstructor().newInstance();

            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {

                if (method.isAnnotationPresent(LogExecutionTime.class)) {

                    long start = System.nanoTime();
                    method.invoke(obj);
                    long end = System.nanoTime();

                    System.out.println("Method: " + method.getName() +
                            " executed in " + (end - start) / 1_000_000 + " ms");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
