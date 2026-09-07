// Last updated: 07/09/2026, 08:45:45
class Solution {

    Integer[] dp;

    private int helper(int[] stoneValue, int i) {
        if (i >= stoneValue.length)
            return 0;

        if (dp[i] != null)
            return dp[i];

        int take = 0;
        int best = Integer.MIN_VALUE;

        for (int k = 0; k < 3 && i + k < stoneValue.length; k++) {
            take += stoneValue[i + k];
            best = Math.max(best, take - helper(stoneValue, i + k + 1));
        }

        return dp[i] = best;
    }

    public String stoneGameIII(int[] stoneValue) {
        dp = new Integer[stoneValue.length];

        int diff = helper(stoneValue, 0);

        if (diff > 0)
            return "Alice";
        if (diff < 0)
            return "Bob";
        return "Tie";
    }
}