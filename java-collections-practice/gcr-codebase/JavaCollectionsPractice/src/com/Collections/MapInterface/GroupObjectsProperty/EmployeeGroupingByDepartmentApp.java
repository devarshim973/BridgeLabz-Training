package com.Collections.MapInterface.GroupObjectsProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Enum for Department
enum Department {
    HR, IT, FINANCE
}

// Employee class
class EmployeeRecord {

    private String name;
    private Department department;

    public EmployeeRecord(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Main class
public class EmployeeGroupingByDepartmentApp {

    public static void main(String[] args) {

        List<EmployeeRecord> employees = new ArrayList<>();
        employees.add(new EmployeeRecord("Alice", Department.HR));
        employees.add(new EmployeeRecord("Bob", Department.IT));
        employees.add(new EmployeeRecord("Carol", Department.HR));

        Map<Department, List<EmployeeRecord>> groupedEmployees =
                groupByDepartment(employees);

        // Display grouped result
        for (Map.Entry<Department, List<EmployeeRecord>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Method to group employees by department
    public static Map<Department, List<EmployeeRecord>> groupByDepartment(
            List<EmployeeRecord> employeeList) {

        Map<Department, List<EmployeeRecord>> departmentMap = new HashMap<>();

        for (EmployeeRecord employee : employeeList) {

            departmentMap
                    .computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>())
                    .add(employee);
        }

        return departmentMap;
    }
}
