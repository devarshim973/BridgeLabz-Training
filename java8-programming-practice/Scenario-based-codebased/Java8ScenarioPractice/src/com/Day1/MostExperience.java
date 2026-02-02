package com.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MostExperience {
	    public static void main(String[] args) {

	        List<Employee> employees = Arrays.asList(
	                new Employee(1, "Aman", 25, "Male", "Product Development", 2020, 50000),
	                new Employee(2, "Neha", 28, "Female", "HR", 2015, 45000),
	                new Employee(3, "Rahul", 30, "Male", "Finance", 2013, 60000),
	                new Employee(4, "Pooja", 26, "Female", "Product Development", 2018, 48000),
	                new Employee(5, "Ayush", 24, "Male", "Product Development", 2022, 52000)
	        );

	        // Employee with most working experience
	        employees.stream()
	                .min(Comparator.comparing(Employee::getYearOfJoining))
	                .ifPresent(e -> System.out.println("Most experienced employee:\n" + e));
	    }
	}
