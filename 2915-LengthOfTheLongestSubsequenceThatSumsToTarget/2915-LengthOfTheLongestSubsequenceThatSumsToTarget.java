// Last updated: 07/09/2026, 08:44:16
class Solution {
    public int length(List<Integer> nums,int target,int i,int[][] dp){
        if(i == nums.size()){
            if(target == 0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int skip = length(nums, target, i+1,dp);
        if(target<nums.get(i)) return skip;
        int take = length(nums, target-nums.get(i), i+1,dp)+1;
        return dp[i][target]=Math.max(skip, take);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int[][] dp = new int[n][target+1];
        for(int[] a:dp) Arrays.fill(a,-1);
        System.out.println(Integer.MIN_VALUE);
        int ans = length(nums,target,0,dp);
        if(ans <0) return -1;
        return ans;
    }
}