package com.Stream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserProfileFileWriter {

    public static void main(String[] args) {

        String fileName = "user_profile.txt";

        try (
            BufferedReader consoleReader =
                new BufferedReader(new InputStreamReader(System.in));
            FileWriter fileWriter = new FileWriter(fileName)
        ) {

            System.out.print("Enter your name: ");
            String userName = consoleReader.readLine();

            System.out.print("Enter your age: ");
            String userAge = consoleReader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String favoriteLanguage = consoleReader.readLine();

            fileWriter.write("Name: " + userName + "\n");
            fileWriter.write("Age: " + userAge + "\n");
            fileWriter.write("Favorite Programming Language: " + favoriteLanguage + "\n");

            System.out.println("\nUser information saved successfully to file.");

        } catch (IOException exception) {
            System.out.println("Error while reading input or writing to file.");
            exception.printStackTrace();
        }
    }
}
