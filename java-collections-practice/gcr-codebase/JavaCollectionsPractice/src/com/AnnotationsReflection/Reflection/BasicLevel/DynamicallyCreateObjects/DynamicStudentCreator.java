package com.AnnotationsReflection.Reflection.BasicLevel.DynamicallyCreateObjects;


public class DynamicStudentCreator {

    public static void main(String[] args) {

        try {
            // Load class dynamically
            Class<?> studentClass =
                    Class.forName("com.reflectiondynamic.Student");

            // Create object without using 'new'
            Object obj = studentClass
                    .getDeclaredConstructor()
                    .newInstance();

            // Type cast
            Student student = (Student) obj;

            // Call method
            student.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
