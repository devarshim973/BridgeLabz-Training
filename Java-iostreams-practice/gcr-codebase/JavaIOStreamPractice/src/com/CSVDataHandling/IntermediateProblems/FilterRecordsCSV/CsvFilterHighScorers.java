package com.CSVDataHandling.IntermediateProblems.FilterRecordsCSV;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvFilterHighScorers {

    public static void main(String[] args) {

    	String filePath = "src/com/CSVDataHandling/BasicProblems/students.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean skipHeader = true;

            System.out.println("🎯 Students with marks > 80:\n");

            while ((line = reader.readLine()) != null) {

                // Skip header
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {

                    StudentRecord student = new StudentRecord(
                            data[0],
                            data[1],
                            Integer.parseInt(data[2]),
                            marks
                    );

                    System.out.println(student);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
