package com.Day1.ExamScanner;


import java.util.*;

public class ExamEvaluator<T extends AnswerSheet> {

    public Map<String, Integer> evaluate(
            List<String> lines, T answerSheet) {

        Map<String, Integer> scoreMap = new HashMap<>();
        List<String> correctAnswers = answerSheet.getCorrectAnswers();

        for (String line : lines) {
            String[] parts = line.split(",");

            String studentName = parts[0];
            int score = 0;

            for (int i = 1; i < parts.length; i++) {
                if (parts[i].equals(correctAnswers.get(i - 1))) {
                    score++;
                }
            }
            scoreMap.put(studentName, score);
        }
        return scoreMap;
    }
}
