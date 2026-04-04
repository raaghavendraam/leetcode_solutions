// Last updated: 04/04/2026, 15:45:43
class Solution {
    public int helper(String a,String b,int m,int n,int[][] dp){
        if(m<0||n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(a.charAt(m)==b.charAt(n)) return dp[m][n]=1+helper(a,b,m-1,n-1,dp);
        else  return dp[m][n]= Math.max(helper(a,b,m-1,n,dp),helper(a,b,m,n-1,dp));
    }
    public int minDistance(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m][n];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        int lcs = helper(a,b,a.length()-1,b.length()-1,dp);

        return ((m-lcs)+(n-lcs));
    }
}