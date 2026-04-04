// Last updated: 04/04/2026, 15:45:15
class Solution {
    class pair implements Comparable<pair>{
    int x;
    int y;
    int dis;
    pair(int x,int y){
        this.x=x;
        this.y =y;
        this.dis = (x*x)+(y*y);
    }
    public int compareTo(pair s){
        return this.dis-s.dis;
    }
}
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            pq.add(new pair(x, y));
            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < ans.length; i++) {
            pair temp = pq.remove();
            ans[i][0] = temp.x;
            ans[i][1] = temp.y;
        }
        return ans;
    }
}