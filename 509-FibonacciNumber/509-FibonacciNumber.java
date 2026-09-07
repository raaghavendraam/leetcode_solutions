// Last updated: 07/09/2026, 08:47:11
class Solution {
    public int fibo(int n,int[] dp){
        if(n==1||n==0) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] =fib(n-1)+fib(n-2);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        // dp[0] = 0;
        // dp[1] = 1;
        return fibo(n, dp);
    }
}