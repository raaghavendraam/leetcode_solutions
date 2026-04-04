// Last updated: 04/04/2026, 15:45:30
class Solution {
    public boolean bfs(boolean[] vis,int i,int[] colour,int n,int[][] graph){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;
        colour[i] = 1;
        while (q.size()>0) {
            int top= q.remove();
            for (int j = 0; j < graph[top].length; j++) {
            int v = graph[top][j];
            if(vis[v]==false){
                colour[v] = 1-colour[top];
                vis[v] = true;
                q.add(v);
            } 
            else if(colour[v]==colour[top]) {
                return false;
            }
        }
    }
        return true;
}
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        int[] colour = new int[n];
        boolean ans =  true;
        Arrays.fill(colour, -1);
        for (int i = 0; i < n; i++) {
            if(vis[i]==false){
                 ans = bfs(vis,i,colour,n,graph);
            }
            if(ans == false) return false;
        }
       return true;
    }
}