package com.AnnotationsReflection.Annotations.Exercise4;


import java.lang.reflect.Method;

public class AnnotationReader {

    public static void main(String[] args) {

        try {
            // Load class
            Class<TaskManager> clazz = TaskManager.class;

            // Get methods
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {

                // Check if method has TaskInfo annotation
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + taskInfo.priority());
                    System.out.println("Assigned To: " + taskInfo.assignedTo());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
