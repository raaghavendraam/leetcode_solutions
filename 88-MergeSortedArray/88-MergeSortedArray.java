// Last updated: 04/04/2026, 15:47:28
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        if(m==0) {
            for(int r = 0;r<nums1.length;r++){
                nums1[r]=nums2[r];  
            }
            return;
        }
        while (i>=0&&j>=0) {
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;        
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
            }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
        }
}