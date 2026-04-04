// Last updated: 04/04/2026, 15:47:23
class Solution {
    public long max(TreeNode root){
        if(root == null) return Long.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.right),max(root.left)));
    }
    public long min(TreeNode root){
        if(root == null) return Long.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.right),min(root.left)));
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        long maxi = max(root.left);
        long mini = min(root.right);
        if(!(maxi<root.val&&root.val<mini)) return false;
        return isValidBST(root.right)&&isValidBST(root.left);
    }
}