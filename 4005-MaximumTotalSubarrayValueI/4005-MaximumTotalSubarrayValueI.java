// Last updated: 09/06/2026, 22:48:11
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