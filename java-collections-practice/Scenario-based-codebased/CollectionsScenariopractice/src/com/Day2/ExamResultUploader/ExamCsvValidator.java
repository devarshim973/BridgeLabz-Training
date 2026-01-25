package com.Day2.ExamResultUploader;

import java.util.regex.Pattern;

public class ExamCsvValidator {

    // RollNo,Name,Subject,Marks
    private static final Pattern CSV_PATTERN =
            Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z]+,\\d{1,3}");

    public static void validate(String line) throws InvalidExamRecordException {
        if (!CSV_PATTERN.matcher(line).matches()) {
            throw new InvalidExamRecordException("Invalid record format: " + line);
        }
    }
}
