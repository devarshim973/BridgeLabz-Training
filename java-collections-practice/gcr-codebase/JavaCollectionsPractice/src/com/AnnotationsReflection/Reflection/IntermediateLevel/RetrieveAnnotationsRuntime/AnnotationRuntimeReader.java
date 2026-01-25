package com.AnnotationsReflection.Reflection.IntermediateLevel.RetrieveAnnotationsRuntime;


public class AnnotationRuntimeReader {

    public static void main(String[] args) {

        // Load class
        Class<AnnotatedBook> clazz = AnnotatedBook.class;

        // Check if annotation is present
        if (clazz.isAnnotationPresent(Author.class)) {

            // Retrieve annotation
            Author author = clazz.getAnnotation(Author.class);

            // Display annotation value
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("Author annotation not found.");
        }
    }
}
