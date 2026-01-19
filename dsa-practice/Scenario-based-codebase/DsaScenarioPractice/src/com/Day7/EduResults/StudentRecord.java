package com.Day7.EduResults;

public class StudentRecord {

    private int studentId;
    private String name;
    private int score;

    public StudentRecord(int studentId, String name, int score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID=" + studentId + ", Name=" + name + ", Score=" + score;
    }
}
