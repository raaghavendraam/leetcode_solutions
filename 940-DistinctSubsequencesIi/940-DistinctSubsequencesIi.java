// Last updated: 08/09/2026, 18:21:36
class Solution {

    static final int MOD = 1000000007;

    public int distinctSubseqII(String s) {

        long[] end = new long[26];

        for (char c : s.toCharArray()) {

            int index = c - 'a';

            long total = 1;

            for (long x : end) {
                total = (total + x) % MOD;
            }

            end[index] = total;
        }

        long answer = 0;

        for (long x : end) {
            answer = (answer + x) % MOD;
        }

        return (int) answer;
    }
}