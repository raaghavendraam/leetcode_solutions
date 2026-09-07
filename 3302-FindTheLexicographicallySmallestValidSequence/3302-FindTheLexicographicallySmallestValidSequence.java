// Last updated: 07/09/2026, 08:43:47
class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] ans = new int[m];

        // last[j] = rightmost position in word1 that can be used
        // to match word2[j], while matching word2[j+1..] exactly.
        int[] last = new int[m];
        java.util.Arrays.fill(last, -1);

        int i = n - 1;
        int j = m - 1;

        // Build the rightmost valid positions from right to left.
        while (i >= 0 && j >= 0) {
            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }
            i--;
        }

        // Greedily construct the lexicographically smallest answer.
        boolean mismatchUsed = false;
        i = 0;
        j = 0;

        while (i < n && j < m) {
            if (word1.charAt(i) == word2.charAt(j)) {
                // Exact match: always take the earliest possible index.
                ans[j] = i;
                j++;
            } else if (!mismatchUsed &&
                       (j == m - 1 || i < last[j + 1])) {

                // Use our one allowed mismatch here.
                //
                // We can do this only if the remaining characters
                // word2[j+1..] can still be matched after index i.
                mismatchUsed = true;
                ans[j] = i;
                j++;
            }

            i++;
        }

        // Couldn't match all characters.
        if (j < m) {
            return new int[0];
        }

        return ans;
    }
}