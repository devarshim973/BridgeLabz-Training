import java.util.Scanner;

public class ShortestAndLongestWord {

    // find length of a string without using length()
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

    public static String[] splitTextIntoWords(String text) {

        int length = findLength(text);

        // Count words
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

    // create 2D array of words and their lengths
    public static String[][] getWordsWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // Method to find shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] wordsWithLength) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < wordsWithLength.length; i++) {
            int length = Integer.parseInt(wordsWithLength[i][1]);

            if (length < min) {
                min = length;
                minIndex = i;
            }

            if (length > max) {
                max = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitTextIntoWords(text);
        String[][] wordsWithLength = getWordsWithLength(words);
        int[] resultIndexes = findShortestAndLongest(wordsWithLength);

        int shortestIndex = resultIndexes[0];
        int longestIndex = resultIndexes[1];

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < wordsWithLength.length; i++) {
            System.out.println(
                wordsWithLength[i][0] + "\t" +
                Integer.parseInt(wordsWithLength[i][1])
            );
        }

        System.out.println("\nShortest Word: " + wordsWithLength[shortestIndex][0]);
        System.out.println("Longest Word: " + wordsWithLength[longestIndex][0]);

    }
}
