// Last updated: 04/04/2026, 15:47:15
class Solution {
    boolean ans = true;
    public int level(TreeNode root){
        if(root==null) return 0;
        int lvlright = level(root.right);
        int lvlleft = level(root.left);
        if(!(Math.abs(lvlleft-lvlright)<=1)) ans =  false;
        return 1+Math.max(lvlright,lvlleft);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        level(root);
        return ans;
    }
}