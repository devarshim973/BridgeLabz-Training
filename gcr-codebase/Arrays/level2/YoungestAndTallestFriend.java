import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] age = new int[3];
        double[] height = new double[3];

        // Take user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age: ");
            age[i] = input.nextInt();

            System.out.print("Enter height (in cm): ");
            height[i] = input.nextDouble();

            System.out.println();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("The youngest friend is " + names[youngestIndex] +
                           " with age " + age[youngestIndex]);

        System.out.println("The tallest friend is " + names[tallestIndex] +
                           " with height " + height[tallestIndex] + " cm");
    }
}
