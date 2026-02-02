package com.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class firstfivehigh {
	public static void main(String[] args) {
		List<Employee> employee= Arrays.asList(
				new Employee(1, "Aman", 25, "Male", "IT", 2020, 50000),
	            new Employee(2, "Neha", 28, "Female", "HR", 2019, 45000),
	            new Employee(3, "Ayush", 30, "Male", "Finance", 2018, 60),
	            new Employee(4, "Pooja", 26, "Female", "manager", 2021, 48000),
	            new Employee(5, "nikhil", 27, "Male", "accountent", 2022, 52000),
	            new Employee(6, "mishra", 30, "Male", "Finance", 2018, 6000),
	            new Employee(7, "payasi", 31, "Male", "business", 2019, 600)
	            
				);
		employee.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.limit(5)
		.forEach(i->System.out.println(i));	
		
		
	}
}
