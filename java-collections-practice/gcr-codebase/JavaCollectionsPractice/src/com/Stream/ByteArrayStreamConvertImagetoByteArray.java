package com.Stream;


import java.io.*;

public class ByteArrayStreamConvertImagetoByteArray{

    public static void main(String[] args) {

        String sourceImage = "originalImage.jpg";   // Input image
        String outputImage = "copiedImage.jpg";     // Output image

        try {
            // Step 1: Read image into byte array
            byte[] imageBytes = fileToByteArray(sourceImage);

            System.out.println("Image converted to byte array. Size: " + imageBytes.length + " bytes");

            // Step 2: Write byte array back to another image file
            byteArrayToFile(imageBytes, outputImage);

            System.out.println("Byte array written back to file: " + outputImage);

        } catch (IOException e) {
            System.out.println("Error processing the image file.");
            e.printStackTrace();
        }
    }

    // Convert file to byte array
    private static byte[] fileToByteArray(String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new IOException("Source file does not exist: " + filePath);
        }

        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    // Write byte array to file
    private static void byteArrayToFile(byte[] data, String filePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream(filePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
