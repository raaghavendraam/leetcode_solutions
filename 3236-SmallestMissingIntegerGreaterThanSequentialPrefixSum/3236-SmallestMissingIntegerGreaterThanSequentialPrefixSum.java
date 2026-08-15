// Last updated: 15/08/2026, 13:55:37
class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) set.add(ele);
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]+1==nums[i])
                sum+=nums[i];
            else break;
        }
        while (true) {
            if(set.contains(sum)) sum++;
            else break;
        }
        return sum;
    }
}