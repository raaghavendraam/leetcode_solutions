// Last updated: 04/04/2026, 15:47:37
class Solution {
    public int helper(String a, String b,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]= helper(a,b,i-1,j-1,dp);
        int del = 1+helper(a,b,i-1,j,dp);
        int rep = 1+helper(a,b,i-1,j-1,dp);
        int ins = 1+helper(a,b,i,j-1,dp);
        return dp[i][j]=Math.min(del,Math.min(rep,ins));
    }
    public int minDistance(String a, String b) {
        int m = a.length(),n = b.length();
        int[][] dp = new int[m][n];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        return helper(a,b,m-1,n-1,dp);
    }
}