package com.Collectors.StudentResultGrouping;

import java.util.*;
import java.util.stream.*;

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Amit", "A"),
            new Student("Neha", "B"),
            new Student("Rahul", "A"),
            new Student("Pooja", "C"),
            new Student("Vikas", "B")
        );

        Map<String, List<String>> studentsByGrade =
                students.stream()
                        .collect(Collectors.groupingBy(
                            Student::getGrade,
                            Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        studentsByGrade.forEach((grade, names) ->
            System.out.println(grade + " → " + names)
        );
    }
}
