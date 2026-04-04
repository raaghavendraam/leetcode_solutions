// Last updated: 04/04/2026, 15:45:37
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
            int[] ans = new int[n+1];
            Arrays.fill(ans,Integer.MAX_VALUE);
            ans[0] =0;
            ans[k] = 0;
            for (int i = 1; i <=n-1; i++) {
                for (int j = 0; j < times.length; j++) {
                    int u = times[j][0];
                    int v = times[j][1];
                    int dist = times[j][2];
                    if(ans[u]!=Integer.MAX_VALUE&&ans[u]+dist<ans[v])  ans[v]=ans[u]+dist;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 1; i < ans.length; i++) {
                if(ans[i]==Integer.MAX_VALUE) return -1;
                max = Math.max(max, ans[i]);
            }
            return max;
    }
}