 class Solution {
    public int lengthOfLongestSubstring(String s) {
        String current = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int index = current.indexOf(ch);

            if (index != -1) {
                current = current.substring(index + 1);
            }

            current = current + ch;

            if (current.length() > maxLength) {
                maxLength = current.length();
            }
        }

        return maxLength;
    }
}