package com.Day1.ExamScanner;


import java.util.Arrays;
import java.util.List;

public class ScienceAnswerSheet implements AnswerSheet {

    @Override
    public List<String> getCorrectAnswers() {
        return Arrays.asList("B", "C", "A", "D", "B", "A", "C");
    }
}
