package com.LinearandBinarySearch.FileReaderTextFileLineReader;

public class FileReaderMainApp {

    public static void main(String[] args) {

        String filePath = "sample.txt"; // file must exist

        TextFileLineReader reader = new TextFileLineReader();
        reader.readFile(filePath);
    }
}
