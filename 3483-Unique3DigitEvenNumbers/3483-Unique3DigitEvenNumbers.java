// Last updated: 11/09/2026, 21:32:34
import java.util.*;

class Solution {

    public int fact(int n, int[] dp) {
        if (n <= 1) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = n * fact(n - 1, dp);
    }

    public int totalNumbers(int[] digits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : digits) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int ans = 0;

        // Choose the last digit
        for (int last : map.keySet()) {

            if (last % 2 != 0)
                continue;

            map.put(last, map.get(last) - 1);

            // Choose the first digit
            for (int first : map.keySet()) {

                if (first == 0 || map.get(first) == 0)
                    continue;

                map.put(first, map.get(first) - 1);

                // Number of choices for middle digit
                for (int middle : map.keySet()) {
                    if (map.get(middle) > 0) {
                        ans++;
                    }
                }

                map.put(first, map.get(first) + 1);
            }

            map.put(last, map.get(last) + 1);
        }

        return ans;
    }
}