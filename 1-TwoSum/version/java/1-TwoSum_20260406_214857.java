// Last updated: 06/04/2026, 21:48:57
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int[] ans = new int[2];
5        for (int i = 0; i < nums.length; i++) {
6            int diff = target - nums[i];
7            if(map.containsKey(diff)){
8               ans[0] = i;
9               ans[1] = map.get(diff); 
10               break;
11            }
12             map.put(nums[i],i);
13        }
14        return ans;
15    }
16}