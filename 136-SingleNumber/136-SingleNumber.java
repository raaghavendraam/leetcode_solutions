// Last updated: 04/04/2026, 15:47:08
class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
       for(int ele:nums){
            ans = ans^ele;
       }  
       return ans;
    }
}