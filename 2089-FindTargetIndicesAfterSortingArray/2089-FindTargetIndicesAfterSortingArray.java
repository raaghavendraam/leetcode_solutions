// Last updated: 19/10/2026, 23:56:40
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int less =0,more = 0;
        for (int i = 0; i <n; i++) {
            if(nums[i]<target) less++;
            else if(nums[i]>target) more++;
        }
        for (int i = less; i < n-more; i++) {
            ans.add(i);
        }
        return ans;
    }
}