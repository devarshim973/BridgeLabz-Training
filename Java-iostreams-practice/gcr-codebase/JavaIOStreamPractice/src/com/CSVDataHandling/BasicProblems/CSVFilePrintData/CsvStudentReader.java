package com.CSVDataHandling.BasicProblems.CSVFilePrintData;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvStudentReader {

    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/BasicProblems/students.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean skipHeader = true;

            while ((line = reader.readLine()) != null) {

                // Skip header row
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                StudentRecord student = new StudentRecord(
                        data[0],
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                System.out.println(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
