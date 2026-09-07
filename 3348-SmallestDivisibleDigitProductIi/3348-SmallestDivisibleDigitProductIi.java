// Last updated: 07/09/2026, 08:43:42
import java.util.Arrays;

class Solution {
    public String smallestNumber(String num, long t) {
        long temp = t;
        int t2 = 0, t3 = 0, t5 = 0, t7 = 0;
        
        while (temp % 2 == 0) { t2++; temp /= 2; }
        while (temp % 3 == 0) { t3++; temp /= 3; }
        while (temp % 5 == 0) { t5++; temp /= 5; }
        while (temp % 7 == 0) { t7++; temp /= 7; }
        
        if (temp > 1) {
            return "-1";
        }
        
        // DP table for the minimum number of digits needed to get at least i twos and j threes
        int[][] dp = new int[50][50];
        for (int i = 0; i < 50; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (i == 0 && j == 0) continue;
                int res = Integer.MAX_VALUE / 2;
                res = Math.min(res, 1 + dp[Math.max(0, i - 1)][j]);                   // digit 2
                res = Math.min(res, 1 + dp[i][Math.max(0, j - 1)]);                   // digit 3
                res = Math.min(res, 1 + dp[Math.max(0, i - 2)][j]);                   // digit 4
                res = Math.min(res, 1 + dp[Math.max(0, i - 1)][Math.max(0, j - 1)]);  // digit 6
                res = Math.min(res, 1 + dp[Math.max(0, i - 3)][j]);                   // digit 8
                res = Math.min(res, 1 + dp[i][Math.max(0, j - 2)]);                   // digit 9
                dp[i][j] = res;
            }
        }
        
        int n = num.length();
        int[] pref2 = new int[n + 1];
        int[] pref3 = new int[n + 1];
        int[] pref5 = new int[n + 1];
        int[] pref7 = new int[n + 1];
        
        int z_idx = n;
        for (int i = 0; i < n; i++) {
            int d = num.charAt(i) - '0';
            if (d == 0) {
                z_idx = i;
                break;
            }
            pref2[i + 1] = pref2[i] + count2(d);
            pref3[i + 1] = pref3[i] + count3(d);
            pref5[i + 1] = pref5[i] + count5(d);
            pref7[i + 1] = pref7[i] + count7(d);
        }
        
        for (int i = z_idx; i >= 0; i--) {
            if (i == n) {
                int r2 = Math.max(0, t2 - pref2[n]);
                int r3 = Math.max(0, t3 - pref3[n]);
                int r5 = Math.max(0, t5 - pref5[n]);
                int r7 = Math.max(0, t7 - pref7[n]);
                if (r2 == 0 && r3 == 0 && r5 == 0 && r7 == 0) {
                    return num;
                }
            } else {
                int start_d = (num.charAt(i) - '0') + 1;
                for (int d = Math.max(1, start_d); d <= 9; d++) {
                    int r2 = Math.max(0, t2 - pref2[i] - count2(d));
                    int r3 = Math.max(0, t3 - pref3[i] - count3(d));
                    int r5 = Math.max(0, t5 - pref5[i] - count5(d));
                    int r7 = Math.max(0, t7 - pref7[i] - count7(d));
                    
                    if (r5 + r7 + dp[r2][r3] <= n - i - 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(num.substring(0, i));
                        sb.append(d);
                        sb.append(construct(n - i - 1, r2, r3, r5, r7, dp));
                        return sb.toString();
                    }
                }
            }
        }
        
        int L = Math.max(n + 1, t5 + t7 + dp[t2][t3]);
        return construct(L, t2, t3, t5, t7, dp);
    }
    
    private String construct(int L, int r2, int r3, int r5, int r7, int[][] dp) {
        StringBuilder sb = new StringBuilder();
        for (int pos = 1; pos <= L; pos++) {
            for (int d = 1; d <= 9; d++) {
                int nr2 = Math.max(0, r2 - count2(d));
                int nr3 = Math.max(0, r3 - count3(d));
                int nr5 = Math.max(0, r5 - count5(d));
                int nr7 = Math.max(0, r7 - count7(d));
                
                if (nr5 + nr7 + dp[nr2][nr3] <= L - pos) {
                    sb.append(d);
                    r2 = nr2; r3 = nr3; r5 = nr5; r7 = nr7;
                    break;
                }
            }
        }
        return sb.toString();
    }
    
    private int count2(int d) {
        if (d == 2 || d == 6) return 1;
        if (d == 4) return 2;
        if (d == 8) return 3;
        return 0;
    }
    
    private int count3(int d) {
        if (d == 3 || d == 6) return 1;
        if (d == 9) return 2;
        return 0;
    }
    
    private int count5(int d) {
        return d == 5 ? 1 : 0;
    }
    
    private int count7(int d) {
        return d == 7 ? 1 : 0;
    }
}