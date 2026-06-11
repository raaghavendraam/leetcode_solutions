// Last updated: 11/06/2026, 23:18:31
class Solution {
    static final long MOD = 1000000007L;

    public long help(int depth) {
        if (depth == 0) return 1;
        long ans = 1;
        long base = 2;
        int exp = depth - 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
            ans = (ans * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
    return ans;
    }
    public int dfs(boolean[] vis,List<List<Integer>> adj,int src){
        if(vis[src]!=false) return 0;
        vis[src] = true;
        int max = 0;
        for (int ele:adj.get(src)) {
            if(vis[ele]==false)  {
                int count = 1 +dfs(vis, adj, ele);
                max = Math.max(count, max);
            }
        }
        return max;
    }
    public int assignEdgeWeights(int[][] edges) {
    List<List<Integer>> adj = new ArrayList<>();
    int n = edges.length + 1;

    for(int i = 0; i <= n; i++) {
        adj.add(new ArrayList<>());
    }

    for(int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];

        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    boolean[] vis = new boolean[n + 1];
    int depth = dfs(vis, adj, 1);

    return (int) help(depth);
}
}