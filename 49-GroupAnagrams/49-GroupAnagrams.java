// Last updated: 11/29/2025, 9:50:57 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4
5        for(String word: strs){
6            char[] chars = word.toCharArray();
7            Arrays.sort(chars);
8            String key = new String(chars);
9
10            if(!map.containsKey(key)) {
11                map.put(key, new ArrayList<>());
12            }
13
14            map.get(key).add(word);
15        }
16
17        return new ArrayList<>(map.values());
18    }
19}