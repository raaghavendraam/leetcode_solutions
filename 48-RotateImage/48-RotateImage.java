// Last updated: 04/04/2026, 15:47:52
class Solution {
     public void rotate(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int lo = 0,hi = n-1;
            while (lo<=hi) {
                int temp = a[i][lo];
                a[i][lo] = a[i][hi];
                a[i][hi] = temp;
                hi--;
                lo++;
            }
        }
    }
}