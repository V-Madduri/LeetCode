// Last updated: 10/24/2025, 9:50:05 PM
import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Two pointer approach
        // left pointer tracks the position of unique elements
        int left = 0;
        
        // right pointer explores the array
        for (int right = 1; right < nums.length; right++) {
            // If we find a new unique element
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }
        
        // Return count of unique elements
        return left + 1;
    }
}