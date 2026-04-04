// Last updated: 04/04/2026, 15:46:40
class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int i=0,j=0;
        int sum =0;
        int min = Integer.MAX_VALUE;
        while(j<n){
            sum+=arr[j];
            while(sum>=target){
                int len=j-i+1;
                min = Math.min(min,len);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}