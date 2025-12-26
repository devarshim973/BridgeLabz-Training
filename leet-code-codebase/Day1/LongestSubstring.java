class LongestSubstring {

    // Method to find length of longest substring
    public static int longestSubstring(String s) {

        int maxLength = 0;

        // Outer loop for starting index
        for (int i = 0; i < s.length(); i++) {

            boolean[] visited = new boolean[256];
            int length = 0;

            // Inner loop for ending index
            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                // If character already seen, break
                if (visited[ch]) {
                    break;
                }

                visited[ch] = true;
                length++;
            }

            // Update maximum length
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(longestSubstring(s1)); 
        System.out.println(longestSubstring(s2)); 
        System.out.println(longestSubstring(s3)); 
    }
}
