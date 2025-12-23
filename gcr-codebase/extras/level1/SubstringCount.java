import java.util.Scanner;

public class SubstringCount {

    public static int countSubstring(String text1, String text2) {
        int count = 0;

        for (int i = 0; i <= text1.length() - text2.length(); i++) {
            if (text1.substring(i, i + text2.length()).equals(text2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the substring: ");
        String text2 = sc.nextLine();

        int result = countSubstring(text1, text2);

        System.out.println("Substring occurs " + result + " times.");
    }
}
