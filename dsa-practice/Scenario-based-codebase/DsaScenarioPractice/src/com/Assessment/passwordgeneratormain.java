package com.Assessment;

import java.util.Scanner;

public class passwordgeneratormain{

    public static String CleanseAndInvert(String input) {

        // 1️⃣ Null or length check
        if (input == null || input.length() < 6) {
            return "";
        }

        // 2️⃣ Check only alphabets (no space, digit, special char)
        if (!input.matches("[a-zA-Z]+")) {
            return "";
        }

        // 3️⃣ Convert to lowercase
        input = input.toLowerCase();

        // 4️⃣ Remove characters with EVEN ASCII values
        StringBuilder filtered = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if ((int) ch % 2 != 0) { // keep ODD ASCII
                filtered.append(ch);
            }
        }

        // 5️⃣ Reverse the remaining characters
        filtered.reverse();

        // 6️⃣ Convert EVEN index characters to uppercase
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < filtered.length(); i++) {
            char ch = filtered.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        String key = CleanseAndInvert(input);

        if (key.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + key);
        }

        sc.close();
    }
}
