// Last updated: 04/04/2026, 15:45:42
class Solution {
    class pair implements Comparable<pair>{
        int ele;
        int row;
        int col;
        pair(int ele,int row,int col){
            this.ele=ele;
            this.row=row;
            this.col= col;
        }
        public int compareTo(pair p){
            return this.ele-p.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans = {0,Integer.MAX_VALUE};
        int max= Integer.MIN_VALUE;
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int k = nums.size();
        for (int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            pq.add(new pair(ele, i, 0));
            max= Math.max(max, ele);
        }
        while (true) {
            pair top = pq.remove();
            int ele = top.ele,row = top.row,col = top.col;
            if(max-ele<ans[1]-ans[0])
            {
                ans[0] = ele;
                ans[1] = max;
            }
            if(nums.get(row).size()==col+1) break;
            max= Math.max(max,nums.get(row).get(col+1));
            pq.add(new pair(nums.get(row).get(col+1),row,col+1));
        }
        return ans;
    }
}