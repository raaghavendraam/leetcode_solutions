// Last updated: 04/04/2026, 15:47:20
class Solution {
    public void invert(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.right;
        root.right= root.left;
        root.left = temp;
        invert(root.right);
        invert(root.left);
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.right,q.right)) return false;
        if(!isSameTree(p.left,q.left)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode temp = root.right;
        invert(temp);
        boolean ans = isSameTree(root.left,temp);
        return ans;
    }
}