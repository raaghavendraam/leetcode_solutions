// Last updated: 07/09/2026, 08:45:17
class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int max = 0;
        int[] dp1 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i-1; j++) {
                if(nums[i]>nums[j]) dp1[i] = Math.max(dp1[i],dp1[j]);
            }
            dp1[i]+=1;
        }
        int[] dp2 = new int[n];
        for(int i =n-1;i>=0;i--){
            for(int j = i+1;j<n;j++){
                if(nums[i]>nums[j]) dp2[i] =Math.max(dp2[i],dp2[j]);
            }
            dp2[i]+=1;
        } 
        for(int i =0;i<n;i++){
            if(dp1[i]>1&&dp2[i]>1){
                int len = dp1[i]+dp2[i]-1;
                max = Math.max(len,max);
            }
        }
        if(max<3) return 0;
        return n-max;
    }
}