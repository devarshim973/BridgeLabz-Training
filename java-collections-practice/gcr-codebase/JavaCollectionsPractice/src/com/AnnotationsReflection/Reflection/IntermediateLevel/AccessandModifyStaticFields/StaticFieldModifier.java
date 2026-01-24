package com.AnnotationsReflection.Reflection.IntermediateLevel.AccessandModifyStaticFields;


import java.lang.reflect.Field;

public class StaticFieldModifier {

    public static void main(String[] args) {

        try {
            // Load Configuration class
            Class<?> configClass =
                    Class.forName("com.reflectionstatic.Configuration");

            // Access private static field
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Allow access to private field
            apiKeyField.setAccessible(true);

            // Modify static field (object reference = null)
            apiKeyField.set(null, "NEW_SECURE_API_KEY");

            // Print updated value
            System.out.println("Updated API_KEY: " +
                    Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
