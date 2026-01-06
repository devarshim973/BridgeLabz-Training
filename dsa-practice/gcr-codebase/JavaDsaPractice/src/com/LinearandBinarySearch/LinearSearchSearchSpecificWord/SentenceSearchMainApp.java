package com.LinearandBinarySearch.LinearSearchSearchSpecificWord;

public class SentenceSearchMainApp {

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful language",
            "Linear search is simple",
            "Data structures are important",
            "I love programming"
        };

        String searchWord = "search";

        SentenceWordLinearFinder finder =
                new SentenceWordLinearFinder();

        String result =
                finder.findSentenceContainingWord(
                        sentences, searchWord);

        System.out.println("Result: " + result);
    }
}

