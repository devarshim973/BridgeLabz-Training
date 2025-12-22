import java.util.Scanner;

public class UniqueCharFrequency {

    // find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            // Check if character has already appeared
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Copy unique characters to array of correct size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static String[][] findCharFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }
            result[i][0] = Character.toString(ch);
            result[i][1] = Integer.toString(count);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayFrequency(String[][] freqArray) {
        System.out.println("Character\tFrequency");
        System.out.println("");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println(freqArray[i][0] + "\t\t" + freqArray[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqResult = findCharFrequency(input);
        displayFrequency(freqResult);
    }
}
