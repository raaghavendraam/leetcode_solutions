// Last updated: 04/04/2026, 15:47:57
class Solution {
    public void swap(int[] a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;
        while (i<n) {
            if(nums[i]>n||nums[i]<=0||nums[i]==i+1||nums[i]==nums[nums[i]-1]) i++;
            else swap(nums, i, nums[i]-1);
        }
        int j =0;
        for ( j = 0; j <n; j++) {
            if(nums[j]!=j+1) return j+1;
        }
        return j+1;
    }
}