// Last updated: 04/04/2026, 15:47:44
class Solution {
    public int paths(int i,int j,int m, int n,int[][] dp){
        if(i==m-1&&j==n-1) return 1;
        int a=0,b=0;
        if(i<m && j<n && dp[i][j]!=-1) return dp[i][j];
        if(i<m)  a = paths(i+1, j, m, n,dp);
        if(j<n)  b = paths(i, j+1, m, n,dp);
        return dp[i][j]=a+b;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return paths(0,0,m,n,dp);
    }
}