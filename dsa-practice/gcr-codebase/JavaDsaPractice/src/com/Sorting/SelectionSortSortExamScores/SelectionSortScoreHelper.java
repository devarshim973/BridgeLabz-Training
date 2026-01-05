package com.Sorting.SelectionSortSortExamScores;

public class SelectionSortScoreHelper {

    public static void sortAscending(int[] scores) {

        int length = scores.length;

        for (int i = 0; i < length - 1; i++) {

            int minIndex = i;

            // Find minimum element in remaining array
            for (int j = i + 1; j < length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
}
