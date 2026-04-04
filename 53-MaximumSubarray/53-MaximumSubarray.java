// Last updated: 04/04/2026, 15:47:48
class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int max = a[0];
        int total = a[0];
        for (int i = 1; i <n; i++) {
            max = Math.max(a[i], max+a[i]);
            total = Math.max(total, max);
            if(total<0){
                max =0;
            }
        }
        return total;
    }
}