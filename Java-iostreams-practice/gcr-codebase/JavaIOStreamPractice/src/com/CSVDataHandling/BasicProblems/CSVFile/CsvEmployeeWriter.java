package com.CSVDataHandling.BasicProblems.CSVFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class CsvEmployeeWriter {

    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/BasicProblems/employees.csv";

        List<EmployeeRecord> employees = Arrays.asList(
                new EmployeeRecord(101, "Ravi", "IT", 55000),
                new EmployeeRecord(102, "Anita", "HR", 48000),
                new EmployeeRecord(103, "Rohit", "Finance", 60000),
                new EmployeeRecord(104, "Neha", "Marketing", 52000),
                new EmployeeRecord(105, "Amit", "IT", 58000)
        );

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            // CSV Header
            writer.write("ID,Name,Department,Salary");
            writer.newLine();

            // Records
            for (EmployeeRecord emp : employees) {
                writer.write(emp.toCsv());
                writer.newLine();
            }

            System.out.println("✅ employees.csv file created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
