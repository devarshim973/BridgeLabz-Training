package com.LinearandBinarySearch.InputStreamReaderConvertBytetoCharacter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteToCharFileReader {

    public void readFile(String filePath) {

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);

            InputStreamReader inputStreamReader =
                    new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

            BufferedReader bufferedReader =
                    new BufferedReader(inputStreamReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException exception) {
            System.out.println("File reading error: " + exception.getMessage());
        }
    }
}
