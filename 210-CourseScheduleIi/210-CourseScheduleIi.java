// Last updated: 04/04/2026, 15:46:39
class Solution {
    public int[] findOrder(int n, int[][] edges) {
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
            in[u]++;
            adj.get(v).add(u);
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
        if(ans.size()!=n) return new int[0];
        int[] ans1 = new int[n];
        for (int i = 0; i < ans.size(); i++) {
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}