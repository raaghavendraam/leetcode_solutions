// Last updated: 07/09/2026, 08:46:58
class Solution {
    static int sum ;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.right);
        root.val+=sum;
        sum = root.val;
        inorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum =0;
        inorder(root);
        return root;

    }
}