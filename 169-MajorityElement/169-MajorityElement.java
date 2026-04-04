// Last updated: 04/04/2026, 15:46:54
class Solution {
     public int majorityElement(int[] nums) {
        int ans = 0,freq= 0;
        for (int i = 0; i < nums.length; i++) {
            if(freq ==0) ans = nums[i];
            if(ans == nums[i]) freq++;
            else freq--;
        }
        return ans;
    }
}