package com.JSON.HandsonPracticeProblems.JSONreport;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseToJsonReport {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        String query = "SELECT EmployeeID, Name, Department, Salary FROM employees";

        List<Map<String, Object>> employeeList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Map<String, Object> employee = new HashMap<>();
                employee.put("EmployeeID", rs.getInt("EmployeeID"));
                employee.put("Name", rs.getString("Name"));
                employee.put("Department", rs.getString("Department"));
                employee.put("Salary", rs.getDouble("Salary"));

                employeeList.add(employee);
            }

            // Convert list to JSON
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("employees.json"), employeeList);

            System.out.println("JSON report generated successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
