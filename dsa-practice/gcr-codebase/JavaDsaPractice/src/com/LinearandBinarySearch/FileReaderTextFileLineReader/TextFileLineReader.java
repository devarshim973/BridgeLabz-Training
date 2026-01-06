package com.LinearandBinarySearch.FileReaderTextFileLineReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileLineReader {

    public void readFile(String filePath) {

        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException exception) {
                System.out.println("Error closing file");
            }
        }
    }
}
