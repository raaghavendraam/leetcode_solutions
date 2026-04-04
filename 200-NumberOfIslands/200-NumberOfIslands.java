// Last updated: 04/04/2026, 15:46:46
class Solution {
    class pair {
    int i;
    int j;
    pair(int i ,int j){
        this.i = i;
        this.j = j;
    }}
    public  void bfs(char[][] grid,boolean[][] vis,int i,int j){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i, j));
        vis[i][j] = true;
        while (q.size()>0) {
            pair top = q.remove();
            int row = top.i;
            int col = top.j;
            if(row-1>=0){
                if(grid[row-1][col]=='1'&&vis[row-1][col]==false)
                {
                    q.add(new pair(row-1, col));
                    vis[row-1][col]=true;
                }
            }
            if(row+1<grid.length){
                if(grid[row+1][col]=='1'&&vis[row+1][col]==false)
                {
                    q.add(new pair(row+1, col));
                    vis[row+1][col]=true;
                }
            }
            if(col-1>=0){
                if(grid[row][col-1]=='1'&&vis[row][col-1]==false)
                {
                    q.add(new pair(row, col-1));
                    vis[row][col-1]=true;
                }
            }
            if(col+1<grid[0].length){
                if(grid[row][col+1]=='1'&&vis[row][col+1]==false)
                {
                    q.add(new pair(row, col+1));
                    vis[row][col+1]=true;
                }
            }
    }}
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(vis[i][j]==false&&grid[i][j]=='1') {
                    bfs(grid,vis,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}