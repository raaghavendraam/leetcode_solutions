// Last updated: 04/04/2026, 15:46:37
class Solution {
    public int helper(int[] nums,int[] dp,int n,int start){
        if(n<start) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = Math.max(nums[n]+helper(nums, dp, n-2,start),helper(nums, dp, n-1,start));
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        return Math.max(helper(nums,dp,n-1,1),helper(nums,dp1,n-2,0));
    }
}