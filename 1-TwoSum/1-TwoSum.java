// Last updated: 11/27/2025, 1:47:59 PM
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
11            returnArray[0] = map.get(c);
12            returnArray[1] = i;
13            return returnArray;
14        } else{
15            map.put(nums[i], i);
16        }
17    }
18
19    return returnArray;
20        
21    }
22}