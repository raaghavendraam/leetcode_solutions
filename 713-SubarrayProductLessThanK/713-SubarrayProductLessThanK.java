// Last updated: 04/04/2026, 15:45:39
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int n = arr.length;
        if (k <= 1) return 0;
        int i=0,j=0;
        int pro =1;
        int count=0;
        while(j<n){
            pro*=arr[j];
            while(pro>=k&&i<n){
                pro/=arr[i];
                i++;
            }
            count+=(j-i+1);
            j++;
        }
        return count;
    }
}