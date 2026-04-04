// Last updated: 04/04/2026, 15:46:36
class Solution {
    public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    //     for (int ele:nums) {
    //         pq.add(ele);

    //     }
    //     for (int i = 0; i < k-1; i++) {
    //      pq.remove();
    //    }
    //     return pq.peek();
    Arrays.sort(nums);
    return nums[nums.length-k];
    }
}