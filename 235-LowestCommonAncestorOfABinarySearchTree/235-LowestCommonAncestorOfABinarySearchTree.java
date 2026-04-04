// Last updated: 04/04/2026, 15:46:22
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<root.val&&q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        else if(p.val>root.val&&q.val>root.val) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
}