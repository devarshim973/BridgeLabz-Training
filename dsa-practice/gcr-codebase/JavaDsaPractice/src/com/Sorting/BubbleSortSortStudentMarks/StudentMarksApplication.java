package com.Sorting.BubbleSortSortStudentMarks;

public class StudentMarksApplication {

    public static void main(String[] args) {

        int[] studentMarks = {78, 92, 45, 88, 67};

        System.out.println("Before Sorting:");
        printMarks(studentMarks);

        BubbleSortUtility.sortAscending(studentMarks);

        System.out.println("After Sorting:");
        printMarks(studentMarks);
    }

    private static void printMarks(int[] marks) {
        for (int value : marks) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
