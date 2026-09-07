// Last updated: 07/09/2026, 08:45:42
class Solution {
    public int[] runningSum(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            a[i]+=a[i-1];
        }
        return a;
    }
}