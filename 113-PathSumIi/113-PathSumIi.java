// Last updated: 04/04/2026, 15:47:11
class Solution {
    public void helper(TreeNode root, int target,List<List<Integer>> ans,int sum,List<Integer> arr){
        if(root==null) return;
        sum+=root.val;
        arr.add(root.val);
        if(root.right==null&&root.left==null)
        {
          if(sum==target) {
        ans.add(new ArrayList<>(arr));
        }
        }
        helper(root.left,target,ans,sum,arr);
        helper(root.right,target,ans,sum,arr);
        arr.remove(arr.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> arr = new ArrayList<>();
      if(root==null) return ans;
      helper(root,targetSum,ans,0,arr);
      return ans;  
    }
}