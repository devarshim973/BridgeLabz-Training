package com.Day3.ExamProctor;

import java.util.Stack;

public class QuestionNavigationStack {

    private Stack<Integer> questionStack = new Stack<>();

    public void visitQuestion(int questionId) {
        questionStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public Integer goBack() {
        if (questionStack.isEmpty()) {
            System.out.println("No previous questions available.");
            return null;
        }
        return questionStack.pop();
    }

    public boolean hasHistory() {
        return !questionStack.isEmpty();
    }
}
