// Last updated: 21/11/2026, 15:08:05
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0) {
            n=n/3;
        }
        return n==1;
    }
}