// Last updated: 07/09/2026, 08:46:32
class Solution {
    public void inorder(List<Integer> nums,TreeNode root){
        if(root==null) return;
        inorder(nums,root.left);
        nums.add(root.val);
        inorder(nums,root.right);
    }
    public TreeNode help(List<Integer> nums,int lo, int hi){
        if(lo>hi) return null;
        int mid = lo +(hi-lo)/2;
        TreeNode node = new TreeNode(nums.get(mid));
        node.right = help(nums,mid+1,hi);
        node.left = help(nums,lo,mid-1);
        return node;
    }
    public TreeNode sortedArrayToBST(List<Integer> nums) {
        int n = nums.size();
        return help(nums,0,n-1);
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inorder(nums,root);
        return sortedArrayToBST(nums);
    }
}