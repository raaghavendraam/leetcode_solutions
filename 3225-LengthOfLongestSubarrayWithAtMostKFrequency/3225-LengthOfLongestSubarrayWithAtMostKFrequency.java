// Last updated: 15/08/2026, 13:55:42
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i =0,j =0,n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        while (i<n&&j<n&&i<=j) {
            int ele = nums[j];
            if(map.containsKey(ele)){
                if(map.get(ele)<k){
                    map.put(ele,map.get(ele)+1);
                    j++;
                }
                else{
                    int len = j-i;
                    max = Math.max(max, len);
                    map.put(nums[i], map.get(nums[i]) - 1);
                    i++;
                }
            }
            else{
                map.put(ele, 1);
                j++;
            }
        }
        return Math.max(max,j-i);
    }
}