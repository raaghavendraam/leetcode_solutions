// Last updated: 04/04/2026, 15:45:32
class Solution {
    public void helper(TreeNode root,TreeNode node){
        if(root.val<node.val) {
            if(root.right==null) root.right=node;
            else helper(root.right,node);
        }
        else{
             if(root.left==null) root.left=node;
            else helper(root.left,node);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if(root==null) return node;
        helper(root,node);
        return root;
    }
}