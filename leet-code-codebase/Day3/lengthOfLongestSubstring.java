class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] lastIndex = new int[256]; // ASCII characters
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character is already seen, move left pointer
            if (lastIndex[currentChar] >= left) {
                left = lastIndex[currentChar] + 1;
            }

            lastIndex[currentChar] = right;

            int windowLength = right - left + 1;
            maxLength = Math.max(maxLength, windowLength);
        }

        return maxLength;
    }
}
