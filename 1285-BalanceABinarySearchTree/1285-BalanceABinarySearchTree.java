// Last updated: 04/04/2026, 15:45:04
class Solution {
    public void inorder(TreeNode root,List<TreeNode> a){
        if(root==null) return;
        inorder(root.left,a);
        a.add(root);
        inorder(root.right,a);
    }
    public TreeNode helper(List<TreeNode> a,int lo,int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        TreeNode root = new TreeNode(a.get(mid).val);
        root.left=helper(a,lo,mid-1);
        root.right=helper(a,mid+1,hi);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
       List<TreeNode> arr = new ArrayList<>(); 
       inorder(root,arr);
       return helper(arr,0,arr.size()-1);
    }
}