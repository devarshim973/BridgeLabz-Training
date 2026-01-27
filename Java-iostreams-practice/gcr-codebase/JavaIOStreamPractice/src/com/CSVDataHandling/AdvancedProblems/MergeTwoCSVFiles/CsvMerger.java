package com.CSVDataHandling.AdvancedProblems.MergeTwoCSVFiles;

import java.io.*;
import java.util.*;

public class CsvMerger {

    public static void main(String[] args) {

        String file1 = "src/com/CSVDataHandling/AdvancedProblems/students1.csv";
        String file2 = "src/com/CSVDataHandling/AdvancedProblems/students2.csv";
        String outputFile = "src/com/CSVDataHandling/AdvancedProblems/merged_students.csv";

        Map<Integer, String[]> marksMap = new HashMap<>();
        List<Student> students = new ArrayList<>();

        try {
            // Read students2.csv → ID, Marks, Grade
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            reader2.readLine(); // skip header
            String line;

            while ((line = reader2.readLine()) != null) {
                String[] data = line.split(",");
                marksMap.put(
                        Integer.parseInt(data[0]),
                        new String[]{data[1], data[2]}
                );
            }
            reader2.close();

            // Read students1.csv → ID, Name, Age
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            reader1.readLine(); // skip header

            while ((line = reader1.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);

                String marks = "NA";
                String grade = "NA";

                if (marksMap.containsKey(id)) {
                    marks = marksMap.get(id)[0];
                    grade = marksMap.get(id)[1];
                }

                students.add(new Student(id, name, age, marks, grade));
            }
            reader1.close();

            // Write merged CSV
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("ID,Name,Age,Marks,Grade\n");

            for (Student s : students) {
                writer.write(s.toCsv());
                writer.newLine();
            }

            writer.close();

            System.out.println("✅ CSV files merged successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
