// Last updated: 04/04/2026, 15:45:24
class Solution {
   public int peakIndexInMountainArray(int[] a){
        int n = a.length;
        int lo = 1,hi = n-2;
        int mid = -1;
        while (lo<=hi) {
            mid = (lo+hi)/2;
            if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]) return mid;
            else if(a[mid]>a[mid-1]&&a[mid]<a[mid+1]) lo =mid+1; 
            else  hi =mid-1;
        }
        return mid;
    }
}