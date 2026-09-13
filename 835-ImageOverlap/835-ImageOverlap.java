// Last updated: 14/09/2026, 00:03:30
class Solution {
    public int calculate(int[][] a,int[][] b,int row,int col){
        int n = a.length;
        int count  =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int r = i+row;
                int c = j+col;
                if(r<0||r>=n||c<0||c>=n) continue;
                if(a[i][j]==1&&1==b[r][c]) count++;
            }
        }
        return count;
    }
    public int largestOverlap(int[][] a, int[][] b) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for (int i = -n+1; i <n; i++) {
            for (int j = -n+1; j < n; j++) {
                int count = calculate(a,b,i,j);
                max = Math.max(max, count);
            }
        }
        return max;
    }
}