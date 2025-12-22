import java.util.Scanner;

public class TrimStringCustom {

    // find start and end index after trimming leading and trailing spaces
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;

        // Find start index (first non-space character)
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (ch != ' ') {
                    start = i;
                    break;
                }
            } catch (StringIndexOutOfBoundsException e) {
                // Entire string is spaces
                start = 0;
                break;
            }
        }

        // Find end index (last non-space character)
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(text.length() - 1 - i);
                if (ch != ' ') {
                    end = text.length() - 1 - i;
                    break;
                }
            } catch (StringIndexOutOfBoundsException e) {
                end = text.length() - 1;
                break;
            }
        }

        return new int[]{start, end};
    }

    // create substring using charAt(), start and end index
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    //compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        int[] indices = findTrimIndices(text);
        String trimmedCustom = createSubstring(text, indices[0], indices[1]);

        String trimmedBuiltIn = text.trim();

        // Compare results
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("\nOriginal String: \"" + text + "\"");
        System.out.println("Custom Trimmed: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed: \"" + trimmedBuiltIn + "\"");
        System.out.println("Do both trimmed strings match? " + isEqual);

    }
}
