// Last updated: 07/09/2026, 08:46:47
class Solution {
public String lcs(String a,String b){
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int i= m;
        int j = n;
        StringBuilder s = new StringBuilder("");
        while (i>0&&j>0) {
            if(a.charAt(i-1)==b.charAt(j-1)) {
                s.append(a.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i][j-1]<dp[i-1][j]) i--;
            else j--;
        }
        s.reverse();
        return s.toString();
    }
    public String shortestCommonSupersequence(String a, String b) {
        String s = lcs(a,b);
        StringBuilder ans = new StringBuilder("");
        int i = 0,j =0,k=0;
        int m = a.length(),n = b.length(),l =s.length();
        while (i<m&&j<n&&k<l) {
            while (a.charAt(i)!=s.charAt(k)) {
                ans.append(a.charAt(i));
                i++;
            }
            while (b.charAt(j)!=s.charAt(k)) {
                ans.append(b.charAt(j));
                j++;
            }
            ans.append(s.charAt(k));
            i++;k++;j++;
        }
        while (i<m) {
            ans.append(a.charAt(i));
            i++;
        }
        while (j<n) {
            ans.append(b.charAt(j));
            j++;
        }
        // System.out.println(ans);
        return ans.toString();
    }
}