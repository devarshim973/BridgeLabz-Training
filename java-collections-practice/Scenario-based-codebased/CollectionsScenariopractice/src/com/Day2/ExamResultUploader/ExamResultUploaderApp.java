package com.Day2.ExamResultUploader;

public class ExamResultUploaderApp {

    public static void main(String[] args) {

        try {
            ExamResultProcessor<Integer> processor =
                    new ExamResultProcessor<>();

            processor.readResults("marks.csv");

            System.out.println("📊 Subject-wise Marks:");
            processor.getSubjectMarksMap()
                     .forEach((s, m) -> System.out.println(s + " -> " + m));

            processor.printTopScorers();

        } catch (InvalidExamRecordException e) {
            System.out.println("❌ Validation Error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
