// Last updated: 04/04/2026, 15:45:46
class Solution {
    int ans =0;
    public int level(TreeNode root){
        if(root==null) return 0;
       int lvlright = level(root.right);
        int lvlleft = level(root.left);
        int temp = lvlright+lvlleft;
        ans = Math.max(temp,ans); 
        return 1+Math.max(lvlright,lvlleft);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        level(root);
        return ans;
    }
}