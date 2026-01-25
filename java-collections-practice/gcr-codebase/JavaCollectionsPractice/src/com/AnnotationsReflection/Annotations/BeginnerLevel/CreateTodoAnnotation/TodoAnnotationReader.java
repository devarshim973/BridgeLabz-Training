package com.AnnotationsReflection.Annotations.BeginnerLevel.CreateTodoAnnotation;


import java.lang.reflect.Method;

public class TodoAnnotationReader {

    public static void main(String[] args) {

        try {
            Class<ProjectBoard> clazz = ProjectBoard.class;
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Pending tasks:");

            for (Method method : methods) {
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println("-----------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
