package com.AnnotationsReflection.Annotations.BeginnerLevel.CreateAnnotationImportantMethods;


import java.lang.reflect.Method;

public class ImportantMethodReader {

    public static void main(String[] args) {

        try {
            Class<ProjectTasks> clazz = ProjectTasks.class;
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Important methods:");

            for (Method method : methods) {
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("Method: " + method.getName() +
                            ", Level: " + annotation.level());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
