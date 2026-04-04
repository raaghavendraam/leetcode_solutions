// Last updated: 04/04/2026, 15:45:09
class Solution {
    public String ls(String a, String b) {
        int m= a.length(),n= b.length();
        int[][] dp = new int[a.length()+1][b.length()+1];
        for(int i = 1;i<=a.length();i++){
            for(int j = 1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder str = new StringBuilder("");
        int i =m,j=n;
        while(i>0&&j>0)
            {
                if(a.charAt(i-1)==b.charAt(j-1)) {
                    str.append(a.charAt(i-1));
                    j--;i--;
                }
                else if(dp[i-1][j]>dp[i][j-1]) i--;
                else j--;
            }
            str.reverse();
        return str.toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        String lcs = ls(str1,str2);
        String str = "";
        int i=0,j=0,k=0;
        while(i<str1.length()&&j<str2.length()&&k<lcs.length()){
            if(str1.charAt(i)==lcs.charAt(k)&&str2.charAt(j)==lcs.charAt(k)) {
                str+=str1.charAt(i);
                i++;
                j++;
                k++;
            }
            while(k<lcs.length()&&i<str1.length()&&str1.charAt(i)!=lcs.charAt(k)) {
                str+=str1.charAt(i);
                i++;
                }
            while(k<lcs.length()&&j<str2.length()&&str2.charAt(j)!=lcs.charAt(k)) {
                str+=str2.charAt(j);
                j++;
            }
        }
         while (i < str1.length()) str+=(str1.charAt(i++));
        while (j < str2.length()) str+=(str2.charAt(j++));
        return str;
    }
}