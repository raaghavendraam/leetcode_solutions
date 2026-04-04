// Last updated: 04/04/2026, 15:44:49
class Solution {
    public int findTheCity(int n, int[][] e, int d) {
        int[][] adj = new int[n][n];
        for(int[] a :adj) Arrays.fill(a, Integer.MAX_VALUE);
        for (int i = 0; i <e.length ; i++) {
            int u = e[i][0];
            int v = e[i][1];
            int dis = e[i][2];
            adj[u][v] = dis;
            adj[v][u] = dis;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) adj[i][i] = 0;
            }
        }    
        int count = 0;
        while (count<n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int a = adj[i][count];
                    int b = adj[count][j];
                    if(a!=Integer.MAX_VALUE&&b!=Integer.MAX_VALUE){
                        if(a+b<adj[i][j]) adj[i][j] = a+b;
                    }
                }
            }
            count++;
        }
        // end 
        
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            int c=0;
            for (int j = 0; j < ans.length; j++) {
                if(i==j) continue;
                if(adj[i][j]<=d) c++;
            }
            ans[i]= c;
        }
        int max = Integer.MAX_VALUE;
        int city = -1;
        for (int i = 0; i < n; i++) {
            if(max>=ans[i]){
                max = ans[i];
                city =i;
            }
        }
        return city;
    }
}