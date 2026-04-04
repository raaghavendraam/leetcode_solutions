// Last updated: 04/04/2026, 15:48:11
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        for (int i = 0; i < n - 2; i++) {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l = i+1;
            int h = n-1;
            while(l<h){
                int sum = nums[i]+nums[l]+nums[h];
                if(sum==0){
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[l]);
                    a.add(nums[h]);
                    ans.add(a);
                    while(l<h&&nums[l]==nums[l+1]) l++;
                    while(l<h&&nums[h]==nums[h-1]) h--;
                    l++;
                    h--;
                }
                else if(sum>0) h--;
                else l++;
            } 
        }
        return ans;
    }
}
