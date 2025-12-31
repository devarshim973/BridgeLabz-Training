package com.Inheritance.hierarchicalinheritance;

public class TeacherRole extends PersonBase {
    String subject;

    TeacherRole(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        showBasicInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
