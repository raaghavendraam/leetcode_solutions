// Last updated: 04/04/2026, 15:44:44
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo = 0,hi = arr.length-1;
        while (lo<=hi) {
            int mid = lo+(hi-lo)/2;
            int mis = arr[mid]-(mid+1);
           if(mis<k) lo = mid +1;
            else  hi = mid-1;
        }
        // int mis = arr[hi]-(hi+1);
        return k+lo;
    }
}