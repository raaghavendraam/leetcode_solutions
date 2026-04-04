// Last updated: 04/04/2026, 15:44:20
class Solution {
    public int helper(List<Integer> nums,int target,int i,int[][] dp){
        if(i==nums.size()){
            if(target==0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int skip = helper(nums,target,i+1,dp);
        if(target-nums.get(i)<0) return dp[i][target]=skip;
        int pick =  helper(nums,target-nums.get(i),i+1,dp);
        if(pick!=Integer.MIN_VALUE) pick +=1;
        return dp[i][target]=Math.max(skip,pick);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target+1];
        for(int[] arr : dp) Arrays.fill(arr,-1);
        int ans = helper(nums,target,0,dp);
        if(ans == Integer.MIN_VALUE) return -1;
        return ans;

    }
}