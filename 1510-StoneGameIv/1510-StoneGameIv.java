// Last updated: 07/09/2026, 08:45:37
class Solution {
    public boolean winnerSquareGame(int n) {
        
        boolean[] dp = new boolean[n + 1];

        // dp[0] = false
        // No stones -> player cannot make a move -> loses

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j * j <= i; j++) {

                int remaining = i - j * j;

                // If opponent is in a losing position,
                // current player can win.
                if (!dp[remaining]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}