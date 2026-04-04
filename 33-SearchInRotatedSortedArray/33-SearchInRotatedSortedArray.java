// Last updated: 04/04/2026, 15:48:01
class Solution {
   public int search(int[] a, int target) {
        int lo = 0,hi = a.length-1;
        while (lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(target==a[mid]) return mid;
            else if(a[mid]<=a[hi]){
                if(target>=a[mid]&&target<=a[hi]){
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
            else{
                if(target>=a[lo]&&target<a[mid]){
                    hi = mid -1;
                }
                else{
                    lo = mid+1;
                }
            }
        }
        return -1;
    }
}