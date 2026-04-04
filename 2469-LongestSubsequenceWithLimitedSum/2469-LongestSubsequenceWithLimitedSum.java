// Last updated: 04/04/2026, 15:44:30
class Solution {
    public int[] answerQueries(int[] a, int[] q) {
        Arrays.sort(a);
        int m = q.length,n = a.length;
        int[] ans = new int[m];
        for (int i = 1; i < n; i++) a[i]+=a[i-1];
        for (int i = 0; i < m; i++) {
            int lo = 0,hi=n-1;
            int ele = q[i];
            int max = 0;
            while (lo<=hi) {
                int mid = lo+(hi-lo)/2;
                if(a[mid]<=ele) {
                    max = Math.max(max, mid+1);
                    lo = mid+1;
                }
                else hi = mid-1;
            }
            ans[i] = max;
        }
        return ans;
    }
}