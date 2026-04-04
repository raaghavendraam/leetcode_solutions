// Last updated: 04/04/2026, 15:44:53
class Solution {
    public int helper(String a,String b,int m,int n,int[][] dp){
        if(m<0||n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(a.charAt(m)==b.charAt(n)) return dp[m][n]=1+helper(a,b,m-1,n-1,dp);
        else  return dp[m][n]= Math.max(helper(a,b,m-1,n,dp),helper(a,b,m,n-1,dp));
    }
    public String convert(String s){
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        return s1.toString();
    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        String s1 = convert(s);
        return helper(s,s1,s.length()-1,s1.length()-1,dp);
    }
    public int minInsertions(String s) {
        return s.length()-longestPalindromeSubseq(s);
    }
}