// Last updated: 04/04/2026, 15:45:38
class Solution {
     public int pivotIndex(int[] a) {
        int n = a.length;
        for (int i = 1; i<n; i++) a[i]+=a[i-1];
        if(a[n-1]-a[0]==0) return 0;
        for (int i = 1; i < n; i++) {
            if(a[i-1]==(a[n-1]-a[i])) return i;
        }
        return -1;
    }
}