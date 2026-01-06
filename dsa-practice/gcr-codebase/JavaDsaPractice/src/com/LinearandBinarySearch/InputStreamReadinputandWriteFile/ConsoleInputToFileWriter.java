package com.LinearandBinarySearch.InputStreamReadinputandWriteFile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleInputToFileWriter {

    public void writeUserInputToFile(String filePath) {

        try {
            InputStreamReader inputStreamReader =
                    new InputStreamReader(System.in);

            BufferedReader bufferedReader =
                    new BufferedReader(inputStreamReader);

            FileWriter fileWriter =
                    new FileWriter(filePath, true);

            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;

            while (true) {
                userInput = bufferedReader.readLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                fileWriter.write(userInput + System.lineSeparator());
            }

            fileWriter.close();

        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}

