// Last updated: 04/04/2026, 15:44:24
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        ans[0] = -1;
        int sum = 0;
        int n = grid.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map.containsKey(grid[i][j])) ans[0] =grid[i][j];
                else if(ans[0] == -1) map.put(grid[i][j],1);
                sum+=grid[i][j];
            }
        }
        n=n*n;
        int s = (n*(n+1))/2;
        // System.out.println(s);
        // System.out.println(n);
        ans[1] = s - (sum - ans[0]);
        return ans;
    }
}