// Last updated: 04/04/2026, 15:46:03
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        int a  = n&(n-1);
        return a==0 && n%3==1;
    }
}