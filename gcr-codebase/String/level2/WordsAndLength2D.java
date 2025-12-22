import java.util.Scanner;

public class WordsAndLength2D {

    //  find length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    //  split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {

        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = "";
            for (int j = start; j < spaceIndex[i]; j++) {
                words[i] += text.charAt(j);
            }
            start = spaceIndex[i] + 1;
        }

        // Last word
        words[wordCount - 1] = "";
        for (int i = start; i < length; i++) {
            words[wordCount - 1] += text.charAt(i);
        }

        return words;
    }

    //create 2D array of words and their lengths
    public static String[][] getWordsWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); // convert int to String
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitTextIntoWords(text);
        String[][] wordsWithLength = getWordsWithLength(words);

        // Display result
        System.out.println("Word\tLength");
        System.out.println(" ");

        for (int i = 0; i < wordsWithLength.length; i++) {
            String word = wordsWithLength[i][0];
            int length = Integer.parseInt(wordsWithLength[i][1]); // String to int
            System.out.println(word + "\t" + length);
        }

    }
}
