package com.Day1.ExamScanner;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ExamFileReader {

    // Name + 7 answers (A-D)
    private static final Pattern FORMAT_PATTERN =
            Pattern.compile("^[A-Za-z ]+(,[ABCD]){7}$");

    public static List<String> readAnswerLines(String filePath) {

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (FORMAT_PATTERN.matcher(line).matches()) {
                    lines.add(line);
                } else {
                    System.out.println("Invalid format skipped: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        return lines;
    }
}
