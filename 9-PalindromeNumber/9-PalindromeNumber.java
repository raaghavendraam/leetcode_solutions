// Last updated: 04/04/2026, 15:48:17
class Solution {
    public boolean isPalindrome(int x) {
         int r = x;
        int rem = 0;
        int rev =0;
        while (r>0) {
            rem = r%10;
            rev =rev*10+rem;
            r=r/10;
        }
        if (rev == x) {
            return true;
        }
        else{
            return false;
        }
    }
}