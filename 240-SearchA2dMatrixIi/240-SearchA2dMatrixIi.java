// Last updated: 04/04/2026, 15:46:17
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int m = a.length,n = a[0].length;
        int i = 0,j = n-1;
        while (i<m&&j>=0) {
            if(a[i][j]==target){   
                return true;
            }
            else if(a[i][j]<target) i++;
            else j--;
            
        }
        return false;
    }
}