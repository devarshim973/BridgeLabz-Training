package com.CSVDataHandling.AdvancedProblems.GenerateCSVReport;


import java.io.FileWriter;
import java.io.IOException;

public class EmployeeCsvReport {

    public static void main(String[] args) {

        // ==========================
        // 1. Database connection details
        // ==========================
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database"; // Replace with your DB name
        String username = "your_username"; // Replace with your DB username
        String password = "your_password"; // Replace with your DB password

        // CSV file path
        String csvFilePath = "employees_report.csv";

        // ==========================
        // 2. JDBC code to fetch data
        // ==========================
        try (
                // Establish connection
                Connection connection = DriverManager.getConnection(jdbcURL, username, password);

                // Create statement
                Statement statement = connection.createStatement();

                // CSV file writer
                FileWriter fileWriter = new FileWriter(csvFilePath)
        ) {
            // SQL query to fetch employee records
            String sql = "SELECT employee_id, name, department, salary FROM employees";

            ResultSet resultSet = statement.executeQuery(sql);

            // Write CSV headers
            fileWriter.append("Employee ID,Name,Department,Salary\n");

            // Write each row from database
            while (resultSet.next()) {
                fileWriter.append(resultSet.getString("employee_id")).append(",");
                fileWriter.append(resultSet.getString("name")).append(",");
                fileWriter.append(resultSet.getString("department")).append(",");
                fileWriter.append(String.valueOf(resultSet.getDouble("salary"))).append("\n");
            }

            System.out.println("CSV report generated successfully at: " + csvFilePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
