package com.objectModeling;

public class DepartmentOne {
    String deptName;
    String mainCourse;

    public DepartmentOne(String deptName, String mainCourse) {
        this.deptName = deptName;
        this.mainCourse = mainCourse;
    }

    void showDepartmentOne() {
        System.out.println("Department: " + deptName + ", Main Course: " + mainCourse);
    }
}
