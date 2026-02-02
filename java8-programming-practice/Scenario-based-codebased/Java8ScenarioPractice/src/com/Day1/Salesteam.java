package com.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Salesteam {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", 25, "Male", "Product Development", 2020, 50000),
                new Employee(2, "Neha", 28, "Female", "HR", 2019, 45000),
                new Employee(3, "Rahul", 30, "Male", "Sales", 2018, 60000),
                new Employee(4, "Pooja", 26, "Female", "Product Development", 2021, 48000),
                new Employee(5, "Ayush", 24, "Male", "Sales", 2022, 52000),
                new Employee(6, "Rohit", 23, "Male", "Product Development", 2023, 55000)
        );
		Map<String,Long> map= employees.stream()
				.filter(i->i.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(map);
	}
}
