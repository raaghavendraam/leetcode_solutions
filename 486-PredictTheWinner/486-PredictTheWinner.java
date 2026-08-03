// Last updated: 03/08/2026, 16:25:58
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        if(n%2==0) return true;
        Integer[][] dp = new Integer[n][n];
        return help(nums,0,n-1,dp) >= 0;
    }
    public int help(int[] nums,int i,int j,Integer[][] dp){
        if(i==j) return nums[i];
        if(dp[i][j] != null) return dp[i][j];
        int take1 = nums[i] - help(nums,i+1,j,dp);
        int take2 = nums[j] - help(nums,i,j-1,dp);
        return dp[i][j] = Math.max(take1, take2);
    }
}