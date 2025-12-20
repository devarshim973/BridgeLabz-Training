import java.util.Scanner;

public class YoungestAndTallestFriends {

    // find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        int index = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // find the tallest friend
    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Finding youngest and tallest
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        // Displaying results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

    }
}
