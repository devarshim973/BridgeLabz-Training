public class DigitalWatchSimulation {
    public static void main(String[] args) {

        // Loop through hours (0 to 23)
        for (int hour = 0; hour < 24; hour++) {

            // Loop through minutes (0 to 59)
            for (int minute = 0; minute < 60; minute++) {

                // Print current time in HH:MM format
                System.out.printf("%02d:%02d\n", hour, minute);

                // Stop at 13:00 to simulate power cut
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut! Watch stopped at 13:00.");
                    break; // exit inner loop
                }
            }

            // Break outer loop if power cut has occurred
            if (hour == 13) {
                break;
            }
        }
    }
}
