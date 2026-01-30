package com.JSON.PracticeProblems.JavaobjectsintoJSONarray;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ravi", 22));
        students.add(new Student(2, "Anita", 24));
        students.add(new Student(3, "Suresh", 21));

        try {
            ObjectMapper mapper = new ObjectMapper();

            String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                     .writeValueAsString(students);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
