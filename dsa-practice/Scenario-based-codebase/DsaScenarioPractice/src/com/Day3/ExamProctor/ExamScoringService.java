package com.Day3.ExamProctor;

import java.util.HashMap;

public class ExamScoringService {

    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    public ExamScoringService() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    public int calculateScore(HashMap<Integer, String> studentAnswers) {

        int score = 0;

        for (int questionId : studentAnswers.keySet()) {
            if (correctAnswers.get(questionId)
                    .equals(studentAnswers.get(questionId))) {
                score++;
            }
        }
        return score;
    }
}
