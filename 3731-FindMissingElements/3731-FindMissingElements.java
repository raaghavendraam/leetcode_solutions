// Last updated: 07/09/2026, 08:42:55
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 101;
        int max = -1;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            set.add(nums[i]);
        }
        for (int i = min; i <= max; i++) {
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}