// Last updated: 07/09/2026, 08:47:24
class Solution {
     public int[][] transpose(int[][] a) {
        int m= a.length,n=a[0].length;
        int[][] ans  = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = a[i][j];
            }
        }
        return ans;
    }
}