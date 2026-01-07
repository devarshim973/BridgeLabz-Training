package com.TimeandSpaceComplexity;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

class LargeFileReadingPerformance {

    // -------- FileReader (Character Stream) --------
    static void readUsingFileReader(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        char[] buffer = new char[8192];
        while (reader.read(buffer) != -1) {
            // reading file content
        }
        reader.close();
    }

    // -------- InputStreamReader (Byte Stream) --------
    static void readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(filePath));
        char[] buffer = new char[8192];
        while (reader.read(buffer) != -1) {
            // reading file content
        }
        reader.close();
    }

    public static void main(String[] args) {

        String filePath = "largefile.txt"; // path to large file

        try {
            // -------- FileReader Timing --------
            long fileReaderStart = System.nanoTime();
            readUsingFileReader(filePath);
            long fileReaderEnd = System.nanoTime();

            // -------- InputStreamReader Timing --------
            long inputStreamStart = System.nanoTime();
            readUsingInputStreamReader(filePath);
            long inputStreamEnd = System.nanoTime();

            System.out.println("File Reading Performance:");
            System.out.println("FileReader Time (ms): " +
                    (fileReaderEnd - fileReaderStart) / 1_000_000.0);
            System.out.println("InputStreamReader Time (ms): " +
                    (inputStreamEnd - inputStreamStart) / 1_000_000.0);

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
