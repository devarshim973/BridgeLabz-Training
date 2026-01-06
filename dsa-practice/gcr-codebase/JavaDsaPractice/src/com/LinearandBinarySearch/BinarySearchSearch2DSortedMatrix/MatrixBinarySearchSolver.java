package com.LinearandBinarySearch.BinarySearchSearch2DSortedMatrix;

public class MatrixBinarySearchSolver {

    public boolean searchTarget(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int rowIndex = mid / columns;
            int columnIndex = mid % columns;

            int midValue = matrix[rowIndex][columnIndex];

            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
