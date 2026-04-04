// Last updated: 04/04/2026, 15:46:31
class Solution {
    public void reverse(TreeNode root){
        if(root==null) return ;
        TreeNode temp = root.right;
        root.right =root.left;
        root.left = temp;
        reverse(root.left);
        reverse(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }
}