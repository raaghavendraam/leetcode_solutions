// Last updated: 04/04/2026, 15:45:57
class Solution {
    public int helper(TreeNode root,int target,long sum){
        if(root==null) return 0;
        sum+= root.val;
        int count =0;
        if(sum==target) count+=1;
        count+=helper(root.right,target,sum)+helper(root.left,target,sum);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return helper(root,targetSum,0)+pathSum(root.right,targetSum)+pathSum(root.left,targetSum);
    }
}