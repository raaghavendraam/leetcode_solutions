// Last updated: 07/09/2026, 08:45:40
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        nums[0] = start;
        for (int i = 1; i < n; i++){
            nums[i] = start+2*i;
            nums[i] ^= nums[i-1];
        }
    return nums[n-1];
    }
}