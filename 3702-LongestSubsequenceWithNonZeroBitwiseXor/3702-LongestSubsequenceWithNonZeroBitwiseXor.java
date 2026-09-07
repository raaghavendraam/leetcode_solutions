// Last updated: 07/09/2026, 08:43:08
class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int c=0;
        int n = nums.length;
        for (int ele : nums) {
            if(ele==0) c++;
            xor = xor^ele;
        }
        if(c==n) return 0;
        if(xor == 0) return n-1;
        return n;
    }
}