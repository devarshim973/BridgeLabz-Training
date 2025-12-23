import java.util.Scanner;

public class ReplaceWord {

    //  replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        String word = "";

        // Traverse sentence character by character
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                // Replace if word matches
                if (word.equals(oldWord)) {
                    result += newWord + " ";
                } else {
                    result += word + " ";
                }
                word = "";
            }
        }

        if (word.equals(oldWord)) {
            result += newWord;
        } else {
            result += word;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String updatedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified Sentence: " + updatedSentence);
    }
}
