// Last updated: 04/04/2026, 15:45:27
class Solution {
    public List<Integer> eventualSafeNodes(int[][] mat) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = mat.length;
        int[] inorder = new int[n];
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++) adj.add(new ArrayList<>());
        for(int i =0;i<n;i++){
            for(int ele:mat[i]){
                adj.get(ele).add(i);
                inorder[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inorder[i]==0) q.add(i);
        }
        while(q.size()>0){
            int front = q.remove();
            ans.add(front);
            for(int ele : adj.get(front)){
                inorder[ele]--;
                if(inorder[ele]==0){
                    q.add(ele);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}