// Last updated: 04/04/2026, 15:45:35
class Solution {
    public int helper(int[] cost,int n, int[] dp){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        if(n==cost.length) return dp[n] = Math.min(helper(cost, n-1, dp), helper(cost, n-2, dp));
        return dp[n] = cost[n] + Math.min(helper(cost, n-1, dp), helper(cost, n-2, dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(cost, n, dp);
    }
}