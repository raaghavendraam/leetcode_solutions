// Last updated: 12/06/2026, 19:36:59
import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;
    int LOG;
    int[][] up;
    int[] depth;
    List<List<Integer>> adj;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;

        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        up = new int[n + 1][LOG];
        depth = new int[n + 1];

        dfs(1, 0);

        for (int j = 1; j < LOG; j++) {
            for (int i = 1; i <= n; i++) {
                up[i][j] = up[up[i][j - 1]][j - 1];
            }
        }

        long[] pow2 = new long[n + 1];
        pow2[0] = 1;

        for (int i = 1; i <= n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            int lca = lca(u, v);

            int dist = depth[u] + depth[v] - 2 * depth[lca];

            if (dist == 0) {
                ans[i] = 0;
            } else {
                ans[i] = (int) pow2[dist - 1];
            }
        }

        return ans;
    }

    private void dfs(int node, int parent) {
        up[node][0] = parent;

        for (int nxt : adj.get(node)) {
            if (nxt == parent) continue;

            depth[nxt] = depth[node] + 1;
            dfs(nxt, node);
        }
    }

    private int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = LOG - 1; j >= 0; j--) {
            if (((diff >> j) & 1) == 1) {
                u = up[u][j];
            }
        }

        if (u == v) return u;

        for (int j = LOG - 1; j >= 0; j--) {
            if (up[u][j] != up[v][j]) {
                u = up[u][j];
                v = up[v][j];
            }
        }

        return up[u][0];
    }
}