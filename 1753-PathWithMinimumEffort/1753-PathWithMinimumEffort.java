// Last updated: 04/04/2026, 15:44:40
class Solution {
     class triplet implements Comparable<triplet> {
        int row;
        int col;
        int dist;
        triplet(int row,int col,int dist){
            this.col=col;
            this.row =row;
            this.dist = dist;
        }
        public int compareTo(triplet t){
            if(this.dist==t.dist) return Integer.compare(this.row, t.row);
            return Integer.compare(this.dist, t.dist);
        }
        
    }
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length,n=heights[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i <m; i++) {
            Arrays.fill(ans[i],Integer.MAX_VALUE);
        }
        ans[0][0] = 0;
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        pq.add(new triplet(0, 0, 0));
        while (pq.size()>0) {
            triplet top = pq.remove();
            int row = top.row, col = top.col,dist = top.dist;
            if(row>=1) {
                int diff = Math.abs(heights[row][col]-heights[row-1][col]);
                int max = Math.max(dist, diff);
                if(ans[row-1][col]>max) {
                    ans[row-1][col]=max;
                    pq.add(new triplet(row-1, col, max));
                }
            }
            if(col>=1) {
                int diff = Math.abs(heights[row][col]-heights[row][col-1]);
                int max = Math.max(dist, diff);
                if(ans[row][col-1]>max) {
                    ans[row][col-1]=max;
                    pq.add(new triplet(row, col-1, max));
                }
            }
            if(row+1<m) {
                int diff = Math.abs(heights[row][col]-heights[row+1][col]);
                int max = Math.max(dist, diff);
                if(ans[row+1][col]>max) {
                    ans[row+1][col]=max;
                    pq.add(new triplet(row+1, col, max));
                }
            }
            if(col+1<n) {
                int diff = Math.abs(heights[row][col]-heights[row][col+1]);
                int max = Math.max(dist, diff);
                if(ans[row][col+1]>max) {
                    ans[row][col+1]=max;
                    pq.add(new triplet(row, col+1, max));
                }
            }
        }
        return ans[m-1][n-1];
    }
}