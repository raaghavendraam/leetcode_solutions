// Last updated: 04/04/2026, 15:45:58
class Solution {
    public static boolean sub(int i ,int[] arr,int target,int[][] dp){
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans = false;
        boolean skip = sub(i+1,arr, target,dp);
        if(target-arr[i]<0) ans =  skip;
        else {
            boolean take = sub(i+1,arr, target-arr[i],dp);
            ans = take|| skip;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] =0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int ele :nums) sum+=ele;
        if(sum%2!=0) return false;
        int[][] dp = new int[nums.length][sum+1];
        for (int[] is : dp) {
            Arrays.fill(is,-1);
        }
        return sub(0 ,nums,sum/2, dp);
    }
}