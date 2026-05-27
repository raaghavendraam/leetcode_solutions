// Last updated: 27/05/2026, 12:25:35
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int max = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i-1; j++) {
                if(nums[i]>nums[j]) dp[i] = Math.max(dp[i],dp[j]);
            }
            dp[i]+=1;
            max = Math.max(max, dp[i]);
        }
        // for (int i = 0; i < dp.length; i++) {
        //     System.out.print(dp[i]+ " ");
        // }
        return max;
    }
}