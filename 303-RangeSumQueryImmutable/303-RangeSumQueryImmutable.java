// Last updated: 04/04/2026, 15:46:06
  class NumArray {
    int[] nums;
    public NumArray(int[] a) {
        int n = a.length;
        nums = a;
        for (int i = 1; i < n; i++) nums[i]+=nums[i-1];
        
    }
    public int sumRange(int left, int right) {
        if(left==0) return nums[right];
        return nums[right] - nums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */