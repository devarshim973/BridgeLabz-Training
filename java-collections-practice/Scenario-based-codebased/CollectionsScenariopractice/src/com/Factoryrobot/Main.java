package com.Factoryrobot;

import java.util.regex.*;
import java.util.*;

public class Main {

    public static String evaluate(String input) {

        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < input.length()) {

            if (input.charAt(i) != '[') {
                output.append(input.charAt(i));
                i++;
                continue;
            }

            int closeIndex = input.indexOf(']', i);

            // broken tag (no closing bracket)
            if (closeIndex == -1) {
                output.append("ERROR");
                break;
            }

            String tag = input.substring(i, closeIndex + 1);
            output.append(processTag(tag));
            i = closeIndex + 1;
        }

        return output.toString();
    }

    private static String processTag(String tag) {

        // no spaces allowed
        if (tag.contains(" ")) return "ERROR";

        Pattern pattern = Pattern.compile("^\\[(SUM|MUL|MAX|MIN):([^\\]]+)\\]$");
        Matcher matcher = pattern.matcher(tag);

        if (!matcher.matches()) return "ERROR";

        String operation = matcher.group(1);
        String numbersPart = matcher.group(2);

        String[] parts = numbersPart.split(",");

        if (parts.length < 2) return "ERROR";

        long sum = 0;
        long product = 1;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (String num : parts) {

            if (!isValidNumber(num)) return "ERROR";

            long value;
            try {
                value = Long.parseLong(num);
            } catch (Exception e) {
                return "ERROR";
            }

            sum += value;
            product *= value;

            if (value > max) max = value;
            if (value < min) min = value;
        }

        if (operation.equals("SUM")) return String.valueOf(sum);
        if (operation.equals("MUL")) return String.valueOf(product);
        if (operation.equals("MAX")) return String.valueOf(max);
        return String.valueOf(min); // MIN
    }

    private static boolean isValidNumber(String num) {

        if (num.length() == 0) return false;

        // handle negative
        if (num.startsWith("-")) {
            if (num.length() == 1) return false;
            num = num.substring(1);
        }

        // leading zero check
        if (num.length() > 1 && num.startsWith("0")) return false;

        for (char c : num.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            System.out.println(evaluate(line));
        }

        sc.close();
    }
}