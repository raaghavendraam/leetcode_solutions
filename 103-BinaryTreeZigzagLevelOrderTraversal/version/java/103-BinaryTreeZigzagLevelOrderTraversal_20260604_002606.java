// Last updated: 04/06/2026, 00:26:06
1class Solution {
2    public class pair{
3            TreeNode node;
4            int level;
5            pair(TreeNode node,int level){
6                this.node = node;
7                this.level=level;
8            }
9        }
10    public int levels(TreeNode root){
11        if(root==null) return 0;
12        return 1+Math.max(levels(root.right),levels(root.left));
13    }
14    public void reverses(List<List<Integer>> ans){
15        for(int i =1;i<ans.size();i+=2){
16            Collections.reverse(ans.get(i));
17        }
18    }
19    public void helper(TreeNode root,int level,List<List<Integer>> ans)
20    {
21        Queue<pair> q = new LinkedList<>();
22        pair temp = new pair(root,level);
23        q.add(temp);
24        while(q.size()>0){
25            pair top=q.remove();
26            ans.get(top.level).add(top.node.val);
27            if(top.node.left!=null) q.add(new pair(top.node.left,top.level+1));
28            if(top.node.right!=null) q.add(new pair(top.node.right,top.level+1));
29        }
30    }
31
32    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
33        List<List<Integer>> ans = new ArrayList<>();
34        if(root == null) return ans;
35        for(int i=0;i<levels(root);i++){
36            ans.add(new ArrayList<>());
37        }
38        helper(root,0,ans);
39        reverses(ans);
40        return ans;
41    }
42}