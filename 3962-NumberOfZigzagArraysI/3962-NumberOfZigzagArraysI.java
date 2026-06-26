// Last updated: 26/06/2026, 14:32:48
class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        if (n == 1) {
            return m;
        }

        long[] up = new long[m];
        long[] down = new long[m];

        // Length = 2
        for (int v = 0; v < m; v++) {
            up[v] = v;              // smaller values
            down[v] = m - v - 1;    // larger values
        }

        for (int len = 3; len <= n; len++) {

            long[] prefixDown = new long[m];
            long[] suffixUp = new long[m];

            prefixDown[0] = down[0];
            for (int i = 1; i < m; i++) {
                prefixDown[i] = (prefixDown[i - 1] + down[i]) % MOD;
            }

            suffixUp[m - 1] = up[m - 1];
            for (int i = m - 2; i >= 0; i--) {
                suffixUp[i] = (suffixUp[i + 1] + up[i]) % MOD;
            }

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            for (int v = 0; v < m; v++) {

                // previous value < current value
                if (v > 0) {
                    newUp[v] = prefixDown[v - 1];
                }

                // previous value > current value
                if (v < m - 1) {
                    newDown[v] = suffixUp[v + 1];
                }
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;

        for (int v = 0; v < m; v++) {
            ans = (ans + up[v] + down[v]) % MOD;
        }

        return (int) ans;
    }
}