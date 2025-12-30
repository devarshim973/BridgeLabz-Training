import java.util.*;

class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        boolean[] visited = new boolean[256]; // ASCII
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (visited[ch]) {
                visited[s.charAt(left)] = false;
                left++;
            }

            visited[ch] = true;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
