// Last updated: 04/04/2026, 15:45:12
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : stones) {
            pq.add(ele);
        }
        while (pq.size()>1) {
            int y = pq.remove();
            int x = pq.remove();
            if(x!=y)pq.add(y-x);
        }
        if(pq.size()==1)return pq.remove();
        return 0;
    }
}