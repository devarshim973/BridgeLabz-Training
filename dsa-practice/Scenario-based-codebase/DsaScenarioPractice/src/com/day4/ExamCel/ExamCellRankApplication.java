package com.day4.ExamCel;

public class ExamCellRankApplication {

    public static void main(String[] args) {

        // Pre-sorted scores from different centers
        StudentScoreRecord[] centerA = {
            new StudentScoreRecord("A01", "Rahul", 92),
            new StudentScoreRecord("A02", "Anita", 85)
        };

        StudentScoreRecord[] centerB = {
            new StudentScoreRecord("B01", "Kiran", 95),
            new StudentScoreRecord("B02", "Meena", 88)
        };

        // Merge all center-wise data
        StudentScoreRecord[] allScores = new StudentScoreRecord[
                centerA.length + centerB.length];

        int index = 0;
        for (StudentScoreRecord s : centerA) {
            allScores[index++] = s;
        }
        for (StudentScoreRecord s : centerB) {
            allScores[index++] = s;
        }

        ExamScoreMergeSorter sorter = new ExamScoreMergeSorter();
        sorter.sortByScore(allScores);

        System.out.println("State-Level Rank List:");
        int rank = 1;
        for (StudentScoreRecord record : allScores) {
            System.out.print("Rank " + rank++ + " → ");
            record.displayStudent();
        }
    }
}
