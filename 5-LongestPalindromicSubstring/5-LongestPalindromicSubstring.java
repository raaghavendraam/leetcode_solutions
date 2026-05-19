// Last updated: 19/05/2026, 18:21:07
class Solution {
    public int[] countSubstrings(String s) {
        int n = s.length();
        int count =0;
        int row = 0;
        int col = 0;
        int max = 0;
        int[][] dp = new int[n][n];
        for (int i = n-1; i>=0; i--) {
            for (int j = i; j < n; j++) {
                if(i==j) {
                    dp[i][j] =j-i+1;
                    if(max <dp[i][j]){
                    max = dp[i][j];
                    row = i;
                    col = j;
                }
                    
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] =j-i+1;
                        if(max <dp[i][j]){
                        max = dp[i][j];
                        row = i;
                        col = j;
                    }   
                }

                }
                else if(s.charAt(i)==s.charAt(j)){
                    if(dp[i+1][j-1]!=0){
                        dp[i][j] =j-i+1;
                        if(max <dp[i][j]){
                            max = dp[i][j];
                            row = i;
                            col = j;
                        }
                    }
                }
            }
        }
        //  for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp.length; j++) {
        //         // if(max <dp[i][j]){
        //         //     max = dp[i][j];
        //         //     row = i;
        //         //     col = j;
        //         // }
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }
        int[] arr = new int[3];
        arr[0] = max;
        arr[1] = row;
        arr[2] = col;
        // for(int ele: arr) System.out.print(ele);
        return arr;
    }
    public String longestPalindrome(String s) {
        int[] arr = countSubstrings(s);
        StringBuilder ans = new StringBuilder("");
        for(int i = arr[1];i<=arr[2];i++){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}