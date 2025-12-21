public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Generates number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all unique
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique ");
        } else {
            System.out.println("\nDuplicate OTPs found ");
        }
    }
}
