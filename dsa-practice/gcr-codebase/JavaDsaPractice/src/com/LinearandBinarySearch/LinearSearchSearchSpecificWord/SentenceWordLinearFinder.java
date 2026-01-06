package com.LinearandBinarySearch.LinearSearchSearchSpecificWord;

public class SentenceWordLinearFinder {

    public String findSentenceContainingWord(
            String[] sentences, String searchWord) {

        for (int index = 0; index < sentences.length; index++) {

            if (sentences[index].toLowerCase()
                    .contains(searchWord.toLowerCase())) {

                return sentences[index];
            }
        }

        return "Not Found";
    }
}
