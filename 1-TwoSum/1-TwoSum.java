// Last updated: 11/27/2025, 1:48:57 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4    HashMap<Integer, Integer> map = new HashMap<>();
5    int[] returnArray = new int[2];
6
7    for(int i = 0; i < nums.length; i++){
8        int c = target - nums[i];
9
10        if(map.containsKey(c)){
11            return new int[] { map.get(c), i };
12        } else{
13            map.put(nums[i], i);
14        }
15    }
16
17    return new int[] {};
18        
19    }
20}