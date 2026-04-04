// Last updated: 04/04/2026, 15:47:19
class Solution {
        List<List<Integer>> ans = new ArrayList<>();
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
        public void help(TreeNode root){
            Queue<pair> q =new LinkedList<>();
            pair temp =new pair(root,0);
            q.add(temp);
            while(q.size()>0)
            {
                pair temp1 = q.remove();
                ans.get(temp1.level).add(temp1.node.val);
    
                if (temp1.node.left != null) 
                    q.add(new pair(temp1.node.left, temp1.level + 1));
                if (temp1.node.right != null) 
                    q.add(new pair(temp1.node.right, temp1.level + 1));
    
            }
        }
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null) return ans;
            for(int i =0;i<levels(root);i++){
                ans.add(new ArrayList<>());
            }
            help(root);
            return ans;
}
}