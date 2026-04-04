// Last updated: 04/04/2026, 15:46:11
class Solution {
    public boolean isPerfect(int n){
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt==n) return true;
        return false;
    }
    public int count(int n,int[] dp){
        if(n==0) return 0;
        if(isPerfect(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min = Integer.MAX_VALUE;
        for(int j =1;j*j<=n;j++){
            int i = count(j*j,dp)+count(n-(j*j),dp);
            min = Math.min(min,i);
        }
        return dp[n]=min;
    }
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return count(n,dp);
    }
}