// Last updated: 07/09/2026, 08:43:01
class Solution {

    class Fenwick {
        long[] bit;

        Fenwick(int n) {
            bit = new long[n + 1];
        }

        void update(int idx, int val) {
            while (idx < bit.length) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        long query(int idx) {
            long sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int offset = n + 1;
        Fenwick ft = new Fenwick(2 * n + 5);

        long ans = 0;
        int prefix = 0;

        // Prefix sum = 0 occurs once initially
        ft.update(offset, 1);

        for (int num : nums) {
            prefix += (num == target) ? 1 : -1;

            int idx = prefix + offset;

            // Count previous prefix sums smaller than current prefix sum
            ans += ft.query(idx - 1);

            ft.update(idx, 1);
        }

        return ans;
    }
}