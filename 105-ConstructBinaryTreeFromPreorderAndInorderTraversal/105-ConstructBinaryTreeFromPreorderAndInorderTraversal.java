// Last updated: 03/08/2026, 16:28:31
class Solution {
    public static TreeNode help( int[] in, int[] pre, int prein, int preout, int inin, int inout) {
        if(inin>inout||prein>preout) return null;
        TreeNode node = new TreeNode(pre[prein]);
        int idx=0;
        for (int i = inin; i <=inout; i++) {
            if(in[i]==pre[prein]) {
                idx = i;
                break;
            }
        }
        int len =idx - inin;
        node.left = help( in, pre, prein+1, prein+len, inin, idx-1);
        node.right = help( in, pre, prein+len+1, preout, idx+1, inout);
        return node;
    }
    public TreeNode buildTree(int[] pre, int[] in) {
        return help(in,pre,0,pre.length-1,0,in.length-1);
    }
}