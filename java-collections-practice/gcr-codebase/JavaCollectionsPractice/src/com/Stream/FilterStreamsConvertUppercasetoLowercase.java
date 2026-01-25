package com.Stream;

import java.io.*;

public class FilterStreamsConvertUppercasetoLowercase {

    public static void main(String[] args) {

        String inputFile = "input.txt";    // Source text file
        String outputFile = "output.txt";  // Destination file

        try (
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                // Convert line to lowercase and write
                bw.write(line.toLowerCase());
                bw.newLine();  // Preserve line breaks
            }

            System.out.println("File converted to lowercase successfully: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error reading or writing files.");
            e.printStackTrace();
        }
    }
}
