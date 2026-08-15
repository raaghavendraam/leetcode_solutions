// Last updated: 15/08/2026, 13:56:39
class Solution {

    int[][] dp;
    int[] suffix;

    private int helper(int i, int M, int[] piles) {

        // All piles have been taken
        if (i >= piles.length) {
            return 0;
        }

        // Already calculated
        if (dp[i][M] != -1) {
            return dp[i][M];
        }

        // Can take all remaining piles
        if (2 * M >= piles.length - i) {
            return dp[i][M] = suffix[i];
        }

        int best = 0;

        // Try taking X piles
        for (int X = 1; X <= 2 * M; X++) {

            int newM = Math.max(M, X);

            // Current player gets all remaining stones
            // except what the opponent can optimally get
            int current = suffix[i]
                    - helper(i + X, newM, piles);

            best = Math.max(best, current);
        }

        return dp[i][M] = best;
    }

    public int stoneGameII(int[] piles) {

        int n = piles.length;

        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        // suffix[i] = sum of piles[i ... n-1]
        suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return helper(0, 1, piles);
    }
}