// Last updated: 04/04/2026, 15:45:40
class Solution {
    class pair implements Comparable<pair>{
    int diff;
    int num;
    pair(int diff,int num){
        this.diff = diff;
        this.num = num;
    }
    public int compareTo(pair s){
        if(this.diff==s.diff) return this.num - s.num;
        return this.diff-s.diff;
    }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(arr[i]-x);
            pq.add(new pair(diff, arr[i]));
            if(pq.size()>k) pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        while (pq.size()>0) {
            ans.add(pq.remove().num);
        }
        Collections.sort(ans);
        return ans;
    }
}