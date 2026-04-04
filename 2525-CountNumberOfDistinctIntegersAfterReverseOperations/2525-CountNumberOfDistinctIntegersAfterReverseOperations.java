// Last updated: 04/04/2026, 15:44:28
class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            ans.add(nums[i]);
            ans.add(reverse(nums[i]));
        }
        return ans.size();
    }
    public int reverse(int n){
        int rev =0;
        while(n!=0){
           rev =rev*10+n%10;
           n/=10;
        }
        return rev;
    }
}