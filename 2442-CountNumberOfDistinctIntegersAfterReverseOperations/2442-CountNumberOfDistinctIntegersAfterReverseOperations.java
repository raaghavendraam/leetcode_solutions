// Last updated: 07/09/2026, 08:44:31
class Solution {
    public  int reverse(int n){
        int rev =0;
        while (n>0) {
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}