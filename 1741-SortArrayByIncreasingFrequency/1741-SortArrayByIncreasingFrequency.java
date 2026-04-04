// Last updated: 04/04/2026, 15:44:41
class Solution {
     public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (int ele : nums) {
            if(map.containsKey(ele)) map.put(ele,(map.get(ele))+1);
            else map.put(ele,1);
        }
        for (int ele : map.keySet()) {
            pq.add(new pair(ele, map.get(ele)));
        }
        int idx = 0;
        int[] ans = new int[nums.length];
        while(pq.size()>0){
            pair temp = pq.remove();
            for(int i = 0;i<temp.freq;i++){
                ans[idx++]=temp.ele;
            }
        }
        return ans;
    }class pair implements Comparable<pair>{
    int ele;
    int freq;
    pair(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(pair s){
        if(this.freq==s.freq) return s.ele-this.ele;
        return this.freq-s.freq;
    }
}
}