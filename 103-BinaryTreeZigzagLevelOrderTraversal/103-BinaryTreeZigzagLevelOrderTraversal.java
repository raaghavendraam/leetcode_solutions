// Last updated: 04/04/2026, 15:47:17
class Solution {
    public class pair{
            TreeNode node;
            int level;
            pair(TreeNode node,int level){
                this.node = node;
                this.level=level;
            }
        }
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.right),levels(root.left));
    }
    public void reverses(List<List<Integer>> ans){
        for(int i =1;i<ans.size();i+=2){
            Collections.reverse(ans.get(i));
        }
    }
    public void helper(TreeNode root,int level,List<List<Integer>> ans)
    {
        Queue<pair> q = new LinkedList<>();
        pair temp = new pair(root,level);
        q.add(temp);
        while(q.size()>0){
            pair top=q.remove();
            ans.get(top.level).add(top.node.val);
            if(top.node.left!=null) q.add(new pair(top.node.left,top.level+1));
            if(top.node.right!=null) q.add(new pair(top.node.right,top.level+1));
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        for(int i=0;i<levels(root);i++){
            ans.add(new ArrayList<>());
        }
        helper(root,0,ans);
        reverses(ans);
        return ans;
    }
}