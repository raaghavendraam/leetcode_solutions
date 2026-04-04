// Last updated: 04/04/2026, 15:46:29
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        n = n&(n-1);
        if(n==0) return true;
        return false;
    }
}