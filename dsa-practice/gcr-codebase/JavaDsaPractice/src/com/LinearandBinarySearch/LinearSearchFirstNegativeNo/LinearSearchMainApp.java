package com.LinearandBinarySearch.LinearSearchFirstNegativeNo;

public class LinearSearchMainApp {

    public static void main(String[] args) {

        int[] array = { 10, 5, 0, -3, 8, -9 };

        FirstNegativeLinearSearch search =
                new FirstNegativeLinearSearch();

        int result = search.findFirstNegativeIndex(array);

        if (result != -1) {
            System.out.println(
                "First negative number found at index: " + result
            );
        } else {
            System.out.println(
                "No negative number found in the array"
            );
        }
    }
}
