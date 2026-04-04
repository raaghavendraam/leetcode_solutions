// Last updated: 04/04/2026, 15:46:49
class Solution {
    public int helper(int[] nums,int[] dp,int n){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = Math.max(nums[n]+helper(nums, dp, n-2),helper(nums, dp, n-1));
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums,dp,n-1);
    }
}