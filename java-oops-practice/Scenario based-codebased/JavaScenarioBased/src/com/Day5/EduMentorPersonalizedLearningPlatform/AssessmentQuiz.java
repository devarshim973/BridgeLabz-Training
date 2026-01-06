package com.Day5.EduMentorPersonalizedLearningPlatform;

public class AssessmentQuiz {

    private String[] questions;
    private String[] correctAnswers;
    private int score;

    public AssessmentQuiz(String[] questions, String[] correctAnswers) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.score = 0;
    }

    public void submitAnswers(String[] userAnswers) {

        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / questions.length;
    }

    public int getScore() {
        return score;
    }
}
