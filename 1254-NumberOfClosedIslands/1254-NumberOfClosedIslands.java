// Last updated: 29/10/2026, 21:46:02
class Solution {
    public void dfs(int[][] grid, int i, int j, boolean[][] vis) {
        vis[i][j] = true;

        int m = grid.length;
        int n = grid[0].length;

        if (i + 1 < m && grid[i + 1][j] == 0 && !vis[i + 1][j])
            dfs(grid, i + 1, j, vis);

        if (i - 1 >= 0 && grid[i - 1][j] == 0 && !vis[i - 1][j])
            dfs(grid, i - 1, j, vis);

        if (j - 1 >= 0 && grid[i][j - 1] == 0 && !vis[i][j - 1])
            dfs(grid, i, j - 1, vis);

        if (j + 1 < n && grid[i][j + 1] == 0 && !vis[i][j + 1])
            dfs(grid, i, j + 1, vis);
    }

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int count = 0;

        // Mark all land connected to the boundary
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0 && !vis[i][0])
                dfs(grid, i, 0, vis);

            if (grid[i][n - 1] == 0 && !vis[i][n - 1])
                dfs(grid, i, n - 1, vis);
        }

        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 0 && !vis[0][j])
                dfs(grid, 0, j, vis);

            if (grid[m - 1][j] == 0 && !vis[m - 1][j])
                dfs(grid, m - 1, j, vis);
        }

        // Count the remaining closed islands
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && !vis[i][j]) {
                    dfs(grid, i, j, vis);
                    count++;
                }
            }
        }

        return count;
    }
}