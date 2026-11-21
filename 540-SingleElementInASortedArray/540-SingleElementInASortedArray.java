// Last updated: 21/11/2026, 14:38:49
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int ele:nums){
            ans = ans^ele;
        }
        return ans;
    }
}