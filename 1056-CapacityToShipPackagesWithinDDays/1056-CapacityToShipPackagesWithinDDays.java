// Last updated: 04/04/2026, 15:45:14
class Solution {
    public int shipWithinDays(int[] weights, int n) {
        int lo =Integer.MIN_VALUE;
        int hi =0;
        for (int i : weights) {
            lo = Math.max(i,lo);
            hi+=i;
        }
        int result = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(helper(weights,mid)<=n){
                result = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }

        }
        return result;  
    }
    public int helper(int[] weights,int mid){
        int days=1,sum=0;
        for (int i = 0; i < weights.length; i++) {
            if(sum+weights[i]<=mid) {
                sum+=weights[i];
            }
            else{
                sum = weights[i];
                days++;
            }
        }
        return days;
    }
}