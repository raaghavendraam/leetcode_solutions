// Last updated: 21/11/2026, 14:36:30
class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int ele : nums) max = Math.max(ele, max);
        for (int ele : nums) ans+=(max-ele);
        return ans;
    }
}