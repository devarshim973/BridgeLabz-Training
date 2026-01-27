package com.CSVDataHandling.AdvancedProblems.EncryptDecryptCSV;

import java.io.BufferedReader;
import java.io.FileReader;

public class DecryptedCsvReader {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("employees_encrypted.csv"))) {

            String line;
            reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = CryptoUtil.decrypt(data[2]);
                String salary = CryptoUtil.decrypt(data[3]);

                System.out.println(id + " | " + name + " | " + email + " | " + salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
