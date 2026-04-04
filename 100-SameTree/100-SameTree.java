// Last updated: 04/04/2026, 15:47:21
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.right,q.right)) return false;
        if(!isSameTree(p.left,q.left)) return false;
        return true;
    }
}