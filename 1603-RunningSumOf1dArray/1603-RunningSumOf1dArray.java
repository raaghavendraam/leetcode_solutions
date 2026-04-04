// Last updated: 04/04/2026, 15:44:47
class Solution {
    public int[] runningSum(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            a[i]+=a[i-1];
        }
        return a;
    }
}