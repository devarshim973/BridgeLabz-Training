package com.Sorting.SelectionSortSortExamScores;

public class ExamScoreSortingApplication {

    public static void main(String[] args) {

        int[] examScores = {78, 92, 65, 88, 70};

        System.out.println("Before Sorting:");
        printScores(examScores);

        SelectionSortScoreHelper.sortAscending(examScores);

        System.out.println("After Sorting:");
        printScores(examScores);
    }

    private static void printScores(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
