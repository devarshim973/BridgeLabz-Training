package com.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExecutor {

    public static void main(String[] args) {

        String sourcePath = "source.txt";
        String destinationPath = "destination.txt";

        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist!");
            return;
        }

        try (
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationPath)
        ) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException exception) {
            System.out.println("Error occurred while copying file.");
            exception.printStackTrace();
        }
    }
}
