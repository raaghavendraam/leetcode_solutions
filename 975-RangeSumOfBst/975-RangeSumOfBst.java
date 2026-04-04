// Last updated: 04/04/2026, 15:45:18
class Solution {
    public void helper(TreeNode root,int low,int high,int[] sum)
    {
        if(root==null) return;
        if(root.val>=low&&root.val<=high) sum[0]+=root.val;
        if(root.val>low) helper(root.left,low,high,sum);
        if(root.val<high) helper(root.right,low,high,sum);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] sum = {0};
        helper(root,low,high,sum);
        return sum[0];
    }
}