// Last updated: 15/07/2026, 23:03:16
class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put((long) x, freq.getOrDefault((long) x, 0) + 1);
        }

        int ans = 1;

        // Handle 1 separately
        if (freq.containsKey(1L)) {
            int cnt = freq.get(1L);
            ans = Math.max(ans, (cnt % 2 == 0) ? cnt - 1 : cnt);
        }

        for (long x : freq.keySet()) {
            if (x == 1) continue;

            long cur = x;
            int len = 0;

            while (true) {
                int cnt = freq.getOrDefault(cur, 0);

                if (cnt >= 2) {
                    len += 2;
                } else if (cnt == 1) {
                    len += 1;
                    break;
                } else {
                    len -= 1;
                    break;
                }

                // Prevent overflow
                if (cur > (long) Math.sqrt(Long.MAX_VALUE))
                    break;

                cur *= cur;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}