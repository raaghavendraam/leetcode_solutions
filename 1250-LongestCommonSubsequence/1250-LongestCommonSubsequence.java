// Last updated: 04/04/2026, 15:45:05
class Solution {
    // public int helper(String a,String b,int m,int n,int[][] dp){
    //     if(m<0||n<0) return 0;
    //     if(dp[m][n]!=-1) return dp[m][n];
    //     if(a.charAt(m)==b.charAt(n)) return dp[m][n]=1+helper(a,b,m-1,n-1,dp);
    //     else  return dp[m][n]= Math.max(helper(a,b,m-1,n,dp),helper(a,b,m,n-1,dp));
    // }
    public int longestCommonSubsequence(String a, String b) {
        int m= a.length(),n= b.length();
        int[][] dp = new int[a.length()+1][b.length()+1];
        for(int i = 1;i<=a.length();i++){
            for(int j = 1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        // StringBuilder str = new StringBuilder("");
        // int i =m,j=n;
        // while(i>0&&j>0)
        //     {
        //         if(a.charAt(i-1)==b.charAt(j-1)) {
        //             str.append(a.charAt(i-1));
        //             j--;i--;
        //         }
        //         else if(dp[i-1][j]>dp[i][j-1]) i--;
        //         else j--;
        //     }
        // System.out.println(str.reverse());
        return dp[m][n];
    }
}