// Last updated: 04/04/2026, 15:45:51
class Solution {
    static int sum;
    public int helper(int[] nums,int res,int target,int i,int[][] dp){
        if(i==nums.length){
             if(target== res) return 1;
             return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int sub = helper(nums,res+nums[i],target,i+1,dp);
        int add = helper(nums,res-nums[i],target,i+1,dp);
        return dp[i][res+sum]= add + sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
        for(int ele:nums) sum+=ele;
        int[][] dp = new int[nums.length][2*sum+1];
        for(int[] arr : dp) Arrays.fill(arr,-1);
        return helper(nums,0,target,0,dp);
    }
}