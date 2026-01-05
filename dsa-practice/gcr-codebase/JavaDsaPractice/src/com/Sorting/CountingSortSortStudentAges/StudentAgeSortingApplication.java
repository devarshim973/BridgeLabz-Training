package com.Sorting.CountingSortSortStudentAges;

public class StudentAgeSortingApplication {

    public static void main(String[] args) {

        int[] studentAges = {14, 12, 15, 10, 18, 13, 12, 16};

        System.out.println("Before Sorting:");
        printAges(studentAges);

        CountingSortAgeHandler.sortAgesAscending(studentAges);

        System.out.println("After Sorting:");
        printAges(studentAges);
    }

    private static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
}
