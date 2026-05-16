// Last updated: 16/05/2026, 16:39:57
1class Solution {
2    public int helper(String a,String b,int m,int n,int[][] dp){
3        if(m<0||n<0) return 0;
4        if(dp[m][n]!=-1) return dp[m][n];
5        if(a.charAt(m)==b.charAt(n)) return dp[m][n]=1+helper(a,b,m-1,n-1,dp);
6        else  return dp[m][n]= Math.max(helper(a,b,m-1,n,dp),helper(a,b,m,n-1,dp));
7    }
8    public int minDistance(String a, String b) {
9        int m = a.length();
10        int n = b.length();
11        int[][] dp = new int[m][n];
12        for(int[] arr:dp) Arrays.fill(arr,-1);
13        int lcs = helper(a,b,a.length()-1,b.length()-1,dp);
14        return ((m-lcs)+(n-lcs));
15    }
16}