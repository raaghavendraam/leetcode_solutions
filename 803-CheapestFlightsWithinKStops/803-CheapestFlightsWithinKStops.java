// Last updated: 04/04/2026, 15:45:28
class Solution {
    class triplet implements Comparable<triplet> {
        int end;
        int cost;
        int stops;
        triplet(int end,int cost,int stops){
            this.end = end;
            this.cost = cost;
            this.stops = stops;
        }
        public int compareTo(triplet t){
            if(this.stops==t.stops) return Integer.compare(this.cost, t.cost);
            return Integer.compare(this.stops, t.stops);
        }
        
    }
     class pair  {
        int des;
        int cost;
        pair(int des,int cost){
            this.cost = cost;
            this.des = des;
        }
        
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < flights.length; i++) {
            int start = flights[i][0],end = flights[i][1],cost=flights[i][2];
            adj.get(start).add(new pair(end, cost));
        }
        int[] ans = new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] =0;
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        pq.add(new triplet(src, 0, 0));
        while (pq.size()>0) {
            triplet t = pq.remove();
            if(t.stops==k+1) continue;
            for(pair p:adj.get(t.end)){
                int total = p.cost + t.cost;
                if(total<ans[p.des]){
                    ans[p.des]=total;
                    pq.add(new triplet(p.des, total, t.stops+1));
                }
            }
        }
        if(ans[dst]==Integer.MAX_VALUE) return -1;
        return ans[dst];
    }
}