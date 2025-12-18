

public class DayOfWeek {
    public static void main(String[] args) {

        // Take month, day, year from command-line arguments
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        int m = Integer.parseInt(args[0]); // month (1=Jan, 2=Feb,...)
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Compute y0
        int y0 = y - (14 - m) / 12;

        //  Compute x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Compute m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        //  Compute day of week d0
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print result
        System.out.println("Day of week (0=Sunday, 1=Monday,...,6=Saturday): " + d0);
    }
}
