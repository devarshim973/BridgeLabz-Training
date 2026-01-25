package com.Day2.ExamResultUploader;

public class ExamRecord<T> {

    private int rollNo;
    private String name;
    private String subject;
    private T marks;

    public ExamRecord(int rollNo, String name, String subject, T marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public T getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " (" + marks + ")";
    }
}
