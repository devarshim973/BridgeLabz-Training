package com.Day2.ExamResultUploader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ExamResultProcessor<T extends Number> {

    private Map<String, List<Integer>> subjectMarksMap = new HashMap<>();

    public void readResults(String filePath) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {

            ExamCsvValidator.validate(line);

            String[] parts = line.split(",");

            int rollNo = Integer.parseInt(parts[0]);
            String name = parts[1];
            String subject = parts[2];
            int marks = Integer.parseInt(parts[3]);

            subjectMarksMap
                    .computeIfAbsent(subject, k -> new ArrayList<>())
                    .add(marks);
        }

        reader.close();
    }

    // Find top scorer per subject
    public void printTopScorers() {

        System.out.println("🏆 Top Scorers Per Subject:");

        for (String subject : subjectMarksMap.keySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(subjectMarksMap.get(subject));

            System.out.println(subject + " → " + pq.peek());
        }
    }

    public Map<String, List<Integer>> getSubjectMarksMap() {
        return subjectMarksMap;
    }
}
