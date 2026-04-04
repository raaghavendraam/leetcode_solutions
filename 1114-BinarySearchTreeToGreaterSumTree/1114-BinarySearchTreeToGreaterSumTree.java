// Last updated: 04/04/2026, 15:45:13
class Solution {
    long sum =0;
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        root.val+=sum;
        sum = root.val;
        helper(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;
    }
}