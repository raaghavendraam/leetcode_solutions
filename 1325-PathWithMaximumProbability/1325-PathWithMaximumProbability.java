// Last updated: 04/04/2026, 15:45:00
class Solution {
    public class pair implements Comparable<pair> {
        int des;
        double cost;
        pair(int des,double cost){
            this.cost = cost;
            this.des = des;
        }
        public int compareTo(pair p){
            if(this.cost==p.cost) return Integer.compare(this.des, p.des);
            return Double.compare(this.cost, p.cost);
        }
        
    }
    public double maxProbability(int n, int[][] edges, double[] s, int src, int des) {
        List<List<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int start = edges[i][0],end = edges[i][1];
            double cost = s[i];
            adj.get(start).add(new pair(end, cost));
            adj.get(end).add(new pair(start, cost));
        }
        double[] ans = new double[n];
        Arrays.fill(ans,0);
        ans[src] = 1;
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new pair(src, 1));
        while (pq.size()>0) {
            pair top = pq.remove();
            if(top.cost<ans[top.des]) continue;
            for(pair p:adj.get(top.des)){
                double prob = top.cost*p.cost;
                if(prob>ans[p.des]){
                    ans[p.des]=prob;
                    pq.add(new pair(p.des, prob));
                }
            }
        }
        return ans[des];
    }
}