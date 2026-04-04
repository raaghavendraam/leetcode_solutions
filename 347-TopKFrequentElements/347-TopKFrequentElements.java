// Last updated: 04/04/2026, 15:46:02
class Solution {
    class pair implements Comparable<pair>{
    int ele;
    int freq;
    pair(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(pair s){
        return this.freq-s.freq;
    }
}
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele : nums) {
            if(map.containsKey(ele)) map.put(ele, (map.get(ele))+1);
            else map.put(ele,1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            pq.add(new pair(ele, map.get(ele)));
            if(pq.size()>k) pq.remove();
        }
        int[] ans = new int[k];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = pq.remove().ele;
        }
        return ans;
    }
}