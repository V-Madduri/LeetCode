// Last updated: 10/26/2025, 6:37:05 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        // Return length of last word
        return words[words.length - 1].length();
    }
}