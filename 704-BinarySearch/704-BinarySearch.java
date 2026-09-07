// Last updated: 07/09/2026, 08:47:42
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0,hi = n-1;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) lo=mid+1;
            else hi = mid-1;
        }
        return -1;
    }
}