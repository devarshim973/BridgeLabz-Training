package com.CSVDataHandling.IntermediateProblems.ModifyCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CsvSalaryUpdater {

    public static void main(String[] args) {

    	String inputFile = "src/com/CSVDataHandling/BasicProblems/employees.csv";
        String outputFile = "src/com/CSVDataHandling/BasicProblems/employees_updated.csv";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile))
        ) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {

                // Write header as it is
                if (isHeader) {
                    writer.println(line);
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase IT department salary by 10%
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                writer.println(
                        data[0] + "," +
                        data[1] + "," +
                        data[2] + "," +
                        salary
                );
            }

            System.out.println("✅ Salary updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
