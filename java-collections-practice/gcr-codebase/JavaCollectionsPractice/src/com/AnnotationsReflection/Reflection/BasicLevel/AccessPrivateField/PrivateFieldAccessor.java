package com.AnnotationsReflection.Reflection.BasicLevel.AccessPrivateField;


import java.lang.reflect.Field;

public class PrivateFieldAccessor {

    public static void main(String[] args) {

        try {
            // Create object of Person
            Person person = new Person();

            // Get Class object
            Class<?> personClass = person.getClass();

            // Access private field "age"
            Field ageField = personClass.getDeclaredField("age");

            // Allow access to private field
            ageField.setAccessible(true);

            // Get current value
            int currentAge = (int) ageField.get(person);
            System.out.println("Current Age: " + currentAge);

            // Modify private field value
            ageField.set(person, 35);

            // Get updated value
            int updatedAge = (int) ageField.get(person);
            System.out.println("Updated Age: " + updatedAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
