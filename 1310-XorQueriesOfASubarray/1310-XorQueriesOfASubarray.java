// Last updated: 07/09/2026, 08:46:07
class Solution {
    public int[] xorQueries(int[] a, int[][] arr) {
        int n = arr.length;
        int m = a.length;
        for (int i = 1; i <m; i++) {
            a[i]^= a[i-1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int left = arr[i][0],right = arr[i][1];
            if(left==0) ans[i] = a[right];
            else ans[i] = a[left-1]^a[right];
        }
        return ans;
    }
}