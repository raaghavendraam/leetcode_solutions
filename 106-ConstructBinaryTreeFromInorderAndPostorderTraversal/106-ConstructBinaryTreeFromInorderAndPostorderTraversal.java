// Last updated: 03/08/2026, 16:28:28
class Solution {
    public static TreeNode help( int[] in, int[] post, int postin, int postout, int inin, int inout) {
        if(inin>inout||postin>postout) return null;
        TreeNode node = new TreeNode(post[postout]);
        int idx=0;
        for (int i = inin; i <=inout; i++) {
            if(in[i]==post[postout]) {
                idx = i;
                break;
            }
        }
        int len =idx - inin;
        node.left = help( in, post, postin, postin+len-1, inin, idx-1);
        node.right = help( in, post, postin+len, postout-1, idx+1, inout);
        return node;
    }
    public TreeNode buildTree(int[] in, int[] pre) {
        return help(in,pre,0,pre.length-1,0,in.length-1);
    }
}