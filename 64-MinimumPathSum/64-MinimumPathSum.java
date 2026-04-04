// Last updated: 04/04/2026, 15:47:41
class Solution {
    public int paths(int i, int j,int m,int n,int[][] grid,int[][] dp){
        if(i==m-1&&j==n-1) return grid[i][j];
        if(i>=m||j>=n) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int sum1=grid[i][j]+Math.min(paths(i+1,j,m,n,grid,dp),paths(i,j+1,m,n,grid,dp));
        return dp[i][j]= sum1;
    }
    public int minPathSum(int[][] grid) {
        int[][] dp  = new int[grid.length+1][grid[0].length+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return paths(0,0,grid.length,grid[0].length,grid,dp);
    }
}