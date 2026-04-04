// Last updated: 04/04/2026, 15:46:41
class Solution {
    public boolean canFinish(int n, int[][] edges) {
        int m = edges.length;
        List<List<Integer>> adj = new ArrayList<>();
        int[] in = new int[n];
        boolean[] vis = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        Arrays.fill(in, 0);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            in[v]++;
            adj.get(u).add(v);
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if(in[i]==0&&vis[i]==false) {
                q.add(i);
                vis[i] =true;
            }
        }
        while (q.size()>0) {
            int top = q.remove();
            ans.add(top);
            for (int ele : adj.get(top)) {
                in[ele]--;
            }
            for (int i = 0; i < n; i++) {
                if(in[i]==0&&vis[i]==false) {
                    q.add(i);
                    vis[i] =true;
                }
            }
        }
        if(ans.size()==n) return true;
        return false;
    }
}