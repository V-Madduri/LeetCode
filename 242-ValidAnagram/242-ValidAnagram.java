// Last updated: 11/29/2025, 9:03:34 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        HashMap<Character, Integer> map = new HashMap<>();
5        HashMap<Character, Integer> map2 = new HashMap<>();
6
7        if(s.length() != t.length()){
8            return false;
9        }
10        else {
11            for (char c: s.toCharArray()){
12                map.put(c, map.getOrDefault(c, 0) + 1);
13            }
14
15            for (char c: t.toCharArray()){
16                map2.put(c, map2.getOrDefault(c, 0) + 1);
17            }
18
19            if(map.equals(map2)){
20                return true;
21            }
22            else{
23                return false;
24            }
25
26        }
27    }
28}