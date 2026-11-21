// Last updated: 21/11/2026, 14:36:39

    class Solution {
    public int help(int n, int[] costs,int[] dp) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MAX_VALUE;
        if(dp[n]!=-1) return dp[n];
        int a = help(n-1, costs,dp);
        int b = help(n-2, costs,dp);
        int c = help(n-3, costs,dp);
        int x = a == Integer.MAX_VALUE ? Integer.MAX_VALUE : a + costs[n] + 1;
        int y = b == Integer.MAX_VALUE ? Integer.MAX_VALUE : b + costs[n] + 4;
        int z = c == Integer.MAX_VALUE ? Integer.MAX_VALUE : c + costs[n] + 9;
        return dp[n] = Math.min(x, Math.min(y, z));
    }

    public int climbStairs(int n, int[] costs) {
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        for (int i = 0; i < n; i++) {
            arr[i+1] = costs[i];
        }

        return help(n, arr,dp);
    }
}
