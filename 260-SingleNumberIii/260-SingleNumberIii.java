// Last updated: 04/04/2026, 15:46:14
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        int[] ans = new int[2];
        for (int ele : nums) xor ^= ele;
        int n = xor&(xor-1);
        int mask = n^xor;
        int a =0,b=0;
        for (int i : nums) {
            if((i&mask)==0) a ^= i;
            else b^=i;
        }
        ans[0] =a;
        ans[1] = b;
        return ans;
    }
}