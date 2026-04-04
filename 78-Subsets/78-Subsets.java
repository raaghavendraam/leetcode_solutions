// Last updated: 04/04/2026, 15:47:35
class Solution {
    public void helper(int[] nums, int i,List<Integer> a,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        helper(nums, i+1,a, ans);
        a.add(nums[i]);
        helper(nums,i+1,a,ans);
        a.remove(a.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}