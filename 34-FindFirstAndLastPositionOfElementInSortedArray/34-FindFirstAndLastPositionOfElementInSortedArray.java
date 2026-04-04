// Last updated: 04/04/2026, 15:48:00
class Solution {
    public int[] searchRange(int[] a, int target){
        int[] ans  = {-1,-1};
        int n= a .length;
        int lo = 0,hi = n-1;
        int lb = n;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if(a[mid]>=target){
                lb = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        if (lb == n || a[lb] != target)
            return ans;
        lo = 0;hi = n-1;
        int ub=n;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if(a[mid]>target){
                ub = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        ans[0] = lb;
        ans[1] = ub-1;
        return ans;}
}