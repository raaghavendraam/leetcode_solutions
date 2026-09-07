// Last updated: 07/09/2026, 08:47:13
class Solution {
    public void inorder(TreeNode root,List<Integer> in){
        if(root==null) return ;
        inorder(root.left,in);
        in.add(root.val);
        inorder(root.right,in);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> in = new ArrayList<>();
        inorder(root,in);
        int sum =0;
        for(int ele:in){
            if(ele>=low&&ele<=high) sum+=ele;
        }
        return sum;
    }
}