// Last updated: 07/09/2026, 08:46:14
class Solution {
    public int countSquares(int[][] a) {
        int sum =0;
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                if(i==0||j==0) sum+=a[i][j];
                if(i>0&&j>0&&a[i][j]==1){
                    a[i][j]+=Math.min(a[i-1][j],Math.min(a[i][j-1],a[i-1][j-1]));
                    sum+=a[i][j];
                }
            }
        }return sum;
    }
}