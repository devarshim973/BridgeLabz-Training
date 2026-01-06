package com.LinearandBinarySearch.FileReaderWordOccurrenceCounter;

public class FileWordCountMain {

    public static void main(String[] args) {

        String filePath = "sample.txt";
        String searchWord = "java";

        WordOccurrenceCounter counter = new WordOccurrenceCounter();
        int result = counter.countWord(filePath, searchWord);

        System.out.println(
            "The word '" + searchWord + "' appears " + result + " times."
        );
    }
}
