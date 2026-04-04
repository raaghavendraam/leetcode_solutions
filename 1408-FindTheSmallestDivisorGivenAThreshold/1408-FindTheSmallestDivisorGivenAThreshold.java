// Last updated: 04/04/2026, 15:44:57
class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        int d = max;
        int lo = 1,hi = max;
        while (lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(helper(mid,nums,n)<=t){
                d = mid;
                hi = mid-1; 
            }
            else{
                lo=mid+1;
            }
        }
        return d;
    }
    public int helper(int mid,int[] nums,int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]%mid==0) sum+=nums[i]/mid;
            else sum+=nums[i]/mid+1;
        }
        return sum;
    }
}