package com.CSVDataHandling.IntermediateProblems.SearchRecordCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CsvEmployeeSearch {

    public static void main(String[] args) {

    	String filePath = "src/com/CSVDataHandling/BasicProblems/employees.csv";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String searchName = scanner.nextLine();

        boolean found = false;

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

                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {

                    EmployeeRecord employee =
                            new EmployeeRecord(data[2],
                                    Double.parseDouble(data[3]));

                    System.out.println("✅ Employee Found");
                    System.out.println(employee);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("❌ Employee not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
