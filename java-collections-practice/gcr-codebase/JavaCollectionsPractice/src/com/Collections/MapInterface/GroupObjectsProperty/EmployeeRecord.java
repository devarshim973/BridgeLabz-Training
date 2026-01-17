package com.Collections.MapInterface.GroupObjectsProperty;

class EmployeeRecord {

    private String name;
    private Department department;

    public EmployeeRecord(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}