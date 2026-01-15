package com.day4.ExamCel;

public class StudentScoreRecord {

    private String studentId;
    private String studentName;
    private int score;

    public StudentScoreRecord(String studentId, String studentName, int score) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void displayStudent() {
        System.out.println(
            "ID: " + studentId +
            ", Name: " + studentName +
            ", Score: " + score
        );
    }
}
