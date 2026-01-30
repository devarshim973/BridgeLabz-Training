package com.day1.MarkMate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class MarkMate {

    public static void main(String[] args) {
        String csvFile = "marks.csv";
        ObjectMapper jsonMapper = new ObjectMapper();
        CsvMapper csvMapper = new CsvMapper();

        try {
            // Read CSV with header
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            Iterator<Map<String, String>> it = csvMapper.readerFor(Map.class)
                    .with(schema)
                    .readValues(new File(csvFile));

            ArrayNode reportCards = jsonMapper.createArrayNode();

            while (it.hasNext()) {
                Map<String, String> row = it.next();
                ObjectNode studentNode = jsonMapper.createObjectNode();

                studentNode.put("StudentID", row.get("StudentID"));
                studentNode.put("Name", row.get("Name"));

                int total = 0;
                int subjectCount = 0;
                boolean invalidEntry = false;

                // Process subjects
                for (String subject : new String[]{"Math", "Science", "English"}) {
                    String value = row.get(subject);
                    try {
                        int marks = Integer.parseInt(value);
                        studentNode.put(subject, marks);
                        total += marks;
                        subjectCount++;
                    } catch (NumberFormatException e) {
                        studentNode.put(subject, "INVALID");
                        invalidEntry = true;
                    }
                }

                // Calculate total, average, and grade if valid
                if (!invalidEntry) {
                    double average = total * 1.0 / subjectCount;
                    studentNode.put("Total", total);
                    studentNode.put("Average", average);

                    String grade;
                    if (average >= 90) grade = "A+";
                    else if (average >= 80) grade = "A";
                    else if (average >= 70) grade = "B";
                    else if (average >= 60) grade = "C";
                    else grade = "F";

                    studentNode.put("Grade", grade);
                } else {
                    studentNode.put("Total", "N/A");
                    studentNode.put("Average", "N/A");
                    studentNode.put("Grade", "N/A");
                }

                reportCards.add(studentNode);
            }

            // Write JSON report
            jsonMapper.writerWithDefaultPrettyPrinter().writeValue(
                    new File("marks_report.json"), reportCards);

            System.out.println("JSON report generated successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
