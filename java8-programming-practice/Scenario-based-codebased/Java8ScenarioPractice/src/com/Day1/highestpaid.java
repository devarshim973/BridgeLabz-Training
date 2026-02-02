package com.Day1;

import java.util.*;
import java.util.Comparator;
import java.util.stream.*;


public class highestpaid {
	public static void main(String[] args) {
		List<Employee> employee= Arrays.asList(
				new Employee(1, "Aman", 25, "Male", "IT", 2020, 50000),
	            new Employee(2, "Neha", 28, "Female", "HR", 2019, 45000),
	            new Employee(3, "Ayush", 30, "Male", "Finance", 2018, 60000),
	            new Employee(4, "Pooja", 26, "Female", "IT", 2021, 48000),
	            new Employee(5, "nikhil", 27, "Male", "HR", 2022, 52000)
				);
		
		employee.stream()
        .mapToDouble(Employee::getSalary)
        .max()
        
        .ifPresent(System.out::println);

	}
}
