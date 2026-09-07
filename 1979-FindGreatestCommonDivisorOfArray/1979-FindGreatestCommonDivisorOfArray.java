// Last updated: 07/09/2026, 08:44:56
class Solution {
    public int gcd(int a, int b){
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int ele : nums) {
            max = Math.max(max,ele);
            min = Math.min(min,ele);
        }
        // System.out.println(min);
        // System.out.println(max);
        int ans = gcd(min,max);
        // System.out.println(ans);
        return ans;
    }
}