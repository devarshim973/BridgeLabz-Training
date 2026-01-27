package com.CSVDataHandling.AdvancedProblems.ValidateCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class CsvDataValidator {

    // Regex patterns
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("\\d{10}");

    public static void main(String[] args) {

    	 String filePath = "src/com/CSVDataHandling/AdvancedProblems/users.csv";


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean isEmailValid = EMAIL_PATTERN.matcher(email).matches();
                boolean isPhoneValid = PHONE_PATTERN.matcher(phone).matches();

                if (!isEmailValid || !isPhoneValid) {

                    System.out.println("❌ Invalid Record Found:");
                    System.out.println("Row Data: " + line);

                    if (!isEmailValid) {
                        System.out.println("Error: Invalid Email Format");
                    }

                    if (!isPhoneValid) {
                        System.out.println("Error: Phone number must be 10 digits");
                    }

                    System.out.println("-----------------------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
