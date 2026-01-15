package com.day4.ExamCel;

public class ExamScoreMergeSorter {

    public void sortByScore(StudentScoreRecord[] records) {
        if (records.length < 2) {
            return;
        }
        mergeSort(records, 0, records.length - 1);
    }

    private void mergeSort(StudentScoreRecord[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(StudentScoreRecord[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        StudentScoreRecord[] leftArr = new StudentScoreRecord[n1];
        StudentScoreRecord[] rightArr = new StudentScoreRecord[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge (higher score first)
        while (i < n1 && j < n2) {
            if (leftArr[i].getScore() >= rightArr[j].getScore()) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
}
