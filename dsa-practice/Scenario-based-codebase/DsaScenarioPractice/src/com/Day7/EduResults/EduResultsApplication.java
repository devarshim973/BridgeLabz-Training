package com.Day7.EduResults;

import java.util.ArrayList;
import java.util.List;

public class EduResultsApplication {

    public static void main(String[] args) {

        // District 1 (Already sorted)
        List<StudentRecord> districtOne = new ArrayList<>();
        districtOne.add(new StudentRecord(101, "Aarav", 95));
        districtOne.add(new StudentRecord(102, "Meera", 88));
        districtOne.add(new StudentRecord(103, "Rohan", 80));

        // District 2 (Already sorted)
        List<StudentRecord> districtTwo = new ArrayList<>();
        districtTwo.add(new StudentRecord(201, "Ananya", 92));
        districtTwo.add(new StudentRecord(202, "Vikram", 88));
        districtTwo.add(new StudentRecord(203, "Kunal", 75));

        List<List<StudentRecord>> allDistricts = new ArrayList<>();
        allDistricts.add(districtOne);
        allDistricts.add(districtTwo);

        List<StudentRecord> finalRankList =
                DistrictResultMerger.mergeDistrictResults(allDistricts);

        System.out.println("📊 State-Wise Rank List:");
        int rank = 1;
        for (StudentRecord student : finalRankList) {
            System.out.println("Rank " + rank++ + " → " + student);
        }
    }
}
