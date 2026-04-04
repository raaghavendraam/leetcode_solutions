// Last updated: 04/04/2026, 15:47:00
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root ==null) return ans;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            TreeNode temp = st.pop();
            ans.add(temp.val);
            if(temp.left!=null) st.push(temp.left);
            if(temp.right!=null) st.push(temp.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}