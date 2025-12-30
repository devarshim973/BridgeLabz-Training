package com.objectModeling;

public class Faculty {
    String name;
    String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name + ", Subject: " + subject);
    }
}
