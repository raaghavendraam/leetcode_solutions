// Last updated: 04/04/2026, 15:45:17
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