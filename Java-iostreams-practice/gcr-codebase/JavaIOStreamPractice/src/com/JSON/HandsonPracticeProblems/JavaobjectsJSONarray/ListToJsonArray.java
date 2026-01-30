package com.JSON.HandsonPracticeProblems.JavaobjectsJSONarray;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray {

    public static void main(String[] args) {

        try {
            // Create list of Java objects
            List<Student> students = new ArrayList<>();
            students.add(new Student(1, "Amit", 22));
            students.add(new Student(2, "Ravi", 26));
            students.add(new Student(3, "Neha", 24));

            // Jackson ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Convert List to JSON Array
            String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                     .writeValueAsString(students);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
