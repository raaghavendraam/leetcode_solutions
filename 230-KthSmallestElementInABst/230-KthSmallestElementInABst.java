// Last updated: 04/04/2026, 15:46:28
class Solution {
    int ans = -1;
    int count =0;
    public void inorder(TreeNode root,int k){
        if(root==null) return;
        inorder(root.left,k);
        count++;
        if(count==k) {
            ans=root.val;return;
        }
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
}