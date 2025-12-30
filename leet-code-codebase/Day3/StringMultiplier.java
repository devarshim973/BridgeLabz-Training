public class StringMultiplier {

    public static String multiplyStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();

        // Result can be at most n1 + n2 digits
        int[] result = new int[n1 + n2];

        // Multiply each digit of num1 with each digit of num2
        for (int i = n1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = digit1 * digit2 + result[i + j + 1];

                result[i + j + 1] = sum % 10;       // current position
                result[i + j] += sum / 10;          // carry to next position
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        // If result is empty, product is 0
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        String product = multiplyStrings(num1, num2);
        System.out.println("Product: " + product);  // Output: 56088
    }
}
