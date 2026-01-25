package com.Stream;


import java.io.*;

public class ReadaLargeFileLinebyLine {

    public static void main(String[] args) {

        String filePath = "largefile.txt"; // Path to your large file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) { // Case-insensitive check
                    System.out.println(line);
                    count++;
                }
            }

            System.out.println("\nTotal lines containing 'error': " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
