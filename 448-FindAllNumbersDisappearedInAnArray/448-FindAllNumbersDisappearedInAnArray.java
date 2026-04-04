// Last updated: 04/04/2026, 15:45:53
class Solution {
    public void swap(int[] a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i =0;
        int n = nums.length;
        while (i<n) {
            if(nums[nums[i]-1]==nums[i])i++;
            else if(nums[i]!=i+1) swap(nums, i, nums[i]-1);
            else i++;
        }
        // for(int ele: nums){
        //     System.out.print(ele+" ");
        // }
        for (int j = 0; j < n; j++) {
            if(nums[j]!=j+1) ans.add(j+1);
        }
        return ans;
    }
}