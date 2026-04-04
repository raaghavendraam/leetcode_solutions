// Last updated: 04/04/2026, 15:47:40
class Solution {
    public int stair(int n,int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int a = stair(n-1,dp);
        int b = stair(n-2,dp);
        return dp[n] = a+b;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return stair(n, dp);
    }}