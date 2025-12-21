public class FootballTeamHeight {

    //  generate random heights 
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            // Random 3-digit height between 150 and 250
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    //  find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    //  find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
// find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    //  find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Football team has 11 players
        int[] heights = generateHeights(11);

        System.out.println("Heights of football players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Calculations
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\n\nResults:");
        System.out.println("Total height of players: " + sum + " cm");
        System.out.println("Mean height of players: " + mean + " cm");
        System.out.println("Shortest player height: " + shortest + " cm");
        System.out.println("Tallest player height: " + tallest + " cm");
    }
}
