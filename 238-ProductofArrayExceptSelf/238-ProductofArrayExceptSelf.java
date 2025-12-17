// Last updated: 12/17/2025, 3:36:13 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] answer = new int[nums.length];
4
5        answer[0] = 1;
6
7        for(int i = 1; i < nums.length; i++){
8            answer[i] = answer[i-1] * nums[i-1];
9        }
10
11        int right = 1;
12        for(int i = nums.length-1; i >= 0; i--){
13            answer[i] *= right;
14            right *= nums[i];
15        }
16        return answer;
17    }
18}