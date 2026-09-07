// Last updated: 07/09/2026, 08:47:18
class Solution {
    public int solve(int[] piles,int i,int j,Integer dp[][]){
        if(i>j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int take1 = piles[i]+Math.min(solve(piles, i+1, j,dp),solve(piles, i, j-1,dp));
        int take2 = piles[j]+Math.min(solve(piles, i+1, j,dp),solve(piles, i, j-1,dp));
        return dp[i][j]=Math.max(take1, take2);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer dp[][] = new Integer[n][n];
        int sum = 0;
        for (int ele : piles) sum+=ele;
        int ans = solve(piles, 0, piles.length-1,dp);
        if(ans>sum/2) return true;
        return false;
    }
}