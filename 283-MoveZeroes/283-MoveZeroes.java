// Last updated: 04/04/2026, 15:46:10
class Solution {
    public  void moveZeroes(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if(a[j]==0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}