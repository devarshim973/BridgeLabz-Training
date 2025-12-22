import java.util.Scanner;

public class VowelConsonantTable {

    //  check if character is vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // find vowels and consonants in a string and return a 2D array
    public static String[][] analyzeString(String text) {

        // string length using charAt and exception
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
         
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkVowelOrConsonant(ch);
        }

        return result;
    }

    // display 2D array in tabular format
    public static void display2DArray(String[][] arr) {
        System.out.println("\nCharacter\tType");
        System.out.println("-----------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] analysis = analyzeString(text);
        display2DArray(analysis);

    }
}
