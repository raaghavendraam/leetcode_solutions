// Last updated: 04/04/2026, 15:47:16
class Solution {
    public TreeNode helper(int[] a,int lo,int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        TreeNode root= new TreeNode(a[mid]);
        root.left=helper(a,lo,mid-1);
        root.right=helper(a,mid+1,hi);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
}