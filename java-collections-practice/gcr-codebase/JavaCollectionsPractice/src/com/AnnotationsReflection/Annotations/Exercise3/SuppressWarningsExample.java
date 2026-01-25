package com.AnnotationsReflection.Annotations.Exercise3;


import java.util.ArrayList;

public class SuppressWarningsExample {

    @SuppressWarnings("unchecked") // suppress unchecked warnings
    public static void main(String[] args) {

        // Raw ArrayList (no generics)
        ArrayList list = new ArrayList();

        // Adding elements
        list.add("Ritika");
        list.add("Devarshi");
        list.add(123); // mixing types, would normally give unchecked warning

        // Retrieving elements (type cast required)
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
