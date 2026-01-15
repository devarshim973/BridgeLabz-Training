package com.day4.ZipZipMart;

public class SalesMergeSorter {

    public void sortByDateAndAmount(SalesTransaction[] transactions) {
        if (transactions.length < 2) {
            return;
        }
        mergeSort(transactions, 0, transactions.length - 1);
    }

    private void mergeSort(SalesTransaction[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(SalesTransaction[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        SalesTransaction[] leftArr = new SalesTransaction[n1];
        SalesTransaction[] rightArr = new SalesTransaction[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge logic
        while (i < n1 && j < n2) {

            int dateCompare =
                leftArr[i].getTransactionDate()
                    .compareTo(rightArr[j].getTransactionDate());

            if (dateCompare < 0 ||
                (dateCompare == 0 &&
                 leftArr[i].getAmount() <= rightArr[j].getAmount())) {

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
