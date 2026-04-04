// Last updated: 04/04/2026, 15:44:37
class Solution {
    public int findMiddleIndex(int[] nums) {
         int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<n;i++){
            int leftsum = 0;
            if(i>0) leftsum = nums[i-1];
            int rightsum  = nums[n-1]-nums[i];
            if(leftsum==rightsum) return i;
        }
        return -1;
    }
}