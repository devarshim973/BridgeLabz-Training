package com.day4;

class Faculty extends Person {

    private String department;

    public Faculty(int id, String name,
                   String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    @Override
    public void printDetails() {
        System.out.println(
                "Faculty ID: " + id +
                ", Name: " + name +
                ", Department: " + department
        );
    }
}
