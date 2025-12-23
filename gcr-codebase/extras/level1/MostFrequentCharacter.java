import java.util.Scanner;

public class MostFrequentCharacter {

    public static char findMostFrequentChar(String text) {

        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int max = 0;
        char result = ' ';

        // Find character with maximum frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequent = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
