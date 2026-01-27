package com.CSVDataHandling.AdvancedProblems.ConvertCSVData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvToStudentObject {

    public static void main(String[] args) {

    	String filePath = "src/com/CSVDataHandling/BasicProblems/students.csv";

        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print all Student objects
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
