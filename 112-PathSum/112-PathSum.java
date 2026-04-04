// Last updated: 04/04/2026, 15:47:12
class Solution {
    boolean ans = false;
    public void sum(TreeNode root,int target,int sum){
        if(root==null) return;
        if(root.right==null&&root.left==null) {
           sum+= root.val;
           int s=sum;
           sum=0;
           if(s==target) {
            ans = true;
           }
           return;
        }
        sum(root.right,target,sum+root.val);
        sum(root.left,target,sum+root.val);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        sum(root,targetSum,0);
        return ans;
    }
}