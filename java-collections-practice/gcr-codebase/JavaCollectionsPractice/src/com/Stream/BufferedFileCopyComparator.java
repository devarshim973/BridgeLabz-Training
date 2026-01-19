package com.Stream;

import java.io.*;

public class BufferedFileCopyComparator {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String sourceFile = "largeSourceFile.dat";
        String normalCopyFile = "normalCopy.dat";
        String bufferedCopyFile = "bufferedCopy.dat";

        long normalTime = copyUsingNormalStreams(sourceFile, normalCopyFile);
        long bufferedTime = copyUsingBufferedStreams(sourceFile, bufferedCopyFile);

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Normal Stream Time   : " + normalTime + " ns");
        System.out.println("Buffered Stream Time : " + bufferedTime + " ns");
    }

    // ❌ Unbuffered File Copy
    private static long copyUsingNormalStreams(String source, String destination) {

        long startTime = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)
        ) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException exception) {
            System.out.println("Error in normal stream copy");
            exception.printStackTrace();
        }

        return System.nanoTime() - startTime;
    }

    // ✅ Buffered File Copy
    private static long copyUsingBufferedStreams(String source, String destination) {

        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException exception) {
            System.out.println("Error in buffered stream copy");
            exception.printStackTrace();
        }

        return System.nanoTime() - startTime;
    }
}
