// Last updated: 04/04/2026, 15:48:18
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
               ans[0] = i;
               ans[1] = map.get(diff); 
               break;
            }
             map.put(nums[i],i);
        }
        return ans;
    }
}