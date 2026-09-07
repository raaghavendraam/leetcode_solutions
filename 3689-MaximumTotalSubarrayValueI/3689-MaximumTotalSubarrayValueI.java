// Last updated: 07/09/2026, 08:43:11
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int ele:nums){
            min = Math.min(min,ele);
            max = Math.max(max,ele);
        }
        return ((long)max-(long)min)*k;
    }
}