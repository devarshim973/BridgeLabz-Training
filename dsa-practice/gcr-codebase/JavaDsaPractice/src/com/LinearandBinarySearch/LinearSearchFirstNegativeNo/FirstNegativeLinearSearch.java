package com.LinearandBinarySearch.LinearSearchFirstNegativeNo;

public class FirstNegativeLinearSearch {

    public int findFirstNegativeIndex(int[] numbers) {

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] < 0) {
                return index;
            }
        }

        return -1;
    }
}
