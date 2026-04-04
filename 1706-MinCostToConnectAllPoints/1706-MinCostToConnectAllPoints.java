// Last updated: 04/04/2026, 15:44:42
class Solution {
    class triplet implements Comparable<triplet>{
    int node;
    int parent;
    int dist;
    triplet(int node,int parent,int dist){
        this.node = node;
        this.parent = parent;
        this.dist = dist;
    }
    public int compareTo(triplet t){
        if(this.dist==t.dist) return Integer.compare(this.node,t.node);
        return Integer.compare(this.dist,t.dist);
    }
    }
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<triplet> pq = new PriorityQueue<>(); 
        int sum = 0;
        int n = points.length;
        boolean[] vis = new boolean[n];  
        pq.add(new triplet(0, -1, 0));
        while (pq.size()>0) {
            triplet top = pq.remove();
            int node = top.node;
            int parent = top.parent;
            if(vis[node]) continue;
            vis[node] = true;
            int dist = top.dist;
            if(vis[node]==true) sum+=dist;
            for (int i = 0; i < n; i++) {
                if(i==node) continue;
                // if(i==parent) continue;
                if(vis[i]==false){
                int a = Math.abs(points[node][0]-points[i][0]);
                int b = Math.abs(points[node][1]-points[i][1]);
                int cost = a+b;
                pq.add(new triplet(i, node, cost));
                }
            }
        }
        return sum;}
}