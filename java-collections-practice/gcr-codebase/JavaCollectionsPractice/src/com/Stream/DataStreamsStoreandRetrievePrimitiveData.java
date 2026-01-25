package com.Stream;


import java.io.*;

public class DataStreamsStoreandRetrievePrimitiveData {

    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {

        // Sample student data
        int[] rollNumbers = {101, 102, 103};
        String[] names = {"Alice", "Bob", "Charlie"};
        double[] gpas = {3.5, 3.8, 3.2};

        // Step 1: Store data using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {

            for (int i = 0; i < rollNumbers.length; i++) {
                dos.writeInt(rollNumbers[i]);   // Roll number
                dos.writeUTF(names[i]);         // Name
                dos.writeDouble(gpas[i]);       // GPA
            }

            System.out.println("Student data saved successfully to " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("Error writing student data.");
            e.printStackTrace();
        }

        // Step 2: Retrieve data using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {

            System.out.println("\nRetrieved Student Data:");

            while (true) {
                try {
                    int roll = dis.readInt();
                    String name = dis.readUTF();
                    double gpa = dis.readDouble();

                    System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
                } catch (EOFException eof) {
                    // End of file reached
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading student data.");
            e.printStackTrace();
        }
    }
}
