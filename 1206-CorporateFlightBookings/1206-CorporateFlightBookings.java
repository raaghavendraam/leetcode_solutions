// Last updated: 04/04/2026, 15:45:08
class Solution {
 public int[] corpFlightBookings(int[][] a, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < a.length; i++) {
            int scr = a[i][0];
            int des = a[i][1];
            int seat = a[i][2];
            ans[scr-1]+= seat;
            if(des<n) ans[des]-=seat;
        }
        for (int i = 1; i < n; i++) {
            ans[i] +=ans[i-1];
        }
        return ans;
    }
}