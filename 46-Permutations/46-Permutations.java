// Last updated: 04/04/2026, 15:47:53
class Solution {
    public void helper(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] flag)
    {
        if(ds.size()==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i =0;i<ds.size();i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(flag[i]==false){
                ds.add(nums[i]);
                flag[i] = true;
                helper(nums,ds,ans,flag);
                flag[i]= false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        helper(nums,ds,ans,flag);
        return ans;
    }
}