// Last updated: 09/06/2026, 22:48:42
class Solution {
    public TreeNode help( int[] in, int[] pre, int prein, int preout, int inin, int inout) {
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
    public TreeNode bstFromPreorder(int[] pre) {
        int n = pre.length;
        int[] in = new int[n];
        for(int i =0;i<n;i++) in[i] = pre[i];
        Arrays.sort(in);
        return buildTree(pre,in);
    }
}