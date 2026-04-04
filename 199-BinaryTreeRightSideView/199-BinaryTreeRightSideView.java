// Last updated: 04/04/2026, 15:46:48
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.right),levels(root.left));
    }
    public void helper(TreeNode root,int level,List<Integer> ans){
        if(root==null) return;
        helper(root.left,level+1,ans);
        helper(root.right,level+1,ans);
        ans.set(level,root.val);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<levels(root);i++){
            ans.add(0);
        }
        helper(root,0,ans);
        return ans;
    }
}