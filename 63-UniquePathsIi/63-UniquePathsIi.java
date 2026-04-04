// Last updated: 04/04/2026, 15:47:43
class Solution {
    public int path(int i ,int j,int[][] a,int[][] dp){
        int m = a.length,n = a[0].length;
        if(i>=m||j>=n) return 0;
        if(a[i][j]==1) return 0;
        if(i==m-1&&j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int left = path(i+1,j,a,dp);
        int right = path(i,j+1,a,dp);
        return dp[i][j]=left+right;

    }
    public int uniquePathsWithObstacles(int[][] a) {
        int m = a.length,n = a[0].length;
        int[][] dp =new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        if(a[0][0]==1||a[m-1][n-1]==1) return 0;
        return path(0,0,a,dp);
    }
}