// Last updated: 04/04/2026, 15:44:21
class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        long max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,nums[i]);
            if(i>0) ans[i]=ans[i-1]+nums[i]+max;
            else ans[i] = nums[i]+max;
        }
        return ans;
    }
}