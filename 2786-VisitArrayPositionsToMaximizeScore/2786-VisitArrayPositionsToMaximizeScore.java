// Last updated: 07/09/2026, 08:44:19
class Solution {

    public long solve(int[] nums, int x, int i, int parity, long[][] dp) {

        if (i == nums.length) return 0;

        if (dp[i][parity] != -1) {
            return dp[i][parity];
        }

        // Skip current element
        long skip = solve(nums, x, i + 1, parity, dp);

        // Take current element
        long take = nums[i];

        if ((nums[i] % 2) != parity) {
            take -= x;
        }

        take += solve(nums, x, i + 1, nums[i] % 2, dp);

        return dp[i][parity] = Math.max(take, skip);
    }

    public long maxScore(int[] nums, int x) {

        int n = nums.length;

        long[][] dp = new long[n][2];

        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }

        return nums[0] + solve(nums, x, 1, nums[0] % 2, dp);
    }
}