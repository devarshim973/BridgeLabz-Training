package com.Day7.EduResults;
import java.util.ArrayList;
import java.util.List;

public class MergeSortRankEngine {

    public static List<StudentRecord> mergeSort(List<StudentRecord> students) {

        if (students.size() <= 1) {
            return students;
        }

        int mid = students.size() / 2;

        List<StudentRecord> left = mergeSort(students.subList(0, mid));
        List<StudentRecord> right = mergeSort(students.subList(mid, students.size()));

        return merge(left, right);
    }

    private static List<StudentRecord> merge(
            List<StudentRecord> left,
            List<StudentRecord> right) {

        List<StudentRecord> sorted = new ArrayList<>();
        int i = 0, j = 0;

        // Stable merge (descending order by score)
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getScore() >= right.get(j).getScore()) {
                sorted.add(left.get(i++));
            } else {
                sorted.add(right.get(j++));
            }
        }

        while (i < left.size()) {
            sorted.add(left.get(i++));
        }

        while (j < right.size()) {
            sorted.add(right.get(j++));
        }

        return sorted;
    }
}
