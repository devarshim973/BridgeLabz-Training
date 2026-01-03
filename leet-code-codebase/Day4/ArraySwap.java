class arraySwap {

   public static void main(String[] args) {

        String s = "abc";
        int n = s.length();

        // Print single characters
        for (int i = 0; i < n; i++) {
            System.out.print(s.charAt(i) + " ");
        }

        // Print two-letter circular substrings
        for (int i = 0; i < n; i++) {
            System.out.print(s.charAt(i));
            System.out.print(s.charAt((i + 1) % n) + " ");
        }

        // Print full string
        System.out.print(s);
    }
}