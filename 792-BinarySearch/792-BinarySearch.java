// Last updated: 04/04/2026, 15:45:31
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