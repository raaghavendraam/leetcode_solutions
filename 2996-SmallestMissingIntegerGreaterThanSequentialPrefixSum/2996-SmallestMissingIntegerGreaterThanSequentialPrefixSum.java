// Last updated: 07/09/2026, 08:44:07
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