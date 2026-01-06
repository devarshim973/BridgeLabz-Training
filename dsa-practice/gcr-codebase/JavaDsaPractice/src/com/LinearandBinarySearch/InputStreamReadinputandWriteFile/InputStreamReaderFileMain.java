package com.LinearandBinarySearch.InputStreamReadinputandWriteFile;

public class InputStreamReaderFileMain {

    public static void main(String[] args) {

        String filePath = "userInput.txt";

        ConsoleInputToFileWriter writer =
                new ConsoleInputToFileWriter();

        writer.writeUserInputToFile(filePath);

        System.out.println("User input successfully saved to file.");
    }
}
