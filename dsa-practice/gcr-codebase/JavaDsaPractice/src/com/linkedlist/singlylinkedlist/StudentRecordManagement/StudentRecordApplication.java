package com.linkedlist.singlylinkedlist.StudentRecordManagement;

public class StudentRecordApplication {
    public static void main(String[] args) {

        StudentLinkedList studentList = new StudentLinkedList();

        studentList.addAtBeginning(101, "Amit", 20, "A");
        studentList.addAtEnd(102, "Neha", 21, "B");
        studentList.addAtEnd(103, "Rahul", 22, "C");

        studentList.addAtPosition(2, 104, "Sneha", 19, "A");

        System.out.println("\nAll Student Records:");
        studentList.displayStudents();

        System.out.println("\nSearching Roll Number 102:");
        studentList.searchStudent(102);

        System.out.println("\nUpdating Grade for Roll 103:");
        studentList.updateGrade(103, "A");

        System.out.println("\nDeleting Roll Number 101:");
        studentList.deleteByRollNumber(101);

        System.out.println("\nFinal Student Records:");
        studentList.displayStudents();
    }
}
