// Last updated: 07/09/2026, 08:42:45
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] max = new int[n];
        int maxi = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ans = n+1;
        for (int i = 0; i <n; i++) {
            maxi = Math.max(maxi,nums[i]);
            max[i] = maxi;
        }
        for (int i = n-1; i>=0; i--) {
            min = Math.min(min, nums[i]);
            int d = max[i] - min;
            if(d<=k) ans = Math.min(ans,i);
        }
        if(ans==n+1) return -1;
        return ans;
    }
}