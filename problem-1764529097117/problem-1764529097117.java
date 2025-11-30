// Last updated: 11/30/2025, 12:58:17 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int n : nums){
5            map.put(n, map.getOrDefault(n,0) + 1);
6        }
7
8        PriorityQueue<int[]> heap = new PriorityQueue<>(
9            (a, b) -> a[1] - b[1]   // compare by frequency
10        );
11
12        // Push each (num, freq) pair into the heap
13        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
14            heap.add(new int[]{entry.getKey(), entry.getValue()});
15
16            // If heap grows larger than k, remove the smallest frequency
17            if (heap.size() > k) {
18                heap.poll();
19            }
20        }
21
22        // 3️⃣ Build the result array from the heap
23        int[] result = new int[k];
24        for (int i = k - 1; i >= 0; i--) {
25            result[i] = heap.poll()[0];
26        }
27
28        return result;
29    }
30}