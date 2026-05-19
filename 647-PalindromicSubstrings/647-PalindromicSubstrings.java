// Last updated: 19/05/2026, 18:16:56
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count =0;
        int[][] dp = new int[n][n];
        for (int i = n-1; i>=0; i--) {
            for (int j = i; j < n; j++) {
                if(i==j) {
                    dp[i][j] =j-i+1;
                    count++;
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] =j-i+1;
                        count++;
                    }
                }
                else if(s.charAt(i)==s.charAt(j)){
                    if(dp[i+1][j-1]!=0){
                        dp[i][j] =j-i+1;
                        count++;
                    }
                }
            }
        }
        //  for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp.length; j++) {
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }
        return count;
    }
}