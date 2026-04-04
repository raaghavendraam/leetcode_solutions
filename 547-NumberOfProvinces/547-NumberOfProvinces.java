// Last updated: 04/04/2026, 15:45:45
class Solution {
     public void bfs(int[][] a,boolean[] vis,int src){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src]=true;
        while (q.size()>0) {
            int i = q.remove();
            for (int j = 0; j < vis.length; j++) {
                if(a[i][j]==1&&vis[j]==false){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }

    }
    public int findCircleNum(int[][] a) {
        int n = a.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i <n; i++) {
            if(!vis[i]){
                bfs(a, vis, i);
                count++;
            }
        }
        return count;
    }
}