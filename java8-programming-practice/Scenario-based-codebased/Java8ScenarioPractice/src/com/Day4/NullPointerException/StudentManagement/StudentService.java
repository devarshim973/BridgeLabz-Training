package com.Day4.NullPointerException.StudentManagement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class StudentService {

    private List<Student> students = Arrays.asList(
        new Student(1, "Rahul", "rahul@gmail.com", null, "Delhi", "Rocky"),
        new Student(2, "Anita", null, "9999999999", null, null)
    );

    // 3. Find student by ID
    public Optional<Student> findStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }
}
