package com.Day2;

import java.util.Arrays;
import java.util.List;

public class branch {
	public static void main(String[] args) {

        List<Student> student = Arrays.asList(
                new Student(1, "Aman", 20, "Male", "Satna", 45, "9876543210"),
                new Student(2, "vaishali", 21, "Female", "Rewa", 72, "9876543222"),
                new Student(3, "Nikhil", 19, "Male", "Indore", 30, "9876543333"),
                new Student(4, "parul", 26, "Female", "Panna", 55, "9876543444"),
                new Student(5, "Devansh", 20, "Male", "Bhopal", 15, "9876543555")
        );
        
        student.stream()
        .filter(i->i.getFirstName().equals("Mechanical Engineering"))
        .forEach(System.out::println);
        
	}
}
