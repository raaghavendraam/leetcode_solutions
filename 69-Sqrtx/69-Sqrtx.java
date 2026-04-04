// Last updated: 04/04/2026, 15:47:42
class Solution {
    public int mySqrt(int n) {
        int lo = 1,hi =n;
        int result = 0;
        while (lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if((long)mid*mid<=n) {
                lo = mid+1;
                result =mid;
            }
            else if((long)mid*mid>n) 
                hi = mid-1;
            
        }
        return result;
    }
}