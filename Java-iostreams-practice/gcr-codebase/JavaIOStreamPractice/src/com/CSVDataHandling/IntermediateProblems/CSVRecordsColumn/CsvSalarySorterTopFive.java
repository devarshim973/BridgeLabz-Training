package com.CSVDataHandling.IntermediateProblems.CSVRecordsColumn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CsvSalarySorterTopFive {

    static class Employee {
        String id;
        String name;
        String department;
        double salary;

        Employee(String id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

    	String filePath = "src/com/CSVDataHandling/BasicProblems/employees.csv";

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                employees.add(new Employee(
                        data[0],
                        data[1],
                        data[2],
                        Double.parseDouble(data[3])
                ));
            }

            // Sort by salary descending
            employees.sort(Comparator.comparingDouble(e -> -e.salary));

            System.out.println("🏆 Top 5 Highest Paid Employees:");
            System.out.println("--------------------------------");

            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                Employee e = employees.get(i);
                System.out.println(
                        e.name + " | " +
                        e.department + " | Salary: " +
                        e.salary
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
