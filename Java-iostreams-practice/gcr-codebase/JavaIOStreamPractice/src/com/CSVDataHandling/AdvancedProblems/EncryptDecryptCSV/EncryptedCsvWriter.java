package com.CSVDataHandling.AdvancedProblems.EncryptDecryptCSV;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EncryptedCsvWriter {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees_encrypted.csv"))) {

            writer.write("ID,Name,Email,Salary");
            writer.newLine();

            writer.write("101,Ravi," +
                    CryptoUtil.encrypt("ravi@gmail.com") + "," +
                    CryptoUtil.encrypt("55000"));
            writer.newLine();

            writer.write("102,Anita," +
                    CryptoUtil.encrypt("anita@yahoo.com") + "," +
                    CryptoUtil.encrypt("62000"));
            writer.newLine();

            System.out.println("✅ Encrypted CSV written successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
