// Last updated: 04/04/2026, 15:44:36
class Solution {
    public void bfs(List<List<Integer>> a,boolean[] vis,int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i]=true;
        while (q.size()>0) {
            int top = q.remove();
            for (int ele:a.get(top)) {
                if(vis[ele]==false){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }

    }
    public boolean validPath(int n, int[][] a, int source, int destination) {
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < vis.length; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < a.length; i++) {
            int a1 = a[i][0];
            int a2 = a[i][1];
            adj.get(a1).add(a2);
            adj.get(a2).add(a1);
        }
        System.out.println(adj);
        bfs(adj, vis, source);
        return vis[destination];
    }
}