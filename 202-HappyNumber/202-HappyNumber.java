// Last updated: 21/11/2026, 14:39:49
class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int sum = 0;
        if(n==7) return true;
        if(n<=9) return false;
        while (n>0) {
            int rem = n%10;
            sum =sum+(rem*rem);
            n/=10;
        }
        return isHappy(sum);
    }
}