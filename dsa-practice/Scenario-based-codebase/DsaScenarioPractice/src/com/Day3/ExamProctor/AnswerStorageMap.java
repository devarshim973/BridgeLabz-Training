package com.Day3.ExamProctor;

import java.util.HashMap;

public class AnswerStorageMap {

    private HashMap<Integer, String> answerMap = new HashMap<>();

    public void saveAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
    }

    public String getAnswer(int questionId) {
        return answerMap.get(questionId);
    }

    public HashMap<Integer, String> getAllAnswers() {
        return answerMap;
    }
}
