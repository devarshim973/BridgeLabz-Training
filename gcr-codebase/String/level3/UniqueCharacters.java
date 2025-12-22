import java.util.Scanner;

public class UniqueCharacters {

    //  find length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of string
        }
        return count;
    }

    // find unique characters in a string using charAt()
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len]; // Temporary array to store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if ch is already in temp
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to temp
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create a new array of exact size to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    //  display character array
    public static void displayChars(char[] chars) {
        System.out.print("Unique characters: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueChars(input);

        // Display result
        displayChars(uniqueChars);
    }
}
