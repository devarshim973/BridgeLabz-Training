package com.Sorting.InsertionSortSortEmployeeIDs;

public class EmployeeIdSortingApplication {

    public static void main(String[] args) {

        int[] employeeIds = {104, 101, 109, 102, 106};

        System.out.println("Before Sorting:");
        printArray(employeeIds);

        InsertionSortUtility.sortAscending(employeeIds);

        System.out.println("After Sorting:");
        printArray(employeeIds);
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
