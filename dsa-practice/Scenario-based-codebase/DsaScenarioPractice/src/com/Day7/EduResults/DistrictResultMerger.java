package com.Day7.EduResults;

import java.util.ArrayList;
import java.util.List;

public class DistrictResultMerger {

    public static List<StudentRecord> mergeDistrictResults(
            List<List<StudentRecord>> districtLists) {

        List<StudentRecord> combinedList = new ArrayList<>();

        for (List<StudentRecord> district : districtLists) {
            combinedList.addAll(district);
        }

        return MergeSortRankEngine.mergeSort(combinedList);
    }
}
