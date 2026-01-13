package com.Day3.ExamProctor;

public class ExamProctorApplication {

    public static void main(String[] args) {

        QuestionNavigationStack navigation = new QuestionNavigationStack();
        AnswerStorageMap answerStore = new AnswerStorageMap();
        ExamScoringService scoringService = new ExamScoringService();

        navigation.visitQuestion(1);
        answerStore.saveAnswer(1, "A");

        navigation.visitQuestion(2);
        answerStore.saveAnswer(2, "B");

        navigation.visitQuestion(3);
        answerStore.saveAnswer(3, "D");

        int finalScore = scoringService.calculateScore(answerStore.getAllAnswers());

        System.out.println("Final Score: " + finalScore);
    }
}
