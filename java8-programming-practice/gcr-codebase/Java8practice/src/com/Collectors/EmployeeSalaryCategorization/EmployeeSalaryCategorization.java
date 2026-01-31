package com.Collectors.EmployeeSalaryCategorization;

import java.util.*;
import java.util.stream.*;

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Amit", "IT", 60000),
            new Employee("Neha", "HR", 45000),
            new Employee("Rahul", "IT", 75000),
            new Employee("Pooja", "Finance", 55000),
            new Employee("Vikas", "HR", 50000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                             Employee::getDepartment,
                             Collectors.averagingDouble(Employee::getSalary)
                         ));

        avgSalaryByDept.forEach((dept, avgSalary) ->
            System.out.println(dept + " → Average Salary: ₹" + avgSalary)
        );
    }
}
