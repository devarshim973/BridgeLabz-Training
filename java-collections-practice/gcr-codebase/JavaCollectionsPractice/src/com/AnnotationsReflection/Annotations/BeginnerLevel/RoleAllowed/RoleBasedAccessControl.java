package com.AnnotationsReflection.Annotations.BeginnerLevel.RoleAllowed;


import java.lang.reflect.Method;

public class RoleBasedAccessControl {

    public static void main(String[] args) {

        String currentUserRole = "USER"; // Simulate logged-in role
        AdminTasks tasks = new AdminTasks();

        try {
            Method[] methods = AdminTasks.class.getDeclaredMethods();

            for (Method method : methods) {

                if (method.isAnnotationPresent(RoleAllowed.class)) {
                    RoleAllowed roleAnnotation = method.getAnnotation(RoleAllowed.class);
                    String allowedRole = roleAnnotation.value();

                    System.out.print("Trying to execute " + method.getName() + ": ");

                    if (allowedRole.equals(currentUserRole)) {
                        method.invoke(tasks);
                    } else {
                        System.out.println("Access Denied!");
                    }

                } else {
                    // Methods without annotation are accessible
                    System.out.print("Executing " + method.getName() + ": ");
                    method.invoke(tasks);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
