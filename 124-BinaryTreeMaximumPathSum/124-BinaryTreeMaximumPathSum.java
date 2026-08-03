// Last updated: 03/08/2026, 16:28:14
class Solution {
    static int max;
    public int sum(TreeNode root){
        if(root==null) return 0;
        int right = sum(root.right);
        int left = sum(root.left);
        int s =root.val;
        if(right>0) s+= right;
        if(left>0) s+= left;
        max = Math.max(max,s);
        return root.val+Math.max(0,Math.max(left,right));
    }
    public int maxPathSum(TreeNode root) {
        max =Integer.MIN_VALUE;
        sum(root);
        return max;
    }
}