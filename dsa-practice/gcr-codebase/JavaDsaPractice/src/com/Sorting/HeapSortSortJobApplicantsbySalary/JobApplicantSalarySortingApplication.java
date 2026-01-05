package com.Sorting.HeapSortSortJobApplicantsbySalary;

public class JobApplicantSalarySortingApplication {

    public static void main(String[] args) {

        int[] expectedSalaries = {45000, 70000, 32000, 85000, 60000};

        System.out.println("Before Sorting:");
        displaySalaries(expectedSalaries);

        HeapSortSalaryProcessor.sortAscending(expectedSalaries);

        System.out.println("After Sorting:");
        displaySalaries(expectedSalaries);
    }

    private static void displaySalaries(int[] salaries) {
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }
}
