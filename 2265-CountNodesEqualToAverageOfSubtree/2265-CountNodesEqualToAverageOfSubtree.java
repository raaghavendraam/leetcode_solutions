// Last updated: 11/09/2026, 16:20:24
class Solution {
    static int sum,count;
    public int average(TreeNode root){
        if(root==null) return 0;
        sum+=root.val;
        int left = average(root.left);
        int right = average(root.right);
        return 1+left+right;
    }
    public void help(TreeNode root){
        if(root==null) return;
        sum =0;
        int c = average(root);
        int avg = sum/c;
        if(avg==root.val) count++;
        help(root.left);
        help(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        count =0;
        help(root);
        return count;
    }
}