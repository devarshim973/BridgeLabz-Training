package com.AnnotationsReflection.Reflection.AdvancedLevel.DependencyInjectionReflection;


import java.lang.reflect.Field;

public class SimpleDIContainer {

    public static <T> T getBean(Class<T> clazz) {

        try {
            // Create main object
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Scan fields for @Inject
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {

                    // Create dependency instance
                    Class<?> fieldType = field.getType();
                    Object dependency = fieldType.getDeclaredConstructor().newInstance();

                    // Set field accessible and inject
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("DI failed", e);
        }
    }
}
