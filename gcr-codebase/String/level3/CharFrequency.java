import java.util.Scanner;

public class CharFrequency {

    //  find frequency of characters in a string
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // Array to store ASCII character frequencies

        // Loop through the string and count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(freq[i]);    // Frequency
                index++;
            }
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
