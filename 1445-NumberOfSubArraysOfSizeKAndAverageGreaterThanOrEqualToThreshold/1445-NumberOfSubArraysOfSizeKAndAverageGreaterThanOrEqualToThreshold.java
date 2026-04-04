// Last updated: 04/04/2026, 15:44:50
class Solution {
    public int numOfSubarrays(int[] a, int k, int threshold) {
        int n = a.length;
        int sum =0;
        int j;
        int i=0;
        int count =0;
        for (j = 0; j < k; j++) {
             sum += a[j];
        }
        i++;
        while (j<n) {
            if(sum/k >= threshold) count++;
            sum-=a[i-1];
            sum+=a[j];
            i++;j++;
        }
         if( sum/k >= threshold) count++;
         return count;
    }
}