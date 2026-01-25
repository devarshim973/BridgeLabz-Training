package com.AnnotationsReflection.Annotations.Exercise5;


import java.lang.reflect.Method;

public class RepeatableAnnotationReader {

    public static void main(String[] args) {

        try {
            Class<TaskTracker> clazz = TaskTracker.class;
            Method method = clazz.getDeclaredMethod("performTask");

            // Retrieve all BugReport annotations
            BugReport[] reports = method.getAnnotationsByType(BugReport.class);

            System.out.println("Bug reports for method: " + method.getName());
            for (BugReport report : reports) {
                System.out.println("- " + report.description());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
