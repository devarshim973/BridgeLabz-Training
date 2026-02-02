package com.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class yongestemp {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", 25, "Male", "Product Development", 2020, 50000),
                new Employee(2, "Neha", 28, "Female", "HR", 2019, 45000),
                new Employee(3, "Rahul", 30, "Male", "Finance", 2018, 60000),
                new Employee(4, "Pooja", 26, "Female", "Product Development", 2021, 48000),
                new Employee(5, "Ayush", 24, "Male", "Product Development", 2022, 52000),
                new Employee(6, "Rohit", 23, "Male", "Product Development", 2023, 55000)
        );

        // Youngest male employee in Product Development
        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Male"))
                .filter(e -> e.getDepartment().equalsIgnoreCase("Product Development"))
                .min(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
        
	}
}
