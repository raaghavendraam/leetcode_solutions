// Last updated: 04/04/2026, 15:45:26
class Solution {
    public void bfs(List<List<Integer>> a,boolean[] vis,int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i]=true;
        while (q.size()>0) {
            int top = q.remove();
            for (int ele:a.get(top)) {
                if(vis[ele]==false){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> a) {
        int n = a.size();
        boolean[] vis = new boolean[n];
        bfs(a,vis,0);
        for (int i = 0; i < vis.length; i++) {
            if(vis[i]==false) return false;
        }
        return true;
    }
}