package com.Day4.NullPointerException.StudentManagement;

import java.util.Optional;

public class StudentManagementMain {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Optional<Student> studentOpt = service.findStudentById(2);

        // 3. Student not available
        Student student = studentOpt.orElseThrow(
                () -> new RuntimeException("Student not available")
        );

        // 1. Fetch email safely
        String email = student.getEmail().orElse("Email not provided");
        System.out.println("Email: " + email);

        // 2. Default phone number
        String phone = student.getPhone().orElse("0000000000");
        System.out.println("Phone: " + phone);

        // 4. Fetch address safely
        String address = student.getAddress().orElse("Address not available");
        System.out.println("Address: " + address);

        // 5. Nickname or real name
        String displayName = student.getNickName().orElse(student.getName());
        System.out.println("Display Name: " + displayName);
    }
}
